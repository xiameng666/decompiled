import j..util.DesugarCollections;
import j..util.Objects;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class ghab implements ghbk, ghbx, Serializable, Comparable {
    static final ghae a;
    static final ghae b;
    public transient ghde c;
    public final int d;
    public ggzx e;
    public ggzx f;
    public boolean g;
    public int h;
    private final AtomicInteger i;
    private final ghae[] j;

    static {
        ghab.a = ghae.f;
        ghab.b = ghae.g;
    }

    public ghab(List list0) {
        this.i = new AtomicInteger();
        this.q();
        int v = list0.size();
        this.d = v;
        ghae[] arr_ghae = new ghae[v];
        this.j = arr_ghae;
        list0.toArray(arr_ghae);
        this.h = 0;
        this.E();
    }

    public ghab(List list0, boolean z, ggzx ggzx0) {
        this.i = new AtomicInteger();
        this.q();
        int v = list0.size();
        this.d = v;
        ghae[] arr_ghae = new ghae[v];
        this.j = arr_ghae;
        this.e = ggzx0;
        this.f = ggzd.a(ggzx0);
        this.h = 0;
        this.g = z;
        list0.toArray(arr_ghae);
    }

    public ghab(ghae[] arr_ghae) {
        this.i = new AtomicInteger();
        this.q();
        this.d = 0;
        this.j = arr_ghae;
        this.h = 0;
        this.E();
    }

    @Override  // ghbx
    public final void A() {
    }

    @Override  // ghbx
    public final void B() {
    }

    private final int C() {
        int v2;
        int v1 = 0;
        for(int v = 1; true; ++v) {
            v2 = this.d;
            if(v >= v2) {
                break;
            }
            if(this.k(v).j(this.k(v1)) < 0) {
                v1 = v;
            }
        }
        if(v2 > 0) {
            int v3 = v2 + v1;
            return this.k(v1 + 1).j(this.k(v3 - 1)) < 0 ? v1 : v3;
        }
        return v1;
    }

    private final void D() {
        int v2;
        int v = this.d;
        if(v < 3) {
            if(this.x()) {
                ggzx ggzx0 = ggzx.g();
                this.e = ggzx0;
                this.f = ggzx0;
                return;
            }
            ggzx ggzx1 = ggzx.d();
            this.e = ggzx1;
            this.f = ggzx1;
            return;
        }
        ggzw ggzw0 = ggzw.c();
        ggxt ggxt0 = new ggxt();
        ggxl ggxl0 = new ggxl();
        ghae ghae0 = null;
        int v1 = 0;
        for(ggzv ggzv0 = null; v1 <= v; ggzv0 = ggzv1) {
            ghae ghae1 = this.k(v1);
            ggzv ggzv1 = new ggzv(ghae1);
            if(ggzw0.q()) {
                ggzw0.e(ggzv1);
                v2 = v1;
            }
            else {
                ghae ghae2 = ghae.n(ghae.r(ghae0, ghae1), ghae.l(ghae0, ghae1));
                double f = ghae2.e();
                if((f < 1.913460E-15)) {
                    if((ghae0.b(ghae1) < 0.0)) {
                        ggzw0.a.f(-1.570796, 1.570796);
                        ggzw0.b.i();
                    }
                    else {
                        ggzw0.g(new ggzx(ggxl.c(ggzv0.e().c, ggzv1.e().c), ggxt.d(ggzv0.g().c, ggzv1.g().c)));
                    }
                    v2 = v1;
                }
                else {
                    ggxt0.f(ggzv0.g().c, ggzv1.g().c);
                    if((ggxt0.a() >= 3.141593)) {
                        ggxt0.i();
                    }
                    ggxl0.e(ggzv0.e().c, ggzv1.e().c);
                    ghae ghae3 = ghae.n(ghae2, ghae.f);
                    double f1 = ghae3.b(ghae0);
                    double f2 = ghae3.b(ghae1);
                    v2 = v1;
                    double f3 = f * 6.066380E-16 + 6.831740E-31;
                    if((Double.compare(f1 * f2, 0.0) < 0 || Math.abs(f1) <= f3) || (Math.abs(f2) <= f3)) {
                        double f4 = Math.min(1.570796, Math.atan2(Math.sqrt(ghae2.h * ghae2.h + ghae2.i * ghae2.i), Math.abs(ghae2.j)) + 6.661338E-16);
                        double f5 = Math.asin(ghae.r(ghae0, ghae1).e() * 0.5 * Math.sin(f4));
                        double f6 = ggxl0.b;
                        double f7 = (f5 + f5 - (f6 - ggxl0.a)) * 0.5 + 2.220446E-16;
                        if(Double.compare(f1, f3) <= 0 && (f2 >= -f3)) {
                            ggxl0.b = Math.min(f4, f6 + f7);
                        }
                        if((f2 <= f3) && (f1 >= -f3)) {
                            ggxl0.a = Math.max(-f4, ggxl0.a - f7);
                        }
                    }
                    ggzw0.g(new ggzx(ggxl0, ggxt0));
                }
            }
            v1 = v2 + 1;
            ghae0 = ghae1;
        }
        ggzv ggzv2 = new ggzv(4.440892E-16, 0.0);
        ggzx ggzx2 = ggzw0.d().e(ggzv2).i();
        if(this.s(ghae.f)) {
            ggzx2 = new ggzx(new ggxl(ggzx2.a.a, 1.570796), ggxt.e());
        }
        ggxt ggxt1 = ggzx2.b;
        if(ggxt1.n() && this.s(ghae.g)) {
            ggzx2 = new ggzx(new ggxl(-1.570796, ggzx2.a.b), ggxt1);
        }
        this.e = ggzx2;
        this.f = ggzd.a(ggzx2);
    }

    private final void E() {
        boolean z = true;
        if(this.d >= 3) {
            ghae ghae0 = this.k(0);
            ghae ghae1 = this.k(1);
            ghae ghae2 = this.k(2);
            this.g = false;
            if(this.k(1).u() && (ghae0.u() && ghae1.u() && ghae2.u() && !ghae0.t(ghae1) && !ghae2.t(ghae1) && !ghau.b(ggxv.f(ghae1), ghae2, ghae0, ghae1)) != this.s(this.k(1))) {
                this.g = true;
            }
        }
        else if(this.w()) {
            if(this.k(0).j >= 0.0) {
                z = false;
            }
            this.g = z;
        }
        else {
            this.g = false;
        }
        this.D();
    }

    private final boolean F(ggzu ggzu0, ggyi ggyi0) {
        ghdb ghdb0 = ((ghcc)ggzu0.a()).b(0);
        int v = ghdb0.d();
        if(v != 0) {
            if(ggzs.a(ggzu0, ggyi0.d) != 0) {
                ggxm ggxm0 = new ggxm();
                ggyi0.j(ggxm0);
                double f = ggze.b;
                ggxm ggxm1 = ggxm0.b(f);
                ggxn ggxn0 = new ggxn();
                ggxn ggxn1 = new ggxn();
                for(int v1 = 0; v1 < v; ++v1) {
                    int v2 = ghdb0.c(v1);
                    if(ggze.c(this.k(v2), this.k(v2 + 1), ((int)ggyi0.a), f, ggxn0, ggxn1) && ggze.d(ggxn0, ggxn1, ggxm1)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean G(ggzu ggzu0, ghae ghae0) {
        int v = 0;
        ghdb ghdb0 = ((ghcc)ggzu0.a()).b(0);
        int v1 = ghdb0.f();
        int v2 = ghdb0.d();
        if(v2 > 0) {
            ggzc ggzc0 = new ggzc(ggzs.c(ggzu0), ghae0);
            for(int v3 = -2; v < v2; v3 = v4) {
                int v4 = ghdb0.c(v);
                if(v4 != v3 + 1) {
                    ggzc0.c(this.k(v4));
                }
                v1 ^= ggzc0.d(this.k(v4 + 1));
                ++v;
            }
        }
        return v1 != 0;
    }

    public final int a(ghab ghab0) {
        int v = this.d;
        int v1 = ghab0.d;
        if(v != v1) {
            return v - v1;
        }
        if(v == 0) {
            return 0;
        }
        int v2 = this.C() % v;
        int v3 = ghab0.C() % v1;
        for(int v4 = 0; v4 < v; ++v4) {
            int v5 = this.k(v2).j(ghab0.k(v3));
            if(v5 != 0) {
                return v5;
            }
            ++v2;
            ++v3;
        }
        return 0;
    }

    @Override  // ghbx
    public final int b(int v) {
        gftb.x(v, this.d());
        return this.e();
    }

    @Override  // ghbx
    public final int c(int v) {
        gftb.x(v, this.d());
        return 0;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((ghab)object0));
    }

    @Override  // ghbx
    public final int d() {
        return this.v() ? 0 : 1;
    }

    @Override  // ghbx
    public final int e() {
        return this.w() ? 0 : this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghab) && Arrays.equals(this.j, ((ghab)object0).j) && this.g == ((ghab)object0).g && Objects.equals(this.e, ((ghab)object0).e);
    }

    @Override  // ghbk
    public final ggyh f() {
        return this.e.f();
    }

    @Override  // ghbx
    public final int g(int v) {
        return ghbt.a(this, v);
    }

    @Override  // ghbk
    public final boolean h(ggyi ggyi0) {
        ggzu ggzu0 = this.c.a();
        return ggzs.e(ggzu0, ggyi0.d) != 1 || this.F(ggzu0, ggyi0) ? false : this.G(ggzu0, ggyi0.e());
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() * 7 + this.d * 11 + this.g;
    }

    @Override  // ghbx
    public final ghae i(int v, int v1) {
        gftb.x(v, this.d());
        return this.k(v1);
    }

    public final ghae j(int v) {
        if(this.y()) {
            v = this.d + this.d - 1 - v;
        }
        return this.k(v);
    }

    public final ghae k(int v) {
        try {
            return this.j[(v < this.j.length ? v : v - this.j.length)];
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw new IllegalStateException("Invalid vertex index " + v + " for loop of " + this.j.length + " vertices.", arrayIndexOutOfBoundsException0);
        }
    }

    @Override  // ghbx
    public final List l(int v) {
        return new ghbu(this, v);
    }

    @Override  // ghbk
    public final boolean m(ggyi ggyi0) {
        ggzu ggzu0 = this.c.a();
        int v = ggzs.e(ggzu0, ggyi0.d);
        if(v == 3) {
            return false;
        }
        if(v != 2) {
            if(ggzs.a(ggzu0, ggyi0.d) == 0) {
                return true;
            }
            return this.F(ggzu0, ggyi0) ? true : this.G(ggzu0, ggyi0.e());
        }
        return true;
    }

    @Override  // ghbx
    public final void n(int v, int v1, ghbw ghbw0) {
        gftb.x(v, this.d());
        this.p(v1, ghbw0);
    }

    @Override  // ghbx
    public final void o(int v, ghbv ghbv0) {
        gftb.x(v, this.e());
        ghbv0.a(0, v);
    }

    @Override  // ghbx
    public final void p(int v, ghbw ghbw0) {
        ghbw0.a(this.k(v), this.k(v + 1));
    }

    public final void q() {
        int v = this.d;
        int v1 = 10;
        if(v > 8) {
            if(v <= 0x2000) {
                v1 = 50;
            }
            else if(v > 50000) {
                v1 = 2;
            }
        }
        this.i.set(v1);
        ghde ghde0 = new ghde();
        this.c = ghde0;
        ghde0.d(this);
    }

    final boolean r(ghae ghae0) {
        int v = this.d;
        if(v < 3) {
            return this.g;
        }
        ghae ghae1 = this.k(0);
        ggzc ggzc0 = new ggzc(ggxv.e, ghae0, ghae1);
        int v1 = this.g;
        for(int v2 = 1; v2 <= v; ++v2) {
            v1 ^= ggzc0.d(this.k(v2));
        }
        return v1 != 0;
    }

    private Object readResolve() {
        this.q();
        return this;
    }

    public final boolean s(ghae ghae0) {
        if(this.c.g || (this.e == null || this.e.p(ghae0))) {
            if(this.d > 0x20 && (this.c.g || this.i.decrementAndGet() <= 0)) {
                ggzu ggzu0 = this.c.a();
                return ggzs.d(ggzu0, ghae0) ? this.G(ggzu0, ghae0) : false;
            }
            return this.r(ghae0);
        }
        return false;
    }

    public final boolean t(ghab ghab0) {
        if(!this.f.o(ghab0.e)) {
            return false;
        }
        if(!this.w() && ghab0.d >= 2) {
            ghae ghae0 = ghab0.k(1);
            int v = this.d;
            if(v < 10) {
                int v1 = 1;
                while(v1 <= v) {
                    if(this.k(v1).t(ghae0)) {
                        v = v1;
                        goto label_30;
                    }
                    ++v1;
                }
            }
            else {
                ggzu ggzu0 = this.c.a();
                if(ggzs.d(ggzu0, ghae0)) {
                    ghdb ghdb0 = ((ghcc)ggzu0.a()).b(0);
                    int v2 = ghdb0.d() - 1;
                    while(v2 >= 0) {
                        int v3 = ghdb0.c(v2);
                        if(this.k(v3).t(ghae0)) {
                            if(v3 != 0) {
                                v = v3;
                            }
                            goto label_30;
                        }
                        ++v3;
                        if(this.k(v3).t(ghae0)) {
                            v = v3;
                            goto label_30;
                        }
                        --v2;
                    }
                }
            }
            v = -1;
        label_30:
            if(v < 0) {
                return this.s(ghab0.k(1));
            }
            ghae ghae1 = this.k(v - 1);
            ghae ghae2 = this.k(v);
            ghae ghae3 = this.k(v + 1);
            ghae ghae4 = ghab0.k(0);
            return ghau.b(ghae3, ghab0.k(2), ghae4, ghae2) && ghau.b(ghae4, ghae1, ghae3, ghae2);
        }
        return this.x() || ghab0.v();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("S2Loop, depth=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", ");
        ghae[] arr_ghae = this.j;
        stringBuilder0.append(arr_ghae.length);
        stringBuilder0.append(" points. [");
        for(int v = 0; v < arr_ghae.length; ++v) {
            stringBuilder0.append(arr_ghae[v].s());
            stringBuilder0.append(" ");
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // ghbx
    public final boolean u() {
        return this.g;
    }

    public final boolean v() {
        return this.w() && !this.g;
    }

    public final boolean w() {
        return this.d == 1;
    }

    public final boolean x() {
        return this.w() && this.g;
    }

    public final boolean y() {
        return (this.h & 1) != 0;
    }

    public final void z() {
        if(this.e.b.a() >= 3.141593) {
            ghae[] arr_ghae = this.j;
            double f = ghdm.a(DesugarCollections.unmodifiableList(Arrays.asList(arr_ghae)));
            int v = this.d;
            if(f < -ggxv.a(v)) {
                this.q();
                if(this.w()) {
                    arr_ghae[0] = this.x() ? ghab.a : ghab.b;
                }
                else {
                    for(int v1 = (v - 2) / 2; v1 >= 0; --v1) {
                        ghae ghae0 = arr_ghae[v1];
                        int v2 = v - 1 - v1;
                        arr_ghae[v1] = arr_ghae[v2];
                        arr_ghae[v2] = ghae0;
                    }
                }
                this.g ^= 1;
                ggxl ggxl0 = this.e.a;
                if((ggxl0.a > -1.570796) && (ggxl0.b < 1.570796)) {
                    ggzx ggzx0 = ggzx.g();
                    this.e = ggzx0;
                    this.f = ggzx0;
                    return;
                }
                this.e = null;
                this.D();
            }
        }
    }
}

