import java.util.concurrent.TimeUnit;

public final class cjie extends cjhv {
    public cjie(cjif cjif0) {
        super(cjif0);
    }

    @Override  // cjhv
    protected final void c() {
        this.a.a.acquire(0x3FFFFFFF);
    }

    @Override  // cjhv
    protected final void d() {
        this.a.a();
    }

    @Override  // cjhv
    protected final boolean f(long v, TimeUnit timeUnit0) {
        return this.a.b(v, timeUnit0);
    }
}

