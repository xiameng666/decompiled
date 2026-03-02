import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Log;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

final class fdvt extends Thread implements Closeable {
    final fdvu a;
    private final fdwy b;
    private final Map c;
    private final long d;
    private volatile boolean e;
    private final Set f;
    private final ggeo g;

    public fdvt(fdvu fdvu0, String s, fdwy fdwy0, Map map0, long v, ggeo ggeo0) {
        Objects.requireNonNull(fdvu0);
        this.a = fdvu0;
        super(s);
        this.e = false;
        this.b = fdwy0;
        this.c = map0;
        this.d = v;
        this.f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.g = ggeo0;
    }

    @Override
    public final void close() {
        if(fdvu.m() || hzvy.c()) {
            Log.v("datatransport", "close() called on this startSyncThread " + this.getName());
        }
        this.e = true;
        for(Object object0: this.f) {
            ((fdvs)object0).d.set(true);
        }
        this.interrupt();
        gmde.c(this);
    }

    @Override
    public final void run() {
        String s8;
        long v6;
        String s3;
        int v4;
        fdvs fdvs1;
        int v10;
        Object object4;
        fdvu fdvu2;
        boolean z;
        long v = SystemClock.elapsedRealtime();
        Map map0 = this.c;
        if(map0 == null) {
            v6 = v;
            long v7 = this.d;
            fdwy fdwy1 = this.b;
            if(v7 == -1L) {
                z = true;
                goto label_91;
            }
            while(true) {
                try {
                    z = false;
                }
                catch(Throwable throwable1) {
                    goto label_119;
                }
            label_91:
                if(this.e) {
                    break;
                }
                fdvu fdvu1 = this.a;
                fdvs fdvs2 = new fdvs(fdvu1, fdwy1);
                this.f.add(fdvs2);
                String s9 = fdvu1.b;
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", "getDataItemsByV1SeqIdAndNonMatchingSourceNodeId: sourceNodeId=" + s9 + ", v1SeqId=" + v7 + ", limit=-1, excludeDeleted=" + z);
                }
                SQLiteDatabase sQLiteDatabase0 = fdvu1.c.c.getReadableDatabase();
                sQLiteDatabase0.beginTransaction();
                try {
                    fdvl.O(sQLiteDatabase0.query("dataItemsAndAssets", fdxc.a, (z ? "v1SeqId >? AND v1SourceNode != ? AND deleted=0" : "v1SeqId >? AND v1SourceNode != ?"), new String[]{Long.toString(v7), s9}, null, null, "v1SeqId", null), fdvs2);
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
                v7 = fdvs2.b;
                int v9 = fdvs2.c;
                if(fdvu.m() || hzvy.c()) {
                    Log.v("datatransport", "handleSyncStart(" + this.getName() + "): node=" + fdvu1.a + ", peer=" + s9 + ", version=1, sent=" + v9 + ", lastSeqId=" + v7);
                }
                Object object3 = fdvu1.k;
                __monitor_enter(object3);
                try {
                    if(!fdvu1.q) {
                        fdvu.k(this.a);
                        goto label_114;
                    }
                    goto label_116;
                }
                catch(Throwable throwable1) {
                    goto label_119;
                }
            label_114:
                __monitor_exit(object3);
                break;
                try {
                label_116:
                    fdvu.l(fdvu1);
                }
                catch(Throwable throwable1) {
                label_119:
                    __monitor_exit(object3);
                    throw throwable1;
                }
                __monitor_exit(object3);
            }
        label_123:
            fdvu2 = this.a;
            object4 = fdvu2.k;
            __monitor_enter(object4);
            v10 = FIN.finallyOpen$NT();
            if(fdvu2.m == this) {
                fdvu2.m = null;
            }
        }
        else {
            fdwy fdwy0 = this.b;
            HashMap hashMap0 = new HashMap(map0);
            while(!this.e) {
                fdvu fdvu0 = this.a;
                fdvl fdvl0 = fdvu0.c;
                Map map1 = fdvl0.z(hashMap0);
                ffmn.a("datatransport", "Sending data on initial sync for the following nodes: %s", new Object[]{map1});
                int v1 = 0;
                for(Object object0: map1.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    String s = (String)map$Entry0.getKey();
                    ggeo ggeo0 = this.g;
                    String s1 = fdvu0.a;
                    String s2 = fdvu0.b;
                    if(fdvu.i(ggeo0, s, s1, s2)) {
                        long v2 = (long)(((Long)map$Entry0.getValue()));
                        int v3 = hashMap0.containsKey(s) ^ 1;
                        fdvs fdvs0 = new fdvs(fdvu0, fdwy0);
                        this.f.add(fdvs0);
                        if(hzys.c()) {
                            fdvs1 = fdvs0;
                            v4 = v1;
                            s3 = s;
                            fdvl0.R(s3, v2, -1, ((boolean)v3), fdvs1, ((ffaz)ggeo0.getOrDefault(s2, null)));
                        }
                        else {
                            fdvs1 = fdvs0;
                            v4 = v1;
                            s3 = s;
                            fdvl0.R(s3, v2, -1, ((boolean)v3), fdvs1, null);
                        }
                        int v5 = fdvs1.c + v4;
                        hashMap0.put(s3, Long.valueOf(fdvs1.a));
                        v1 = v5;
                    }
                    else {
                        if(!Log.isLoggable("datatransport", 3)) {
                            continue;
                        }
                        Log.d("datatransport", String.format("Skipping sending data items from nodeId: %s, to nodeId: %s, owned by nodeId: %s", s1, s2, s));
                    }
                }
                if(!fdvu.m() && !hzvy.c()) {
                    v6 = v;
                }
                else {
                    String s4 = this.getName();
                    String s5 = fdvu0.a;
                    String s6 = fdvu0.b;
                    String s7 = hashMap0.toString();
                    ggeo ggeo1 = this.g;
                    if(ggeo1 == null) {
                        s8 = "null";
                        v6 = v;
                    }
                    else {
                        ggdy ggdy0 = new ggdy();
                        ggqj ggqj0 = ggeo1.w().om();
                        while(ggqj0.hasNext()) {
                            Object object1 = ggqj0.next();
                            ggdy0.i("(" + ((String)object1) + " : " + ffcz.b(((ffaz)ggeo1.get(((String)object1)))) + ")");
                            v = v;
                        }
                        v6 = v;
                        gfss gfss0 = gfss.d(',');
                        StringBuilder stringBuilder0 = new StringBuilder();
                        stringBuilder0.append('[');
                        gfss0.i(stringBuilder0, ggdy0.h());
                        stringBuilder0.append(']');
                        s8 = stringBuilder0.toString();
                    }
                    Log.v("datatransport", "handleSyncStart(" + s4 + "): node=" + s5 + ", peer=" + s6 + ", version=2, sent=" + v1 + ", synced=" + s7 + ", restrictions=" + s8);
                }
                Object object2 = fdvu0.k;
                __monitor_enter(object2);
                try {
                    if(fdvu0.q) {
                        goto label_74;
                    }
                    else {
                        fdvu.k(fdvu0);
                        goto label_72;
                    }
                    goto label_129;
                }
                catch(Throwable throwable0) {
                    goto label_79;
                }
            label_72:
                __monitor_exit(object2);
                goto label_123;
                try {
                label_74:
                    fdvu.l(fdvu0);
                    __monitor_exit(object2);
                    v = v6;
                }
                catch(Throwable throwable0) {
                label_79:
                    __monitor_exit(object2);
                    throw throwable0;
                }
            }
            v6 = v;
            goto label_123;
        }
    label_129:
        fdvu2.p.countDown();
        FIN.finallyCodeBegin$NT(v10);
        __monitor_exit(object4);
        FIN.finallyCodeEnd$NT(v10);
        if(!fdvu.m() && !hzvy.c()) {
            return;
        }
        long v11 = SystemClock.elapsedRealtime() - v6;
        Log.v("datatransport", this.getName() + " Completed sending data items in " + v11 + "ms");
    }
}

