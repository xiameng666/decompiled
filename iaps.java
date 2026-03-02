import j..util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class iaps implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b;
    private final AtomicReference c;

    public iaps(Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
        this.b = new ConcurrentLinkedQueue();
        this.c = new AtomicReference();
        this.a = thread$UncaughtExceptionHandler0;
    }

    public final iapr a(Runnable runnable0, long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        iapq iapq0 = new iapq(runnable0);
        return new iapr(iapq0, scheduledExecutorService0.schedule(new iapp(this, iapq0, runnable0), v, timeUnit0));
    }

    public final void b() {
        while(true) {
            AtomicReference atomicReference0 = this.c;
            Thread thread0 = Thread.currentThread();
        label_2:
            if(!atomicReference0.compareAndSet(null, thread0)) {
                break;
            }
            try {
                Runnable runnable0;
                while((runnable0 = (Runnable)this.b.poll()) != null) {
                    try {
                        runnable0.run();
                    }
                    catch(Throwable throwable1) {
                        this.a.uncaughtException(Thread.currentThread(), throwable1);
                    }
                }
            }
            catch(Throwable throwable0) {
                this.c.set(null);
                throw throwable0;
            }
            this.c.set(null);
            if(!this.b.isEmpty()) {
                continue;
            }
            return;
        }
        if(atomicReference0.get() == null) {
            goto label_2;
        }
    }

    public final void c(Runnable runnable0) {
        gftb.z(runnable0, "runnable is null");
        this.b.add(runnable0);
    }

    public final void d() {
        gftb.r(Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.c(runnable0);
        this.b();
    }
}

