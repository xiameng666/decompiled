import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class cjid extends cjhv {
    public cjid(cjif cjif0) {
        super(cjif0);
    }

    @Override  // cjhv
    protected final void c() {
        this.a.a.acquire();
    }

    @Override  // cjhv
    protected final void d() {
        Semaphore semaphore0 = this.a.a;
        __monitor_enter(semaphore0);
        int v = FIN.finallyOpen$NT();
        if(semaphore0.availablePermits() != 0) {
            if(semaphore0.availablePermits() < 0x3FFFFFFF) {
                if(semaphore0.availablePermits() >= 0) {
                    semaphore0.release();
                    FIN.finallyCodeBegin$NT(v);
                    return;
                }
                throw new IllegalStateException("Lock is in an inconsistent state");
            }
            throw new IllegalStateException("Releasing reader lock that is not acquired");
        }
        throw new IllegalStateException("Releasing reader lock that is exclusively held by writer");
    }

    @Override  // cjhv
    protected final boolean f(long v, TimeUnit timeUnit0) {
        return this.a.a.tryAcquire(v, timeUnit0);
    }

    public final void j() {
        super.i();
    }
}

