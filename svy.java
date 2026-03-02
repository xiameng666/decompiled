public final class svy extends sta {
    public final srk a;
    public final byte[] b;
    public final byte[] c;
    public final swc d;
    private final byte[] e;

    public svy(ssg ssg0, ssi ssi0, srk srk0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, swc swc0) {
        super(ssg0, ssi0);
        this.a = srk0;
        this.b = arr_b;
        this.c = arr_b1;
        this.e = arr_b2;
        this.d = swc0;
    }

    @Override  // ssx, ssw
    public final byte[] a() {
        sxk sxk0 = new sxk();
        sxk0.g(this.m.g());
        sxk0.g(this.b);
        sxk0.g(this.c);
        sxk0.g(this.e);
        return sxk0.b();
    }
}

