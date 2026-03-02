import android.view.View;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public final class ify implements gom, iin, iip {
    public boolean A;
    public int B;
    public boolean C;
    public int D;
    public gzk E;
    private static final ifv F;
    private static final iqy G;
    private final boolean H;
    private int I;
    private final ihh J;
    private gwq K;
    private boolean L;
    private ify M;
    private ity N;
    private final gwq O;
    private boolean P;
    private ifg Q;
    private ihy R;
    private boolean S;
    private hfc T;
    private int U;
    public static final ibth a;
    public static final Comparator b;
    public int c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public ify i;
    public iio j;
    public jmw k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public iau p;
    public jks q;
    public jlm r;
    public iqy s;
    public boolean t;
    public final ihl u;
    public final igd v;
    public iag w;
    public hfc x;
    public ibts y;
    public ibts z;

    static {
        ify.F = new ift();
        ify.a = ifr.a;
        ify.G = new ifs();
        ify.b = new ifq();
    }

    public ify() {
        this(false, 3, null);
    }

    public ify(boolean z, int v) {
        this.H = z;
        this.c = v;
        this.d = 0x7FFFFFFF7FFFFFFFL;
        this.e = 0L;
        this.f = 0x7FFFFFFF7FFFFFFFL;
        this.g = true;
        this.J = new ihh(new gwq(new ify[16]), new ifw(this));
        this.O = new gwq(new ify[16]);
        this.P = true;
        this.p = ify.F;
        this.q = igc.a;
        this.r = jlm.a;
        this.s = ify.G;
        this.E = gpp.a;
        this.D = 3;
        this.U = 3;
        this.u = new ihl(this);
        this.v = new igd(this);
        this.S = true;
        this.x = hfc.e;
    }

    public ify(boolean z, int v, byte[] arr_b) {
        this(1 == (((int)z) & (v & 1 ^ 1)), iuc.a());
    }

    @Override  // iip
    public final boolean A() {
        return this.am();
    }

    public final void B(iio iio0) {
        ify ify3;
        if(this.j != null) {
            hxt.d(("Cannot attach " + this + " as it already is attached.  Tree: " + ify.ar(this)));
        }
        if(this.M != null && !ibuq.m(this.M.j, iio0)) {
            ify ify0 = this.n();
            hxt.d(("Attaching to a different owner(" + iio0 + ") than the parent\'s owner(" + (ify0 == null ? null : ify0.j) + "). This tree: " + ify.ar(this) + " Parent tree: " + (this.M == null ? null : ify.ar(this.M))));
        }
        ify ify1 = this.n();
        if(ify1 == null) {
            this.q().s = true;
            igt igt0 = this.p();
            if(igt0 != null) {
                igt0.z = 1;
            }
        }
        this.s().x = ify1 == null ? null : ify1.r();
        this.j = iio0;
        this.l = (ify1 == null ? -1 : ify1.l) + 1;
        hfc hfc0 = this.T;
        if(hfc0 != null) {
            this.aI(hfc0);
        }
        this.T = null;
        ((ili)iio0).aa.g(this.c, this);
        if(this.h) {
            this.aN(this);
        }
        else {
            ify ify2 = this.M;
            if(ify2 == null) {
                ify3 = this.i;
            }
            else {
                ify3 = ify2.i;
                if(ify3 == null) {
                    ify3 = this.i;
                }
            }
            this.aN(ify3);
            if(this.i == null && this.u.j(0x200)) {
                this.aN(this);
            }
        }
        if(!this.C) {
            this.u.b();
        }
        Object[] arr_object = this.J.a.a;
        int v = this.J.a.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ((ify)arr_object[v1]).B(iio0);
        }
        if(!this.C) {
            this.u.e();
        }
        this.L();
        if(ify1 != null) {
            ify1.L();
        }
        ibts ibts0 = this.y;
        if(ibts0 != null) {
            ibts0.a(iio0);
        }
        this.v.m();
        if(!this.C && this.u.j(8)) {
            this.N();
        }
        hfv hfv0 = ((ili)iio0).ac;
        if(hfv0 != null) {
            ity ity0 = this.u();
            if(ity0 != null && hfq.b(ity0)) {
                hfv0.i.d(this.c);
                hfv0.h.a(hfv0.b, this.c, true);
            }
        }
    }

    public final void C() {
        this.U = this.D;
        this.D = 3;
        gwq gwq0 = this.k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify0 = (ify)arr_object[v1];
            if(ify0.D != 3) {
                ify0.C();
            }
        }
    }

    public final void D() {
        this.U = this.D;
        this.D = 3;
        gwq gwq0 = this.k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify0 = (ify)arr_object[v1];
            if(ify0.D == 2) {
                ify0.D();
            }
        }
    }

    public final void E() {
        iio iio0 = this.j;
        String s = null;
        if(iio0 == null) {
            StringBuilder stringBuilder0 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            ify ify0 = this.n();
            if(ify0 != null) {
                s = ify.ar(ify0);
            }
            stringBuilder0.append(s);
            hxt.b(stringBuilder0.toString());
            throw new ibnm();
        }
        ify ify1 = this.n();
        if(ify1 != null) {
            ify1.J();
            ify1.L();
            this.q().G = 3;
            igt igt0 = this.p();
            if(igt0 != null) {
                igt0.y = 3;
            }
        }
        this.v.o.w.h();
        igt igt1 = this.v.p;
        if(igt1 != null) {
            idr idr0 = igt1.p;
            if(idr0 != null) {
                idr0.h();
            }
        }
        ihy ihy0 = this.s();
        ihy ihy1 = this.r().w;
        while(!ibuq.m(ihy0, ihy1) && ihy0 != null) {
            ihy0.aw();
            ihy0 = ihy0.w;
        }
        ibts ibts0 = this.z;
        if(ibts0 != null) {
            ibts0.a(iio0);
        }
        ihl ihl0 = this.u;
        ihl0.f();
        this.m = true;
        Object[] arr_object = this.J.a.a;
        int v = this.J.a.b;
        for(int v2 = 0; v2 < v; ++v2) {
            ((ify)arr_object[v2]).E();
        }
        this.m = false;
        ihl0.c();
        ((ili)iio0).aa.d(this.c);
        ((ili)iio0).A.b.c(this);
        ((ili)iio0).A.e.a.m(this);
        ((ili)iio0).w = true;
        ((ili)iio0).l.f(this);
        hfv hfv0 = ((ili)iio0).ac;
        if(hfv0 != null && hfv0.i.e(this.c)) {
            hfv0.h.a(hfv0.b, this.c, false);
        }
        this.j = null;
        this.d = 0x7FFFFFFF7FFFFFFFL;
        this.aN(null);
        this.l = 0;
        ihc ihc0 = this.q();
        ihc0.i = 0x7FFFFFFF;
        ihc0.h = 0x7FFFFFFF;
        ihc0.s = false;
        igt igt2 = this.p();
        if(igt2 != null) {
            igt2.i = 0x7FFFFFFF;
            igt2.h = 0x7FFFFFFF;
            igt2.z = 3;
        }
        if(ihl0.j(8)) {
            ity ity0 = this.N;
            this.N = null;
            this.n = false;
            Object[] arr_object1 = ((ili)iio0).m.c.a;
            int v3 = ((ili)iio0).m.c.b;
            for(int v1 = 0; v1 < v3; ++v1) {
                ((iua)arr_object1[v1]).d(this, ity0);
            }
            iio0.u();
        }
    }

    public final void F(hli hli0, hpn hpn0) {
        try {
            this.s().aj(hli0, hpn0);
        }
        catch(Throwable throwable0) {
            this.ay(throwable0);
            throw new ibnm();
        }
    }

    public final void G() {
        if(this.i == null) {
            ify.ax(this, false, 5);
        }
        else {
            ify.av(this, false, 5);
        }
        jkp jkp0 = this.v.b();
        if(jkp0 == null) {
            iio iio1 = this.j;
            if(iio1 != null) {
                iim.a(iio1);
            }
        }
        else {
            iio iio0 = this.j;
            if(iio0 != null) {
                iio0.p(this, jkp0.a);
            }
        }
    }

    public final void H(long v, ifb ifb0, int v1, boolean z) {
        this.s().am(ihy.r, ihy.aC(this.s(), v), ifb0, v1, z);
    }

    public final void I(int v, ify ify0) {
        if(ify0.M != null && ify0.j != null) {
            hxt.d(this.aH(ify0));
        }
        ify0.M = this;
        this.J.b(v, ify0);
        this.T();
        if(ify0.H) {
            ++this.I;
        }
        this.aJ();
        iio iio0 = this.j;
        if(iio0 != null) {
            ify0.B(iio0);
        }
        if(ify0.v.k > 0) {
            this.v.g(this.v.k + 1);
        }
        if(ify0.B > 0) {
            this.ac(this.B + 1);
        }
    }

    public final void J() {
        if(this.S) {
            ihy ihy0 = this.r();
            ihy ihy1 = this.s().x;
            this.R = null;
            while(!ibuq.m(ihy0, ihy1)) {
                if((ihy0 == null ? null : ihy0.G) == null) {
                    ihy0 = ihy0 == null ? null : ihy0.x;
                    continue;
                }
                else {
                    this.R = ihy0;
                }
                break;
            }
        }
        ihy ihy2 = this.R;
        if(ihy2 != null && ihy2.G == null) {
            hxt.b("layer was not set");
            throw new ibnm();
        }
        if(ihy2 != null) {
            ihy2.an();
            return;
        }
        ify ify0 = this.n();
        if(ify0 != null) {
            ify0.J();
        }
    }

    public final void K() {
        ihy ihy0 = this.s();
        ihy ihy1 = this.r();
        while(ihy0 != ihy1) {
            ibuq.d(ihy0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            iil iil0 = ((ifn)ihy0).G;
            if(iil0 != null) {
                iil0.invalidate();
            }
            ihy0 = ((ifn)ihy0).w;
        }
        iil iil1 = this.r().G;
        if(iil1 != null) {
            iil1.invalidate();
        }
    }

    public final void L() {
        if(this.H) {
            ify ify0 = this.n();
            if(ify0 != null) {
                ify0.L();
            }
            return;
        }
        if(this.i != null) {
            ify.av(this, false, 7);
            return;
        }
        ify.ax(this, false, 7);
    }

    public final void M() {
        if(!jlf.f(this.d, 0x7FFFFFFF7FFFFFFFL)) {
            this.d = 0x7FFFFFFF7FFFFFFFL;
            gwq gwq0 = this.k();
            Object[] arr_object = gwq0.a;
            int v = gwq0.b;
            for(int v1 = 0; v1 < v; ++v1) {
                ((ify)arr_object[v1]).M();
            }
        }
    }

    public final void N() {
        if(this.o) {
            return;
        }
        if(this.u.b.v == null && !this.ah()) {
            ity ity0 = this.N;
            this.o = true;
            ibvd ibvd0 = new ibvd();
            ibvd0.a = new ity();
            iiy iiy0 = ((ili)igc.a(this)).z;
            ifx ifx0 = new ifx(this, ibvd0);
            iiy0.a.c(this, iiy0.d, ifx0);
            int v = 0;
            this.o = false;
            this.N = (ity)ibvd0.a;
            this.n = false;
            iio iio0 = igc.a(this);
            if(ity0 == null) {
                Object[] arr_object = ((ili)iio0).m.c.a;
                int v1 = ((ili)iio0).m.c.b;
                while(v < v1) {
                    ((iua)arr_object[v]).a(this);
                    ++v;
                }
            }
            else {
                Object[] arr_object1 = ((ili)iio0).m.c.a;
                int v2 = ((ili)iio0).m.c.b;
                while(v < v2) {
                    ((iua)arr_object1[v]).b(this, ity0);
                    ++v;
                }
            }
            iio0.u();
            return;
        }
        this.n = true;
    }

    public final void O() {
        if(this.D == 3) {
            this.D();
        }
        igt igt0 = this.p();
        ibuq.c(igt0);
        try {
            igt0.g = true;
            if(!igt0.k) {
                hxt.d("replace() called on item that was not placed");
            }
            igt0.x = false;
            igt0.F(igt0.m, igt0.n, igt0.o);
            if(igt0.n() && !igt0.x) {
                ify ify0 = igt0.o().n();
                if(ify0 != null) {
                    ify.au(ify0);
                }
            }
        }
        finally {
            igt0.g = false;
        }
    }

    public final void P() {
        this.v.o.r();
    }

    public final void Q() {
        this.v.d = true;
    }

    public final void R() {
        this.v.o.s();
    }

    public final void S(int v, int v1, int v2) {
        if(v != v1) {
            for(int v3 = 0; v3 < v2; ++v3) {
                ify ify0 = (ify)this.J.a((v <= v1 ? v : v + v3));
                this.J.b((v <= v1 ? v1 + v2 - 2 : v1 + v3), ify0);
            }
            this.T();
            this.aJ();
            this.L();
        }
    }

    public final void T() {
        if(this.H) {
            ify ify0 = this.n();
            if(ify0 != null) {
                ify0.T();
            }
            return;
        }
        this.P = true;
    }

    public final void U() {
        ihh ihh0 = this.J;
        gwq gwq0 = ihh0.a;
        int v = gwq0.b;
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            this.aK(((ify)gwq0.a[v]));
        }
        gwq0.g();
        ihh0.b.a();
    }

    public final void V(int v, int v1) {
        if(v1 < 0) {
            hxt.c(a.f(v1, "count (", ") must be greater than 0"));
        }
        int v2 = v1 + v - 1;
        if(v <= v2) {
            while(true) {
                this.aK(((ify)this.J.a.a[v2]));
                ify ify0 = (ify)this.J.a(v2);
                if(v2 == v) {
                    break;
                }
                --v2;
            }
        }
    }

    public final void W() {
        ihc ihc0;
        if(this.D == 3) {
            this.D();
        }
        try {
            ihc0 = this.q();
            ihc0.g = true;
            if(!ihc0.k) {
                hxt.d("replace called on unplaced item");
            }
            boolean z = ihc0.s;
            ihc0.D(ihc0.m, ihc0.p, ihc0.n, ihc0.o);
            if(z && !ihc0.B) {
                ify ify0 = ihc0.o().n();
                if(ify0 != null) {
                    ify.aw(ify0);
                }
            }
            ihc0.g = false;
        }
        catch(Throwable throwable0) {
            try {
                ihc0.o().ay(throwable0);
                throw new ibnm();
            }
            catch(Throwable throwable1) {
                ihc0.g = false;
                throw throwable1;
            }
        }
    }

    public final void X(boolean z) {
        this.g = true;
        if(!this.H) {
            iio iio0 = this.j;
            if(iio0 != null) {
                iio0.t(this, true, z);
            }
        }
    }

    public final void Y(boolean z) {
        this.g = true;
        if(!this.H) {
            iio iio0 = this.j;
            if(iio0 != null) {
                iio0.t(this, false, z);
            }
        }
    }

    public final void Z(ify ify0) {
        int v = ify0.aC();
        if(v == 0) {
            throw null;
        }
        if(v - 1 == 4) {
            if(ify0.ak()) {
                ify.av(ify0, true, 6);
                return;
            }
            if(ify0.aj()) {
                ify0.X(true);
            }
            if(ify0.al()) {
                ify.ax(ify0, true, 6);
                return;
            }
            if(ify0.ai()) {
                ify0.Y(true);
            }
            return;
        }
        int v1 = ify0.aC();
        Objects.toString(ifu.a(v1));
        throw new IllegalStateException("Unexpected state " + ifu.a(v1));
    }

    @Override  // iin
    public final void a() {
        ihy ihy0 = this.r();
        hfb hfb0 = ((ife)ihy0).f;
        hfb hfb1 = ihy0.ad(true);
        while(hfb1 != null && (hfb1.t & 0x80) != 0) {
            if((hfb1.s & 0x80) != 0) {
                hfb hfb2 = hfb1;
                gwq gwq0 = null;
                while(hfb2 != null) {
                    if((hfb2 instanceof ifi)) {
                        ((ifi)hfb2).dV(this.r());
                    }
                    else if((hfb2.s & 0x80) != 0 && (hfb2 instanceof iep)) {
                        hfb hfb3 = ((iep)hfb2).D;
                        int v = 0;
                        while(hfb3 != null) {
                            if((hfb3.s & 0x80) != 0) {
                                ++v;
                                if(v == 1) {
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
                        if(v != 1) {
                            goto label_29;
                        }
                        continue;
                    }
                label_29:
                    hfb2 = ien.a(gwq0);
                }
            }
            if(hfb1 == hfb0) {
                break;
            }
            hfb1 = hfb1.v;
        }
    }

    public final void aA() {
        this.S = true;
    }

    public final void aB() {
        this.g = false;
    }

    public final int aC() {
        return this.v.q;
    }

    public final int aD() {
        return this.q().G;
    }

    public final int aE() {
        igt igt0 = this.p();
        if(igt0 != null) {
            return igt0.y == 0 ? 3 : igt0.y;
        }
        return 3;
    }

    public final void aF(gzk gzk0) {
        this.E = gzk0;
        this.ab(((jks)gzk0.h(ipa.d)));
        jlm jlm0 = (jlm)gzk0.h(ipa.i);
        if(this.r != jlm0) {
            this.r = jlm0;
            this.aL();
            hfb hfb0;
            for(hfb0 = this.u.f; hfb0 != null; hfb0 = hfb0.v) {
                hfb0.dG();
            }
        }
        this.af(((iqy)gzk0.h(ipa.m)));
        ihl ihl0 = this.u;
        if((ihl0.a() & 0x8000) != 0) {
            hfb hfb1 = ihl0.f;
            while(hfb1 != null) {
                if((hfb1.s & 0x8000) != 0) {
                    hfb hfb2 = hfb1;
                    gwq gwq0 = null;
                    while(hfb2 != null) {
                        if((hfb2 instanceof iek)) {
                            hfb hfb3 = ((iek)hfb2).I();
                            if(hfb3.B) {
                                iia.g(hfb3);
                            }
                            else {
                                hfb3.z = true;
                            }
                        }
                        else if((hfb2.s & 0x8000) != 0 && (hfb2 instanceof iep)) {
                            hfb hfb4 = ((iep)hfb2).D;
                            int v = 0;
                            while(hfb4 != null) {
                                if((hfb4.s & 0x8000) != 0) {
                                    ++v;
                                    if(v == 1) {
                                        hfb2 = hfb4;
                                    }
                                    else {
                                        if(gwq0 == null) {
                                            gwq0 = new gwq(new hfb[16]);
                                        }
                                        if(hfb2 != null) {
                                            gwq0.n(hfb2);
                                        }
                                        gwq0.n(hfb4);
                                        hfb2 = null;
                                    }
                                }
                                hfb4 = hfb4.v;
                            }
                            if(v != 1) {
                                goto label_45;
                            }
                            continue;
                        }
                    label_45:
                        hfb2 = ien.a(gwq0);
                    }
                }
                if((hfb1.t & 0x8000) == 0) {
                    break;
                }
                hfb1 = hfb1.v;
            }
        }
    }

    private final String aG(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("  ");
        }
        stringBuilder0.append("|-");
        stringBuilder0.append(this.toString());
        stringBuilder0.append('\n');
        gwq gwq0 = this.k();
        Object[] arr_object = gwq0.a;
        int v2 = gwq0.b;
        for(int v3 = 0; v3 < v2; ++v3) {
            stringBuilder0.append(((ify)arr_object[v3]).aG(v + 1));
        }
        String s = stringBuilder0.toString();
        if(v == 0) {
            s = s.substring(0, s.length() - 1);
            ibuq.e(s, "substring(...)");
        }
        return s;
    }

    private final String aH(ify ify0) {
        return "Cannot insert " + ify0 + " because it already has a parent or an owner. This tree: " + ify.ar(this) + " Other tree: " + (ify0.M == null ? null : ify.ar(ify0.M));
    }

    private final void aI(hfc hfc0) {
        ihk ihk1;
        ihl ihl1;
        gwq gwq3;
        ihl ihl0 = this.u;
        boolean z = ihl0.j(16);
        boolean z1 = ihl0.j(0x400);
        this.x = hfc0;
        ihk ihk0 = ihl0.b;
        if(ihl0.f == ihk0) {
            hxt.d("padChain called on already padded chain");
        }
        ihl0.f.u = ihk0;
        ihk0.v = ihl0.f;
        gwq gwq0 = ihl0.g;
        int v = gwq0 == null ? 0 : gwq0.b;
        gwq gwq1 = ihl0.h == null ? new gwq(new hfa[16]) : ihl0.h;
        gwq gwq2 = ihl0.i;
        gwq2.n(hfc0);
        ihm ihm0 = null;
        int v1;
        while((v1 = gwq2.b) != 0) {
            hfc hfc1 = (hfc)gwq2.c(v1 - 1);
            if((hfc1 instanceof hes)) {
                gwq2.n(((hes)hfc1).b);
                gwq2.n(((hes)hfc1).a);
            }
            else if((hfc1 instanceof hfa)) {
                gwq1.n(hfc1);
            }
            else {
                if(ihm0 == null) {
                    ihm0 = new ihm(gwq1);
                }
                hfc1.c(ihm0);
            }
        }
        int v2 = gwq1.b;
        boolean z2 = true;
        if(v2 == v) {
            hfb hfb0 = ihk0.v;
            int v3 = 0;
        label_34:
            while(hfb0 != null && v3 < v) {
                if(gwq0 != null) {
                    hfa hfa0 = (hfa)gwq0.a[v3];
                    hfa hfa1 = (hfa)gwq1.a[v3];
                    switch(ihn.a(hfa0, hfa1)) {
                        case 0: {
                            hfb0 = hfb0.u;
                            break label_34;
                        }
                        case 1: {
                            ihl.m(hfa0, hfa1, hfb0);
                        }
                    }
                    hfb0 = hfb0.v;
                    ++v3;
                    continue;
                }
                hxt.b("expected prior modifier list to be non-empty");
                throw new ibnm();
            }
            if(v3 < v) {
                if(gwq0 != null) {
                    if(hfb0 != null) {
                        gwq3 = gwq1;
                        ihl1 = ihl0;
                        ihl1.g(v3, gwq0, gwq3, hfb0, ((boolean)(ihl0.a.ah() ^ 1)));
                        ihk1 = ihk0;
                        goto label_97;
                    }
                    hxt.b("structuralUpdate requires a non-null tail");
                    throw new ibnm();
                }
                hxt.b("expected prior modifier list to be non-empty");
                throw new ibnm();
            }
            else {
                goto label_84;
            }
        }
        else {
            ify ify0 = ihl0.a;
            if(ify0.ah() && v == 0) {
                hfb hfb1 = ihk0;
                for(int v4 = 0; v4 < gwq1.b; ++v4) {
                    hfb1 = ihl.k(((hfa)gwq1.a[v4]), hfb1);
                }
                ihl0.h();
                ihl1 = ihl0;
                gwq3 = gwq1;
                ihk1 = ihk0;
            }
            else if(v2 == 0) {
                if(gwq0 != null) {
                    hfb hfb2 = ihk0.v;
                    for(int v5 = 0; hfb2 != null && v5 < gwq0.b; ++v5) {
                        hfb2 = ihl.l(hfb2).v;
                    }
                    ify ify1 = ify0.n();
                    ihl0.c.x = ify1 == null ? null : ify1.r();
                    ihl0.d = ihl0.c;
                label_84:
                    ihl1 = ihl0;
                    gwq3 = gwq1;
                    ihk1 = ihk0;
                    z2 = false;
                    goto label_97;
                }
                hxt.b("expected prior modifier list to be non-empty");
                throw new ibnm();
            }
            else {
                if(gwq0 == null) {
                    gwq0 = new gwq(new hfa[16]);
                }
                ihl1 = ihl0;
                gwq3 = gwq1;
                ihk1 = ihk0;
                ihl1.g(0, gwq0, gwq3, ihk1, ((boolean)(ify0.ah() ^ 1)));
            }
        }
    label_97:
        ihl1.g = gwq3;
        if(gwq0 == null) {
            gwq0 = null;
        }
        else {
            gwq0.g();
        }
        ihl1.h = gwq0;
        hfb hfb3 = ihk1.v == null ? ihl1.e : ihk1.v;
        hfb3.u = null;
        ihk1.v = null;
        ihk1.t = -1;
        ihk1.x = null;
        if(hfb3 == ihk1) {
            hxt.d("trimChain did not update the head");
        }
        ihl1.f = hfb3;
        if(z2) {
            ihl1.i();
        }
        int v6 = ihl1.j(16);
        int v7 = ihl1.j(0x400);
        this.v.m();
        if(this.i == null && ihl1.j(0x200)) {
            this.aN(this);
        }
        if(z != v6 || z1 != v7) {
            ivv ivv0 = ((ili)igc.a(this)).l;
            if(this.am()) {
                int v8 = this.c & 0x3FFFFFF;
                long[] arr_v = ivv0.a.a;
                int v9 = ivv0.a.c;
                for(int v10 = 0; v10 < arr_v.length - 2 && v10 < v9; v10 += 3) {
                    long v11 = arr_v[v10 + 2];
                    if((((int)v11) & 0x3FFFFFF) == v8) {
                        arr_v[v10 + 2] = 0x3FFFFFFFFFFFFFFFL & v11 | ((long)v7) * 0x4000000000000000L | ((long)v6) * 0x8000000000000000L;
                        return;
                    }
                }
            }
        }
    }

    private final void aJ() {
        if(this.I > 0) {
            this.L = true;
        }
        if(this.H) {
            ify ify0 = this.M;
            if(ify0 != null) {
                ify0.aJ();
            }
        }
    }

    private final void aK(ify ify0) {
        if(ify0.v.k > 0) {
            this.v.g(this.v.k - 1);
        }
        if(this.j != null) {
            ify0.E();
        }
        ify0.M = null;
        if(ify0.B > 0) {
            this.ac(this.B - 1);
        }
        ify0.s().x = null;
        if(ify0.H) {
            --this.I;
            Object[] arr_object = ify0.J.a.a;
            int v = ify0.J.a.b;
            for(int v1 = 0; v1 < v; ++v1) {
                ((ify)arr_object[v1]).s().x = null;
            }
        }
        this.aJ();
        this.T();
    }

    private final void aL() {
        this.L();
        ify ify0 = this.n();
        if(ify0 != null) {
            ify0.J();
        }
        this.K();
    }

    private final void aM() {
        ihl ihl0 = this.u;
        for(hfb hfb0 = ihl0.e; hfb0 != null; hfb0 = hfb0.u) {
            if(hfb0.B) {
                hfb0.M();
            }
        }
        ihl0.f();
        ihl0.c();
    }

    private final void aN(ify ify0) {
        if(!ibuq.m(ify0, this.i)) {
            this.i = ify0;
            if(ify0 == null) {
                this.v.p = null;
                this.v.e = false;
                this.v.d = false;
            }
            else {
                igd igd0 = this.v;
                if(igd0.p == null) {
                    igd0.p = new igt(igd0);
                }
                ihy ihy0 = this.s();
                ihy ihy1 = this.r().w;
                while(!ibuq.m(ihy0, ihy1) && ihy0 != null) {
                    ihy0.D();
                    ihy0 = ihy0.w;
                }
            }
            this.L();
        }
    }

    public final void aa() {
        gwq gwq0 = this.k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify0 = (ify)arr_object[v1];
            ify0.D = ify0.U;
            if(ify0.U != 3) {
                ify0.aa();
            }
        }
    }

    public final void ab(jks jks0) {
        if(!ibuq.m(this.q, jks0)) {
            this.q = jks0;
            this.aL();
            for(hfb hfb0 = this.u.f; hfb0 != null; hfb0 = hfb0.v) {
                hfb0.dH();
            }
        }
    }

    public final void ac(int v) {
        int v1 = this.B;
        if(v1 != v) {
            if(v > 0 && v1 == 0) {
                ify ify0 = this.n();
                if(ify0 != null) {
                    ify0.ac(ify0.B + 1);
                }
            }
            if(v == 0 && this.B > 0) {
                ify ify1 = this.n();
                if(ify1 != null) {
                    ify1.ac(ify1.B - 1);
                }
            }
            this.B = v;
        }
    }

    public final void ad(iau iau0) {
        if(!ibuq.m(this.p, iau0)) {
            this.p = iau0;
            ifg ifg0 = this.Q;
            if(ifg0 != null) {
                ifg0.b.b(iau0);
            }
            this.L();
        }
    }

    public final void ae(hfc hfc0) {
        if(this.H && this.x != hfc.e) {
            hxt.c("Modifiers are not supported on virtual LayoutNodes");
        }
        if(this.C) {
            hxt.c("modifier is updated when deactivated");
        }
        if(this.am()) {
            this.aI(hfc0);
            if(this.n) {
                this.N();
            }
            return;
        }
        this.T = hfc0;
    }

    public final void af(iqy iqy0) {
        if(!ibuq.m(this.s, iqy0)) {
            this.s = iqy0;
            ihl ihl0 = this.u;
            if((ihl0.a() & 16) != 0) {
                hfb hfb0 = ihl0.f;
                while(hfb0 != null) {
                    if((hfb0.s & 16) != 0) {
                        hfb hfb1 = hfb0;
                        gwq gwq0 = null;
                        while(hfb1 != null) {
                            if((hfb1 instanceof ijc)) {
                                ((ijc)hfb1).r();
                            }
                            else if((hfb1.s & 16) != 0 && (hfb1 instanceof iep)) {
                                hfb hfb2 = ((iep)hfb1).D;
                                int v = 0;
                                while(hfb2 != null) {
                                    if((hfb2.s & 16) != 0) {
                                        ++v;
                                        if(v == 1) {
                                            hfb1 = hfb2;
                                        }
                                        else {
                                            if(gwq0 == null) {
                                                gwq0 = new gwq(new hfb[16]);
                                            }
                                            if(hfb1 != null) {
                                                gwq0.n(hfb1);
                                            }
                                            gwq0.n(hfb2);
                                            hfb1 = null;
                                        }
                                    }
                                    hfb2 = hfb2.v;
                                }
                                if(v != 1) {
                                    goto label_31;
                                }
                                continue;
                            }
                        label_31:
                            hfb1 = ien.a(gwq0);
                        }
                    }
                    if((hfb0.t & 16) == 0) {
                        break;
                    }
                    hfb0 = hfb0.v;
                }
            }
        }
    }

    public final void ag() {
        if(this.I > 0 && this.L) {
            this.L = false;
            gwq gwq0 = this.K;
            if(gwq0 == null) {
                gwq0 = new gwq(new ify[16]);
                this.K = gwq0;
            }
            gwq0.g();
            Object[] arr_object = this.J.a.a;
            int v1 = this.J.a.b;
            for(int v = 0; v < v1; ++v) {
                ify ify0 = (ify)arr_object[v];
                if(ify0.H) {
                    gwq gwq1 = ify0.k();
                    gwq0.o(gwq0.b, gwq1);
                }
                else {
                    gwq0.n(ify0);
                }
            }
            this.v.d();
        }
    }

    public final boolean ah() {
        return this.T != null;
    }

    public final boolean ai() {
        return this.v.n();
    }

    public final boolean aj() {
        return this.v.e;
    }

    public final boolean ak() {
        return this.v.d;
    }

    public final boolean al() {
        return this.v.o.u;
    }

    public final boolean am() {
        return this.j != null;
    }

    public final boolean an() {
        return this.q().s;
    }

    public final boolean ao() {
        return this.q().t;
    }

    public final boolean ap(jkp jkp0) {
        if(jkp0 != null && this.i != null) {
            igt igt0 = this.p();
            ibuq.c(igt0);
            return igt0.E(jkp0.a);
        }
        return false;
    }

    public final boolean aq(jkp jkp0) {
        if(jkp0 != null) {
            if(this.D == 3) {
                this.C();
            }
            return this.q().E(jkp0.a);
        }
        return false;
    }

    static String ar(ify ify0) {
        return ify0.aG(0);
    }

    public final void as(long v, ifb ifb0, boolean z) {
        this.s().am(ihy.s, ihy.aC(this.s(), v), ifb0, 1, z);
    }

    public static boolean at(ify ify0) {
        return ify0.aq(ify0.v.b());
    }

    public static void au(ify ify0) {
        ify0.X(false);
    }

    public static void av(ify ify0, boolean z, int v) {
        if(ify0.i == null) {
            hxt.d("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        boolean z1 = false;
        ify0.g = true;
        iio iio0 = ify0.j;
        if(iio0 != null && !ify0.m && !ify0.H) {
            if(1 == (((int)z) & (v & 1 ^ 1))) {
                z1 = true;
            }
            iio0.s(ify0, true, z1, (v & 2) != 0);
            if((v & 4) != 0) {
                igt igt0 = ify0.p();
                ibuq.c(igt0);
                ify ify1 = igt0.o().n();
                int v1 = igt0.o().D;
                if(ify1 != null && v1 != 3) {
                    while(ify1.D == v1) {
                        ify ify2 = ify1.n();
                        if(ify2 == null) {
                            break;
                        }
                        ify1 = ify2;
                    }
                    if(v1 != 0) {
                        switch(v1 - 1) {
                            case 0: {
                                if(ify1.i != null) {
                                    ify.av(ify1, z1, 6);
                                    return;
                                }
                                ify.ax(ify1, z1, 6);
                                return;
                            }
                            case 1: {
                                if(ify1.i != null) {
                                    ify1.X(z1);
                                    return;
                                }
                                ify1.Y(z1);
                                return;
                            }
                            default: {
                                throw new IllegalStateException("Intrinsics isn\'t used by the parent");
                            }
                        }
                    }
                    throw null;
                }
            }
        }
    }

    public static void aw(ify ify0) {
        ify0.Y(false);
    }

    public static void ax(ify ify0, boolean z, int v) {
        ify0.g = true;
        if(!ify0.m && !ify0.H) {
            iio iio0 = ify0.j;
            if(iio0 != null) {
                boolean z1 = 1 == (((int)z) & (v & 1 ^ 1));
                iio0.s(ify0, false, z1, (v & 2) != 0);
                if((v & 4) != 0) {
                    ihc ihc0 = ify0.q();
                    ify ify1 = ihc0.o().n();
                    int v1 = ihc0.o().D;
                    if(ify1 != null && v1 != 3) {
                        while(ify1.D == v1) {
                            ify ify2 = ify1.n();
                            if(ify2 == null) {
                                break;
                            }
                            ify1 = ify2;
                        }
                        if(v1 != 0) {
                            switch(v1 - 1) {
                                case 0: {
                                    ify.ax(ify1, z1, 6);
                                    return;
                                }
                                case 1: {
                                    ify1.Y(z1);
                                    return;
                                }
                                default: {
                                    throw new IllegalStateException("Intrinsics isn\'t used by the parent");
                                }
                            }
                        }
                        throw null;
                    }
                }
            }
        }
    }

    public final void ay(Throwable throwable0) {
        hdw hdw0 = (hdw)this.E.h(hdy.a);
        if(hdw0 != null) {
            hdw0.b(throwable0, this);
        }
        throw throwable0;
    }

    public final void az() {
    }

    @Override  // gom
    public final void b() {
        jmw jmw0 = this.k;
        if(jmw0 != null) {
            jmw0.removeAllViewsInLayout();
        }
        iag iag0 = this.w;
        if(iag0 != null) {
            iag0.b();
        }
        this.C = true;
        this.aM();
        if(this.am()) {
            ity ity0 = this.N;
            this.N = null;
            this.n = false;
            if(this.u.j(8)) {
                bzd bzd0 = ((ili)igc.a(this)).m.c;
                Object[] arr_object = bzd0.a;
                int v = bzd0.b;
                for(int v1 = 0; v1 < v; ++v1) {
                    ((iua)arr_object[v1]).c(this, ity0);
                }
            }
        }
        iio iio0 = this.j;
        if(iio0 != null) {
            ((ili)iio0).l.f(this);
            hfv hfv0 = ((ili)iio0).ac;
            if(hfv0 != null && hfv0.i.e(this.c)) {
                hfv0.h.a(hfv0.b, this.c, false);
            }
        }
    }

    @Override  // gom
    public final void c() {
        jmw jmw0 = this.k;
        if(jmw0 != null) {
            jmw0.c();
        }
        iag iag0 = this.w;
        if(iag0 != null) {
            iag0.h();
        }
        ihy ihy0 = this.s();
        ihy ihy1 = this.r().w;
        while(!ibuq.m(ihy0, ihy1) && ihy0 != null) {
            ihy0.as();
            ihy0 = ihy0.w;
        }
    }

    @Override  // gom
    public final void d() {
        if(!this.am()) {
            hxt.c("onReuse is only expected on attached node");
        }
        jmw jmw0 = this.k;
        if(jmw0 != null) {
            jmw0.d();
        }
        iag iag0 = this.w;
        if(iag0 != null) {
            iag0.d();
        }
        this.o = false;
        if(this.C) {
            this.C = false;
        }
        else {
            this.aM();
        }
        int v = this.c;
        this.c = iuc.a();
        iio iio0 = this.j;
        if(iio0 != null) {
            ((ili)iio0).aa.d(v);
            ((ili)iio0).aa.g(this.c, this);
        }
        this.u.b();
        this.u.e();
        if(this.u.j(8)) {
            this.N();
        }
        this.Z(this);
        iio iio1 = this.j;
        if(iio1 != null) {
            hfv hfv0 = ((ili)iio1).ac;
            if(hfv0 != null) {
                if(hfv0.i.e(v)) {
                    hfv0.h.a(hfv0.b, v, false);
                }
                ity ity0 = this.u();
                if(ity0 != null && hfq.b(ity0)) {
                    hfv0.i.d(this.c);
                    hfv0.h.a(hfv0.b, this.c, true);
                }
            }
            ((ili)iio1).l.e(this, true);
        }
    }

    public final float e() {
        return this.q().A;
    }

    public final int f() {
        return this.v.o.b;
    }

    public final int g() {
        return this.q().i;
    }

    public final int h() {
        return this.v.o.a;
    }

    public final View i() {
        return this.k == null ? null : this.k.c;
    }

    public final gwq j() {
        if(this.P) {
            this.O.g();
            gwq gwq0 = this.k();
            this.O.o(this.O.b, gwq0);
            this.O.j(ify.b);
            this.P = false;
        }
        return this.O;
    }

    public final gwq k() {
        this.ag();
        if(this.I == 0) {
            return this.J.a;
        }
        gwq gwq0 = this.K;
        ibuq.c(gwq0);
        return gwq0;
    }

    public final hka l(hzk hzk0) {
        hfb hfb1;
        ify ify0 = this.n();
        if(ify0 == null) {
            return hka.a;
        }
        ihl ihl0 = ify0.u;
        ihy ihy0 = null;
        if((ihl0.a() & 8) != 0) {
            hfb hfb0 = ihl0.f;
            while(hfb0 != null) {
                if((hfb0.s & 8) != 0) {
                    hfb1 = hfb0;
                    gwq gwq0 = null;
                    while(hfb1 != null) {
                        if((hfb1 instanceof ije)) {
                            if(((ije)hfb1).y()) {
                                goto label_39;
                            }
                        }
                        else if((hfb1.s & 8) != 0 && (hfb1 instanceof iep)) {
                            hfb hfb2 = ((iep)hfb1).D;
                            int v = 0;
                            while(hfb2 != null) {
                                if((hfb2.s & 8) != 0) {
                                    ++v;
                                    if(v == 1) {
                                        hfb1 = hfb2;
                                    }
                                    else {
                                        if(gwq0 == null) {
                                            gwq0 = new gwq(new hfb[16]);
                                        }
                                        if(hfb1 != null) {
                                            gwq0.n(hfb1);
                                        }
                                        gwq0.n(hfb2);
                                        hfb1 = null;
                                    }
                                }
                                hfb2 = hfb2.v;
                            }
                            if(v != 1) {
                                goto label_33;
                            }
                            continue;
                        }
                    label_33:
                        hfb1 = ien.a(gwq0);
                    }
                }
                if((hfb0.t & 8) == 0) {
                    break;
                }
                hfb0 = hfb0.v;
            }
        }
        hfb1 = null;
    label_39:
        if(((ije)hfb1) != null) {
            ihy0 = ien.e(((ije)hfb1), 8);
        }
        return ihy0 == null ? ify0.l(hzk0) : hzj.a(ihy0, hzk0);
    }

    public final ifg m() {
        ifg ifg0 = this.Q;
        if(ifg0 == null) {
            ifg0 = new ifg(this, this.p);
            this.Q = ifg0;
        }
        return ifg0;
    }

    public final ify n() {
        do {
            this = this.M;
        }
        while(this != null && this.H);
        return this;
    }

    public final igb o() {
        return ((ili)igc.a(this)).e;
    }

    public final igt p() {
        return this.v.p;
    }

    public final ihc q() {
        return this.v.o;
    }

    public final ihy r() {
        return this.u.c;
    }

    public final ihy s() {
        return this.u.d;
    }

    public final ije t() {
        ity ity0 = this.u();
        if(ity0 != null && ity0.a) {
            ihl ihl0 = this.u;
            if((ihl0.a() & 8) != 0) {
                hfb hfb0 = ihl0.f;
                hfb hfb1 = null;
                while(hfb0 != null) {
                    if((hfb0.s & 8) != 0) {
                        hfb hfb2 = hfb0;
                        gwq gwq0 = null;
                        while(hfb2 != null) {
                            if(!(hfb2 instanceof ije)) {
                                if((hfb2.s & 8) != 0 && (hfb2 instanceof iep)) {
                                    hfb hfb3 = ((iep)hfb2).D;
                                    int v = 0;
                                    while(hfb3 != null) {
                                        if((hfb3.s & 8) != 0) {
                                            ++v;
                                            if(v == 1) {
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
                                    if(v != 1) {
                                        goto label_36;
                                    }
                                    continue;
                                }
                            }
                            else if(((ije)hfb2).y()) {
                                if(((ije)hfb2).x()) {
                                    return (ije)hfb2;
                                }
                                if(hfb1 == null) {
                                    hfb1 = (ije)hfb2;
                                }
                            }
                        label_36:
                            hfb2 = ien.a(gwq0);
                        }
                    }
                    if((hfb0.t & 8) == 0) {
                        break;
                    }
                    hfb0 = hfb0.v;
                }
                return (ije)hfb1;
            }
        }
        else {
            ihl ihl1 = this.u;
            if((ihl1.a() & 8) != 0) {
                hfb hfb4 = ihl1.f;
                while(hfb4 != null) {
                    if((hfb4.s & 8) != 0) {
                        hfb1 = hfb4;
                        gwq gwq1 = null;
                        while(hfb1 != null) {
                            if((hfb1 instanceof ije)) {
                                if(((ije)hfb1).y()) {
                                    return (ije)hfb1;
                                }
                            }
                            else if((hfb1.s & 8) != 0 && (hfb1 instanceof iep)) {
                                hfb hfb5 = ((iep)hfb1).D;
                                int v1 = 0;
                                while(hfb5 != null) {
                                    if((hfb5.s & 8) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            hfb1 = hfb5;
                                        }
                                        else {
                                            if(gwq1 == null) {
                                                gwq1 = new gwq(new hfb[16]);
                                            }
                                            if(hfb1 != null) {
                                                gwq1.n(hfb1);
                                            }
                                            gwq1.n(hfb5);
                                            hfb1 = null;
                                        }
                                    }
                                    hfb5 = hfb5.v;
                                }
                                if(v1 != 1) {
                                    goto label_71;
                                }
                                continue;
                            }
                        label_71:
                            hfb1 = ien.a(gwq1);
                        }
                    }
                    if((hfb4.t & 8) == 0) {
                        break;
                    }
                    hfb4 = hfb4.v;
                }
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return ipy.a(this) + " children: " + this.y().size() + " measurePolicy: " + this.p + " deactivated: " + this.C;
    }

    public final ity u() {
        return !this.am() || this.C || !this.u.j(8) ? null : this.N;
    }

    public final Boolean v() {
        igt igt0 = this.p();
        return igt0 == null ? null : Boolean.valueOf(igt0.n());
    }

    public final List w() {
        igt igt0 = this.p();
        ibuq.c(igt0);
        igt0.o().y();
        if(!igt0.r) {
            return igt0.q.e();
        }
        ify ify0 = igt0.o();
        gwq gwq0 = igt0.q;
        gwq gwq1 = ify0.k();
        Object[] arr_object = gwq1.a;
        int v = gwq1.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify1 = (ify)arr_object[v1];
            if(gwq0.b <= v1) {
                igt igt1 = ify1.v.p;
                ibuq.c(igt1);
                gwq0.n(igt1);
            }
            else {
                igt igt2 = ify1.v.p;
                ibuq.c(igt2);
                gwq0.d(v1, igt2);
            }
        }
        gwq0.h(ify0.y().size(), gwq0.b);
        igt0.r = false;
        return gwq0.e();
    }

    public final List x() {
        return this.q().q();
    }

    public final List y() {
        return this.k().e();
    }

    public final List z() {
        return this.J.a.e();
    }
}

