final class ifpz extends ifqh {
    public final int a;
    public final int b;
    public final int c;

    public ifpz(ifpy ifpy0) {
        super(ifpy0);
        this.a = ifpy0.a;
        this.b = ifpy0.b;
        this.c = ifpy0.c;
    }

    @Override  // ifqh
    protected final byte[] a() {
        byte[] arr_b = super.a();
        ifua.f(this.a, arr_b, 16);
        ifua.f(this.b, arr_b, 20);
        ifua.f(this.c, arr_b, 24);
        return arr_b;
    }
}

