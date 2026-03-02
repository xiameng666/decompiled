public final class fviv {
    public final fvgr a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;

    public fviv(fvcl fvcl0) {
        ggzv ggzv0 = fvcl0.i(fvcl0.e(0, 0));
        fvgr fvgr0 = fvgs.a(new fvgn(ggzv0.a, ggzv0.b, 0.0));
        ggzv ggzv1 = fvcl0.i(fvcl0.e(fvcl0.d - 1, 0));
        fvgr fvgr1 = fvgs.a(new fvgn(ggzv1.a, ggzv1.b, 0.0));
        ggzv ggzv2 = fvcl0.i(fvcl0.e(0, fvcl0.e - 1));
        fvgr fvgr2 = fvgs.a(new fvgn(ggzv2.a, ggzv2.b, 0.0));
        fvgr fvgr3 = fvgs.a(new fvgn(ggzv0.a, ggzv0.b, 100.0));
        double f = (double)(fvcl0.d - 1);
        this.b = (fvgr1.a - fvgr0.a) / f;
        this.c = (fvgr1.b - fvgr0.b) / f;
        this.d = (fvgr1.c - fvgr0.c) / f;
        double f1 = (double)(fvcl0.e - 1);
        this.e = (fvgr2.a - fvgr0.a) / f1;
        this.f = (fvgr2.b - fvgr0.b) / f1;
        this.g = (fvgr2.c - fvgr0.c) / f1;
        this.h = (fvgr3.a - fvgr0.a) / 100.0;
        this.i = (fvgr3.b - fvgr0.b) / 100.0;
        this.j = (fvgr3.c - fvgr0.c) / 100.0;
        this.a = fvgr0;
    }
}

