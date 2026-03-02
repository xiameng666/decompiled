import java.io.Serializable;

public final class ggyi implements ghbk, Serializable {
    byte a;
    public byte b;
    byte c;
    ggym d;
    double e;
    double f;
    double g;
    double h;
    private static final double i;

    static {
        ggyi.i = Math.asin(Math.sqrt(0.333333)) - 1.110223E-16;
    }

    public ggyi() {
    }

    public ggyi(ggym ggym0) {
        this.d = ggym0;
        this.a = (byte)ggym0.b();
        long v = ggym0.t();
        this.c = (byte)ggym.f(v);
        this.b = (byte)ggym0.j();
        int v1 = ggym.d(v);
        int v2 = ggym.e(v);
        int v3 = ggym0.h();
        this.e = ghbj.a(v1, v3);
        this.f = ghbj.a(v1 + v3, v3);
        this.g = ghbj.a(v2, v3);
        this.h = ghbj.a(v2 + v3, v3);
    }

    public static double a(int v) {
        return Math.scalb(ghbj.a.a, -ghbj.a.b * v);
    }

    public final ggxn b() {
        long v = this.d.m();
        return new ggxn(ghbj.c(ghbj.b(ggym.g(v))), ghbj.c(ghbj.b(((int)v))));
    }

    public final ggxr c(ghae ghae0) {
        int v1;
        ghae ghae1 = ghbj.j(this.a, ghae0);
        double f = ghae1.h;
        double f1 = this.f * ghae1.j;
        double f2 = ghae1.i;
        double f3 = this.g * ghae1.j;
        double f4 = ghae1.j * this.h;
        double f5 = f - this.e * ghae1.j;
        int v = 0;
        if(Double.compare(f5, 0.0) < 0) {
            if(this.q(ghae1, false)) {
                return ggxr.e(ggyi.n(-f5, this.e));
            }
            v1 = 0;
        }
        else {
            v1 = 1;
        }
        double f6 = f - f1;
        if((f6 > 0.0)) {
            if(this.q(ghae1, true)) {
                return ggxr.e(ggyi.n(f6, this.f));
            }
            v1 = 0;
        }
        double f7 = f2 - f3;
        if(!(f7 < 0.0)) {
            v = v1;
        }
        else if(this.p(ghae1, false)) {
            return ggxr.e(ggyi.n(-f7, this.g));
        }
        double f8 = f2 - f4;
        if((f8 > 0.0)) {
            return this.p(ghae1, true) ? ggxr.e(ggyi.n(f8, this.h)) : ggxr.e(Math.min(ggyi.l(ghae1, this.e, this.g), Math.min(ggyi.l(ghae1, this.e, this.h), Math.min(ggyi.l(ghae1, this.f, this.g), ggyi.l(ghae1, this.f, this.h)))));
        }
        return v == 0 ? ggxr.e(Math.min(ggyi.l(ghae1, this.e, this.g), Math.min(ggyi.l(ghae1, this.e, this.h), Math.min(ggyi.l(ghae1, this.f, this.g), ggyi.l(ghae1, this.f, this.h))))) : ggxr.e(0.0);
    }

    public final ggzx d() {
        int v1;
        int v = 1;
        if(this.b > 0) {
            double f = this.e + this.f;
            double f1 = this.g + this.h;
            if(ghbj.l(this.a, 0).j != 0.0) {
                v1 = f > 0.0 ? 1 : 0;
            }
            else if((f < 0.0)) {
                v1 = 1;
            }
            else {
                v1 = 0;
            }
            if(ghbj.l(this.a, 1).j == 0.0) {
                return f1 < 0.0 ? new ggzx(ggxl.c(ggzv.f(this.o(v1, 1)).c, ggzv.f(this.o(1 - v1, 0)).c), ggxt.d(ggzv.h(this.o(v1, 0)).c, ggzv.h(this.o(1 - v1, 1)).c)).e(new ggzv(4.440892E-16, 4.440892E-16)).i() : new ggzx(ggxl.c(ggzv.f(this.o(v1, 0)).c, ggzv.f(this.o(1 - v1, 1)).c), ggxt.d(ggzv.h(this.o(v1, 1)).c, ggzv.h(this.o(1 - v1, 0)).c)).e(new ggzv(4.440892E-16, 4.440892E-16)).i();
            }
            if(f1 <= 0.0) {
                v = 0;
            }
            return new ggzx(ggxl.c(ggzv.f(this.o(v1, v)).c, ggzv.f(this.o(1 - v1, 1 - v)).c), ggxt.d(ggzv.h(this.o(v1, 1 - v)).c, ggzv.h(this.o(1 - v1, v)).c)).e(new ggzv(4.440892E-16, 4.440892E-16)).i();
        }
        switch(this.a) {
            case 0: {
                return new ggzx(new ggxl(-0.785398, 0.785398), new ggxt(-0.785398, 0.785398)).e(new ggzv(2.220446E-16, 0.0));
            }
            case 1: {
                return new ggzx(new ggxl(-0.785398, 0.785398), new ggxt(0.785398, 2.356194)).e(new ggzv(2.220446E-16, 0.0));
            }
            case 2: {
                return new ggzx(new ggxl(ggyi.i, 1.570796), ggxt.e()).e(new ggzv(2.220446E-16, 0.0));
            }
            case 3: {
                return new ggzx(new ggxl(-0.785398, 0.785398), new ggxt(2.356194, -2.356194)).e(new ggzv(2.220446E-16, 0.0));
            }
            case 4: {
                return new ggzx(new ggxl(-0.785398, 0.785398), new ggxt(-2.356194, -0.785398)).e(new ggzv(2.220446E-16, 0.0));
            }
            default: {
                return new ggzx(new ggxl(-1.570796, -ggyi.i), ggxt.e()).e(new ggzv(2.220446E-16, 0.0));
            }
        }
    }

