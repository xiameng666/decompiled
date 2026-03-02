import j..util.Objects;

public final class fvcu implements fvcm {
    public static final double a;
    public static final double b;
    public static final double c;
    public static final double d;
    public static final double e;
    public final int f;
    public final fvct g;

    static {
        double f = Math.sqrt(0.993306);
        double f1 = (1.0 - f) / (f + 1.0);
        fvcu.a = f1;
        double f2 = f1 * f1;
        double f3 = f2 * f1;
        double f4 = f3 * f1;
        double f5 = f4 * f1;
        fvcu.b = f1 * 1.5 - 0.84375 * f3 + 0.525391 * f5;
        fvcu.c = f2 * 1.3125 - 1.71875 * f4;
        fvcu.d = f3 * 1.572917 - f5 * 3.257813;
        fvcu.e = f4 * 2.142578;
    }

    public fvcu(int v, fvct fvct0) {
        this.f = v;
        this.g = fvct0;
    }

    @Override  // fvcm
    public final ggxn a(ggzv ggzv0) {
        double f = ggzv0.a;
        double f1 = Math.sin(f);
        double f2 = Math.cos(f);
        double f3 = f1 / f2;
        double f4 = Math.toRadians((this.f - 1) * 6 - 0xB1);
        double f5;
        for(f5 = ggzv0.b; (f5 - f4 > 3.141593); f5 += -6.283185) {
        }
        while((f4 - f5 > 3.141593)) {
            f5 += 6.283185;
        }
        double f6 = f3 * f3;
        double f7 = 6378137.0 / Math.sqrt(1.0 - 0.006694 * f1 * f1);
        double f8 = 0.006739 * f2 * f2;
        double f9 = f2 * (f5 - f4);
        double f10 = f6 * f6;
        double f11 = f9 * f9;
        double f12 = f11 * f9;
        double f13 = f12 * f9;
        double f14 = f13 * f9;
        return new ggxn(f7 * 0.9996 * (f9 + f12 / 6.0 * (1.0 - f6 + f8) + f14 / 120.0 * (5.0 - 18.0 * f6 + f10 + 72.0 * f8 - 0.390891)) + 500000.0, ((0.998324 * f - Math.sin(f + f) * 0.002515 + Math.sin(f * 4.0) * 0.000003 - Math.sin(f * 6.0) * 3.418046E-09) * 6378137.0 + f3 * f7 * (f11 / 2.0 + f13 / 24.0 * (5.0 - f6 + 9.0 * f8 + 4.0 * f8 * f8) + f14 * f9 / 720.0 * (61.0 - 58.0 * f6 + f10 + 600.0 * f8 - 2.224034))) * 0.9996 + this.g.d);
    }

    public final ggxm b(ggzx ggzx0) {
        ggxn ggxn0 = this.a(ggzx0.k(0));
        double f = ggxn0.a;
        double f1 = ggxn0.b;
        double f2 = f1;
        double f3 = f;
        for(int v = 1; v < 4; ++v) {
            ggxn ggxn1 = this.a(ggzx0.k(v));
            f = Math.min(ggxn1.a, f);
            f1 = Math.min(ggxn1.b, f1);
            f3 = Math.max(ggxn1.a, f3);
            f2 = Math.max(ggxn1.b, f2);
        }
        return ggxm.c(new ggxn(f, f1), new ggxn(f3, f2));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvcu) ? ((fvcu)object0).f == this.f && ((fvcu)object0).g == this.g : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.f), this.g});
    }

    @Override
    public final String toString() {
        return String.format("UTM Zone: %s in %s hemisphere", ((int)this.f), this.g.name());
    }
}

