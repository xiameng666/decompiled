public final class svz extends sta {
    public final byte[] a;
    public final swc b;
    private final byte[] c;

    public svz(ssg ssg0, ssi ssi0, byte[] arr_b, byte[] arr_b1, swc swc0) {
        super(ssg0, ssi0);
        this.a = arr_b;
        this.c = arr_b1;
        this.b = swc0;
    }

    @Override  // ssx, ssw
    public final byte[] a() {
        sxk sxk0 = new sxk();
        sxk0.g(this.m.g());
        sxk0.g(this.a);
        sxk0.g(this.c);
        return sxk0.b();
    }
}

