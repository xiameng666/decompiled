public final class fvgs {
    public static fvgr a(fvgn fvgn0) {
        double f = Math.sin(fvgn0.a);
        double f1 = 6378137.0 / Math.sqrt(1.0 - Math.pow(0.081819, 2.0) * f * f);
        double f2 = (fvgn0.c + f1) * Math.cos(fvgn0.a);
        return new fvgr(f2 * Math.cos(fvgn0.b), f2 * Math.sin(fvgn0.b), (fvgn0.c + f1 * (1.0 - Math.pow(0.081819, 2.0))) * f);
    }
}

