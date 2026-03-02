public final class fvdj {
    public static final double a;
    public static final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public fvdl h;
    public long i;

    static {
        fvdj.a = Math.toRadians(15.0);
        fvdj.b = Math.toRadians(15.0);
    }

    public fvdj(double f, double f1, double f2, double f3, double f4) {
        this.i = 0L;
        this.c = f;
        this.d = f1;
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    public static fvuf a(double f, double f1, double f2, double f3) {
        double f4 = Math.atan2(f1, f);
        return new fvuf(AngleUtils.d(f4), ((double)((Math.pow(f2 * Math.sin(f4), 2.0) + Math.pow(f3 * Math.cos(f4), 2.0)) / (f * f + f1 * f1))));
    }

    public final fvuf b(double f, double f1, double f2, double f3, long v) {
        fvuf fvuf0 = fvdj.a(f, f1, f2, f3);
        cjdt cjdt0 = new cjdt(2, 1);
        cjdt0.e(0, 0, ((Double)fvuf0.a).doubleValue());
        cjdt0.e(1, 0, 0.0);
        cjdt cjdt1 = cjdt.b(2);
        Double double0 = (Double)fvuf0.b;
        gftb.check(double0);
        cjdt1.e(0, 0, double0.doubleValue());
        cjdt1.e(1, 1, 9.869604);
        this.h = new fvdl(cjdt0, cjdt1);
        this.i = v;
        return fvuf0;
    }
}

