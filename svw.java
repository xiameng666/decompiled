public final class svw implements stb {
    public static final ssy a;
    public final svv b;
    public final svv c;
    public final sxd d;
    public final sxd e;

    static {
        svw.a = new ssy(0xFF47);
    }

    public svw(svv svv0, svv svv1, sxd sxd0, sxd sxd1) {
        this.b = svv0;
        this.c = svv1;
        this.d = sxd0;
        this.e = sxd1;
    }

    @Override  // ssw
    public final byte[] a() {
        sxk sxk0 = new sxk();
        sxk0.g(this.b.d());
        sxk0.g(this.c.d());
        sxd sxd0 = this.d;
        if(sxd0.d()) {
            sxk0.g(((svv)sxd0.b()).d());
        }
        sxd sxd1 = this.e;
        if(sxd1.d()) {
            sxk0.g(((svv)sxd1.b()).d());
        }
        return sxk0.b();
    }

    @Override  // ssw
    public final ssy d() {
        return svw.a;
    }

    @Override  // stb
    public final byte[] e() {
        sxk sxk0 = new sxk();
        byte[] arr_b = this.a();
        sxk0.d(svw.a.a, arr_b);
        return sxk0.b();
    }
}

