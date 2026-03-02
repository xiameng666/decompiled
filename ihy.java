import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.FIN;

public abstract class ihy extends igl implements hzk, ias, iip {
    public hmu A;
    public boolean B;
    public boolean C;
    public hpn D;
    public hli E;
    public boolean F;
    public iil G;
    private boolean H;
    private boolean I;
    private ibts J;
    private jks K;
    private jlm L;
    private float M;
    private iav N;
    private hjw O;
    private ifh P;
    private ibtw Q;
    private final ibth R;
    private hpn S;
    private bza T;
    private static final ibts f;
    private static final ifh g;
    private static final float[] h;
    public static final ibts p;
    public static final hmr q;
    public static final ihs r;
    public static final ihs s;
    public final ify t;
    public boolean u;
    public boolean v;
    public ihy w;
    public ihy x;
    public long y;
    public float z;

    static {
        ihy.f = ihr.a;
        ihy.p = ihq.a;
        ihy.q = new hmr();
        ihy.g = new ifh();
        ihy.h = hmb.f();
        ihy.r = new iho();
        ihy.s = new ihp();
    }

    public ihy(ify ify0) {
        this.t = ify0;
        this.K = ify0.q;
        this.L = ify0.r;
        this.M = 0.8f;
        this.y = 0L;
        this.A = hmp.a;
        this.R = new ihv(this);
    }

    @Override  // iip
    public final boolean A() {
        return this.G != null && !this.H && this.t.am();
    }

    public abstract hfb B();

    public abstract igm C();

    public abstract void D();

    public void E(ihs ihs0, long v, ifb ifb0, int v1, boolean z) {
        ihy ihy0 = this.w;
        if(ihy0 != null) {
            ihy0.am(ihs0, ihy.aC(ihy0, v), ifb0, v1, z);
        }
    }

    public void F(hli hli0, hpn hpn0) {
        throw null;
    }

    private final long G(ihy ihy0, long v, boolean z) {
        if(ihy0 == this) {
            return v;
        }
        ihy ihy1 = this.x;
        return ihy1 == null || ibuq.m(ihy0, ihy1) ? this.Z(v, z) : this.Z(ihy1.G(ihy0, v, z), z);
    }

    private final ibtw H() {
        ibtw ibtw0 = this.Q;
        if(ibtw0 == null) {
            ibtw ibtw1 = new iht(this, new ihu(this));
            this.Q = ibtw1;
            return ibtw1;
        }
        return ibtw0;
    }

    @Override  // igl
    public final long I() {
        return this.y;
    }

    @Override  // igl
    public final hzk J() {
        return this;
    }