    public final ghae e() {
        return ghae.q(this.d.J());
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggyi) && this.a == ((ggyi)object0).a && this.b == ((ggyi)object0).b && this.c == ((ggyi)object0).c && this.d.equals(((ggyi)object0).d);
    }

    @Override  // ghbk
    public final ggyh f() {
        int v = this.a;
        ggxn ggxn0 = this.b();
        ggyh ggyh0 = ggyh.n(ghae.q(ghbj.i(v, ggxn0.a, ggxn0.b)));
        for(int v1 = 0; v1 < 4; ++v1) {
            ggyh0 = ggyh0.c(this.i(v1));
        }
        return ggyh0;
    }

    public final ghae g(int v) {
        switch(v & 3) {
            case 0: {
                return ghbj.m(this.a, this.g);
            }
            case 1: {
                return ghbj.k(this.a, this.f);
            }
            case 2: {
                return ghae.p(ghbj.m(this.a, this.h));
            }
            default: {
                return ghae.p(ghbj.k(this.a, this.e));
            }
        }
    }

    @Override  // ghbk
    public final boolean h(ggyi ggyi0) {
        return this.d.O(ggyi0.d);
    }

    @Override
    public final int hashCode() {
        return (((this.a + 629) * 37 + this.c) * 37 + this.b) * 37 + this.d.hashCode();
    }

    public final ghae i(int v) {
        int v1 = (v & 3) >> 1;
        int v2 = this.a;
        double f = (v & 1 ^ v1) == 0 ? this.e : this.f;
        return v1 == 0 ? ghae.q(ghbj.i(v2, f, this.g)) : ghae.q(ghbj.i(v2, f, this.h));
    }

    final void j(ggxm ggxm0) {
        ggxm0.a.f(this.e, this.f);
        ggxm0.b.f(this.g, this.h);
    }

    public final boolean k(ghae ghae0) {
        int v = this.a;
        ggxn ggxn0 = null;
        if(!(v >= 3 ? ghae0.c(v - 3) >= 0.0 : ghae0.c(v) <= 0.0)) {
            ggxn0 = new ggxn();
            ghbj.p(v, ghae0, ggxn0);
        }
        return ggxn0 == null ? false : ggxn0.a >= this.e - 2.220446E-16 && ggxn0.a <= this.f + 2.220446E-16 && (ggxn0.b >= this.g - 2.220446E-16 && ggxn0.b <= this.h + 2.220446E-16);
    }

    private static double l(ghae ghae0, double f, double f1) {
        return ghae0.d(ghae.q(new ghae(f, f1, 1.0)));
    }

    @Override  // ghbk
    public final boolean m(ggyi ggyi0) {
        long v = ggyi0.d.c;
        long v1 = this.d.c;
        return ggym.Z(ggym.s(v), ggym.r(v1)) && ggym.X(ggym.r(v), ggym.s(v1));
    }

    private static double n(double f, double f1) {
        double f2 = f * f / (f1 * f1 + 1.0);
        double f3 = 1.0 - Math.sqrt(1.0 - f2);
        return f2 + f3 * f3;
    }

    private final ghae o(int v, int v1) {
        int v2 = this.a;
        double f = v == 0 ? this.e : this.f;
        return v1 == 0 ? ghbj.i(v2, f, this.g) : ghbj.i(v2, f, this.h);
    }

    private final boolean p(ghae ghae0, boolean z) {
        double f = z ? this.h : this.g;
        double f1 = f * f + 1.0;
        return ghae0.b(new ghae(f1, -this.e * f, -this.e)) > 0.0 && ghae0.b(new ghae(f1, -this.f * f, -this.f)) < 0.0;
    }

    private final boolean q(ghae ghae0, boolean z) {
        double f = z ? this.f : this.e;
        double f1 = f * f + 1.0;
        return ghae0.b(new ghae(-f * this.g, f1, -this.g)) > 0.0 && ghae0.b(new ghae(-f * this.h, f1, -this.h)) < 0.0;
    }

    @Override
    public final String toString() {
        return "[" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + "]";
    }
}

