import java.util.Objects;

public final class igt extends ibq implements ias, ids, ihg {
    private boolean A;
    private final ibth B;
    private final ibth C;
    public final igd f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public jkp l;
    public long m;
    public ibts n;
    public hpn o;
    public final idr p;
    public final gwq q;
    public boolean r;
    public boolean s;
    public boolean t;
    public Object u;
    public long v;
    public final ibth w;
    public boolean x;
    public int y;
    public int z;

    public igt(igd igd0) {
        this.f = igd0;
        this.h = 0x7FFFFFFF;
        this.i = 0x7FFFFFFF;
        this.y = 3;
        this.m = 0L;
        this.z = 3;
        this.p = new igg(this);
        this.q = new gwq(new igt[16]);
        this.r = true;
        this.B = new igp(this);
        this.t = true;
        this.u = this.p().r;
        this.v = jkq.k(0, 0, 0, 15);
        this.w = new igr(this);
        this.C = new igq(this);
    }

    public final void B(boolean z) {
        this.f.e = z;
    }

    public final void C(boolean z) {
        this.f.f = z;
    }

    public final boolean D() {
        return this.f.c;
    }

    public final boolean E(long v) {
        ify ify0;
        try {
            ify0 = this.o();
            if(this.o().C) {
                hxt.c("measure is called on a deactivated node");
            }
            ify ify1 = this.o().n();
            this.o().t = this.o().t || ify1 != null && ify1.t;
            if(!this.o().ak() && (this.l != null && jkp.h(this.l.a, v))) {
                iio iio0 = this.o().j;
                if(iio0 != null) {
                    iio0.n(this.o(), true);
                }
                this.o().aa();
                return false;
            }
            this.l = new jkp(v);
            this.eq(v);
            this.p.f = false;
            this.j(igs.a);
            long v1 = this.A ? this.c : 0x8000000080000000L;
            this.A = true;
            igm igm0 = this.q().C();
            if(igm0 == null) {
                hxt.d("Lookahead result from lookaheadRemeasure cannot be null");
            }
            igt igt0 = this.f.p;
            if(igt0 != null) {
                igt0.H(2);
                igt0.f.d = false;
                igt0.v = v;
                iiy iiy0 = ((ili)igc.a(igt0.o())).z;
                iiy0.a.c(igt0.o(), iiy0.b, igt0.w);
                igt0.B(true);
                igt0.C(true);
                if(ige.a(igt0.o())) {
                    igt0.p().r();
                }
                else {
                    igt0.p().s();
                }
                igt0.H(5);
            }
            this.z(((long)igm0.b) & 0xFFFFFFFFL | ((long)igm0.a) << 0x20);
            return ((int)(v1 >> 0x20)) == igm0.a ? ((int)(v1 & 0xFFFFFFFFL)) != igm0.b : true;
        }
        catch(Throwable throwable0) {
            ify0.ay(throwable0);
            throw new ibnm();
        }
    }

    public final void F(long v, ibts ibts0, hpn hpn0) {
        ify ify0;
        try {
            ify0 = this.o();
            ify ify1 = this.o().n();
            if(ify1 != null && ify1.aC() == 4) {
                this.f.c = false;
            }
            if(this.o().C) {
                hxt.c("place is called on a deactivated node");
            }
            this.H(4);
            this.k = true;
            this.x = false;
            if(!jlf.f(v, this.m)) {
                if(this.f.m || this.f.l) {
                    this.B(true);
                }
                this.s();
            }
            iio iio0 = igc.a(this.o());
            this.m = v;
            if(!this.K() && this.n()) {
                igm igm0 = this.q().C();
                ibuq.c(igm0);
                igm0.D(jlf.d(v, igm0.e));
                this.t();
            }
            else {
                this.f.k(false);
                this.p.g = false;
                ((ili)iio0).z.a.c(this.o(), ((ili)iio0).z.g, this.C);
            }
            this.n = ibts0;
            this.o = hpn0;
            this.H(5);
        }
        catch(Throwable throwable0) {
            ify0.ay(throwable0);
            throw new ibnm();
        }
    }

    public final int G() {
        return this.f.q;
    }

    public final void H(int v) {
        this.f.q = v;
    }

