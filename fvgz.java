public final class fvgz extends fvhj {
    public final double a;
    public final double b;
    public final fvhh c;
    public final fvhh d;
    private final fvhw e;

    public fvgz(fvgy fvgy0) {
        super(fvgy0);
        this.a = fvgy0.a;
        this.b = fvgy0.b;
        this.c = fvgy0.c;
        this.d = fvgy0.d;
        this.e = fvhw.m(this.g, ((long)(this.k.a * 1000000000000.0)));
    }

    @Override  // fvhj
    public final double a(double f) {
        gftb.f(this.f(fveh.a(6, f)), "Invalid carrier frequency for signal group delay: %s", Double.valueOf(f));
        return Math.pow(1575420000.0 / f, 2.0) * this.c(f).e;
    }

    @Override  // fvhd
    public final int b() {
        return 14400;
    }

    @Override  // fvhj
    public final fvhh c(double f) {
        Double double0 = f;
        if(!fvea.a.s(double0) && !fvea.c.s(double0)) {
            if(fvea.b.s(double0)) {
                return this.c;
            }
            throw new IllegalArgumentException(a.E(f, "Invalid carrier frequency for current Galileo clock models: "));
        }
        return this.d;
    }

    @Override  // fvhj
    public final fvhw d(double f) {
        double f1 = this.c(f).a * 1000000000000.0;
        return fvhw.m(this.g, ((long)f1));
    }

    @Override  // fvhd
    public final fvhw e() {
        return this.e;
    }

    @Override  // fvhd
    public final boolean f(fveh fveh0) {
        if(fveh0.D != 6) {
            return false;
        }
        return fveh0 == fveh.i || fveh0 == fveh.k ? this.d != null : fveh0 == fveh.j && this.c != null;
    }

    @Override  // fvhd
    public final boolean g(fveh fveh0) {
        if(hunn.i()) {
            gxpy gxpy0 = gxpy.b(this.h);
            switch(fveh0.ordinal()) {
                case 8: {
                    return gxpy0.b == 0 && this.b < 8.0;
                }
                case 9: {
                    return gxpy0.d == 0 && this.a < 8.0;
                }
                case 10: {
                    return gxpy0.f == 0 && this.b < 8.0;
                }
                default: {
                    return false;
                }
            }
        }
        if(hunn.i()) {
            return this.g(fveh.i) || this.g(fveh.j) ? true : this.g(fveh.k);
        }
        return this.h != 0 || !(this.a < 8.0) ? false : this.b < 8.0;
    }
}

