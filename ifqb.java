final class ifqb extends ifqh {
    public final int a;
    public final int b;
    public final int c;

    public ifqb(ifqa ifqa0) {
        super(ifqa0);
        this.a = ifqa0.a;
        this.b = ifqa0.b;
        this.c = ifqa0.c;
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

