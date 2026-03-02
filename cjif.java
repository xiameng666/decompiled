import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class cjif {
    public final Semaphore a;
    public final Object b;
    public final Set c;

    public cjif() {
        this(new Semaphore(0x3FFFFFFF));
    }

    public cjif(Semaphore semaphore0) {
        this.b = new Object();
        gftb.check(semaphore0);
        this.a = semaphore0;
        this.c = Collections.newSetFromMap(new WeakHashMap());
    }

    final void a() {
        Semaphore semaphore0 = this.a;
        __monitor_enter(semaphore0);
        int v = FIN.finallyOpen$NT();
        if(semaphore0.availablePermits() == 0) {
            semaphore0.release(0x3FFFFFFF);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("ReadWriteLock is in an inconsistent state");
    }

    public final boolean b(long v, TimeUnit timeUnit0) {
        return this.a.tryAcquire(0x3FFFFFFF, v, timeUnit0);
    }
}

