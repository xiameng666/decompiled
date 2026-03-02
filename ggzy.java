import java.io.Serializable;

public abstract class ggzy implements ghbk, Serializable {
    public final ggxl a;
    public final ggxt b;

    public ggzy() {
        this.a = new ggxl(1.0, 0.0);
        this.b = ggxt.c();
    }

    public ggzy(ggxl ggxl0, ggxt ggxt0) {
        this.a = ggxl0;
        this.b = ggxt0;
    }

    public ggzy(ggzv ggzv0, ggzv ggzv1) {
        this.a = new ggxl(ggzv0.e().c, ggzv1.e().c);
        this.b = new ggxt(ggzv0.g().c, ggzv1.g().c);
    }

    public abstract ggxl a();

    public abstract ggxt b();

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggzy) ? this.a().equals(((ggzy)object0).a()) && this.b().equals(((ggzy)object0).b()) : false;
    }

    @Override  // ghbk
    public final ggyh f() {
        double f3;
        double f2;
        if(this.q()) {
            return ggyh.d();
        }
        double f = this.a.a;
        double f1 = this.a.b;
        if(Double.compare(f + f1, 0.0) < 0) {
            f2 = f1 + 1.570796;
            f3 = -1.0;
        }
        else {
            f2 = 1.570796 - f;
            f3 = 1.0;
        }
        ggyh ggyh0 = ggyh.e(new ghae(0.0, 0.0, f3), new ggxp(f2 * 1.0));
        if((this.b.a() < 6.283185)) {
            ggyh ggyh1 = ggyh.e(this.j().k(), ggxp.b);
            for(int v = 0; v < 4; ++v) {
                ggyh1 = ggyh1.c(this.k(v).k());
            }
            return ggyh1.a() < ggyh0.a() ? ggyh1 : ggyh0;
        }
        return ggyh0;
    }

    @Override  // ghbk
    public final boolean h(ggyi ggyi0) {
        return this.o(ggyi0.d());
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() + 629) * 37 + this.b.hashCode();
    }

    public final ggzv j() {
        double f = (this.b.a + this.b.b) * 0.5;
        return new ggzv((this.a.a + this.a.b) * 0.5, (this.b.o() ? f + (f <= 0.0 ? 3.141593 : -3.141593) : (this.b.a + this.b.b) * 0.5));
    }

    public final ggzv k(int v) {
        switch(v & 3) {
            case 0: {
                return new ggzv(this.a.a, this.b.a);
            }
            case 1: {
                return new ggzv(this.a.a, this.b.b);
            }
            case 2: {
                return new ggzv(this.a.b, this.b.b);
            }
            default: {
                return new ggzv(this.a.b, this.b.a);
            }
        }
    }

    public final ggzv l() {
        return new ggzv(new ggxp(this.a.b), new ggxp(this.b.b));
    }

    @Override  // ghbk
    public final boolean m(ggyi ggyi0) {
        ggzx ggzx0 = ggyi0.d();
        if(this.a.i(ggzx0.a)) {
            ggxt ggxt0 = this.b;
            ggxt ggxt1 = ggzx0.b;
            if(!ggxt0.m()) {
                if(ggxt1.m()) {
                    return false;
                }
                if(ggxt0.o()) {
                    return ggxt1.o() || ggxt1.a <= ggxt0.b ? true : ggxt1.b >= ggxt0.a;
                }
                double f = ggxt1.a;
                double f1 = ggxt0.b;
                if(ggxt1.o()) {
                    return f <= f1 ? true : ggxt1.b >= ggxt0.a;
                }
                return f <= f1 ? ggxt1.b >= ggxt0.a : false;
            }
        }
        return false;
    }

    public final ggzv n() {
        return new ggzv(new ggxp(this.a.a), new ggxp(this.b.a));
    }

    public final boolean o(ggzy ggzy0) {
        return (ggzy0.a.j() || ggzy0.a.a >= this.a.a && ggzy0.a.b <= this.a.b) && this.b.k(ggzy0.b);
    }

    public final boolean p(ghae ghae0) {
        ggzv ggzv0 = new ggzv(ghae0);
        return this.a.h(ggzv0.a) ? this.b.l((ggzv0.b == -3.141593 ? 3.141593 : ggzv0.b)) : false;
    }

    public final boolean q() {
        return this.a.j();
    }

    public final boolean r() {
        return ggzy.s(this.a, this.b);
    }

    public static boolean s(ggxl ggxl0, ggxt ggxt0) {
        return Math.abs(ggxl0.a) <= 1.570796 && Math.abs(ggxl0.b) <= 1.570796 && Math.abs(ggxt0.a) <= 3.141593 && Math.abs(ggxt0.b) <= 3.141593 && ((ggxt0.a != -3.141593 || ggxt0.b == 3.141593) && (ggxt0.b != -3.141593 || ggxt0.a == 3.141593) && ggxl0.j() == ggxt0.m());
    }

    @Override
    public final String toString() {
        return "[Lo=" + this.n().toString() + ", Hi=" + this.l().toString() + "]";
    }
}

