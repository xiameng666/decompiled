import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class ibba implements AutoCloseable, ScheduledExecutorService {
    final ScheduledExecutorService a;

    public ibba(ScheduledExecutorService scheduledExecutorService0) {
        gftb.z(scheduledExecutorService0, "delegate");
        this.a = scheduledExecutorService0;
    }

    @Override
    public final boolean awaitTermination(long v, TimeUnit timeUnit0) {
        return this.a.awaitTermination(v, timeUnit0);
    }

    @Override
    public final void close() {
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

    @Override
    public final void execute(Runnable runnable0) {
        this.a.execute(runnable0);
    }

    @Override
    public final List invokeAll(Collection collection0) {
        return this.a.invokeAll(collection0);
    }

    @Override
    public final List invokeAll(Collection collection0, long v, TimeUnit timeUnit0) {
        return this.a.invokeAll(collection0, v, timeUnit0);
    }

    @Override
    public final Object invokeAny(Collection collection0) {
        return this.a.invokeAny(collection0);
    }

    @Override
    public final Object invokeAny(Collection collection0, long v, TimeUnit timeUnit0) {
        return this.a.invokeAny(collection0, v, timeUnit0);
    }

    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        return this.a.schedule(runnable0, v, timeUnit0);
    }

    @Override
    public final ScheduledFuture schedule(Callable callable0, long v, TimeUnit timeUnit0) {
        return this.a.schedule(callable0, v, timeUnit0);
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        return this.a.scheduleAtFixedRate(runnable0, v, v1, timeUnit0);
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        return this.a.scheduleWithFixedDelay(runnable0, v, v1, timeUnit0);
    }

    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
    }

    @Override
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
    }

    @Override
    public final Future submit(Runnable runnable0) {
        return this.a.submit(runnable0);
    }

    @Override
    public final Future submit(Runnable runnable0, Object object0) {
        return this.a.submit(runnable0, object0);
    }

    @Override
    public final Future submit(Callable callable0) {
        return this.a.submit(callable0);
    }
}

