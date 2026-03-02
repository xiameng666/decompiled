public final class fvhb extends fvhd {
    public final fvht a;
    public final fvhw b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;
    public final double m;
    public final double n;
    public final int o;
    public final int p;
    public final int q;

    public fvhb(fvha fvha0) {
        super(fvha0);
        fvht fvht0 = fvha0.a;
        this.a = fvht0;
        this.b = fvhw.l(fvht0);
        this.c = fvha0.b;
        this.d = fvha0.c;
        this.e = fvha0.d;
        this.f = fvha0.e;
        this.g = fvha0.f;
        this.h = fvha0.g;
        this.i = fvha0.h;
        this.j = fvha0.i;
        this.k = fvha0.j;
        this.l = fvha0.k;
        this.m = fvha0.l;
        this.n = fvha0.m;
        this.o = fvha0.n;
        this.p = fvha0.o;
        this.q = fvha0.p;
    }

    @Override  // fvhd
    public final int b() {
        return 3600;
    }

    @Override  // fvhd
    public final fvhw e() {
        return this.b;
    }

    @Override  // fvhd
    public final boolean f(fveh fveh0) {
        return fveh0.D == 3;
    }

    @Override  // fvhd
    public final boolean g(fveh fveh0) {
        return this.o == 0 && this.l != 0.0;
    }
}

