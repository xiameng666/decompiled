import java.util.List;
import java.util.Objects;

public final class ihc extends ibq implements ias, ids, ihg {
    public float A;
    public boolean B;
    public ibts C;
    public hpn D;
    public long E;
    public float F;
    public int G;
    private boolean H;
    private final gwq I;
    private final ibth J;
    private final ibth K;
    private final ibth L;
    private boolean M;
    public final igd f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public long m;
    public ibts n;
    public hpn o;
    public float p;
    public boolean q;
    public Object r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final idr w;
    public boolean x;
    public boolean y;
    public long z;

    public ihc(igd igd0) {
        this.f = igd0;
        this.h = 0x7FFFFFFF;
        this.i = 0x7FFFFFFF;
        this.G = 3;
        this.m = 0L;
        this.q = true;
        this.w = new ifz(this);
        this.I = new gwq(new ihc[16]);
        this.x = true;
        this.z = jkq.k(0, 0, 0, 15);
        this.J = new igz(this);
        this.K = new igy(this);
        this.E = 0L;
        this.L = new iha(this);
    }

    public final void B() {
        if(this.f.k > 0) {
            gwq gwq0 = this.o().k();
            Object[] arr_object = gwq0.a;
            int v = gwq0.b;
            for(int v1 = 0; v1 < v; ++v1) {
                ify ify0 = (ify)arr_object[v1];
                igd igd0 = ify0.v;
                if((igd0.i || igd0.j) && !igd0.n()) {
                    ify.aw(ify0);
                }
                igd0.o.B();
            }
        }
    }

    public final void C() {
        this.B = true;
        ify ify0 = this.o().n();
        float f = this.i().z;
        ify ify1 = this.o();
        ihy ihy0 = ify1.s();
        ihy ihy1 = ify1.r();
        while(ihy0 != ihy1) {
            ibuq.d(ihy0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f += ((ifn)ihy0).z;
            ihy0 = ((ifn)ihy0).w;
        }
        if(f != this.A) {
            this.A = f;
            if(ify0 != null) {
                ify0.T();
            }
            if(ify0 != null) {
                ify0.J();
            }
        }
        if(this.s) {
            this.o().r().ar();
        }
        else {
            if(ify0 != null) {
                ify0.J();
            }
            this.I();
            if(this.g && ify0 != null) {
                ify.aw(ify0);
            }
        }
        if(ify0 == null) {
            this.i = 0;
        }
        else if(!this.g && ify0.aC() == 3) {
            if(this.i != 0x7FFFFFFF) {
                hxt.d("Place was called on a node which was placed already");
            }
            this.i = ify0.v.h;
            ++ify0.v.h;
        }
        this.k();
    }

    public final void D(long v, float f, ibts ibts0, hpn hpn0) {
        if(this.o().C) {
            hxt.c("place is called on a deactivated node");
        }
        this.G(3);
        this.m = v;
        this.p = f;
        this.n = ibts0;
        this.o = hpn0;
        this.B = false;
        iio iio0 = igc.a(this.o());
        if(!this.v && this.s) {
            ihy ihy0 = this.p();
            ihy0.au(jlf.d(v, ihy0.e), f, ibts0, hpn0);
            this.C();
        }
        else {
            this.w.g = false;
            this.f.i(false);
            this.C = ibts0;
            this.E = v;
            this.F = f;
            this.D = hpn0;
            ((ili)iio0).z.a.c(this.o(), ((ili)iio0).z.f, this.L);
        }
        this.G(5);
        this.k = true;
    }

    public final boolean E(long v) {
        ify ify0;
        try {
            ify0 = this.o();
            if(this.o().C) {
                hxt.c("measure is called on a deactivated node");
            }
            iio iio0 = igc.a(this.o());
            ify ify1 = this.o().n();
            boolean z = false;
            this.o().t = this.o().t || ify1 != null && ify1.t;
            if(!this.o().al() && jkp.h(this.d, v)) {
                iio0.n(this.o(), false);
                this.o().aa();
                return false;
            }
            this.w.f = false;
            this.j(ihb.a);
            this.j = true;
            long v1 = this.p().c;
            this.eq(v);
            if(this.F() != 5) {
                hxt.d("layout state is not idle before measure starts");
            }
            this.z = v;
            this.G(1);
            this.u = false;
            iiy iiy0 = ((ili)igc.a(this.o())).z;
            iiy0.a.c(this.o(), iiy0.c, this.J);
            if(this.F() == 1) {
                this.r();
                this.G(5);
            }
            if(!jlk.c(this.p().c, v1) || this.p().a != this.a || this.p().b != this.b) {
                z = true;
            }
            this.z(((long)this.p().b) & 0xFFFFFFFFL | ((long)this.p().a) << 0x20);
            return z;
        }
        catch(Throwable throwable0) {
            ify0.ay(throwable0);
            throw new ibnm();
        }
    }

    public final int F() {
        return this.f.q;
    }

    public final void G(int v) {
        this.f.q = v;
    }

    private final igt H() {
        return this.f.p;
    }

    private final void I() {
        boolean z = this.s;
        this.s = true;
        ify ify0 = this.o();
        if(!z) {
            ify0.r().ar();
            if(ify0.al()) {
                ify.ax(ify0, true, 6);
            }
            else if(ify0.ak()) {
                ify.av(ify0, true, 6);
            }
        }
        ihy ihy0 = ify0.s();
        ihy ihy1 = ify0.r().w;
        while(!ibuq.m(ihy0, ihy1) && ihy0 != null) {
            if(ihy0.F) {
                ihy0.an();
            }
            ihy0 = ihy0.w;
        }
        gwq gwq0 = ify0.k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify1 = (ify)arr_object[v1];
            if(ify1.g() != 0x7FFFFFFF) {
                ify1.q().I();
                ify0.Z(ify1);
            }
        }
    }

