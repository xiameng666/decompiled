public final class ggze {
    public static final double a;
    public static final double b;

    static {
        double f = ggxv.a * 9.0 * 2.220446E-16;
        ggze.a = f;
        ggze.b = f + ggxv.b * 3.0 * 2.220446E-16;
    }

    static double a(double f, double f1, double f2, double f3, double f4) {
        return Math.abs(f1 - f) <= Math.abs(f2 - f) ? f3 + (f4 - f3) * ((f - f1) / (f2 - f1)) : f4 + (f3 - f4) * ((f - f2) / (f1 - f2));
    }

    static int b(ghae ghae0, ghae ghae1, ghae ghae2, ghae ghae3, ghae ghae4, double f, ggxn ggxn0) {
        int v;
        double f11;
        double f10;
        double f1 = 1.0 - ggze.a;
        double f2 = ghae1.j;
        if(Double.compare(f2, 0.0) > 0) {
            ggxn0.c(ghae1.h / f2, ghae1.i / f2);
            if(Math.max(Math.abs(ggxn0.a), Math.abs(ggxn0.b)) > f1) {
                goto label_7;
            }
            return 0;
        }
    label_7:
        double f3 = ghae2.h;
        double f4 = ghae2.i;
        double f5 = ghae2.j;
        double f6 = Math.abs(f3);
        double f7 = Math.abs(f4);
        double f8 = f6 - f7;
        double f9 = Math.abs(f5);
        if(Double.compare(Math.abs(f8), f9) == 0) {
            if(!(f6 >= f7)) {
                if((f7 - f9 >= f6)) {
                label_21:
                    if(Math.abs(f3) < Math.abs(f4)) {
                        f10 = f4 > 0.0 ? 1.0 : -1.0;
                        f11 = (-f10 * f3 - f5) / f4;
                    }
                    else {
                        goto label_29;
                    }
                }
                else {
                label_25:
                    if(((f3 < 0.0 ? 1 : 0) ^ (f4 < 0.0 ? 1 : 0) ^ (f5 < 0.0 ? 1 : 0)) == 0) {
                    label_29:
                        double f12 = f3 < 0.0 ? 1.0 : -1.0;
                        f11 = f12;
                        f10 = (-f12 * f4 - f5) / f3;
                    }
                    else {
                        f10 = f4 > 0.0 ? 1.0 : -1.0;
                        f11 = (-f10 * f3 - f5) / f4;
                    }
                }
            }
            else if((f6 - f9 >= f7)) {
                goto label_21;
            }
            else {
                goto label_25;
            }
        }
        else if((Math.abs(f8) >= f9)) {
            goto label_21;
        }
        else {
            goto label_25;
        }
        double f13 = f10 * f;
        ggxn0.a = f13;
        double f14 = f11 * f;
        ggxn0.b = f14;
        ghae ghae5 = new ghae(f13, f14, 1.0);
        if((ghae.r(ghae5, ghae0).b(ghae3) < 0.0)) {
            v = 2;
        }
        else {
            v = ghae.r(ghae5, ghae1).b(ghae4) < 0.0 ? 1 : 0;
        }
        if(v > 0) {
            if((f2 <= 0.0)) {
                return 3;
            }
            ggxn0.c(ghae1.h / f2, ghae1.i / f2);
        }
        return v;
    }

    public static boolean c(ghae ghae0, ghae ghae1, int v, double f, ggxn ggxn0, ggxn ggxn1) {
        if(ghbj.f(ghae0) == v && ghbj.f(ghae1) == v) {
            ghbj.p(v, ghae0, ggxn0);
            ghbj.p(v, ghae1, ggxn1);
            return true;
        }
        ghae ghae2 = ghbj.j(v, ghbs.a(ghae0, ghae1));
        ghae ghae3 = ghbj.j(v, ghae0);
        ghae ghae4 = ghbj.j(v, ghae1);
        ghae ghae5 = new ghae((f + 1.0) * ghae2.h, (f + 1.0) * ghae2.i, ghae2.j);
        double f1 = Math.abs(ghae5.h);
        double f2 = Math.abs(ghae5.i);
        double f3 = Math.abs(ghae5.j);
        if(Double.compare(f2, f3 - f1) >= 0 && (f1 >= f3 - f2)) {
            ghae ghae6 = ghae.q(ghae2);
            ghae ghae7 = ghae.n(ghae6, ghae3);
            ghae ghae8 = ghae.n(ghae4, ghae6);
            return ggze.b(ghae4, ghae3, ghae.p(ghae5), ghae8, ghae7, f + 1.0, ggxn0) + ggze.b(ghae3, ghae4, ghae5, ghae7, ghae8, f + 1.0, ggxn1) < 3;
        }
        return false;
    }

    static boolean d(ggxn ggxn0, ggxn ggxn1, ggxm ggxm0) {
        ggxm ggxm1 = ggxm.c(ggxn0, ggxn1);
        if(ggxm0.a.i(ggxm1.a) && ggxm0.b.i(ggxm1.b)) {
            ggxn ggxn2 = ggxn.b(ggxn1, ggxn0);
            ggxn ggxn3 = new ggxn(-ggxn2.b, ggxn2.a);
            int v = Double.compare(ggxn3.a, 0.0) < 0 ? 0 : 1;
            int v1 = ggxn3.b >= 0.0 ? 1 : 0;
            return ggxn.a(ggxn3, ggxn.b(ggxm0.d(v, v1), ggxn0)) >= 0.0 && ggxn.a(ggxn3, ggxn.b(ggxm0.d(1 - v, 1 - v1), ggxn0)) <= 0.0;
        }
        return false;
    }

    public static boolean e(ghae ghae0, ghae ghae1, ghae ghae2, ghae ghae3) {
        if(!ghae0.t(ghae1) && !ghae2.t(ghae3)) {
            if(ghae0.t(ghae3)) {
                return ghau.b(ggxv.f(ghae0), ghae2, ghae1, ghae0);
            }
            if(ghae1.t(ghae2)) {
                return ghau.b(ggxv.f(ghae1), ghae3, ghae0, ghae1);
            }
            if(ghae0.t(ghae2)) {
                return ghau.b(ggxv.f(ghae0), ghae3, ghae1, ghae0);
            }
            return ghae1.t(ghae3) ? ghau.b(ggxv.f(ghae1), ghae2, ghae0, ghae1) : false;
        }
        return false;
    }
}

