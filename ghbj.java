public final class ghbj {
    public static final ggxu a;
    public static final ggxu b;
    public static final ggxu c;
    private static final double d;
    private static final ghae[][] e;
    private static final ghbh[] f;
    private static final ghbi[] g;

    static {
        double f = Math.sqrt(2.0);
        double f1 = (f + f) / 3.0;
        ghbj.d = f1;
        ghbj.e = new ghae[][]{new ghae[]{ghae.d, ghae.f, ghae.b}, new ghae[]{ghae.c, ghae.f, ghae.d}, new ghae[]{ghae.c, ghae.e, ghae.f}, new ghae[]{ghae.g, ghae.e, ghae.c}, new ghae[]{ghae.g, ghae.b, ghae.e}, new ghae[]{ghae.d, ghae.b, ghae.g}};
        ghbj.f = new ghbh[]{new ghay(), new ghaz(), new ghba(), new ghbb(), new ghbc(), new ghbd()};
        ghbj.g = new ghbi[]{new ghbe(), new ghbf(), new ghbg(), new ghav(), new ghaw(), new ghax()};
        ghbj.a = new ggxu(2, 2.094395);
        ghbj.b = new ggxu(1, f1);
        ghbj.c = new ggxu(1, 1.459214);
    }

    public static double a(int v, int v1) {
        return ghbj.c(((double)(v & -v1)) * 9.313226E-10);
    }

    public static double b(long v) {
        return ((double)v) * 4.656613E-10;
    }

    public static double c(double f) {
        return Double.compare(f, 0.5) < 0 ? (1.0 - 4.0 * (1.0 - f) * (1.0 - f)) * 0.333333 : (4.0 * f * f - 1.0) * 0.333333;
    }

    public static double d(double f) {
        return Double.compare(f, 0.0) < 0 ? 1.0 - Math.sqrt(1.0 - f * 3.0) * 0.5 : Math.sqrt(f * 3.0 + 1.0) * 0.5;
    }

    public static int e(double f) {
        return Math.max(0, Math.min(0x3FFFFFFF, ((int)Math.round(((long)f) * 0x41D0000000000000L - 0.5))));
    }

    public static int f(ghae ghae0) {
        return ghbj.g(ghae0.h, ghae0.i, ghae0.j);
    }

    static int g(double f, double f1, double f2) {
        switch(ghae.k(f, f1, f2)) {
            case 0: {
                return f < 0.0 ? 3 : 0;
            }
            case 1: {
                return f1 < 0.0 ? 4 : 1;
            }
            default: {
                return f2 < 0.0 ? 5 : 2;
            }
        }
    }

    public static ghae h(int v, long v1, long v2) {
        return ghbj.i(v, ghbj.c(ghbj.b(v1)), ghbj.c(ghbj.b(v2)));
    }

    public static ghae i(int v, double f, double f1) {
        ghbi ghbi0 = ghbj.o(v);
        return new ghae(ghbi0.a(f, f1), ghbi0.b(f, f1), ghbi0.c(f, f1));
    }

    public static ghae j(int v, ghae ghae0) {
        switch(v) {
            case 0: {
                return new ghae(ghae0.i, ghae0.j, ghae0.h);
            }
            case 1: {
                return new ghae(-ghae0.h, ghae0.j, ghae0.i);
            }
            case 2: {
                return new ghae(-ghae0.h, -ghae0.i, ghae0.j);
            }
            case 3: {
                return new ghae(-ghae0.j, -ghae0.i, -ghae0.h);
            }
            case 4: {
                return new ghae(-ghae0.j, ghae0.h, -ghae0.i);
            }
            default: {
                return new ghae(ghae0.i, ghae0.h, -ghae0.j);
            }
        }
    }

    public static ghae k(int v, double f) {
        switch(v) {
            case 0: {
                return new ghae(f, -1.0, 0.0);
            }
            case 1: {
                return new ghae(1.0, f, 0.0);
            }
            case 2: {
                return new ghae(1.0, 0.0, f);
            }
            case 3: {
                return new ghae(-f, 0.0, 1.0);
            }
            case 4: {
                return new ghae(0.0, -f, 1.0);
            }
            default: {
                return new ghae(0.0, -1.0, -f);
            }
        }
    }

    static ghae l(int v, int v1) {
        return ghbj.e[v][v1];
    }

    public static ghae m(int v, double f) {
        switch(v) {
            case 0: {
                return new ghae(-f, 0.0, 1.0);
            }
            case 1: {
                return new ghae(0.0, -f, 1.0);
            }
            case 2: {
                return new ghae(0.0, -1.0, -f);
            }
            case 3: {
                return new ghae(f, -1.0, 0.0);
            }
            case 4: {
                return new ghae(1.0, f, 0.0);
            }
            default: {
                return new ghae(1.0, 0.0, f);
            }
        }
    }

    public static ghbh n(int v) {
        return ghbj.f[v];
    }

    static ghbi o(int v) {
        return ghbj.g[Math.min(5, v)];
    }

    static void p(int v, ghae ghae0, ggxn ggxn0) {
        ghbh ghbh0 = ghbj.n(v);
        ggxn0.c(ghbh0.a(ghae0.h, ghae0.i, ghae0.j), ghbh0.b(ghae0.h, ghae0.i, ghae0.j));
    }
}

