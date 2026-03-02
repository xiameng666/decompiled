import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

public abstract class glza extends AbstractExecutorService implements gmcg, AutoCloseable {
    @Override
    public void close() {
        if(this != ForkJoinPool.commonPool() && !this.isTerminated()) {
            this.shutdown();
            boolean z1 = false;
            for(boolean z = false; !z; z = this.awaitTermination(1L, TimeUnit.DAYS)) {
                try {
                }
                catch(InterruptedException unused_ex) {
                    if(!z1) {
                        this.shutdownNow();
                    }
                    z1 = true;
                }
            }
            if(z1) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override  // gmcg
    public final gmcd d(Runnable runnable0) {
        return (gmcd)super.submit(runnable0);
    }

    @Override  // gmcg
    public final gmcd e(Callable callable0) {
        return (gmcd)super.submit(callable0);
    }

    @Override  // gmcg
    public final gmcd f(Runnable runnable0, Object object0) {
        return (gmcd)super.submit(runnable0, object0);
    }

    @Override
    protected final RunnableFuture newTaskFor(Runnable runnable0, Object object0) {
        return gmdc.d(runnable0, object0);
    }

    @Override
    protected final RunnableFuture newTaskFor(Callable callable0) {
        return new gmdc(callable0);
    }

    @Override
    public final Future submit(Runnable runnable0) {
        return this.d(runnable0);
    }

    @Override
    public final Future submit(Runnable runnable0, Object object0) {
        return this.f(runnable0, object0);
    }

    @Override
    public final Future submit(Callable callable0) {
        return this.e(callable0);
    }
}

