import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class ialy extends ialx {
    @Override  // ialx
    @Deprecated
    protected abstract ianl b();

    @Override  // ialx
    public final void c() {
        this.j();
    }

    @Override  // ialx
    public final void e(ialv ialv0) {
        this.b().e(ialv0);
    }

    @Override  // ialx
    public final void f(Executor executor0) {
        this.b().f(executor0);
    }

    @Override  // ialx
    public final void g(iakw[] arr_iakw) {
        this.b().g(arr_iakw);
    }

    @Override  // ialx
    public final void h(String s) {
        this.b().h(s);
    }

    @Override  // ialx
    public void i(long v, TimeUnit timeUnit0) {
        this.k(v, timeUnit0);
    }

    public final void j() {
        this.b().c();
    }

    public void k(long v, TimeUnit timeUnit0) {
        this.b().i(v, timeUnit0);
    }
}

