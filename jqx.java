import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class jqx implements gmcd {
    final WeakReference a;
    public final jqs b;

    public jqx(jqt jqt0) {
        this.b = new jqw(this);
        this.a = new WeakReference(jqt0);
    }

    final boolean a(Throwable throwable0) {
        return this.b.h(throwable0);
    }

    @Override
    public final boolean cancel(boolean z) {
        jqt jqt0 = (jqt)this.a.get();
        boolean z1 = this.b.cancel(z);
        if(z1 && jqt0 != null) {
            jqt0.a = null;
            jqt0.b = null;
            jqt0.c.g(null);
            return true;
        }
        return z1;
    }

    @Override
    public final Object get() {
        return this.b.get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        return this.b.get(v, timeUnit0);
    }

    @Override  // gmcd
    public final void hB(Runnable runnable0, Executor executor0) {
        this.b.hB(runnable0, executor0);
    }

    @Override
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override
    public final String toString() {
        return this.b.toString();
    }
}

