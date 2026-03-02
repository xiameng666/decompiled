public final class fvfy {
    public static double a(fvgr fvgr0, fvgr fvgr1, double f, gxmd gxmd0, double f1) {
        fvgp fvgp0 = fvgq.a(fvgr0, fvgr1);
        fvgn fvgn0 = fvgo.a(fvgr0);
        double f2 = fvgn0.b;
        double f3 = fvgp0.b / 3.141593;
        double f4 = fvgp0.a / 3.141593 * 3.141593;
        double f5 = 0.0137 / (0.11 + f3) - 0.022;
        double f6 = fvgn0.a / 3.141593 + Math.cos(f4) * f5;
        if(f6 > 0.416) {
            f6 = 0.416;
        }
        else if(f6 >= -0.416) {
        }
        else {
            f6 = 0.416;
        }
        double f7 = f2 / 3.141593 + f5 * Math.sin(f4) / Math.cos(f6 * 3.141593);
        double f8 = (f7 * 43200.0 + f) % 86400.0;
        double f9 = f6 + Math.cos(3.141593 * f7 - 5.08) * 0.064;
        double f10 = gxmd0.d.d(0) + gxmd0.d.d(1) * f9 + gxmd0.d.d(2) * f9 * f9 + gxmd0.d.d(3) * f9 * f9 * f9;
        if((f10 < 0.0)) {
            f10 = 0.0;
        }
        double f11 = gxmd0.e.d(0) + gxmd0.e.d(1) * f9 + gxmd0.e.d(2) * f9 * f9 + gxmd0.e.d(3) * f9 * f9 * f9;
        if((f11 < 72000.0)) {
            f11 = 72000.0;
        }
        double f12 = ((f8 < 0.0 ? f8 + 86400.0 : (f7 * 43200.0 + f) % 86400.0) - 50400.0) * 6.283185 / f11;
        double f13 = Math.pow(0.53 - f3, 3.0) * 16.0 + 1.0;
        return Double.compare(Math.abs(f12), 1.570796) < 0 ? f13 * ((1.0 - Math.pow(f12, 2.0) / 2.0 + Math.pow(f12, 4.0) / 24.0) * f10 + 5.000000E-09) * Math.pow(1575420000.0 / f1, 2.0) : f13 * 5.000000E-09 * Math.pow(1575420000.0 / f1, 2.0);
    }
}

