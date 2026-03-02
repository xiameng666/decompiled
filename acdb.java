import j..util.Objects;

public final class acdb extends tm {
    final acdc a;
    private final accz b;

    public acdb(acdc acdc0, accz accz0) {
        Objects.requireNonNull(acdc0);
        this.a = acdc0;
        super();
        this.b = accz0;
    }

    @Override  // tm
    public final void a() {
        this.a.q();
    }

    @Override  // tm
    public final void b(int v, int v1) {
        int v2 = this.a.f.indexOf(this.b);
        int v3 = v + this.a.Y(v2);
        this.a.u(v3, v1);
    }

    @Override  // tm
    public final void d(int v, int v1) {
        int v2 = this.a.f.indexOf(this.b);
        int v3 = v + this.a.Y(v2);
        this.a.w(v3, v1);
    }

    @Override  // tm
    public final void e(int v, int v1) {
        int v2 = this.a.f.indexOf(this.b);
        int v3 = v + this.a.Y(v2);
        this.a.x(v3, v1);
    }

    @Override  // tm
    public final void g(int v, int v1) {
        int v2 = this.a.f.indexOf(this.b);
        int v3 = this.a.Y(v2);
        this.a.t(v + v3, v1 + v3);
    }
}

