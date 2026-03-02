import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.util.TimingLogger;
import j..util.Objects;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

abstract class fdvf extends fduv {
    protected fduq a;
    protected final boolean b;
    protected final String c;
    protected final AtomicInteger d;
    final fdvl e;
    private fduq f;
    private IOException g;

    public fdvf(fdvl fdvl0, fduq fduq0, boolean z, String s, AtomicInteger atomicInteger0) {
        Objects.requireNonNull(fdvl0);
        this.e = fdvl0;
        super();
        batl.s(fduq0);
        this.a = fduq0;
        this.b = z;
        this.c = s;
        this.d = atomicInteger0;
    }

    @Override  // fduv
    protected final void c(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0, LinkedHashMap linkedHashMap0) {
        this.d.incrementAndGet();
        IOException iOException0 = this.g;
        if(iOException0 != null) {
            this.r(iOException0);
            return;
        }
        fduq fduq0 = this.f;
        if(fduq0 == null) {
            this.q(new fdvi(this.a, null, null));
            return;
        }
        this.h(timingLogger0, sQLiteDatabase0, fduq0, linkedHashMap0);
    }

    @Override  // fduv
    protected final boolean d(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0) {
        String s = this.c;
        if(s != null) {
            fdvl fdvl0 = this.e;
            if(fdvl0.Z(this.a, 1, true, s)) {
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", String.format("SetDataItemFuture: filtering data item from peer=%s, %s", s, this.a));
                }
                fdvl0.U(sQLiteDatabase0, this.a);
                return false;
            }
            long v = fdvl.ah(sQLiteDatabase0, this.a.e);
            fduq fduq0 = this.a;
            if(fduq0.f <= v) {
                if(Log.isLoggable("DataItems", 3)) {
                    Log.d("DataItems", String.format("SetDataItemFuture: dropping data with old seqId from peer=%s, currentSeqId=%s, %s", s, v, this.a));
                }
                return false;
            }
            this.a = fdvl0.i(fduq0, s);
        }
        try {
            this.i(sQLiteDatabase0);
            timingLogger0.addSplit("processAssets");
        }
        catch(IOException iOException0) {
            this.g = iOException0;
            timingLogger0.addSplit("failed with IOException");
            return false;
        }
        this.f = this.f(timingLogger0, sQLiteDatabase0);
        timingLogger0.addSplit("recordDataItem");
        return false;
    }

    public abstract fduq f(TimingLogger arg1, SQLiteDatabase arg2);

    final void g(TimingLogger timingLogger0, fdpl fdpl0, HashSet hashSet0, HashSet hashSet1) {
        if(hashSet0 != null && !hashSet0.isEmpty()) {
            for(Object object0: hashSet0) {
                this.e.d.c(fdpl0, ((String)object0));
                timingLogger0.addSplit("onAssetMissing");
            }
        }
        if(hashSet1 != null && !hashSet1.isEmpty()) {
            for(Object object1: hashSet1) {
                this.e.d.d(fdpl0, ((String)object1));
                timingLogger0.addSplit("onAssetPermissionMissing");
            }
        }
        timingLogger0.addSplit("requestMissingAssets");
    }

    public abstract void h(TimingLogger arg1, SQLiteDatabase arg2, fduq arg3, LinkedHashMap arg4);

    public abstract void i(SQLiteDatabase arg1);
}

