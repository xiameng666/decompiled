public final class ghac {
    public final ggym a;
    public final double b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    private final ggxm g;
    private ggxm h;

    public ghac(ggym ggym0, double f) {
        this.a = ggym0;
        this.b = f;
        if(ggym0.R()) {
            this.g = new ggxm(new ggxl(-(1.0 + f), 1.0 + f), new ggxl(-(1.0 + f), 1.0 + f));
            this.h = new ggxm(new ggxl(-f, f), new ggxl(-f, f));
            this.d = 0;
            this.c = 0;
            this.e = ggym0.b() & 1;
            this.f = 0;
            return;
        }
        long v = ggym0.t();
        int v1 = ggym.d(v);
        int v2 = ggym.e(v);
        this.e = ggym.f(v);
        int v3 = ggym0.j();
        this.f = v3;
        ggxm ggxm0 = new ggxm();
        int v4 = ggym.i(v3);
        ggym.N(v1, v4, ggxm0.a);
        ggym.N(v2, v4, ggxm0.b);
        this.g = ggxm0.b(f);
        int v5 = -ggym.i(v3);
        this.c = v1 & v5;
        this.d = v5 & v2;
    }

    public ghac(ghac ghac0, int v, int v1, int v2) {
        this.b = ghac0.b;
        ggxm ggxm0 = new ggxm(new ggxl(ghac0.g.a), new ggxl(ghac0.g.b));
        this.g = ggxm0;
        int v3 = 1;
        this.f = ghac0.f + 1;
        this.a = ghac0.a.u(v);
        int v4 = ggym.i(ghac0.f + 1);
        this.c = ghac0.c + v1 * v4;
        this.d = ghac0.d + v4 * v2;
        this.e = ggxv.e(v) ^ ghac0.e;
        ggxm ggxm1 = ghac0.a();
        int v5 = v1 == 0 ? 2 : 1;
        ggxk.b(v5, ggxm0.a, ggxk.a(v5, ggxm1.a));
        ggxl ggxl0 = ggxm0.b;
        ggxl ggxl1 = ggxm1.b;
        if(1 != v2) {
            v3 = 2;
        }
        ggxk.b(v3, ggxl0, ggxk.a(v3, ggxl1));
    }

    public final ggxm a() {
        if(this.h == null) {
            long v = (long)this.c;
            long v1 = (long)ggym.i(this.f);
            double f = ghbj.c(ghbj.b(v + v + v1));
            ggxl ggxl0 = new ggxl(f - this.b, f + this.b);
            long v2 = (long)this.d;
            double f1 = ghbj.c(ghbj.b(v2 + v2 + v1));
            this.h = new ggxm(ggxl0, new ggxl(f1 - this.b, f1 + this.b));
        }
        return this.h;
    }
}

