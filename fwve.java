import android.os.SystemClock;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class fwve {
    final long a;
    final AtomicReference b;
    final CountDownLatch c;
    final fwvf d;

    public fwve(fwvf fwvf0, long v, AtomicReference atomicReference0, CountDownLatch countDownLatch0) {
        this.a = v;
        this.b = atomicReference0;
        this.c = countDownLatch0;
        Objects.requireNonNull(fwvf0);
        this.d = fwvf0;
        super();
    }

    public final void a(fvtm[] arr_fvtm, int v) {
        fwvf fwvf0 = this.d;
        fwvf0.d.a();
        long v1 = SystemClock.elapsedRealtime() - this.a;
        fvtm fvtm0 = null;
        if(arr_fvtm != null && arr_fvtm.length > 0) {
            fvtm0 = arr_fvtm[0];
            fwtu fwtu0 = fwvf0.b;
            boolean z = true;
            fwso.k(fwtu0.e, v1, 1, -1);
            fwtu0.q.D(fvtm0);
            long v2 = fvtm0 == null ? SystemClock.elapsedRealtime() : fvtm0.f;
            if(huvd.z()) {
                fwtu0.a.c(v2, fvtm0);
                z = fwtu0.a.e();
            }
            fvtm fvtm1 = z ? fvtm0 : fvtm.h(v2);
            this.b.set(fvtm1);
        }
        fvtm fvtm2 = (fvtm)this.b.get();
        fwvf0.e.f(1, fvtm2, v, v1, 0L);
        fwso.e(fwvf0.a, fvtm0, v);
        this.c.countDown();
    }
}

