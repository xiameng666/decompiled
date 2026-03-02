public final class fvie {
    public static final double a;
    public static final double b;

    static {
        fvie.a = Math.cos(Math.toRadians(-5.0));
        fvie.b = Math.sin(Math.toRadians(-5.0));
    }

    public static double a(fvhj fvhj0) {
        return (fvhj0 instanceof fvhf) || (fvhj0 instanceof fvho) ? 398600500000000.0 : 398600441800000.0;
    }

    public static double b(fvhj fvhj0) {
        return (fvhj0 instanceof fvgw) ? 0.000073 : 0.000073;
    }

    public static fvid c(double f, fvhj fvhj0, fvhw fvhw0) {
        fvhl fvhl0 = fvhj0.k;
        double f1 = fvhl0.e;
        double f2 = f1 * f1;
        double f3 = Math.sqrt(fvie.a(fvhj0) / (f2 * f2 * f2)) + fvhl0.b;
        double f4 = (double)fvhw0.b(fvhj0.d(f));
        fvhh fvhh0 = fvhj0.c(f);
        double f5 = fvie.e(f4 * 1.000000E-09);
        double f6 = fvhj0.a(f);
        double f7 = fvhh0.b + fvhh0.c * f5 + fvhh0.d * f5 * f5 - f6;
        double f8 = (double)fvhw0.b(fvhj0.e());
        double f9 = f7;
        int v = 0;
    label_12:
        while(v <= 100) {
            double f10 = fvhl0.c + fvie.e(f8 * 1.000000E-09 - f9) * f3;
            double f11 = f10;
            int v1 = 0;
            while(v1 <= 100) {
                double f12 = -0.0;
                double f13 = fvhl0.d;
                double f14 = f10 + Math.sin(f11) * f13;
                ++v1;
                if(Math.abs(f11 - f14) > 1.000000E-12) {
                    f11 = f14;
                    continue;
                }
                if(!(fvhj0 instanceof fvhf) && !(fvhj0 instanceof fvho)) {
                    f12 = -0.0;
                }
                double f15 = f12 * f13 * f1 * Math.sin(f14) + f7;
                ++v;
                if((Math.abs(f9 - f15) > 1.000000E-12)) {
                    f9 = f15;
                    f8 = f8;
                    continue label_12;
                }
                return new fvid(f15 * 299792458.0, f14, f8 * 1.000000E-09 - f15);
            }
            throw new ArithmeticException("Kepler Eccentric Anomaly calculation did not converge in 100 iterations");
        }
        throw new ArithmeticException("Satellite Clock Correction calculation did not converge in 100 iterations");
    }

    public static boolean d(fvhj fvhj0) {
        return Math.abs(fvhj0.k.e * fvhj0.k.e / 1000.0 - 42164.0) <= 1000.0 && Math.abs(Math.toDegrees(fvhj0.k.j)) <= 20.0 && fvhj0.k.d < 0.1 && (fvhj0 instanceof fvgw);
    }

    private static double e(double f) {
        return f < -302400.0 ? f + 604800.0 : (f > 302400.0 ? -604800.0 + f : f);
    }
}

