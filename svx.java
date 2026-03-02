public final class svx implements stb {
    public static final ssy a;
    public final byte[] b;
    public final byte[] c;

    static {
        svx.a = new ssy(0xDF47);
    }

    public svx(byte[] arr_b, byte[] arr_b1) {
        this.b = arr_b;
        this.c = arr_b1;
    }

    @Override  // ssw
    public final byte[] a() {
        sxk sxk0 = new sxk();
        sxk0.g(this.b);
        sxk0.g(this.c);
        return sxk0.b();
    }

    @Override  // ssw
    public final ssy d() {
        return svx.a;
    }

    @Override  // stb
    public final byte[] e() {
        sxk sxk0 = new sxk();
        byte[] arr_b = this.a();
        sxk0.d(svx.a.a, arr_b);
        return sxk0.b();
    }
}

