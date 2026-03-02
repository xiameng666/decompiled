import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class ialx extends ianl {
    @Override  // ianl
    public ianj_grpcChannel a() {
        return this.b().a();
    }

    protected abstract ianl b();

    @Override  // ianl
    public void c() {
        this.b().c();
    }

    @Override  // ianl
    public final void d(iaom iaom0, Object object0) {
        this.b().d(iaom0, object0);
    }

    @Override  // ianl
    public void e(ialv ialv0) {
        this.b().e(ialv0);
    }

    @Override  // ianl
    public void f(Executor executor0) {
        this.b().f(executor0);
    }

    @Override  // ianl
    public void g(iakw[] arr_iakw) {
        this.b().g(arr_iakw);
    }

    @Override  // ianl
    public void h(String s) {
        this.b().h(s);
    }

    @Override  // ianl
    public void i(long v, TimeUnit timeUnit0) {
        this.b().i(v, timeUnit0);
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("delegate", this.b());
        return gfsv0.toString();
    }
}

