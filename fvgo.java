public final class fvgo {
    public static final double a;
    private static final double b;

    static {
        double f = Math.sqrt(Math.pow(6378137.0, 2.0) * (1.0 - Math.pow(0.081819, 2.0)));
        fvgo.a = f;
        fvgo.b = Math.sqrt((Math.pow(6378137.0, 2.0) - Math.pow(f, 2.0)) / Math.pow(f, 2.0));
    }

    public static fvgn a(fvgr fvgr0) {
        return fvgo.b(fvgr0.a, fvgr0.b, fvgr0.c);
    }

    public static fvgn b(double f, double f1, double f2) {
        double f3 = Math.hypot(f, f1);
        double f4 = fvgo.a;
        double f5 = Math.atan2(f2 * 6378137.0, f4 * f3);
        double f6 = Math.atan2(f1, f);
        double f7 = Math.atan2(f2 + Math.pow(fvgo.b, 2.0) * f4 * Math.pow(Math.sin(f5), 3.0), f3 - Math.pow(0.081819, 2.0) * 6378137.0 * Math.pow(Math.cos(f5), 3.0));
        double f8 = f3 / Math.cos(f7) - 6378137.0 / Math.sqrt(1.0 - Math.pow(0.081819, 2.0) * Math.pow(Math.sin(f7), 2.0));
        if(Double.compare(Math.abs(f), 1.0) < 0 && (Math.abs(f1) < 1.0)) {
            f8 = Math.abs(f2) - f4;
        }
        return new fvgn(f7, f6, f8);
    }
}

