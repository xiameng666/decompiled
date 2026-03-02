import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.util.Log;
import android.util.TimingLogger;
import j..util.Objects;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

final class fdux implements Runnable {
    final fdvl a;
    private final fdxm b;
    private final LinkedBlockingQueue c;
    private final AtomicInteger d;
    private final boolean e;
    private final SQLiteDatabase f;

    public fdux(fdvl fdvl0, fdxm fdxm0, LinkedBlockingQueue linkedBlockingQueue0, AtomicInteger atomicInteger0, boolean z) {
        Objects.requireNonNull(fdvl0);
        this.a = fdvl0;
        super();
        batl.s(fdxm0);
        this.b = fdxm0;
        this.c = linkedBlockingQueue0;
        this.d = atomicInteger0;
        this.e = z;
        this.f = fdxm0.getWritableDatabase();
    }

    // This method was un-flattened
    @Override
    public final void run() {
        fduv fduv1;
        try {
            TimingLogger timingLogger0 = new TimingLogger("DataItemsTiming", "setDataItemsRunner");
            fduv fduv0 = null;
            while(true) {
                timingLogger0.reset();
                ArrayList arrayList0 = new ArrayList();
                long v = this.e ? hzzi.a.i().B() : hzzi.a.i().A();
                boolean z = false;
                boolean z1 = true;
                if(fduv0 == null) {
                    try {
                        fduv1 = (fduv)this.c.take();
                    label_12:
                        timingLogger0.reset();
                        this.f.beginTransaction();
                        try {
                            timingLogger0.addSplit("beginTransaction");
                            while(true) {
                            label_15:
                                arrayList0.add(fduv1);
                                if(fduv1.d(timingLogger0, this.f)) {
                                    goto label_34;
                                }
                                break;
                            }
                        }
                        catch(Throwable throwable1) {
                            z = true;
                            goto label_29;
                        }
                        z = true;
                        if(((long)arrayList0.size()) < v) {
                            fduv1 = (fduv)this.c.poll();
                            timingLogger0.addSplit("got next item to process");
                            if(fduv1 != null) {
                                goto label_15;
                            }
                        }
                        z1 = false;
                        goto label_34;
                    }
                    catch(Throwable throwable1) {
                    }
                    goto label_29;
                }
                else {
                    fduv1 = fduv0;
                }
                goto label_12;
            label_29:
                if(z) {
                    this.f.endTransaction();
                    timingLogger0.addSplit("endTransaction");
                }
                this.d.incrementAndGet();
                throw throwable1;
            label_34:
                SQLiteDatabase sQLiteDatabase0 = this.f;
                sQLiteDatabase0.setTransactionSuccessful();
                sQLiteDatabase0.endTransaction();
                timingLogger0.addSplit("endTransaction");
                this.d.incrementAndGet();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                int v2 = arrayList0.size();
                for(int v1 = 0; v1 < v2; ++v1) {
                    ((fduv)arrayList0.get(v1)).c(timingLogger0, sQLiteDatabase0, linkedHashMap0);
                }
                if(!linkedHashMap0.isEmpty()) {
                    ArrayList arrayList1 = ggia.b(linkedHashMap0.values());
                    this.a.N(timingLogger0, arrayList1);
                }
                timingLogger0.addSplit(a.S(arrayList0, "completed:"));
                fduv0 = z1 ? ((fduv)arrayList0.get(arrayList0.size() - 1)) : null;
                timingLogger0.dumpToLog();
            }
        }
        catch(Throwable throwable0) {
            Log.w("DataItems", "the DataItem Processor Thread, " + Thread.currentThread().getName() + ", caught the following unknown throwable, killing process", throwable0);
            Process.killProcess(Process.myPid());
        }
    }
}

