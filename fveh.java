public enum fveh {
    GPS_L1(1, 1575420000.0),
    GPS_L2(1, 1227600000.0),
    GPS_L5(1, 1176450000.0),
    GLO_G1(3, 1602000000.0),
    GLO_G1A(3, 1600995000.0),
    GLO_G2(3, 1246000000.0),
    GLO_G2A(3, 1248060000.0),
    GLO_G3(3, 1202025000.0),
    GAL_E1(6, 1575420000.0),
    GAL_E5A(6, 1176450000.0),
    GAL_E5B(6, 1207140000.0),
    GAL_E5_ALTBOC(6, 1191795000.0),
    GAL_E6(6, 1278750000.0),
    SBAS_L1(2, 1575420000.0),
    SBAS_L5(2, 1176450000.0),
    QZS_L1(4, 1575420000.0),
    QZS_L2(4, 1227600000.0),
    QZS_L5(4, 1176450000.0),
    QZS_L6(4, 1278750000.0),
    BDS_B1(5, 1561098000.0),
    BDS_B1C(5, 1575420000.0),
    BDS_B2A(5, 1176450000.0),
    BDS_B2(5, 1207140000.0),
    BDS_B2AB(5, 1191795000.0),
    BDS_B3(5, 1268520000.0),
    IRN_L1(7, 1575420000.0),
    IRN_L5(7, 1176450000.0),
    IRN_S(7, 2492028000.0),
    UNKNOWN(0, 0.0);

    public final int D;
    public final double E;

    static {
        ggfp.O(fveh.a, fveh.d, fveh.e, fveh.i, fveh.t, fveh.u, new fveh[]{fveh.p, fveh.n, fveh.z});
        ggfp.M(fveh.b, fveh.f, fveh.g, fveh.q);
        ggfp.O(fveh.c, fveh.h, fveh.j, fveh.k, fveh.l, fveh.v, new fveh[]{fveh.w, fveh.x, fveh.r, fveh.o, fveh.A});
        ggfp.L(fveh.m, fveh.y, fveh.s);
        new ggoh(fveh.B);
        ggek ggek0 = new ggek();
        Double double0 = (double)0.000001;
        ggek0.i(fveh.a, double0);
        Double double1 = (double)9.775171E-08;
        ggek0.i(fveh.c, double1);
        ggek0.i(fveh.i, double0);
        ggek0.i(fveh.j, double1);
        ggek0.i(fveh.k, double1);
        ggek0.i(fveh.d, Double.valueOf(0.000002));
        ggek0.i(fveh.t, Double.valueOf(4.887586E-07));
        ggek0.i(fveh.u, double0);
        ggek0.i(fveh.v, double1);
        ggek0.i(fveh.w, double1);
        ggek0.i(fveh.p, double0);
        ggek0.i(fveh.r, double1);
        ggek0.i(fveh.n, double0);
        ggek0.i(fveh.o, double1);
        ggek0.i(fveh.A, double0);
        ggkm.c(ggek0.b());
        ggek ggek1 = new ggek();
        ggek1.i(fveh.a, Double.valueOf(586.104512));
        ggek1.i(fveh.c, Double.valueOf(58.610451));
        ggek1.i(fveh.i, Double.valueOf(207.0));
        ggek1.i(fveh.j, Double.valueOf(58.610451));
        ggek1.i(fveh.k, Double.valueOf(58.610451));
        ggek1.i(fveh.d, Double.valueOf(1173.356));
        ggek1.i(fveh.t, Double.valueOf(293.052256));
        ggek1.i(fveh.u, Double.valueOf(586.104512));
        ggek1.i(fveh.v, Double.valueOf(58.610451));
        ggek1.i(fveh.w, Double.valueOf(58.610451));
        ggek1.i(fveh.p, Double.valueOf(586.104512));
        ggek1.i(fveh.r, Double.valueOf(58.610451));
        ggek1.i(fveh.n, Double.valueOf(586.104512));
        ggek1.i(fveh.o, Double.valueOf(58.610451));
        ggkm.c(ggek1.b());
    }

    private fveh(int v1, double f) {
        this.D = v1;
        this.E = f;
    }

    public static fveh a(int v, double f) {
        switch(v) {
            case 1: {
                Double double0 = f;
                if(!fvec.a.s(double0)) {
                    if(f == 0.0) {
                        return fveh.a;
                    }
                    if(fvec.b.s(double0)) {
                        return fveh.b;
                    }
                    return fvec.c.s(double0) ? fveh.c : fveh.C;
                }
                return fveh.a;
            }
            case 2: {
                Double double1 = f;
                if(!fveg.a.s(double1)) {
                    if(f == 0.0) {
                        return fveh.n;
                    }
                    return fveg.b.s(double1) ? fveh.o : fveh.C;
                }
                return fveh.n;
            }
            case 3: {
                if(fven.b(1600995000.0, f)) {
                    return fveh.e;
                }
                Double double2 = f;
                if(!fveb.a.s(double2)) {
                    if(f == 0.0) {
                        return fveh.d;
                    }
                    if(fven.b(1248060000.0, f)) {
                        return fveh.g;
                    }
                    if(fveb.c.s(double2)) {
                        return fveh.f;
                    }
                    return fveb.e.s(double2) ? fveh.h : fveh.C;
                }
                return fveh.d;
            }
            case 4: {
                Double double3 = f;
                if(!fvee.a.s(double3)) {
                    if(f == 0.0) {
                        return fveh.p;
                    }
                    if(fvee.b.s(double3)) {
                        return fveh.q;
                    }
                    if(fvee.c.s(double3)) {
                        return fveh.r;
                    }
                    return fvee.d.s(double3) ? fveh.s : fveh.C;
                }
                return fveh.p;
            }
            case 5: {
                Double double4 = f;
                if(!fvdz.a.s(double4)) {
                    if(f == 0.0) {
                        return fveh.t;
                    }
                    if(fven.b(1575420000.0, f)) {
                        return fveh.u;
                    }
                    if(fvdz.c.s(double4)) {
                        return fveh.v;
                    }
                    if(fvdz.d.s(double4)) {
                        return fveh.w;
                    }
                    if(fven.b(1191795000.0, f)) {
                        return fveh.x;
                    }
                    return fvdz.e.s(double4) ? fveh.y : fveh.C;
                }
                return fveh.t;
            }
            case 6: {
                Double double5 = f;
                if(!fvea.a.s(double5)) {
                    if(f == 0.0) {
                        return fveh.i;
                    }
                    if(fven.b(1191795000.0, f)) {
                        return fveh.l;
                    }
                    if(fvea.b.s(double5)) {
                        return fveh.j;
                    }
                    if(fvea.c.s(double5)) {
                        return fveh.k;
                    }
                    return fvea.e.s(double5) ? fveh.m : fveh.C;
                }
                return fveh.i;
            }
            case 7: {
                Double double6 = f;
                if(!fved.a.s(double6)) {
                    if(f == 0.0) {
                        return fveh.z;
                    }
                    if(fved.b.s(double6)) {
                        return fveh.A;
                    }
                    return fved.c.s(double6) ? fveh.B : fveh.C;
                }
                return fveh.z;
            }
            default: {
                return fveh.C;
            }
        }
    }

    // String Decryptor: 13 succeeded, 0 failed
    private static double b(double f) {
        return (f + f) * 299792458.0;
    }
}

