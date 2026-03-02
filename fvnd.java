import j..util.Objects;
import java.io.FileNotFoundException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class fvnd extends ThreadPoolExecutor implements AutoCloseable {
    final fvne a;

    public fvnd(fvne fvne0, TimeUnit timeUnit0, BlockingQueue blockingQueue0, RejectedExecutionHandler rejectedExecutionHandler0) {
        Objects.requireNonNull(fvne0);
        this.a = fvne0;
        super(1, 1, 60L, timeUnit0, blockingQueue0, rejectedExecutionHandler0);
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
        super.execute(clhn.b.b(runnable0));
    }

    @Override
    protected final void terminated() {
        fvne fvne0;
        try {
            fvne0 = this.a;
            fvob fvob0 = fvne0.k;
            if(fvne0.f && fvob0 != null) {
                try {
                    fvob0.g(fvne0.d);
                }
                catch(FileNotFoundException unused_ex) {
                }
            }
            if(fvne0.d != null) {
                fvno.a.b(fvne0.d);
            }
        }
        finally {
            fvlt fvlt0 = fvne0.h;
            if(fvlt0 != null) {
                fvlt0.j(fvne0.k);
            }
        }
    }
}

