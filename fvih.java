public final class fvih {
    public static double a(fvgr fvgr0, fvgr fvgr1, int v) {
        return fvih.b(fvgr0, fvgr0.b(fvgr1) / 299792458.0, v).b(fvgr1) / 299792458.0;
    }

    public static fvgr b(fvgr fvgr0, double f, int v) {
        double f1 = f * (v == 3 || v == 5 ? 0.000073 : 0.000073);
        double f2 = Math.cos(f1);
        double f3 = Math.sin(f1);
        return new fvgr(fvgr0.a * f2 + fvgr0.b * f3, -fvgr0.a * f3 + fvgr0.b * f2, fvgr0.c);
    }

    public static double c(double f, double f1, int v) {
        if(f1 == 0.0) {
            return f;
        }
        double f2 = f / f1;
        return v - 1 == 0 ? f - Math.floor(f2) * f1 : f - ((double)Math.round(f2)) * f1;
    }
}

