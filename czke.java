public final class czke {
    public static void A(String s, int v, hfub hfub0, gymd gymd0) {
        czke.B(s, v, hfub0, gymd0, null);
    }

    public static void B(String s, int v, hfub hfub0, gymd gymd0, String s1) {
        czke.E(s, hfub0, czke.F(gyxl.f, v, hfub0, gymd0, s1, null));
    }

    public static void C(String s, hfub hfub0) {
        czke.k(s, 2, hfub0, gymd.cn);
    }

    public static void D(String s, hfub hfub0, gymd gymd0) {
        czke.x(s, 8, hfub0, gymd0, null);
    }

    private static void E(String s, hfub hfub0, cvah cvah0) {
        String s1 = czmk.u(s);
        int v = hfub0.a();
        czkd czkd0 = new czkd(cvah0.a, cvah0.t, v, cvah0.b, cvah0.c);
        switch(czkd0.b - 1) {
            case 1: 
            case 3: 
            case 4: {
                cunf cunf0 = czkq.a;
                cunf0.c().i("MEDIUM_ERROR %s, %s", czkd0, gxyf.b(gxye.k, s1));
                String s2 = czkd0.a;
                if(s2 != null) {
                    cunf0.c().h("Extra Sensitive/PII message : %s", s2);
                }
                break;
            }
            case 2: 
            case 5: {
                cunf cunf1 = czkq.a;
                cunf1.e().i("MEDIUM_ERROR %s, %s", czkd0, gxyf.b(gxye.k, s1));
                String s3 = czkd0.a;
                if(s3 != null) {
                    cunf1.e().h("Extra Sensitive/PII message : %s", s3);
                }
                break;
            }
            default: {
                czkq.a.c().h("Invalid! This is unknown type error code. %s", czkd0);
            }
        }
        czjv.a().b(s1, cvah0);
    }

    private static cvah F(gyxl gyxl0, int v, hfub hfub0, gymd gymd0, String s, String s1) {
        gylz gylz0 = gylz.a;
        gymb gymb0 = gymb.n;
        gymf gymf0 = gymf.b;
        gymn gymn0 = gymn.a;
        gymj gymj0 = gymj.a;
        gymp gymp0 = gymp.n;
        gymv gymv0 = gymv.e;
        gymr gymr0 = gymr.k;
        gymx gymx0 = gymx.d;
        gymt gymt0 = gymt.h;
        gymz gymz0 = gymz.b;
        gylx gylx0 = gylx.a;
        gyml gyml0 = gyml.a;
        gynb gynb0 = gynb.a;
        Boolean boolean0 = Boolean.valueOf(true);
        if(czkd.a(hfub0.a())) {
            return new cvah(gyxl0, v, gymd0, s, boolean0, gylz.b(hfub0.a()), gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
        }
        try {
            Boolean boolean1 = Boolean.valueOf(false);
            switch(v - 1) {
                case 1: {
                    gymp0 = gymp.b(hfub0.a());
                    return new cvah(gyxl0, 2, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 2: {
                    gymv0 = gymv.b(hfub0.a());
                    return new cvah(gyxl0, 3, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 3: {
                    gymt0 = gymt.b(hfub0.a());
                    return new cvah(gyxl0, 4, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 4: {
                    gymz0 = gymz.b(hfub0.a());
                    return new cvah(gyxl0, 5, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 5: {
                    gymr0 = gymr.b(hfub0.a());
                    return new cvah(gyxl0, 6, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 6: {
                    gymx0 = gymx.b(hfub0.a());
                    return new cvah(gyxl0, 7, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 7: {
                    gymb0 = gymb.b(hfub0.a());
                    return new cvah(gyxl0, 8, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 8: {
                    gymf0 = gymf.b(hfub0.a());
                    return new cvah(gyxl0, 9, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 9: {
                    gylx0 = gylx.b(hfub0.a());
                    return new cvah(gyxl0, 10, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 10: {
                    gyml0 = gyml.b(hfub0.a());
                    return new cvah(gyxl0, 11, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 11: {
                    gymn0 = gymn.b(hfub0.a());
                    return new cvah(gyxl0, 12, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 13: {
                    gymj0 = gymj.b(hfub0.a());
                    return new cvah(gyxl0, 14, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
                case 14: {
                    gynb0 = gynb.b(hfub0.a());
                    return new cvah(gyxl0, 15, gymd0, s, boolean1, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
                }
            }
        }
        catch(NullPointerException nullPointerException0) {
            czkq.a.e().f(nullPointerException0).h("Unexpected call set Error: errorNumber %d", Integer.valueOf(hfub0.a()));
            return new cvah(gyxl0, v, gymd0, s, boolean0, gylz.a, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
        }
        return new cvah(gyxl0, v, gymd0, s, boolean0, gylz0, gymb0, gymf0, gymn0, gymj0, gymp0, gymv0, gymr0, gymx0, gymt0, gymz0, gylx0, gyml0, gynb0, s1);
    }

    public static void a(cvae cvae0, hfub hfub0, gymd gymd0, String s) {
        cvah cvah0 = czke.F(gyxl.c, cvae0.c, hfub0, gymd0, s, cvae0.b);
        czke.E(cvae0.a, hfub0, cvah0);
    }

    public static void b(cvae cvae0, hfub hfub0, gymd gymd0, String s) {
        cvah cvah0 = czke.F(gyxl.j, cvae0.c, hfub0, gymd0, s, cvae0.b);
        czke.E(cvae0.a, hfub0, cvah0);
    }

    public static void c(cvae cvae0, hfub hfub0, gymd gymd0, String s) {
        cvah cvah0 = czke.F(gyxl.g, cvae0.c, hfub0, gymd0, s, cvae0.b);
        czke.E(cvae0.a, hfub0, cvah0);
    }

    public static void d(cvae cvae0, hfub hfub0, gymd gymd0, String s) {
        cvah cvah0 = czke.F(gyxl.i, cvae0.c, hfub0, gymd0, s, cvae0.b);
        czke.E(cvae0.a, hfub0, cvah0);
    }

    public static void e(cvae cvae0, hfub hfub0, gymd gymd0, String s) {
        cvah cvah0 = czke.F(gyxl.d, cvae0.c, hfub0, gymd0, s, cvae0.b);
        czke.E(cvae0.a, hfub0, cvah0);
    }

    public static void f(cvae cvae0, hfub hfub0, gymd gymd0, String s) {
        cvah cvah0 = czke.F(gyxl.f, cvae0.c, hfub0, gymd0, s, cvae0.b);
        czke.E(cvae0.a, hfub0, cvah0);
    }

    public static void g(cvae cvae0, hfub hfub0, gymd gymd0) {
        cvah cvah0 = czke.F(gyxl.e, cvae0.c, hfub0, gymd0, null, cvae0.b);
        czke.E(cvae0.a, hfub0, cvah0);
    }

    public static void h(String s, int v, hfub hfub0) {
        czke.i(s, v, hfub0, gymd.cn);
    }

    public static void i(String s, int v, hfub hfub0, gymd gymd0) {
        czke.j(s, v, hfub0, gymd0, null);
    }

    public static void j(String s, int v, hfub hfub0, gymd gymd0, String s1) {
        czke.E(s, hfub0, czke.F(gyxl.e, v, hfub0, gymd0, s1, null));
    }

    public static void k(String s, int v, hfub hfub0, gymd gymd0) {
        czke.l(s, v, hfub0, gymd0, null);
    }

    public static void l(String s, int v, hfub hfub0, gymd gymd0, String s1) {
        czke.E(s, hfub0, czke.F(gyxl.c, v, hfub0, gymd0, s1, null));
    }

    public static void m(gyxl gyxl0, String s, int v, hfub hfub0, gymd gymd0) {
        czke.n(gyxl0, s, v, hfub0, gymd0, null);
    }

    public static void n(gyxl gyxl0, String s, int v, hfub hfub0, gymd gymd0, String s1) {
        czke.E(s, hfub0, czke.F(gyxl0, v, hfub0, gymd0, s1, null));
    }

    public static void o(String s, int v, hfub hfub0) {
        czke.p(s, v, hfub0, gymd.cn);
    }

    public static void p(String s, int v, hfub hfub0, gymd gymd0) {
        czke.q(s, v, hfub0, gymd0, null);
    }

    public static void q(String s, int v, hfub hfub0, gymd gymd0, String s1) {
        czke.E(s, hfub0, czke.F(gyxl.h, v, hfub0, gymd0, s1, null));
    }

    public static void r(gyxl gyxl0, String s, int v, hfub hfub0, gymd gymd0, String s1, String s2) {
        czke.E(s, hfub0, czke.F(gyxl0, v, hfub0, gymd0, s1, s2));
    }

    public static void s(String s, int v, hfub hfub0, gymd gymd0) {
        czke.t(s, v, hfub0, gymd0, null);
    }

    public static void t(String s, int v, hfub hfub0, gymd gymd0, String s1) {
        czke.E(s, hfub0, czke.F(gyxl.j, v, hfub0, gymd0, s1, null));
    }

    public static void u(String s, int v, hfub hfub0) {
        czke.v(s, v, hfub0, gymd.cn);
    }

    public static void v(String s, int v, hfub hfub0, gymd gymd0) {
        czke.w(s, v, hfub0, gymd0, null);
    }

    public static void w(String s, int v, hfub hfub0, gymd gymd0, String s1) {
        czke.E(s, hfub0, czke.F(gyxl.g, v, hfub0, gymd0, s1, null));
    }

    public static void x(String s, int v, hfub hfub0, gymd gymd0, String s1) {
        czke.E(s, hfub0, czke.F(gyxl.i, v, hfub0, gymd0, s1, null));
    }

    public static void y(String s, int v, hfub hfub0, gymd gymd0, String s1) {
        czke.E(s, hfub0, czke.F(gyxl.d, v, hfub0, gymd0, s1, null));
    }

    public static void z(String s, int v, hfub hfub0) {
        czke.A(s, v, hfub0, gymd.cn);
    }
}

