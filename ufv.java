import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class ufv implements AutoCloseable, ExecutorService {
    public static final long a;
    private static volatile int b;
    private final ExecutorService c;

    static {
        ufv.a = TimeUnit.SECONDS.toMillis(10L);
    }

    public ufv(ExecutorService executorService0) {
        this.c = executorService0;
    }

    public static int a() {
        if(ufv.b == 0) {
            ufv.b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return ufv.b;
    }

    @Override
    public final boolean awaitTermination(long v, TimeUnit timeUnit0) {
        return this.c.awaitTermination(v, timeUnit0);
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
        this.c.execute(runnable0);
    }

    @Override
    public final List invokeAll(Collection collection0) {
        return this.c.invokeAll(collection0);
    }

    @Override
    public final List invokeAll(Collection collection0, long v, TimeUnit timeUnit0) {
        return this.c.invokeAll(collection0, v, timeUnit0);
    }

    @Override
    public final Object invokeAny(Collection collection0) {
        return this.c.invokeAny(collection0);
    }

    @Override
    public final Object invokeAny(Collection collection0, long v, TimeUnit timeUnit0) {
        return this.c.invokeAny(collection0, v, timeUnit0);
    }

    @Override
    public final boolean isShutdown() {
        return this.c.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.c.isTerminated();
    }

    @Override
    public final void shutdown() {
        this.c.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return this.c.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable0) {
        return this.c.submit(runnable0);
    }

    @Override
    public final Future submit(Runnable runnable0, Object object0) {
        return this.c.submit(runnable0, object0);
    }

    @Override
    public final Future submit(Callable callable0) {
        return this.c.submit(callable0);
    }

    @Override
    public final String toString() {
        return this.c.toString();
    }
}

