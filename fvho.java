public final class fvho extends fvhj {
    public final double a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final fvhh f;
    private final fvhw l;

    public fvho(fvhn fvhn0) {
        super(fvhn0);
        this.a = fvhn0.a;
        this.b = fvhn0.b;
        this.d = fvhn0.c;
        this.e = fvhn0.d;
        this.c = fvhn0.e;
        this.f = fvhn0.f;
        this.l = new fvhw(this.g, ((long)(this.k.a * 1000000000000.0)));
    }

    @Override  // fvhj
    public final double a(double f) {
        gftb.f(this.f(fveh.a(4, f)), "Invalid carrier frequency for signal group delay: %s", Double.valueOf(f));
        return Math.pow(1575420000.0 / f, 2.0) * this.f.e;
    }

    @Override  // fvhd
    public final int b() {
        return 14400;
    }

    @Override  // fvhj
    public final fvhh c(double f) {
        return this.f;
    }

    @Override  // fvhj
    public final fvhw d(double f) {
        return new fvhw(this.g, ((long)(this.f.a * 1000000000000.0)));
    }

    @Override  // fvhd
    public final fvhw e() {
        return this.l;
    }

    @Override  // fvhd
    public final boolean f(fveh fveh0) {
        return fveh0.D == 4;
    }

    @Override  // fvhd
    public final boolean g(fveh fveh0) {
        return (this.h & -18) == 0 && this.a < 8.0;
    }
}

