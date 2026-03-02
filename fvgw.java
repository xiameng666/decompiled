public final class fvgw extends fvhj {
    public final double a;
    public final int b;
    public final fvhh c;
    public final fvhh d;
    private final fvhw e;

    public fvgw(fvgv fvgv0) {
        super(fvgv0);
        this.a = fvgv0.a;
        this.b = fvgv0.b;
        this.c = fvgv0.c;
        this.d = fvgv0.d;
        this.e = fvhw.j(this.g, ((long)(this.k.a * 1000000000000.0)));
    }

    @Override  // fvhj
    public final double a(double f) {
        Double double0 = f;
        gftb.f(this.f(fveh.a(5, f)), "Invalid carrier frequency for signal group delay: %s", double0);
        if(!fvdz.b.s(double0) && !fvdz.a.s(double0)) {
            if(!fvdz.c.s(double0) && !fvdz.d.s(double0)) {
                throw new IllegalArgumentException(a.E(f, "Invalid carrier frequency for this Beidou group delay: "));
            }
            return this.d.e;
        }
        return this.c.e;
    }

    @Override  // fvhd
    public final int b() {
        return 10800;
    }

    @Override  // fvhj
    public final fvhh c(double f) {
        Double double0 = f;
        if(!fvdz.b.s(double0) && !fvdz.a.s(double0)) {
            if(!fvdz.c.s(double0) && !fvdz.d.s(double0)) {
                throw new IllegalArgumentException(a.E(f, "Invalid carrier frequency for current Beidou clock models: "));
            }
            return this.d;
        }
        return this.c;
    }

    @Override  // fvhj
    public final fvhw d(double f) {
        double f1 = this.c(f).a * 1000000000000.0;
        return fvhw.j(this.g, ((long)f1));
    }

    @Override  // fvhd
    public final fvhw e() {
        return this.e;
    }

    @Override  // fvhd
    public final boolean f(fveh fveh0) {
        if(fveh0.D != 5) {
            return false;
        }
        if(fveh0 != fveh.t && fveh0 != fveh.u) {
            return fveh0 == fveh.v || fveh0 == fveh.w ? this.d != null : false;
        }
        return this.c != null;
    }

    @Override  // fvhd
    public final boolean g(fveh fveh0) {
        if(this.h == 0 && (this.a < 8.0)) {
            return Double.compare(this.i, 0.0) == 0 ? true : Math.abs(this.i - this.k.a) <= 10800.0;
        }
        return false;
    }
}

