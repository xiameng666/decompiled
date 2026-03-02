public final class bxe extends bxp {
    final bxf a;

    public bxe(bxf bxf0) {
        this.a = bxf0;
        super(bxf0.c);
    }

    @Override  // bxp
    protected final Object a(int v) {
        return this.a.b(v);
    }

    @Override  // bxp
    protected final void b(int v) {
        this.a.e(v);
    }
}

