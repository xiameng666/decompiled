public class ifqh {
    private final int a;
    public final int d;
    public final long e;
    public final int f;

    protected ifqh(ifqg ifqg0) {
        this.d = ifqg0.e;
        this.e = ifqg0.f;
        this.a = ifqg0.d;
        this.f = ifqg0.g;
    }

    protected byte[] a() {
        byte[] arr_b = new byte[0x20];
        ifua.f(this.d, arr_b, 0);
        ifua.k(this.e, arr_b, 4);
        ifua.f(this.a, arr_b, 12);
        ifua.f(this.f, arr_b, 28);
        return arr_b;
    }
}

