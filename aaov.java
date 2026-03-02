public final class aaov implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        grxr grxr0 = ((zho)object0).a;
        if(grxr0.c == 10) {
            grwj grwj0 = (grwj)grxr0.d;
            ggdy ggdy0 = new ggdy();
            ggdy ggdy1 = new ggdy();
            ggek ggek0 = new ggek();
            boolean z = false;
            int v = 0;
            for(Object object1: grwj0.b) {
                grwk grwk0 = (grwk)object1;
                int v1 = grwk0.b;
                if(v1 == 2) {
                    ++v;
                    z = true;
                }
                else {
                    if(v1 != 1) {
                        continue;
                    }
                    grwm grwm0 = (grwm)grwk0.c;
                    String s = grwm0.b;
                    grwd grwd0 = grwd.b((grwm0.c == null ? grwe.a : grwm0.c).c);
                    String s1 = aabu.c((grwm0.c == null ? grwe.a : grwm0.c));
                    grwp grwp0 = grwm0.d == null ? grwp.a : grwm0.d;
                    aaoz aaoz0 = new aaoz(s, grwd0, s1, (grwp0.c == null ? grxw.a : grwp0.c));
                    aaoy aaoy0 = new aaoy(v, aaoz0);
                    if(v == 0) {
                        ggdy1.i(aaoz0);
                        v = 0;
                    }
                    ggdy0.i(aaoy0);
                    ggek0.i(Integer.valueOf(aaoz0.d.c), aaoz0.d);
                }
            }
            return new aaox(ggdy0.h(), ggdy1.h(), ggek0.b(), z);
        }
        return new aaox(ggna.a, ggna.a, ggnf.a, false);
    }
}

