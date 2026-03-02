public final class ggzs {
    public static int a(ggzu ggzu0, ggym ggym0) {
        return glxm.a(ggzu0.a().n(), ggym0.c);
    }

    public static ggym b(ggzu ggzu0) {
        return new ggym(ggzu0.a().n());
    }

    public static ghae c(ggzu ggzu0) {
        return ggzs.b(ggzu0).I();
    }

    public static boolean d(ggzu ggzu0, ghae ghae0) {
        ggym ggym0 = ggym.B(ghae0);
        ggzu0.d(ggym0);
        if(!ggzu0.f() && ggzs.b(ggzu0).G().V(ggym0)) {
            return true;
        }
        if(!ggzu0.e()) {
            ggzu0.g();
            return ggzs.b(ggzu0).F().P(ggym0);
        }
        return false;
    }

    public static int e(ggzu ggzu0, ggym ggym0) {
        ggzu0.d(ggym0.G());
        if(!ggzu0.f()) {
            if(ggzs.b(ggzu0).P(ggym0) && ggzs.b(ggzu0).G().V(ggym0)) {
                return 1;
            }
            if(ggzs.b(ggzu0).V(ggym0.F())) {
                return 2;
            }
        }
        if(!ggzu0.e()) {
            ggzu0.g();
            return ggzs.b(ggzu0).F().P(ggym0) ? 1 : 3;
        }
        return 3;
    }
}

