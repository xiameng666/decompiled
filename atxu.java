import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class atxu {
    private static final avjh a;
    private final AtomicLong b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;

    static {
        atxu.a = new avjh("EventFlowCoordinator");
    }

    public atxu(ScheduledExecutorService scheduledExecutorService0) {
        this.c = scheduledExecutorService0;
        this.b = new AtomicLong(0L);
    }

    public final long a() {
        long v1;
        synchronized(this) {
            AtomicLong atomicLong0 = this.b;
            if(atomicLong0.get() == 0L) {
                atomicLong0.set(System.currentTimeMillis());
            }
            v1 = atomicLong0.get();
        }
        return v1;
    }

    public final void b() {
        synchronized(this) {
            ScheduledFuture scheduledFuture0 = this.d;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
                this.d = null;
            }
        }
    }

    // Detected as a lambda impl.
    public final void c() {
        synchronized(this) {
            this.b();
            AtomicLong atomicLong0 = this.b;
            if(atomicLong0.get() == 0L) {
                return;
            }
            atxu.a.m("reset event flow ID to unknown");
            atomicLong0.set(0L);
        }
    }

    public final void d() {
        synchronized(this) {
            this.e();
        }
    }

    private final void e() {
        synchronized(this) {
            atxt atxt0 = () -> synchronized(this) {
                this.b();
                AtomicLong atomicLong0 = this.b;
                if(atomicLong0.get() == 0L) {
                    return;
                }
                atxu.a.m("reset event flow ID to unknown");
                atomicLong0.set(0L);
            };
            this.d = ((bbll)this.c).g(atxt0, 600000L, TimeUnit.MILLISECONDS);
        }
    }
}

