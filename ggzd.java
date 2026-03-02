public final class ggzd {
    static ggzx a(ggzx ggzx0) {
        if(!ggzx0.q()) {
            double f = 3.141593;
            double f1 = Math.max(0.0, 3.141593 - ggzx0.b.a() - 5.551115E-16);
            double f2 = Math.max(ggzx0.a.a, -ggzx0.a.b);
            double f3 = ggzx0.a.a + 1.570796;
            double f4 = 1.570796 - ggzx0.a.b;
            if((f2 >= 0.0)) {
                if(f2 + f2 + f1 >= 1.354000E-15) {
                    goto label_15;
                }
                return ggzx.g();
            }
            else if((f1 >= 1.570796)) {
                if((f3 + f4 < 1.687000E-15)) {
                    return ggzx.g();
                }
            }
            else if((Math.max(f3, f4) * f1 < 1.765000E-15)) {
                return ggzx.g();
            }
        label_15:
            if(f1 > 0.0) {
                f = 0.0;
            }
            return ggzx0.e(new ggzv(1.998401E-15, f)).i();
        }
        return ggzx0;
    }
}