    private final void J() {
        ify.ax(this.o(), false, 7);
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

    private final void K(long v, float f, ibts ibts0, hpn hpn0) {
        ibp ibp0;
        ify ify0;
        try {
            ify0 = this.o();
            this.t = true;
            if(!jlf.f(v, this.m) || this.M) {
                if(this.f.j || this.f.i || this.M) {
                    this.v = true;
                    this.M = false;
                }
                this.B();
            }
            igt igt0 = this.H();
            if(igt0 != null) {
                if(ige.a(igt0.o())) {
                label_15:
                    ihy ihy0 = this.p().x;
                    if(ihy0 == null) {
                        ibp0 = new ibl(igc.a(this.o()));
                    }
                    else {
                        ibp0 = ihy0.m;
                        if(ibp0 == null) {
                            ibp0 = new ibl(igc.a(this.o()));
                        }
                    }
                    igt igt1 = this.H();
                    ibuq.c(igt1);
                    ify ify1 = this.o().n();
                    if(ify1 != null) {
                        ify1.v.g = 0;
                    }
                    igt1.i = 0x7FFFFFFF;
                    ibp.y(ibp0, igt1, jlf.a(v), jlf.b(v));
                }
                else {
                    if(igt0.z == 3) {
                        igd igd0 = igt0.f;
                        if(!igd0.b) {
                            igd0.c = true;
                        }
                    }
                    if(igt0.D()) {
                        goto label_15;
                    }
                }
            }
            igt igt2 = this.H();
            if(igt2 != null && !igt2.k) {
                hxt.d("Error: Placement happened before lookahead.");
            }
            this.D(v, f, ibts0, hpn0);
        }
        catch(Throwable throwable0) {
            ify0.ay(throwable0);
            throw new ibnm();
        }
    }

    @Override  // ihg
    public final void T(boolean z) {
        if(z != this.p().j) {
            this.p().j = z;
            this.M = true;
        }
    }

    @Override  // hzf
    public final int a(int v) {
        if(ige.a(this.o())) {
            igt igt0 = this.H();
            ibuq.c(igt0);
            return igt0.a(v);
        }
        this.J();
        return this.p().a(v);
    }

    @Override  // hzf
    public final int b(int v) {
        if(ige.a(this.o())) {
            igt igt0 = this.H();
            ibuq.c(igt0);
            return igt0.b(v);
        }
        this.J();
        return this.p().b(v);
    }

    @Override  // hzf
    public final int c(int v) {
        if(ige.a(this.o())) {
            igt igt0 = this.H();
            ibuq.c(igt0);
            return igt0.c(v);
        }
        this.J();
        return this.p().c(v);
    }

    @Override  // hzf
    public final int d(int v) {
        if(ige.a(this.o())) {
            igt igt0 = this.H();
            ibuq.c(igt0);
            return igt0.d(v);
        }
        this.J();
        return this.p().d(v);
    }

    @Override  // ibq
    public final void dZ(long v, float f, ibts ibts0) {
        this.K(v, f, ibts0, null);
    }

    @Override  // ias
    public final ibq e(long v) {
        int v1 = 3;
        if(this.o().D == 3) {
            this.o().C();
        }
        if(ige.a(this.o())) {
            igt igt0 = this.H();
            ibuq.c(igt0);
            igt0.y = 3;
            igt0.e(v);
        }
        ify ify0 = this.o();
        ify ify1 = ify0.n();
        if(ify1 != null) {
            if(this.G != 3 && !ify0.t) {
                hxt.d("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int v2 = ify1.aC();
            if(v2 == 0) {
                throw null;
            }
            switch(v2 - 1) {
                case 0: {
                    v1 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                    break;
                }
                default: {
                    int v3 = ify1.aC();
                    Objects.toString(ifu.a(v3));
                    throw new IllegalStateException("Measurable could be only measured from the parent\'s measure or layout block. Parents state is " + ifu.a(v3));
                }
            }
        }
        this.G = v1;
        this.E(v);
        return this;
    }

    @Override  // iay
    public final int ee(hxw hxw0) {
        ify ify0 = this.o().n();
        if(ify0 != null && ify0.aC() == 1) {
            this.w.c = true;
        }
        else {
            ify ify1 = this.o().n();
            if(ify1 != null && ify1.aC() == 3) {
                this.w.d = true;
            }
        }
        this.l = true;
        this.l = false;
        return this.p().ee(hxw0);
    }

    @Override  // ibq, hzf
    public final Object f() {
        return this.r;
    }

    @Override  // ids
    public final idr g() {
        return this.w;
    }

    @Override  // ids
    public final ids h() {
        ify ify0 = this.o().n();
        if(ify0 != null) {
            igd igd0 = ify0.v;
            if(igd0 != null) {
                return igd0.o;
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
            ibts0.a(((ify)arr_object[v1]).v.o);
        }
    }

    @Override  // ids
    public final void k() {
        this.y = true;
        idr idr0 = this.w;
        idr0.g();
        if(this.v) {
            gwq gwq0 = this.o().k();
            Object[] arr_object = gwq0.a;
            int v = gwq0.b;
            for(int v1 = 0; v1 < v; ++v1) {
                ify ify0 = (ify)arr_object[v1];
                if(ify0.al() && ify0.aD() == 1 && ify.at(ify0)) {
                    ify.ax(this.o(), false, 7);
                }
            }
        }
        if(this.H || !this.l && !this.i().l && this.v) {
            this.v = false;
            this.G(3);
            this.f.j(false);
            ify ify1 = this.o();
            iiy iiy0 = ((ili)igc.a(ify1)).z;
            iiy0.a.c(ify1, iiy0.e, this.K);
            this.G(this.F());
            if(this.i().l && this.f.i) {
                this.l();
            }
            this.H = false;
        }
        if(idr0.d) {
            idr0.e = true;
        }
        if(idr0.b && idr0.j()) {
            idr0.f();
        }
        this.y = false;
    }

    @Override  // ids
    public final void l() {
        ify.aw(this.o());
    }

    @Override  // ids
    public final void m() {
        ify.ax(this.o(), false, 7);
    }

    @Override  // ids
    public final boolean n() {
        return this.s;
    }

    public final ify o() {
        return this.f.a;
    }

    public final ihy p() {
        return this.f.a();
    }

    public final List q() {
        this.o().ag();
        if(!this.x) {
            return this.I.e();
        }
        ify ify0 = this.o();
        gwq gwq0 = this.I;
        gwq gwq1 = ify0.k();
        Object[] arr_object = gwq1.a;
        int v = gwq1.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify1 = (ify)arr_object[v1];
            if(gwq0.b <= v1) {
                gwq0.n(ify1.v.o);
            }
            else {
                gwq0.d(v1, ify1.v.o);
            }
        }
        gwq0.h(ify0.y().size(), gwq0.b);
        this.x = false;
        return gwq0.e();
    }

    public final void r() {
        this.v = true;
        this.H = true;
    }

    public final void s() {
        this.u = true;
    }

    public final void t() {
        if(this.s) {
            this.s = false;
            ify ify0 = this.o();
            ihy ihy0 = ify0.s();
            ihy ihy1 = ify0.r().w;
            while(!ibuq.m(ihy0, ihy1) && ihy0 != null) {
                if(ihy0.az(0x100000)) {
                    hfb hfb0 = ihy0.B().u;
                    if(hfb0 != null) {
                        hfb hfb1 = ihy0.ad(false);
                        while(hfb1 != null && (hfb1.t & 0x100000) != 0) {
                            if((hfb1.s & 0x100000) != 0) {
                                hfb hfb2 = hfb1;
                                gwq gwq0 = null;
                                while(hfb2 != null) {
                                    if((hfb2 instanceof iij)) {
                                        ((iij)hfb2).a();
                                    }
                                    else if((hfb2.s & 0x100000) != 0 && (hfb2 instanceof iep)) {
                                        hfb hfb3 = ((iep)hfb2).D;
                                        int v1 = 0;
                                        while(hfb3 != null) {
                                            if((hfb3.s & 0x100000) != 0) {
                                                ++v1;
                                                if(v1 == 1) {
                                                    hfb2 = hfb3;
                                                }
                                                else {
                                                    if(gwq0 == null) {
                                                        gwq0 = new gwq(new hfb[16]);
                                                    }
                                                    if(hfb2 != null) {
                                                        gwq0.n(hfb2);
                                                    }
                                                    gwq0.n(hfb3);
                                                    hfb2 = null;
                                                }
                                            }
                                            hfb3 = hfb3.v;
                                        }
                                        if(v1 != 1) {
                                            goto label_37;
                                        }
                                        continue;
                                    }
                                label_37:
                                    hfb2 = ien.a(gwq0);
                                }
                            }
                            if(hfb1 == hfb0) {
                                break;
                            }
                            hfb1 = hfb1.v;
                        }
                    }
                }
                ihy0.aw();
                ihy0 = ihy0.w;
            }
            gwq gwq1 = this.o().k();
            Object[] arr_object = gwq1.a;
            int v2 = gwq1.b;
            for(int v = 0; v < v2; ++v) {
                ((ify)arr_object[v]).q().t();
            }
        }
    }

    @Override  // ibq
    public final int v() {
        return this.p().v();
    }

    @Override  // ibq
    public final int w() {
        return this.p().w();
    }

    @Override  // ibq
    public final void y(long v, float f, hpn hpn0) {
        this.K(v, f, null, hpn0);
    }
}

