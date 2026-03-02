import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class gmbe extends ggcs implements gmcd, Future {
    @Override
    public boolean cancel(boolean z) {
        return this.gW().cancel(z);
    }

    protected abstract gmcd gV();

    protected Future gW() {
        throw null;
    }

    @Override
    public Object get() {
        return this.gW().get();
    }

    @Override
    public Object get(long v, TimeUnit timeUnit0) {
        return this.gW().get(v, timeUnit0);
    }

    @Override  // gmcd
    public void hB(Runnable runnable0, Executor executor0) {
        this.gV().hB(runnable0, executor0);
    }

    @Override
    public final boolean isCancelled() {
        return this.gW().isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.gW().isDone();
    }

    @Override  // ggcs
    protected Object oi() {
        throw null;
    }
}

