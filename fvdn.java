public final class fvdn {
    public static final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final boolean i;
    public gpuk j;
    public EquirectangularProjection k;
    public long l;
    private final double m;

    static {
        fvdn.a = Math.toRadians(15.0);
    }

    public fvdn(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7, boolean z) {
        this.l = 0L;
        this.c = f;
        this.b = f1;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.m = f5;
        this.g = f6;
        this.h = f7;
        this.i = z;
    }

    public final void a(gptu_Position gptu0, long v) {
        double f2;
        double f1;
        this.k = new EquirectangularProjection(gptu0.latE7, gptu0.lngE7);
        cjdt cjdt0 = new cjdt(5, 1);
        cjdt0.e(0, 0, this.k.lngE7ToMetersX(gptu0.lngE7));
        cjdt0.e(1, 0, this.k.latE7ToMetersY(gptu0.latE7));
        double f = (double)gptu0.speedMps;
        if(f == 0.0) {
            f1 = 0.0;
            f2 = 0.0;
        }
        else {
            double f3 = AngleUtils.c(Math.toRadians(gptu0.bearingDegrees));
            f2 = Math.cos(f3) * f;
            f1 = Math.sin(f3) * f;
        }
        cjdt0.e(2, 0, f2);
        cjdt0.e(3, 0, f1);
        cjdt0.e(4, 0, 0.0);
        cjdt cjdt1 = cjdt.b(5);
        double f4 = ((double)gptu0.accuracyMm) * 0.001;
        double f5 = f4 + f4;
        double f6 = f5 * f5 / 2.0;
        cjdt1.e(0, 0, f6);
        cjdt1.e(1, 1, f6);
        double f7 = this.m + this.m;
        double f8 = f7 * f7;
        cjdt1.e(2, 2, f8);
        cjdt1.e(3, 3, f8);
        cjdt1.e(4, 4, 1.0);
        this.j = new gpuk(cjdt0, cjdt1);
        this.l = v;
    }
}

