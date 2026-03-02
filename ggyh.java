import java.io.Serializable;

public final class ggyh implements ghbk, Serializable {
    public final ghae a;
    public final ggxr b;

    public ggyh(ghae ghae0, ggxr ggxr0) {
        this.a = ghae0;
        this.b = ggxr0;
    }

    public final double a() {
        return this.b.f * 0.5;
    }

    public final ggxp b() {
        return this.b.c();
    }

    public final ggyh c(ghae ghae0) {
        gftb.checkTrue(ggxv.g(ghae0));
        if(this.k()) {
            return new ggyh(ghae0, ggxr.a);
        }
        ggxr ggxr0 = ggxr.e(Math.max(this.b.f, this.a.d(ghae0)));
        return new ggyh(this.a, ggxr0);
    }

    public static ggyh d() {
        return new ggyh(ghae.b, ggxr.e);
    }

    public static ggyh e(ghae ghae0, ggxp ggxp0) {
        gftb.checkTrue(ggxv.g(ghae0));
        return new ggyh(ghae0, ggxr.g(new ggxp(Math.min(ggxp0.c, 3.141593))));
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof ggyh)) {
            if(this.a.t(((ggyh)object0).a) && this.b.equals(((ggyh)object0).b)) {
                return true;
            }
            return !this.k() || !((ggyh)object0).k() ? this.l() && ((ggyh)object0).l() : true;
        }
        return false;
    }

    @Override  // ghbk
    public final ggyh f() {
        return this;
    }

    public final ggzx g() {
        boolean z;
        if(this.k()) {
            return ggzx.d();
        }
        if(this.l()) {
            return ggzx.g();
        }
        ggzv ggzv0 = new ggzv(this.a);
        double f = this.b().c;
        double f1 = -3.141593;
        double f2 = 3.141593;
        double f3 = ggzv0.e().c - f;
        double f4 = f3;
        if((f3 <= -1.570796)) {
            f4 = -1.570796;
            z = true;
        }
        else {
            z = false;
        }
        double f5 = ggzv0.e().c + f;
        if((f5 >= 1.570796)) {
            return new ggzx(new ggxl(f4, 1.570796), new ggxt(-3.141593, 3.141593));
        }
        if(!z) {
            double f6 = Math.sqrt(ggxr.a(this.b));
            double f7 = Math.cos(ggzv0.e().c);
            if((f6 <= f7)) {
                double f8 = Math.asin(f6 / f7);
                f1 = ggxf.b(ggzv0.g().c - f8);
                f2 = ggxf.b(ggzv0.g().c + f8);
            }
        }
        return new ggzx(new ggxl(f4, f5), new ggxt(f1, f2));
    }

    @Override  // ghbk
    public final boolean h(ggyi ggyi0) {
        ghae[] arr_ghae = new ghae[4];
        for(int v = 0; v < 4; ++v) {
            ghae ghae0 = ggyi0.i(v);
            arr_ghae[v] = ghae0;
            if(!this.i(ghae0)) {
                return false;
            }
        }
        return this.l() ? !ggyh.d().j(ggyi0, arr_ghae) : !(this.k() ? new ggyh(ghae.b, ggxr.c) : new ggyh(ghae.p(this.a), ggxr.e(4.0 - this.b.f))).j(ggyi0, arr_ghae);
    }

    @Override
    public final int hashCode() {
        if(this.l()) {
            return 17;
        }
        return this.k() ? 37 : (this.a.hashCode() + 629) * 37 + this.b.hashCode();
    }

    public final boolean i(ghae ghae0) {
        return new ggxr(this.a, ghae0).b(this.b) <= 0;
    }

    public final boolean j(ggyi ggyi0, ghae[] arr_ghae) {
        ggxr ggxr0 = this.b;
        if(ggxr0.b(ggxr.b) >= 0) {
            return false;
        }
        if(this.k()) {
            return false;
        }
        ghae ghae0 = this.a;
        if(ggyi0.k(ghae0)) {
            return true;
        }
        double f = ggxr.a(ggxr0);
        for(int v = 0; v < 4; ++v) {
            ghae ghae1 = ggyi0.g(v);
            double f1 = ghae0.b(ghae1);
            if(f1 <= 0.0) {
                if((f1 * f1 > ghae1.g() * f)) {
                    return false;
                }
                ghae ghae2 = ghae.n(ghae1, ghae0);
                if((ghae2.b(arr_ghae[v]) < 0.0) && (ghae2.b(arr_ghae[v + 1 & 3]) > 0.0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        return this.b.j();
    }

    public final boolean l() {
        return ggxr.c.equals(this.b);
    }

    @Override  // ghbk
    public final boolean m(ggyi ggyi0) {
        ghae[] arr_ghae = new ghae[4];
        for(int v = 0; v < 4; ++v) {
            ghae ghae0 = ggyi0.i(v);
            arr_ghae[v] = ghae0;
            if(this.i(ghae0)) {
                return true;
            }
        }
        return this.j(ggyi0, arr_ghae);
    }

    public static ggyh n(ghae ghae0) {
        return new ggyh(ghae0, ggxr.e(0.0));
    }

    @Override
    public final String toString() {
        return "[Point = " + this.a.toString() + " Radius = " + this.b + "]";
    }
}

