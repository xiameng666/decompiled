public final class fvhf extends fvhj {
    public final double a;
    public final double b;
    public final boolean c;
    public final int d;
    public final int e;
    public final fvhh f;
    private final fvhw l;

    public fvhf(fvhe fvhe0) {
        super(fvhe0);
        this.a = fvhe0.a;
        this.b = fvhe0.b;
        this.c = fvhe0.c;
        this.d = fvhe0.d;
        this.e = fvhe0.e;
        this.f = fvhe0.f;
        this.l = new fvhw(this.g, ((long)(this.k.a * 1000000000000.0)));
    }

    @Override  // fvhj
    public final double a(double f) {
        Double double0 = f;
        gftb.f(this.f(fveh.a(1, f)), "Invalid carrier frequency for signal group delay: %s", double0);
        if(!fvec.a.s(double0) && !fvec.c.s(double0)) {
            if(fvec.b.s(double0)) {
                return Math.pow(1575420000.0 / f, 2.0) * this.f.e;
            }
            throw new IllegalArgumentException(a.E(f, "Invalid carrier frequency for signal group delay: %s"));
        }
        return this.f.e;
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
        return fveh0.D == 1;
    }

    @Override  // fvhd
    public final boolean g(fveh fveh0) {
        return this.h == 0 && this.a < 8.0;
    }
}

