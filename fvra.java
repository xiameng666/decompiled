import j..util.DesugarCollections;
import java.io.PrintWriter;
import java.util.Random;

public final class fvra extends fvqd {
    private boolean A;
    private long B;
    private fuxg C;
    private int D;
    private int E;
    private int F;
    private final fwyg G;
    private boolean H;
    private final fwxs I;
    private long J;
    private final fvqb K;
    private final fvqb L;
    private final int M;
    private cjds N;
    boolean k;
    boolean l;
    fvtm m;
    fvvj n;
    boolean o;
    gwvh p;
    long q;
    boolean r;
    int s;
    int t;
    boolean u;
    boolean v;
    boolean w;
    gwvh x;
    long y;
    private fvvj z;

    public fvra(fwze fwze0, fwyd fwyd0, fwzp fwzp0, fvrj fvrj0, fwxs fwxs0, fxzs fxzs0, fvqa fvqa0) {
        super("PassiveCollector", fwze0, fwyd0, fwzp0, fvrj0, fxzs0, fvqa0, 2);
        this.m = null;
        this.z = null;
        int v = 0;
        this.A = false;
        this.B = -1L;
        this.n = null;
        this.C = null;
        this.o = false;
        this.q = -1L;
        this.r = false;
        this.u = false;
        this.v = false;
        this.H = false;
        this.w = false;
        this.J = -1L;
        this.y = -1L;
        this.I = fwxs0;
        fwxs0.g(0x7FFFFFFFFFFFFFFFL, true);
        this.K = new fvqb(fwyd0, 4L);
        this.L = new fvqb(fwyd0, 8L);
        this.G = fwze0.g();
        if(huvo.b() != 0L) {
            Random random0 = new Random();
            int v1 = (int)huvo.b();
            v = random0.nextInt(v1 + v1) - ((int)huvo.b());
        }
        this.M = v;
    }

    private final void E() {
        this.u = false;
        this.v = false;
        this.H = false;
        this.w = false;
    }

    private final void F() {
        if(this.r) {
            fwzp fwzp0 = this.d;
            fwzp0.b(fwzf.d);
            this.J = -1L;
            this.r = false;
            fwzp0.j(fwzf.d);
        }
    }

    private final void G(long v) {
        if(v != this.J) {
            this.J = v;
            this.d.c(fwzf.d, 3, this.J, fwzy.a);
        }
    }

    private final void H() {
        this.I(false);
    }