    private final void I() {
        int v = this.z;
        this.z = this.D() ? 2 : 1;
        if(v != 1 && this.f.d) {
            ify.av(this.o(), true, 6);
        }
        gwq gwq0 = this.o().k();
        Object[] arr_object = gwq0.a;
        int v1 = gwq0.b;
        int v2 = 0;
        while(v2 < v1) {
            ify ify0 = (ify)arr_object[v2];
            igt igt0 = ify0.p();
            if(igt0 == null) {
                throw new IllegalArgumentException("Error: Child node\'s lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if(igt0.i != 0x7FFFFFFF) {
                igt0.I();
                ify0.Z(ify0);
            }
            ++v2;
            continue;
        }
    }

    private final void J() {
        ify.av(this.o(), false, 7);
        ify ify0 = this.o().n();
        if(ify0 != null && this.o().D == 3) {
            int v = 2;
            ify ify1 = this.o();
            int v1 = ify0.aC();
            if(v1 == 0) {
                throw null;
            }
            switch(v1 - 1) {
                case 0: {
                    v = 1;
                    break;
                }
                case 2: {
                    break;
                }
                default: {
                    v = ify0.D;
                }
            }
            ify1.D = v;
        }
    }

    private final boolean K() {
        return this.f.e;
    }

    @Override  // ihg
    public final void T(boolean z) {
        igm igm0 = this.q().C();
        if(!ibuq.m(Boolean.valueOf(z), (igm0 == null ? null : Boolean.valueOf(igm0.j)))) {
            igm igm1 = this.q().C();
            if(igm1 != null) {
                igm1.j = z;
            }
        }
    }

    @Override  // hzf
    public final int a(int v) {
        this.J();
        igm igm0 = this.q().C();
        ibuq.c(igm0);
        return igm0.a(v);
    }

    @Override  // hzf
    public final int b(int v) {
        this.J();
        igm igm0 = this.q().C();
        ibuq.c(igm0);
        return igm0.b(v);
    }

    @Override  // hzf
    public final int c(int v) {
        this.J();
        igm igm0 = this.q().C();
        ibuq.c(igm0);
        return igm0.c(v);
    }

    @Override  // hzf
    public final int d(int v) {
        this.J();
        igm igm0 = this.q().C();
        ibuq.c(igm0);
        return igm0.d(v);
    }

    @Override  // ibq
    public final void dZ(long v, float f, ibts ibts0) {
        this.F(v, ibts0, null);
    }

    @Override  // ias
    public final ibq e(long v) {
        ify ify0 = this.o().n();
        int v1 = 2;
        if(ify0 == null || ify0.aC() != 2) {
            ify ify1 = this.o().n();
            if(ify1 != null && ify1.aC() == 4) {
                this.f.b = false;
            }
        }
        else {
            this.f.b = false;
        }
        ify ify2 = this.o();
        ify ify3 = ify2.n();
        if(ify3 == null) {
            this.y = 3;
        }
        else {
            if(this.y != 3 && !ify2.t) {
                hxt.d("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int v2 = ify3.aC();
            if(v2 == 0) {
                throw null;
            }
            switch(v2 - 1) {
                case 0: 
                case 1: {
                    v1 = 1;
                    break;
                }
                case 2: 
                case 3: {
                    break;
                }
                default: {
                    int v3 = ify3.aC();
                    Objects.toString(ifu.a(v3));
                    throw new IllegalStateException("Measurable could be only measured from the parent\'s measure or layout block. Parents state is " + ifu.a(v3));
                }
            }
            this.y = v1;
        }
        if(this.o().D == 3) {
            this.o().C();
        }
        this.E(v);
        return this;
    }

    @Override  // iay
    public final int ee(hxw hxw0) {
        ify ify0 = this.o().n();
        if(ify0 != null && ify0.aC() == 2) {
            this.p.c = true;
        }
        else {
            ify ify1 = this.o().n();
            if(ify1 != null && ify1.aC() == 4) {
                this.p.d = true;
            }
        }
        this.j = true;
        igm igm0 = this.q().C();
        ibuq.c(igm0);
        int v = igm0.ee(hxw0);
        this.j = false;
        return v;
    }

    @Override  // ibq, hzf
    public final Object f() {
        return this.u;
    }

    @Override  // ids
    public final idr g() {
        return this.p;
    }

    @Override  // ids
    public final ids h() {
        ify ify0 = this.o().n();
        if(ify0 != null) {
            igd igd0 = ify0.v;
            if(igd0 != null) {
                return igd0.p;
            }
        }
        return null;
    }

    @Override  // ids
    public final ihy i() {
        return this.o().r();
    }

    @Override  // ids
    public final void j(ibts ibts0) {
        gwq gwq0 = this.o().k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            igt igt0 = ((ify)arr_object[v1]).v.p;
            ibuq.c(igt0);
            ibts0.a(igt0);
        }
    }

    @Override  // ids
    public final void k() {
        this.s = true;
        idr idr0 = this.p;
        idr0.g();
        if(this.K()) {
            gwq gwq0 = this.o().k();
            Object[] arr_object = gwq0.a;
            int v = gwq0.b;
            for(int v1 = 0; v1 < v; ++v1) {
                ify ify0 = (ify)arr_object[v1];
                if(ify0.ak() && ify0.aE() == 1) {
                    igt igt0 = ify0.v.p;
                    ibuq.c(igt0);
                    jkp jkp0 = ify0.v.c();
                    ibuq.c(jkp0);
                    if(igt0.E(jkp0.a)) {
                        ify.av(this.o(), false, 7);
                    }
                }
            }
        }
        igm igm0 = ((ife)this.i()).g;
        ibuq.c(igm0);
        igd igd0 = this.f;
        if(igd0.f || !this.j && !igm0.l && this.K()) {
            this.B(false);
            this.H(4);
            igd0.l(false);
            iiy iiy0 = ((ili)igc.a(this.o())).z;
            iiy0.a.c(this.o(), iiy0.h, this.B);
            this.H(this.G());
            if(igd0.l && igm0.l) {
                this.l();
            }
            this.C(false);
        }
        if(idr0.d) {
            idr0.e = true;
        }
        if(idr0.b && idr0.j()) {
            idr0.f();
        }
        this.s = false;
    }

    @Override  // ids
    public final void l() {
        ify.au(this.o());
    }

    @Override  // ids
    public final void m() {
        ify.av(this.o(), false, 7);
    }

    @Override  // ids
    public final boolean n() {
        return this.z != 3;
    }

    public final ify o() {
        return this.f.a;
    }

    public final ihc p() {
        return this.f.o;
    }

    public final ihy q() {
        return this.f.a();
    }

    public final void r(boolean z) {
        if(!z) {
            if(this.D()) {
            label_4:
                this.z = 3;
                gwq gwq0 = this.o().k();
                Object[] arr_object = gwq0.a;
                int v = gwq0.b;
                for(int v1 = 0; v1 < v; ++v1) {
                    igt igt0 = ((ify)arr_object[v1]).v.p;
                    ibuq.c(igt0);
                    igt0.r(true);
                }
            }
        }
        else if(!this.D()) {
            goto label_4;
        }
    }

    public final void s() {
        if(this.f.n > 0) {
            gwq gwq0 = this.o().k();
            Object[] arr_object = gwq0.a;
            int v = gwq0.b;
            for(int v1 = 0; v1 < v; ++v1) {
                ify ify0 = (ify)arr_object[v1];
                igd igd0 = ify0.v;
                if((igd0.l || igd0.m) && !igd0.e) {
                    ify.au(ify0);
                }
                igt igt0 = igd0.p;
                if(igt0 != null) {
                    igt0.s();
                }
            }
        }
    }

    public final void t() {
        this.x = true;
        ify ify0 = this.o().n();
        int v = this.z;
        if(v == 1 || v != 2) {
            if(this.D()) {
            label_7:
                this.I();
                if(this.g && ify0 != null) {
                    ify.au(ify0);
                }
            }
        }
        else if(!this.D()) {
            goto label_7;
        }
        if(ify0 == null) {
            this.i = 0;
        }
        else if(!this.g && (ify0.aC() == 3 || ify0.aC() == 4)) {
            if(this.i != 0x7FFFFFFF) {
                hxt.d("Place was called on a node which was placed already");
            }
            this.i = ify0.v.g;
            ++ify0.v.g;
        }
        this.k();
    }

    @Override  // ibq
    public final int v() {
        igm igm0 = this.q().C();
        ibuq.c(igm0);
        return igm0.v();
    }

    @Override  // ibq
    public final int w() {
        igm igm0 = this.q().C();
        ibuq.c(igm0);
        return igm0.w();
    }

    @Override  // ibq
    public final void y(long v, float f, hpn hpn0) {
        this.F(v, null, hpn0);
    }
}