    @Override  // igl
    public final iav K() {
        iav iav0 = this.N;
        if(iav0 != null) {
            return iav0;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override  // igl
    public final ify L() {
        return this.t;
    }

    @Override  // igl
    public final igl N() {
        return this.w;
    }

    @Override  // igl
    public final igl O() {
        return this.x;
    }

    @Override  // igl
    public final void S() {
        hpn hpn0 = this.S;
        if(hpn0 != null) {
            this.y(this.y, this.z, hpn0);
            return;
        }
        this.dZ(this.y, this.z, this.J);
    }

    @Override  // igl
    public final boolean U() {
        return this.N != null;
    }

    protected final float X(long v, long v1) {
        if(Float.compare(this.w(), Float.intBitsToFloat(((int)(v1 >> 0x20)))) < 0 || ((float)this.v()) < Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL)))) {
            long v2 = this.Y(v1);
            float f = Float.intBitsToFloat(((int)(v2 >> 0x20)));
            float f1 = Float.intBitsToFloat(((int)(v2 & 0xFFFFFFFFL)));
            float f2 = Float.intBitsToFloat(((int)(v >> 0x20)));
            float f3 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
            long v3 = ((long)Float.floatToRawIntBits(Math.max(0.0f, (f2 < 0.0f ? -f2 : f2 - ((float)this.w()))))) << 0x20;
            long v4 = ((long)Float.floatToRawIntBits(Math.max(0.0f, (f3 < 0.0f ? -f3 : f3 - ((float)this.v()))))) & 0xFFFFFFFFL;
            if((f > 0.0f) || (f1 > 0.0f)) {
                long v5 = v3 | v4;
                if((Float.intBitsToFloat(((int)(v5 >> 0x20))) <= f) && (Float.intBitsToFloat(((int)(v5 & 0xFFFFFFFFL))) <= f1)) {
                    float f4 = Float.intBitsToFloat(((int)(v5 >> 0x20)));
                    float f5 = Float.intBitsToFloat(((int)(v5 & 0xFFFFFFFFL)));
                    return f4 * f4 + f5 * f5;
                }
            }
        }
        return Infinityf;
    }

    protected final long Y(long v) {
        return ((long)Float.floatToRawIntBits(Math.max(0.0f, (Float.intBitsToFloat(((int)(v >> 0x20))) - ((float)this.w())) / 2.0f))) << 0x20 | ((long)Float.floatToRawIntBits(Math.max(0.0f, (Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) - ((float)this.v())) / 2.0f))) & 0xFFFFFFFFL;
    }

    public final long Z(long v, boolean z) {
        if(z || !this.j) {
            v = ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) - ((float)jlf.b(this.y)))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) - ((float)jlf.a(this.y)))) << 0x20;
        }
        return this.G == null ? v : this.G.a(v, true);
    }

    public final boolean aA() {
        if(this.G != null) {
            if(this.M > 0.0f) {
                return this.x == null ? false : this.x.aA();
            }
            return true;
        }
        return this.x == null ? false : this.x.aA();
    }

    protected final boolean aB(long v) {
        return Long.compare((0x7F8000007F800000L ^ v & 0x7F8000007F800000L) - 0x100000001L & 0x8000000080000000L, 0L) == 0 ? this.G == null || !this.I || this.G.l(v) : false;
    }

    public static long aC(ihy ihy0, long v) {
        return ihy0.Z(v, true);
    }

    public static long aD(ihy ihy0, long v) {
        return ihy0.ab(v, true);
    }

    public static void aE(ihy ihy0, ibts ibts0) {
        ihy0.ay(ibts0, false);
    }

    static boolean aF(ihy ihy0) {
        return ihy0.aL(true);
    }

    private final void aG(ihy ihy0, hjw hjw0, boolean z) {
        if(ihy0 != this) {
            ihy ihy1 = this.x;
            if(ihy1 != null) {
                ihy1.aG(ihy0, hjw0, z);
            }
            float f = (float)jlf.a(this.y);
            hjw0.a -= f;
            hjw0.c -= f;
            float f1 = (float)jlf.b(this.y);
            hjw0.b -= f1;
            hjw0.d -= f1;
            iil iil0 = this.G;
            if(iil0 != null) {
                iil0.e(hjw0, true);
                if(this.I && z) {
                    hjw0.a(0.0f, 0.0f, ((float)(((int)(this.c >> 0x20)))), ((float)(((int)(this.c & 0xFFFFFFFFL)))));
                }
            }
        }
    }

    private final void aH(hfb hfb0, ihs ihs0, long v, ifb ifb0, int v1, boolean z) {
        if(hfb0 == null) {
            this.E(ihs0, v, ifb0, v1, z);
            return;
        }
        int v2 = ifb0.a;
        ifb0.d(v2 + 1, ifb0.a());
        ++ifb0.a;
        ifb0.b.p(hfb0);
        ifb0.c.b(ifc.a(-1.0f, z, false));
        this.aH(ihz.a(hfb0, ihs0.a()), ihs0, v, ifb0, v1, z);
        ifb0.a = v2;
    }

    private final void aI(hfb hfb0, ihs ihs0, long v, ifb ifb0, int v1, boolean z, float f) {
        if(hfb0 == null) {
            this.E(ihs0, v, ifb0, v1, z);
            return;
        }
        int v2 = ifb0.a;
        ifb0.d(v2 + 1, ifb0.a());
        ++ifb0.a;
        ifb0.b.p(hfb0);
        ifb0.c.b(ifc.a(f, z, false));
        this.at(ihz.a(hfb0, ihs0.a()), ihs0, v, ifb0, v1, z, f, true);
        ifb0.a = v2;
    }

    private final void aJ(ihy ihy0, float[] arr_f) {
        if(!ibuq.m(ihy0, this)) {
            ihy ihy1 = this.x;
            ibuq.c(ihy1);
            ihy1.aJ(ihy0, arr_f);
            if(!jlf.f(this.y, 0L)) {
                hmb.c(ihy.h);
                hmb.i(ihy.h, -((float)jlf.a(this.y)), -((float)jlf.b(this.y)));
                hmb.e(arr_f, ihy.h);
            }
            iil iil0 = this.G;
            if(iil0 != null) {
                iil0.d(arr_f);
            }
        }
    }

    private final void aK(ihy ihy0, float[] arr_f) {
        while(!ibuq.m(this, ihy0)) {
            iil iil0 = this.G;
            if(iil0 != null) {
                iil0.i(arr_f);
            }
            long v = this.y;
            if(!jlf.f(v, 0L)) {
                hmb.c(ihy.h);
                hmb.i(ihy.h, ((float)jlf.a(v)), ((float)jlf.b(v)));
                hmb.e(arr_f, ihy.h);
            }
            this = this.x;
            ibuq.c(this);
        }
    }

    private final boolean aL(boolean z) {
        int v = 0;
        if(this.S != null) {
            return false;
        }
        iil iil0 = this.G;
        if(iil0 != null) {
            ibts ibts0 = this.J;
            if(ibts0 != null) {
                hmr hmr0 = ihy.q;
                hmr0.n();
                ify ify0 = this.t;
                hmr0.q = ify0.q;
                hmr0.r = ify0.r;
                hmr0.p = jll.b(this.c);
                iiy iiy0 = this.ai();
                ihx ihx0 = new ihx(ibts0, this);
                iiy0.a.c(this, ihy.f, ihx0);
                ifh ifh0 = this.P;
                if(ifh0 == null) {
                    ifh0 = new ifh();
                    this.P = ifh0;
                }
                ihy.g.a = ifh0.a;
                ihy.g.b = ifh0.b;
                ihy.g.c = ifh0.c;
                ihy.g.d = ifh0.d;
                ihy.g.e = ifh0.e;
                ihy.g.f = ifh0.f;
                ihy.g.g = ifh0.g;
                ifh0.a = hmr0.b;
                ifh0.b = hmr0.c;
                ifh0.c = hmr0.e;
                ifh0.d = hmr0.f;
                ifh0.e = hmr0.j;
                ifh0.f = hmr0.k;
                ifh0.g = hmr0.l;
                iil0.k(hmr0);
                boolean z1 = this.I;
                this.I = hmr0.n;
                this.M = hmr0.d;
                if(ihy.g.a == ifh0.a && ihy.g.b == ifh0.b && ihy.g.c == ifh0.c && ihy.g.d == ifh0.d && ihy.g.e == ifh0.e && ihy.g.f == ifh0.f && hnd.d(ihy.g.g, ifh0.g)) {
                    v = 1;
                }
                if(z && (v == 0 || z1 != this.I)) {
                    iio iio0 = ify0.j;
                    if(iio0 != null) {
                        iio0.r(ify0);
                    }
                }
                return v ^ 1;
            }
            hxt.b("updateLayerParameters requires a non-null layerBlock");
            throw new ibnm();
        }
        if(this.J != null) {
            hxt.d("null layer with a non-null layerBlock");
        }
        return false;
    }

    private static final ihy aM(hzk hzk0) {
        iai iai0 = (hzk0 instanceof iai) ? ((iai)hzk0) : null;
        if(iai0 != null) {
            ihy ihy0 = iai0.a();
            if(ihy0 != null) {
                return ihy0;
            }
        }
        ibuq.d(hzk0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (ihy)hzk0;
    }

    public final long aa() {
        return this.K.ek(this.t.s.g());
    }

    public final long ab(long v, boolean z) {
        iil iil0 = this.G;
        if(iil0 != null) {
            v = iil0.a(v, false);
        }
        return z || !this.j ? jlg.a(v, this.y) : v;
    }

    public final hfb ac(int v) {
        hfb hfb1;
        hfb hfb0;
        boolean z = iia.h(v);
        if(z) {
            hfb0 = this.B();
            hfb1 = this.ad(z);
            goto label_8;
        }
        else {
            hfb0 = this.B().u;
            if(hfb0 != null) {
                hfb1 = this.ad(z);
            label_8:
                while(hfb1 != null && (hfb1.t & v) != 0) {
                    if((hfb1.s & v) != 0) {
                        return hfb1;
                    }
                    if(hfb1 == hfb0) {
                        break;
                    }
                    hfb1 = hfb1.v;
                }
            }
        }
        return null;
    }

    public final hfb ad(boolean z) {
        ify ify0 = this.t;
        if(ify0.s() == this) {
            return ify0.u.f;
        }
        if(z) {
            ihy ihy0 = this.x;
            if(ihy0 != null) {
                hfb hfb0 = ihy0.B();
                return hfb0 == null ? null : hfb0.v;
            }
            return null;
        }
        return this.x == null ? null : this.x.B();
    }

    protected final hjw ae() {
        hjw hjw0 = this.O;
        if(hjw0 == null) {
            hjw0 = new hjw();
            this.O = hjw0;
        }
        return hjw0;
    }

    public final hka af() {
        if(this.t()) {
            hzk hzk0 = hzl.g(this);
            hjw hjw0 = this.ae();
            long v = this.Y(this.aa());
            hjw0.a = -Float.intBitsToFloat(((int)(v >> 0x20)));
            hjw0.b = -Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
            hjw0.c = ((float)this.w()) + Float.intBitsToFloat(((int)(v >> 0x20)));
            hjw0.d = ((float)this.v()) + Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
            while(this != hzk0) {
                this.av(hjw0, false, true);
                if(hjw0.b()) {
                    return hka.a;
                }
                this = this.x;
                ibuq.c(this);
            }
            return hjx.a(hjw0);
        }
        return hka.a;
    }

    public final ids ag() {
        return this.t.v.o;
    }

    public final ihy ah(ihy ihy0) {
        ify ify0 = ihy0.t;
        ify ify1 = this.t;
        if(ify0 == ify1) {
            hfb hfb0 = ihy0.B();
            hfb hfb1 = this.B();
            if(!hfb1.I().B) {
                hxt.d("visitLocalAncestors called on an unattached node");
            }
            hfb hfb2 = hfb1.I();
            do {
                hfb2 = hfb2.u;
                if(hfb2 == null) {
                    return this;
                }
            }
            while((hfb2.s & 2) == 0 || hfb2 != hfb0);
            return ihy0;
        }
        else {
            ify ify2 = ify0;
            while(ify2.l > ify1.l) {
                ify2 = ify2.n();
                ibuq.c(ify2);
            }
            ify ify3 = ify1;
            while(ify3.l > ify2.l) {
                ify3 = ify3.n();
                ibuq.c(ify3);
            }
            while(ify2 != ify3) {
                ify2 = ify2.n();
                ify3 = ify3.n();
                if(ify2 == null || ify3 == null) {
                    throw new IllegalArgumentException("layouts are not part of the same hierarchy");
                }
            }
            if(ify3 != ify1) {
                return ify2 == ify0 ? ihy0 : ify2.r();
            }
        }
        return this;
    }

    public final iiy ai() {
        return ((ili)igc.a(this.t)).z;
    }

    public final void aj(hli hli0, hpn hpn0) {
        iil iil0 = this.G;
        if(iil0 != null) {
            iil0.c(hli0, hpn0);
            return;
        }
        float f = (float)jlf.a(this.y);
        float f1 = (float)jlf.b(this.y);
        hli0.o(f, f1);
        this.al(hli0, hpn0);
        hli0.o(-f, -f1);
    }

    protected final void ak(hli hli0, hmi hmi0) {
        hli0.g(0.5f, 0.5f, ((float)(((int)(this.c >> 0x20)))) - 0.5f, ((float)(((int)(this.c & 0xFFFFFFFFL)))) - 0.5f, hmi0);
    }

    public final void al(hli hli0, hpn hpn0) {
        hpn hpn1;
        hli hli1;
        ihy ihy0;
        hfb hfb0 = this.ac(4);
        if(hfb0 == null) {
            this.F(hli0, hpn0);
            return;
        }
        igb igb0 = this.t.o();
        long v = jll.b(this.c);
        gwq gwq0 = null;
        while(hfb0 != null) {
            if((hfb0 instanceof iew)) {
                ihy0 = this;
                hli1 = hli0;
                hpn1 = hpn0;
                igb0.u(hli1, v, ihy0, ((iew)hfb0), hpn1);
                hfb0 = ien.a(gwq0);
            }
            else {
                ihy0 = this;
                hli1 = hli0;
                hpn1 = hpn0;
                if((hfb0.s & 4) != 0 && (hfb0 instanceof iep)) {
                    hfb hfb1 = ((iep)hfb0).D;
                    int v1 = 0;
                    while(hfb1 != null) {
                        if((hfb1.s & 4) != 0) {
                            ++v1;
                            if(v1 == 1) {
                                hfb0 = hfb1;
                            }
                            else {
                                if(gwq0 == null) {
                                    gwq0 = new gwq(new hfb[16]);
                                }
                                if(hfb0 != null) {
                                    gwq0.n(hfb0);
                                }
                                gwq0.n(hfb1);
                                hfb0 = null;
                            }
                        }
                        hfb1 = hfb1.v;
                    }
                    if(v1 != 1) {
                        hfb0 = ien.a(gwq0);
                    }
                }
                else {
                    hfb0 = ien.a(gwq0);
                }
            }
            hli0 = hli1;
            this = ihy0;
            hpn0 = hpn1;
        }
    }

    public final void am(ihs ihs0, long v, ifb ifb0, int v1, boolean z) {
        boolean z2;
        float f4;
        ihy ihy0;
        boolean z1;
        hfb hfb0 = this.ac(ihs0.a());
        if(!this.aB(v)) {
            if(v1 == 1) {
                float f = this.X(v, this.aa());
                if((Float.floatToRawIntBits(f) & 0x7FFFFFFF) < 0x7F800000 && ifb0.e(f, false)) {
                    this.aI(hfb0, ihs0, v, ifb0, 1, false, f);
                }
            }
            return;
        }
        if(hfb0 == null) {
            this.E(ihs0, v, ifb0, v1, z);
            return;
        }
        float f1 = Float.intBitsToFloat(((int)(v >> 0x20)));
        float f2 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
        if(Float.compare(f1, 0.0f) >= 0 && (f2 >= 0.0f) && (f1 < ((float)this.w())) && f2 < ((float)this.v())) {
            this.aH(hfb0, ihs0, v, ifb0, v1, z);
            return;
        }
        float f3 = v1 == 1 ? this.X(v, this.aa()) : Infinityf;
        if((Float.floatToRawIntBits(f3) & 0x7FFFFFFF) < 0x7F800000) {
            z1 = z;
            if(ifb0.e(f3, z1)) {
                ihy0 = this;
                f4 = f3;
                z2 = true;
            }
            else {
                ihy0 = this;
                f4 = f3;
                z2 = false;
            }
        }
        else {
            ihy0 = this;
            z1 = z;
            f4 = f3;
            z2 = false;
        }
        ihy0.at(hfb0, ihs0, v, ifb0, v1, z1, f4, z2);
    }

    public final void an() {
        iil iil0 = this.G;
        if(iil0 != null) {
            iil0.invalidate();
            return;
        }
        ihy ihy0 = this.x;
        if(ihy0 != null) {
            ihy0.an();
        }
    }

    public final void ao() {
        this.t.v.f();
    }

    public final void ap() {
        iil iil0 = this.G;
        if(iil0 != null) {
            iil0.invalidate();
        }
    }

    public final void aq() {
        if(this.az(0x80)) {
            hbm hbm0 = hbl.a();
            ibts ibts0 = hbm0 == null ? null : hbm0.i();
            hbm hbm1 = hbl.b(hbm0);
            int v = FIN.finallyOpen$NT();
            hfb hfb0 = this.B();
            hfb hfb1 = this.ad(true);
            while(hfb1 != null && (hfb1.t & 0x80) != 0) {
                if((hfb1.s & 0x80) != 0) {
                    gwq gwq0 = null;
                    hfb hfb2 = hfb1;
                    while(hfb2 != null) {
                        if((hfb2 instanceof ifi)) {
                            ((ifi)hfb2).i(this.c);
                        }
                        else if((hfb2.s & 0x80) != 0 && (hfb2 instanceof iep)) {
                            hfb hfb3 = ((iep)hfb2).D;
                            int v1 = 0;
                            while(hfb3 != null) {
                                if((hfb3.s & 0x80) != 0) {
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
                                goto label_33;
                            }
                            continue;
                        }
                    label_33:
                        hfb2 = ien.a(gwq0);
                    }
                }
                if(hfb1 == hfb0) {
                    break;
                }
                hfb1 = hfb1.v;
            }
            FIN.finallyCodeBegin$NT(v);
            hbl.d(hbm0, hbm1, ibts0);
            FIN.finallyCodeEnd$NT(v);
        }
    }

    public final void ar() {
        hfb hfb0 = this.B();
        hfb hfb1 = this.ad(true);
        while(hfb1 != null && (hfb1.t & 0x80) != 0) {
            if((hfb1.s & 0x80) != 0) {
                hfb hfb2 = hfb1;
                gwq gwq0 = null;
                while(hfb2 != null) {
                    if((hfb2 instanceof ifi)) {
                        ((ifi)hfb2).dV(this);
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
                            goto label_28;
                        }
                        continue;
                    }
                label_28:
                    hfb2 = ien.a(gwq0);
                }
            }
            if(hfb1 == hfb0) {
                break;
            }
            hfb1 = hfb1.v;
        }
    }

    public final void as() {
        this.H = true;
        this.R.a();
        this.aw();
    }

    public final void at(hfb hfb0, ihs ihs0, long v, ifb ifb0, int v1, boolean z, float f, boolean z1) {
        if(hfb0 == null) {
            this.E(ihs0, v, ifb0, v1, z);
            return;
        }
        int v2 = v1;
        if(v2 == 3 || v2 == 4) {
            hfb hfb1 = hfb0;
            gwq gwq0 = null;
            while(hfb1 != null) {
                if((hfb1 instanceof ijc)) {
                    long v3 = ((ijc)hfb1).dQ();
                    if((Float.intBitsToFloat(((int)(v >> 0x20))) >= ((float)(-(this.p() == jlm.a ? ijk.b(v3) : ijk.a(v3))))) && ((Float.intBitsToFloat(((int)(v >> 0x20))) < ((float)(this.w() + (this.p() == jlm.a ? ijk.a(v3) : ijk.b(v3))))) && (Float.intBitsToFloat(((int)(0xFFFFFFFFL & v))) >= ((float)(-ijj.a(v3, 1)))) && (Float.intBitsToFloat(((int)(0xFFFFFFFFL & v))) < ((float)(this.v() + ijj.a(v3, 3)))))) {
                        ihw ihw0 = new ihw(this, hfb0, ihs0, v, ifb0, v2, z, f, z1);
                        if(ifb0.a == ibpo.d(ifb0)) {
                            int v4 = ifb0.a;
                            ifb0.d(v4 + 1, ifb0.a());
                            ++ifb0.a;
                            ifb0.b.p(hfb0);
                            ifb0.c.b(ifc.a(0.0f, z, true));
                            ihw0.a();
                            ifb0.a = v4;
                            return;
                        }
                        long v5 = ifb0.b();
                        int v6 = ifb0.a;
                        if(ieu.c(v5)) {
                            int v7 = ibpo.d(ifb0);
                            ifb0.a = v7;
                            ifb0.d(v7 + 1, ifb0.a());
                            ++ifb0.a;
                            ifb0.b.p(hfb0);
                            ifb0.c.b(ifc.a(0.0f, z, true));
                            ihw0.a();
                            ifb0.a = v7;
                            if((ieu.a(ifb0.b()) < 0.0f)) {
                                ifb0.d(v6 + 1, ifb0.a + 1);
                            }
                            ifb0.a = v6;
                            return;
                        }
                        if((ieu.a(v5) > 0.0f)) {
                            int v8 = ifb0.a;
                            ifb0.d(v8 + 1, ifb0.a());
                            ++ifb0.a;
                            ifb0.b.p(hfb0);
                            ifb0.c.b(ifc.a(0.0f, z, true));
                            ihw0.a();
                            ifb0.a = v8;
                        }
                        return;
                    }
                    break;
                }
                if((hfb1.s & 16) != 0 && (hfb1 instanceof iep)) {
                    hfb hfb2 = ((iep)hfb1).D;
                    int v9 = 0;
                    while(hfb2 != null) {
                        if((hfb2.s & 16) != 0) {
                            ++v9;
                            if(v9 == 1) {
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
                    if(v9 != 1) {
                        hfb1 = ien.a(gwq0);
                    }
                }
                else {
                    hfb1 = ien.a(gwq0);
                }
                v2 = v1;
            }
        }
        if(z1) {
            this.aI(hfb0, ihs0, v, ifb0, v1, z, f);
            return;
        }
        ihs0.e(hfb0);
        this.at(ihz.a(hfb0, ihs0.a()), ihs0, v, ifb0, v1, z, f, false);
    }

    public final void au(long v, float f, ibts ibts0, hpn hpn0) {
        if(hpn0 == null) {
            if(this.S != null) {
                this.S = null;
                ihy.aE(this, null);
            }
            ihy.aE(this, ibts0);
        }
        else {
            if(ibts0 != null) {
                hxt.c("both ways to create layers shouldn\'t be used together");
            }
            if(this.S != hpn0) {
                this.S = null;
                ihy.aE(this, null);
                this.S = hpn0;
            }
            if(this.G == null) {
                iil iil0 = igc.a(this.t).i(this.H(), this.R, hpn0);
                iil0.g(this.c);
                iil0.f(v);
                this.G = iil0;
                this.t.aA();
                this.R.a();
            }
        }
        if(!jlf.f(this.y, v)) {
            ify ify0 = this.t;
            igc.a(ify0).x(-4.0f);
            this.y = v;
            ify0.v.o.B();
            iil iil1 = this.G;
            if(iil1 == null) {
                ihy ihy0 = this.x;
                if(ihy0 != null) {
                    ihy0.an();
                }
            }
            else {
                iil1.f(v);
            }
            gwq gwq0 = ify0.k();
            Object[] arr_object = gwq0.a;
            int v1 = gwq0.b;
            for(int v2 = 0; v2 < v1; ++v2) {
                ((ify)arr_object[v2]).M();
            }
            ihy.W(this);
            iio iio0 = ify0.j;
            if(iio0 != null) {
                iio0.r(ify0);
            }
        }
        this.z = f;
        if(!this.l) {
            this.R(this.K());
        }
        ify ify1 = this.t;
        if(this == ify1.s()) {
            ((ili)igc.a(ify1)).l.e(ify1, ((boolean)(ify1.q().k ^ 1)));
        }
    }

    public final void av(hjw hjw0, boolean z, boolean z1) {
        iil iil0 = this.G;
        if(iil0 != null) {
            if(this.I) {
                if(z1) {
                    long v = this.aa();
                    float f = Float.intBitsToFloat(((int)(v >> 0x20))) / 2.0f;
                    float f1 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) / 2.0f;
                    hjw0.a(-f, -f1, ((float)(((int)(this.c >> 0x20)))) + f, ((float)(((int)(0xFFFFFFFFL & this.c)))) + f1);
                }
                else if(z) {
                    hjw0.a(0.0f, 0.0f, ((float)(((int)(this.c >> 0x20)))), ((float)(((int)(this.c & 0xFFFFFFFFL)))));
                }
                if(hjw0.b()) {
                    return;
                }
            }
            iil0.e(hjw0, false);
        }
        float f2 = (float)jlf.a(this.y);
        hjw0.a += f2;
        hjw0.c += f2;
        float f3 = (float)jlf.b(this.y);
        hjw0.b += f3;
        hjw0.d += f3;
    }

    public final void aw() {
        if(this.G != null) {
            if(this.S != null) {
                this.S = null;
            }
            ihy.aE(this, null);
            ify.aw(this.t);
        }
    }

    public final void ax(iav iav0) {
        iav iav1 = this.N;
        if(iav0 != iav1) {
            this.N = iav0;
            if(iav1 == null || iav0.b() != iav1.b() || iav0.a() != iav1.a()) {
                long v = (long)iav0.b();
                long v1 = (long)iav0.a();
                iil iil0 = this.G;
                long v2 = v << 0x20 | v1 & 0xFFFFFFFFL;
                if(iil0 != null) {
                    iil0.g(v2);
                }
                else if(this.t.an()) {
                    ihy ihy0 = this.x;
                    if(ihy0 != null) {
                        ihy0.an();
                    }
                }
                this.z(v2);
                if(this.J != null) {
                    this.aL(false);
                }
                hfb hfb0 = this.B().u;
                if(hfb0 != null) {
                    hfb hfb1 = this.ad(false);
                    while(hfb1 != null && (hfb1.t & 4) != 0) {
                        if((hfb1.s & 4) != 0) {
                            gwq gwq0 = null;
                            hfb hfb2 = hfb1;
                            while(hfb2 != null) {
                                if((hfb2 instanceof iew)) {
                                    ((iew)hfb2).dU();
                                }
                                else if((hfb2.s & 4) != 0 && (hfb2 instanceof iep)) {
                                    hfb hfb3 = ((iep)hfb2).D;
                                    int v3 = 0;
                                    while(hfb3 != null) {
                                        if((hfb3.s & 4) != 0) {
                                            ++v3;
                                            if(v3 == 1) {
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
                                    if(v3 != 1) {
                                        goto label_47;
                                    }
                                    continue;
                                }
                            label_47:
                                hfb2 = ien.a(gwq0);
                            }
                        }
                        if(hfb1 == hfb0) {
                            break;
                        }
                        hfb1 = hfb1.v;
                    }
                }
                ify ify0 = this.t;
                iio iio0 = ify0.j;
                if(iio0 != null) {
                    iio0.r(ify0);
                }
            }
            if(this.T != null && this.T.c() || !iav0.e().isEmpty()) {
                bza bza0 = this.T;
                Map map0 = iav0.e();
                if(bza0 != null && bza0.e == map0.size()) {
                    Object[] arr_object = bza0.b;
                    int[] arr_v = bza0.c;
                    long[] arr_v1 = bza0.a;
                    int v4 = arr_v1.length - 2;
                    if(v4 >= 0) {
                        int v5 = 0;
                        while(true) {
                            long v6 = arr_v1[v5];
                            if((~v6 << 7 & v6 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_81;
                            }
                            int v7 = 0;
                            while(true) {
                                int v8 = 8 - (~(v5 - v4) >>> 0x1F);
                                if(v7 >= v8) {
                                    break;
                                }
                                if((v6 & 0xFFL) < 0x80L) {
                                    int v9 = (v5 << 3) + v7;
                                    Object object0 = arr_object[v9];
                                    int v10 = arr_v[v9];
                                    Integer integer0 = (Integer)map0.get(((hxw)object0));
                                    if(integer0 != null && ((int)integer0) == v10) {
                                        goto label_77;
                                    }
                                    goto label_84;
                                }
                            label_77:
                                v6 >>= 8;
                                ++v7;
                            }
                            if(v8 == 8) {
                            label_81:
                                if(v5 != v4) {
                                    ++v5;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                }
                else {
                label_84:
                    ((ihc)this.ag()).w.e();
                    bza bza1 = this.T;
                    if(bza1 == null) {
                        bza1 = new bza(null);
                        this.T = bza1;
                    }
                    bza1.d();
                    for(Object object1: iav0.e().entrySet()) {
                        bza1.f(((Map.Entry)object1).getKey(), ((Number)((Map.Entry)object1).getValue()).intValue());
                    }
                }
            }
        }
    }

    public final void ay(ibts ibts0, boolean z) {
        if(ibts0 != null && this.S != null) {
            hxt.c("layerBlock can\'t be provided when explicitLayer is provided");
        }
        ify ify0 = this.t;
        boolean z1 = z || this.J != ibts0 || !ibuq.m(this.K, ify0.q) || this.L != ify0.r;
        this.K = ify0.q;
        this.L = ify0.r;
        if(ify0.am() && ibts0 != null) {
            this.J = ibts0;
            if(this.G == null) {
                iil iil0 = igc.a(ify0).i(this.H(), this.R, null);
                iil0.g(this.c);
                iil0.f(this.y);
                this.G = iil0;
                ihy.aF(this);
                ify0.aA();
                this.R.a();
                return;
            }
            if(z1 && ihy.aF(this)) {
                ((ili)igc.a(ify0)).l.d(ify0);
            }
            return;
        }
        this.J = null;
        iil iil1 = this.G;
        if(iil1 != null) {
            iil1.b();
            ify0.aA();
            this.R.a();
            if(this.t() && ify0.an()) {
                iio iio0 = ify0.j;
                if(iio0 != null) {
                    iio0.r(ify0);
                }
            }
        }
        this.G = null;
        this.F = false;
    }

    public final boolean az(int v) {
        hfb hfb0 = this.ad(iia.h(v));
        return hfb0 != null && (hfb0.I().t & v) != 0;
    }

    @Override  // jks
    public final float dX() {
        return this.t.q.dX();
    }

    @Override  // jlc
    public final float dY() {
        return this.t.q.dY();
    }

    @Override  // ibq
    public void dZ(long v, float f, ibts ibts0) {
        if(this.u) {
            igm igm0 = this.C();
            ibuq.c(igm0);
            this.au(igm0.h, f, ibts0, null);
            return;
        }
        this.au(v, f, ibts0, null);
    }

    @Override  // hzk
    public final hzk ef() {
        if(!this.t()) {
            StringBuilder stringBuilder0 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for(ify ify0 = this.t; ify0 != null; ify0 = ify0.n()) {
                stringBuilder0.append("\n|");
                stringBuilder0.append(ify0);
                stringBuilder0.append(" isAttached=");
                stringBuilder0.append(ify0.am());
                stringBuilder0.append(" modifier=");
                stringBuilder0.append(ify0.x);
                stringBuilder0.append(" tail=");
                stringBuilder0.append(this.B());
            }
            hxt.d(stringBuilder0.toString());
        }
        this.ao();
        return this.t.s().x;
    }

    @Override  // ibq, hzf
    public final Object f() {
        ihl ihl0 = this.t.u;
        if(ihl0.j(0x40)) {
            this.B();
            ibvd ibvd0 = new ibvd();
            hfb hfb0 = ihl0.e;
            while(hfb0 != null) {
                if((hfb0.s & 0x40) != 0) {
                    hfb hfb1 = hfb0;
                    gwq gwq0 = null;
                    while(hfb1 != null) {
                        if((hfb1 instanceof iiz)) {
                            ibvd0.a = ((iiz)hfb1).a(ibvd0.a);
                        }
                        else if((hfb1.s & 0x40) != 0 && (hfb1 instanceof iep)) {
                            hfb hfb2 = ((iep)hfb1).D;
                            int v = 0;
                            while(hfb2 != null) {
                                if((hfb2.s & 0x40) != 0) {
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
                hfb0 = hfb0.u;
            }
            return ibvd0.a;
        }
        return null;
    }

    @Override  // hzk
    public final long g() {
        return this.c;
    }

    @Override  // hzk
    public final long h(hzk hzk0, long v) {
        return this.i(hzk0, v, true);
    }

    @Override  // hzk
    public final long i(hzk hzk0, long v, boolean z) {
        if((hzk0 instanceof iai)) {
            ((iai)hzk0).a().ao();
            return ((iai)hzk0).i(this, v ^ 0x8000000080000000L, z) ^ 0x8000000080000000L;
        }
        ihy ihy0 = ihy.aM(hzk0);
        ihy0.ao();
        ihy ihy1 = this.ah(ihy0);
        while(ihy0 != ihy1) {
            v = ihy0.ab(v, z);
            ihy0 = ihy0.x;
            ibuq.c(ihy0);
        }
        return this.G(ihy1, v, z);
    }

    @Override  // hzk
    public final long j(long v) {
        if(!this.t()) {
            hxt.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        this.ao();
        while(this != null) {
            v = ihy.aD(this, v);
            this = this.x;
        }
        return v;
    }

    @Override  // hzk
    public final long k(long v) {
        if(!this.t()) {
            hxt.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        long v1 = this.j(v);
        return igc.a(this.t).f(v1);
    }

    @Override  // hzk
    public final long l(long v) {
        long v1 = this.j(v);
        ili ili0 = (ili)igc.a(this.t);
        ili0.G();
        return hmb.a(ili0.B, v1);
    }

    @Override  // hzk
    public final long m(long v) {
        if(!this.t()) {
            hxt.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        long v1 = igc.a(this.t).g(v);
        return this.h(hzl.g(this), v1);
    }

    @Override  // hzk
    public final long n(long v) {
        if(!this.t()) {
            hxt.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        hzk hzk0 = hzl.g(this);
        ili ili0 = (ili)igc.a(this.t);
        ili0.G();
        return this.h(hzk0, hjz.c(hmb.a(ili0.C, v), hzl.a(hzk0)));
    }

    @Override  // hzk
    public final hka o(hzk hzk0, boolean z) {
        if(!this.t()) {
            hxt.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if(!hzk0.t()) {
            hxt.d(a.i(hzk0, "LayoutCoordinates ", " is not attached!"));
        }
        ihy ihy0 = ihy.aM(hzk0);
        ihy0.ao();
        ihy ihy1 = this.ah(ihy0);
        hjw hjw0 = this.ae();
        hjw0.a = 0.0f;
        hjw0.b = 0.0f;
        hjw0.c = (float)(((int)(hzk0.g() >> 0x20)));
        hjw0.d = (float)(((int)(hzk0.g() & 0xFFFFFFFFL)));
        while(ihy0 != ihy1) {
            ihy0.av(hjw0, z, false);
            if(hjw0.b()) {
                return hka.a;
            }
            ihy0 = ihy0.x;
            ibuq.c(ihy0);
        }
        this.aG(ihy1, hjw0, z);
        return hjx.a(hjw0);
    }

    @Override  // hzg
    public final jlm p() {
        return this.t.r;
    }

    @Override  // hzk
    public final void r(hzk hzk0, float[] arr_f) {
        ihy ihy0 = ihy.aM(hzk0);
        ihy0.ao();
        ihy ihy1 = this.ah(ihy0);
        hmb.c(arr_f);
        ihy0.aK(ihy1, arr_f);
        this.aJ(ihy1, arr_f);
    }

    @Override  // hzk
    public final void s(float[] arr_f) {
        iio iio0 = igc.a(this.t);
        this.aK(ihy.aM(hzl.g(this)), arr_f);
        ((hvp)iio0).e(arr_f);
    }

    @Override  // hzk
    public final boolean t() {
        return this.B().B;
    }

    @Override  // ibq
    public void y(long v, float f, hpn hpn0) {
        if(this.u) {
            igm igm0 = this.C();
            ibuq.c(igm0);
            this.au(igm0.h, f, null, hpn0);
            return;
        }
        this.au(v, f, null, hpn0);
    }
}

