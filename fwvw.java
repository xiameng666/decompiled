import android.os.SystemClock;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class fwvw implements fwvz {
    final fwvx a;
    private final CountDownLatch b;
    private final AtomicReference c;
    private final long d;
    private final boolean e;

    public fwvw(fwvx fwvx0, CountDownLatch countDownLatch0, AtomicReference atomicReference0, long v, boolean z) {
        Objects.requireNonNull(fwvx0);
        this.a = fwvx0;
        super();
        this.b = countDownLatch0;
        this.c = atomicReference0;
        this.d = v;
        this.e = z;
    }

    @Override  // fwvz
    public final void a(int v, List list0, fvvg[] arr_fvvg, int v1, int v2, int v3, int v4) {
        long v5 = SystemClock.elapsedRealtime();
        int v6 = list0.size();
        fvvj[] arr_fvvj = new fvvj[v6];
        if(huqy_phenotype.B() && v != 0) {
            hecl hecl0 = new hecl(5, fvvc.q(SystemClock.elapsedRealtime()));
            this.c.set(hecl0);
        }
        else {
            for(int v7 = 0; v7 < v6; ++v7) {
                fwvy[] arr_fwvy = (fwvy[])list0.get(v7);
                arr_fvvj[v7] = fwvr.a(v5, this.d, this.a.c, arr_fwvy, (v7 == v6 - 1 ? arr_fvvg : null), false, v, v4, this.a.b);
            }
            hecl hecl1 = new hecl(1, gged_interceptors.k(arr_fvvj));
            this.c.set(hecl1);
        }
        this.b.countDown();
        fwvx fwvx0 = this.a;
        fwvx0.e.g(1, v, v6, (arr_fvvg == null ? 0 : arr_fvvg.length), this.e, v1, v2, v3, v4, false, 0L);
        if(v1 != -1) {
            fwso.k(fwvx0.b, ((long)v1), 0, v4);
        }
        if(v3 != -1) {
            fwso.k(fwvx0.b, ((long)v3), 0, 0x40000000);
        }
    }
}