    private final void I(boolean z) {
        if(z || this.u()) {
            fwzp fwzp0 = this.d;
            fwzf fwzf0 = fwzf.d;
            fwzp0.i(fwzf0, 60000L, null);
            this.j = 6;
            this.E += (this.x == null ? 0 : ((gwvi)this.x.b_message).f.size());
            gwvh gwvh0 = this.x;
            this.p = gwvh0;
            gftb.check(gwvh0);
            for(Object object0: DesugarCollections.unmodifiableList(((gwvi)gwvh0.b_message).f)) {
                gwtl gwtl0 = (gwtl)object0;
                if((gwtl0.b & 4) == 0) {
                    continue;
                }
                gwtr gwtr0 = gwtl0.e == null ? gwtr.a : gwtl0.e;
                if((gwtr0.b & 0x40) == 0 || gwtq.a(gwtr0.f) != 0 && gwtq.a(gwtr0.f) != 1) {
                    continue;
                }
                fwze fwze0 = this.b;
                gwts gwts0 = fwze0.l().b();
                if(!gwvh0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwvh0).ensureMutable();
                }
                gwvi gwvi0 = (gwvi)gwvh0.b_message;
                gwts0.getClass();
                gwvi0.c = gwts0;
                gwvi0.b |= 1;
                fwyd fwyd0 = this.c;
                this.e.a(fwyd0);
                gmcd gmcd0 = fwze0.l().g(1, ((gwvi)((ProtoLiteBuilder)gwvh0).N_build()).getDefaultInstanceForType(), this.f);
                gmcd0.hB(new fvqz(this), fwzp0.a());
                this.G.b(gmcd0);
                this.y = -1L;
                this.r = true;
                long v = fwyd0.b();
                this.q = v;
                this.G(v + 15000L);
                ++this.D;
                goto label_42;
            }
            this.p = null;
            this.x = null;
            this.y = -1L;
            fwzp0.j(fwzf0);
            this.j = 2;
            this.o();
        }
    label_42:
        this.x = null;
    }

    private final boolean J(long v) {
        gwvh gwvh0 = this.x;
        if(gwvh0 == null) {
            return false;
        }
        int v1 = ((gwvi)gwvh0.b_message).f.size();
        return v1 >= 30 || v - this.y >= (v1 <= 10 ? 1800000L : 900000L) + ((long)this.M);
    }

    private final void K(int v, long v1, boolean z, boolean z1, boolean z2, boolean z3) {
        if(z1) {
            this.A = ((int)z) ^ 1;
            this.z = this.n;
        }
        cjds cjds0 = ((int)z) == 0 ? null : this.N;
        fvtm fvtm0 = z2 ? this.m : null;
        fuxg fuxg0 = z3 ? this.C : null;
        fvvj fvvj0 = z1 ? this.n : null;
        if(fvtm0 != null) {
            ++this.F;
        }
        if(fvvj0 != null) {
            ++this.s;
        }
        if(cjds0 != null) {
            ++this.t;
        }
        this.h.a(cjds0, fvtm0, fvvj0);
        if(this.x == null) {
            this.x = (gwvh)((ProtoLiteMessage)gwvi.a).v_newBuilder();
            this.y = v1;
        }
        if(z1 && z2 && ((int)z) == 0) {
            this.B = this.c.b() + 1000L;
        }
        gwvh gwvh0 = this.x;
        gftb.check(gwvh0);
        gwvh0.a(fvra.C(this.c, cjds0, fvtm0, fvvj0, fuxg0, this.l, v, false));
        if(z3) {
            this.C = null;
        }
    }

    private final boolean L(int v, boolean z, boolean z1, boolean z2) {
        if(((int)z) + ((int)z1) + ((int)z2) < 2) {
            return false;
        }
        if(((int)z2) == 0 && v == 1) {
            return false;
        }
        if(v == 4) {
            return ((int)z1) == 0 || ((int)z) == 0 ? false : true;
        }
        return ((int)z1) == 0 || ((int)z2) == 0 || ((int)z) != 0 || this.c.b() >= this.B;
    }

    @Override  // fvqd
    public final int a() {
        return 4;
    }

    @Override  // fvqd
    public final void b(fwzf fwzf0) {
        if(fwzf0 == fwzf.d) {
            this.J = -1L;
        }
    }

    @Override  // fvqd
    public final void c(int v, int v1, boolean z) {
        boolean z1 = true;
        float f = fyaw.a(v, v1);
        if((f >= 0.0f)) {
            if(!z && ((double)f) < 0.2) {
                z1 = false;
            }
            this.k = z1;
        }
        this.l = z;
    }

    @Override  // fvqd
    public final void d(fvtm fvtm0) {
        boolean z = false;
        if(fvtm0 != null && fvtm0.i()) {
            if(this.m == null || !this.m.j(fvtm0)) {
            label_5:
                this.m = fvtm0;
                if(this.u() && !z) {
                    this.v = true;
                }
            }
            else if(this.m.i != fvtm0.i || huqp.c() && ((this.m instanceof fvue) && (fvtm0 instanceof fvue) && ((fvue)this.m).m != ((fvue)fvtm0).m)) {
                z = true;
                goto label_5;
            }
            return;
        }
        this.m = null;
    }

    @Override  // fvqd
    public final void e(PrintWriter printWriter0) {
        printWriter0.println("PC uploadCount is " + this.D);
        printWriter0.println("PC itemCount is " + this.E);
        printWriter0.println("PC cellCount is " + this.F);
        printWriter0.println("PC wifiCount is " + this.s);
        printWriter0.println("PC gnssCount is " + this.t);
    }

    @Override  // fvqd
    public final void f(boolean z) {
        this.o = z;
    }

    @Override  // fvqd
    public final void g(fuxg fuxg0) {
        if(fuxg0.c().a == fuxh.f) {
            return;
        }
        this.C = fuxg0;
    }

    @Override  // fvqd
    public final void i(long v) {
        this.K.b(v);
        this.L.b(v);
    }

    @Override  // fvqd
    public final void p(fvvj fvvj0) {
        if(fvvj0 != null && fvvj0.d() != 0) {
            this.n = fvvj0;
            if(this.u()) {
                fvvj fvvj1 = this.z;
                if(fvvj1 == null || fvvj0.m() - fvvj1.m() > 600000L) {
                    int v = this.u | (this.h.c(fvvj0, this.c.b()) <= 0 ? 0 : 1);
                    this.u = v;
                    if(v != 0) {
                        fvvj0.d();
                    }
                }
            }
        }
    }

    @Override  // fvqd
    protected final boolean s(long v) {
        int v17;
        int v16;
        Boolean boolean8;
        int v11;
        int v10;
        int v9;
        huvo huvo1;
        Boolean boolean4;
        boolean z4;
        int v6;
        int v3;
        boolean z2;
        boolean z = this.K.c();
        boolean z1 = this.L.c();
        this.K.a();
        this.L.a();
        if(z1) {
            if(this.x != null) {
                this.I(true);
            }
            return true;
        }
        if(!z && !this.u()) {
            this.E();
            return false;
        }
        if(this.J(v)) {
            this.H();
            return true;
        }
        fvvj fvvj0 = this.n;
        if(fvvj0 == null) {
            z2 = true;
        }
        else {
            fvqa fvqa0 = this.h;
            z2 = fvvj0.m() <= fvqa0.a;
        }
        boolean z3 = this.m == null || this.m.f <= this.h.b;
        int v1 = this.u;
        if(v1 && z2) {
            this.u = false;
            v1 = 0;
        }
        if(this.v && z3) {
            this.v = false;
        }
        if(z2 && z3 && this.w) {
            this.w = false;
        }
        huvo huvo0 = huvo.a;
        this.u = huvo0.c().d() & v1;
        int v2 = this.w & huvo0.c().c();
        this.w = v2;
        if(z || this.u || this.v || v2 != 0 || this.H) {
            if(z) {
                v3 = 20;
            }
            else if(this.u) {
                v3 = 2;
            }
            else if(this.H) {
                v3 = 4;
            }
            else if(v2 == 0) {
                v3 = this.v ? 1 : 0;
            }
            else {
                v3 = 11;
            }
            if(v3 != 0) {
                long v4 = this.c.b();
                if(v3 == 20) {
                    this.K(20, v4, true, true, true, true);
                    this.E();
                }
                else {
                    int v5 = this.N == null || v4 - this.N.b > 720000L ? 0 : 1;
                    if(this.C != null && fvra.x(this.C, this.N)) {
                        v6 = v5;
                        z4 = true;
                    }
                    else {
                        v6 = v5;
                        z4 = false;
                    }
                    fvvj fvvj1 = this.n;
                    Boolean boolean0 = null;
                    if(fvvj1 == null) {
                        boolean4 = Boolean.valueOf(false);
                    }
                    else {
                        cjds cjds0 = this.N;
                        if(cjds0 == null) {
                            boolean4 = Boolean.valueOf(false);
                        }
                        else {
                            long v7 = fvvj1.m();
                            Boolean boolean1 = ((futd)this.I).ae.a(cjds0.b, v7, 2000L);
                            Boolean boolean2 = ((futd)this.I).ae.b(cjds0.b, v7, 8000L);
                            Boolean boolean3 = ((futd)this.I).ae.c(cjds0.b, v7, 20000L);
                            boolean4 = boolean1 != null && boolean2 != null && boolean3 != null ? Boolean.valueOf(boolean1.booleanValue() || boolean2.booleanValue() || boolean3.booleanValue()) : null;
                        }
                    }
                    fvvj fvvj2 = this.n;
                    if(fvvj2 == null) {
                        huvo1 = huvo0;
                        v9 = v6;
                        v11 = 0;
                        v10 = 0;
                    }
                    else if(v3 != 2) {
                        if(!this.A) {
                            huvo1 = huvo0;
                            v9 = v6;
                            v11 = 0;
                            v10 = 0;
                        }
                        else if(v6 == 0) {
                            huvo1 = huvo0;
                            v11 = 0;
                            v10 = 0;
                            v6 = 0;
                            v9 = 0;
                        }
                        else if(fvra.y(fvvj2, this.N)) {
                            v11 = Boolean.TRUE.equals(boolean4) ^ 1;
                            huvo1 = huvo0;
                            v10 = 1;
                            v6 = 1;
                            v9 = 1;
                        }
                        else {
                            huvo1 = huvo0;
                            v6 = 1;
                            v9 = 1;
                            v11 = 0;
                            v10 = 0;
                        }
                    }
                    else if(boolean4 != null) {
                        int v8 = v6 == 0 ? 0 : 1;
                        huvo1 = huvo0;
                        v9 = v8 == 0 || boolean4.booleanValue() ? 0 : 1;
                        v10 = 1;
                        v6 = v8;
                        v11 = 1;
                    }
                    else {
                        huvo1 = huvo0;
                        v9 = v6;
                        v11 = 1;
                        v10 = 1;
                    }
                    fvtm fvtm0 = this.m;
                    if(fvtm0 == null) {
                        boolean8 = Boolean.valueOf(false);
                    }
                    else {
                        cjds cjds1 = this.N;
                        if(cjds1 == null) {
                            boolean8 = Boolean.valueOf(false);
                        }
                        else {
                            long v12 = cjds1.b;
                            long v13 = fvtm0.f;
                            if(v13 > v12) {
                                Boolean boolean5 = ((futd)this.I).ae.a(v12, v13, 20000L);
                                Boolean boolean6 = ((futd)this.I).ae.b(v12, v13, 80000L);
                                Boolean boolean7 = ((futd)this.I).ae.c(v12, v13, 200000L);
                                boolean8 = boolean5 != null && boolean6 != null && boolean7 != null ? Boolean.valueOf(boolean5.booleanValue() || boolean6.booleanValue() || boolean7.booleanValue()) : null;
                            }
                            else {
                                boolean8 = Boolean.valueOf(false);
                            }
                        }
                    }
                    fvvj fvvj3 = this.n;
                    fvtm fvtm1 = this.m;
                    if(fvvj3 != null && fvtm1 != null) {
                        long v14 = fvtm1.f;
                        if(v14 > fvvj3.m()) {
                            long v15 = fvvj3.m();
                            Boolean boolean9 = ((futd)this.I).ae.a(v15, v14, 2000L);
                            Boolean boolean10 = ((futd)this.I).ae.b(v15, v14, 8000L);
                            Boolean boolean11 = ((futd)this.I).ae.c(v15, v14, 20000L);
                            if(boolean9 != null && boolean10 != null && boolean11 != null) {
                                boolean0 = Boolean.valueOf(boolean9.booleanValue() || boolean10.booleanValue() || boolean11.booleanValue());
                            }
                        }
                        else {
                            boolean0 = Boolean.valueOf(false);
                        }
                    }
                    else {
                        boolean0 = Boolean.valueOf(false);
                    }
                    fvtm fvtm2 = this.m;
                    if(fvtm2 == null) {
                        v16 = 0;
                        v17 = 0;
                    }
                    else {
                        boolean z5 = this.h.b(fvtm2, this.N);
                        if(v11 != 0 && !Boolean.TRUE.equals(boolean0)) {
                            v16 = 1;
                        }
                        else if(v9 == 0 || Boolean.TRUE.equals(boolean8) || z5) {
                            v16 = 0;
                        }
                        else {
                            v16 = 1;
                        }
                        v17 = v10 == 0 && (v6 == 0 || z5) ? 0 : 1;
                    }
                    boolean z6 = this.L(v3, ((boolean)v9), ((boolean)v11), ((boolean)v16));
                    boolean z7 = this.L(v3, ((boolean)v6), ((boolean)v10), ((boolean)v17));
                    if(huvo1.c().b()) {
                        if(z6) {
                            this.K(v3, v4, ((boolean)v9), ((boolean)v11), ((boolean)v16), z4);
                            this.E();
                        }
                    }
                    else if(v9 + v11 + v16 >= v6 + v10 + v17 && z6) {
                        this.K(v3, v4, ((boolean)v9), ((boolean)v11), ((boolean)v16), z4);
                        this.E();
                    }
                    else if(z7) {
                        this.K(v3, v4, ((boolean)v6), ((boolean)v10), ((boolean)v17), z4);
                        this.E();
                    }
                }
                if(this.J(v)) {
                    this.H();
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // fvqd
    protected final boolean t(long v) {
        if(this.p != null && this.u()) {
            long v1 = this.q;
            if(Long.compare(v - v1, 15000L) >= 0) {
                this.F();
                return false;
            }
            this.G(v1 + 15000L);
            return false;
        }
        this.F();
        this.q = -1L;
        this.j = 2;
        return true;
    }

    @Override  // fvqd
    public final boolean u() {
        return this.k && super.u() && this.o && fvqi.a(0x20);
    }

    @Override  // fvqd
    public final void w(cjds cjds0) {
        if(cjds0 != null) {
            this.N = cjds0;
            if(this.u()) {
                if(this.A && fvra.y(this.n, this.N)) {
                    this.H = true;
                    return;
                }
                cjds cjds1 = this.h.c;
                if(cjds1 != null && (GeoMath.a(cjds1.b(), cjds1.c(), this.N.b(), this.N.c()) > 200.0)) {
                    this.w = true;
                }
            }
        }
    }
}

