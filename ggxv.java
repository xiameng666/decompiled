public final class ggxv {
    public static final double a;
    public static final double b;
    public static final ggxp c;
    public static final double d;
    public static final ghae e;
    private static final int[] f;
    private static final int[][] g;
    private static final ghae[] h;

    static {
        ggxv.a = 1.0 / Math.sqrt(2.0);
        ggxv.b = Math.sqrt(2.0);
        double f = Math.sqrt(3.0);
        ggxp ggxp0 = new ggxp(8.881784E-16);
        ggxv.c = ggxp0;
        ggxv.d = 32.0 * f * 1.110223E-16 / (ggxp0.c / 1.110223E-16 - (f + f + 1.0));
        ggxv.e = new ghae(-0.009999, 0.002592, 0.999947);
        ggxv.f = new int[]{1, 0, 0, 3};
        ggxv.g = new int[][]{new int[]{0, 1, 3, 2}, new int[]{0, 2, 3, 1}, new int[]{3, 2, 0, 1}, new int[]{3, 1, 0, 2}};
        ggxv.h = new ghae[]{new ghae(1.0, 0.0053, 0.00457), new ghae(0.012, 1.0, 0.00457), new ghae(0.012, 0.0053, 1.0)};
    }

    public static double a(int v) {
        return ((double)v) * 2.160494E-15;
    }

    public static double b(ghae ghae0, ghae ghae1) {
        double f = Math.atan2(ghae.r(ghae0, ghae1).e(), ghae.l(ghae0, ghae1).e());
        return f + f;
    }

    public static double c(ghae ghae0, ghae ghae1, ghae ghae2) {
        double f = ghbs.a(ghae0, ghae1).a(ghbs.a(ghae1, ghae2));
        return ghau.a(ghae0, ghae1, ghae2) <= 0 ? -f : f;
    }

    public static int d(int v, int v1) {
        return ggxv.g[v][v1];
    }

    public static int e(int v) {
        gftb.checkTrue(v >= 0 && v < 4);
        return ggxv.f[v];
    }

    public static ghae f(ghae ghae0) {
        return ghae.q(ghae.n(ghae0, ggxv.h[(ghae.k(ghae0.h, ghae0.i, ghae0.j) - 1 >= 0 ? ghae.k(ghae0.h, ghae0.i, ghae0.j) - 1 : 2)]));
    }

    public static boolean g(ghae ghae0) {
        return Math.abs(ghae0.g() - 1.0) <= 1.110223E-15;
    }
}

