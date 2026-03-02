final class bwy extends bxp {
    final bxd a;

    public bwy(bxd bxd0) {
        this.a = bxd0;
        super(bxd0.d_num);
    }

    @Override  // bxp
    protected final Object a(int v) {
        return this.a.f(v);
    }

    @Override  // bxp
    protected final void b(int v) {
        this.a.g(v);
    }
}

