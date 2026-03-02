public final class fvjv {
    public static double a(double f) {
        double f1 = ((long)f) + ((long)f) + 15.0;
        for(int v = 1; v < 2; v = 2) {
            f1 = Math.min(f1, 100.0);
        }
        return f1;
    }

    public static ggzv b(ggzv ggzv0, double f, double f1) {
        double f2 = 0x4056800000000000L - ((long)f);
        ggzv ggzv1 = ggzv.i(Math.toDegrees(Math.sin(Math.toRadians(f2)) * f1 / 6367000.0), Math.toDegrees(GeoMath.f(f1 * Math.cos(Math.toRadians(f2)), Math.toRadians(ggzv0.b()))));
        return new ggzv(ggzv0.a + ggzv1.a, ggzv0.b + ggzv1.b);
    }
}

