public final class fvgq {
    public static fvgp a(fvgr fvgr0, fvgr fvgr1) {
        double f5;
        double f4;
        fvgr fvgr2 = new fvgr(fvgr1.a - fvgr0.a, fvgr1.b - fvgr0.b, fvgr1.c - fvgr0.c);
        fvgn fvgn0 = fvgo.a(fvgr0);
        cjdt cjdt0 = fvgm.a(fvgn0.a, fvgn0.b);
        cjdt cjdt1 = new cjdt(3, 1);
        gpvu.b(cjdt0, new cjdt(new double[][]{new double[]{fvgr2.a}, new double[]{fvgr2.b}, new double[]{fvgr2.c}}), cjdt1);
        double f = cjdt1.a(0, 0);
        double f1 = cjdt1.a(1, 0);
        double f2 = cjdt1.a(2, 0);
        double f3 = Math.hypot(f, f1);
        if(Double.compare(f3, 1.000000E-22) < 0) {
            f4 = 1.570796;
            f5 = 0.0;
        }
        else {
            f4 = Math.atan2(f2, f3);
            f5 = Math.atan2(f, f1);
        }
        if((f5 < 0.0)) {
            f5 += 6.283185;
        }
        return new fvgp(f5, f4);
    }
}

