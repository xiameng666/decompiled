import java.util.ArrayList;

public final class fvqh extends fvqd {
    private final fwyg A;
    private final fvqe B;
    private boolean C;
    private fvtm D;
    private fvvj E;
    private fuxg F;
    private cjds G;
    boolean k;
    gwvh l;
    boolean m;
    long n;
    final fvqg o;
    long p;
    boolean q;
    boolean r;
    cjds s;
    private long t;
    private int u;
    private boolean v;
    private long w;
    private boolean x;
    private long y;
    private final fwyy z;

    public fvqh(fwze fwze0, fwyd fwyd0, fwyy fwyy0, fwzp fwzp0, fvrj fvrj0, fxzs fxzs0, fvqa fvqa0, fwxs fwxs0) {
        super("BurstCollector", fwze0, fwyd0, fwzp0, fvrj0, fxzs0, fvqa0, 2);
        this.G = null;
        this.t = -1L;
        this.u = 0;
        this.k = false;
        this.v = false;
        this.m = false;
        this.n = -1L;
        this.w = -1L;
        this.s = null;
        this.x = false;
        this.y = -1L;
        this.o = new fvqg(((int)huoa.b()));
        this.C = false;
        this.p = 0L;
        this.q = false;
        this.r = false;
        this.D = null;
        this.E = null;
        this.F = null;
        this.B = new fvqe(fwze0, fwyd0, fwzp0, fvrj0, fwxs0);
        this.z = fwyy0;
        this.A = fwze0.g();
    }

    @Override  // fvqd
    public final void D(Object object0) {
        if(this.j == 2) {
            this.y = this.c.b();
            return;
        }
        this.B.b();
    }

    private final void E(long v) {
        if(this.j == 3 || this.j == 6) {
            cjds cjds0 = this.s;
            if(cjds0 != null) {
                cjds cjds1 = this.G;
                if(cjds1 == null) {
                    this.G = cjds0;
                    this.u = 1;
                }
                else if(fvqh.B(cjds0, cjds1)) {
                    ++this.u;
                }
                else {
                    this.G = this.s;
                    this.u = 1;
                }
            }
            this.t = v;
        }
        this.s = null;
        this.p = 0L;
        this.j = 2;
        this.l = null;
        this.x = false;
        this.y = -1L;
        this.w = -1L;
        this.C = false;
        this.d.b(fwzf.c);
    }

    private final void F() {
        if(this.q) {
            fwzp fwzp0 = this.d;
            fwzp0.b(fwzf.c);
            this.q = false;
            fwzp0.j(fwzf.c);
        }
    }

    private final boolean G(long v) {
        boolean z;
        if(fvqi.a(2) && this.u()) {
            int v1 = this.j - 1;
            if(this.j != 0) {
                switch(v1) {
                    case 1: {
                        return this.m && this.k;
                    }
                    case 2: {
                        long v2 = this.w;
                        if(v2 == -1L) {
                            cjds cjds0 = this.o.b();
                            if(cjds0 == null) {
                                z = false;
                            }
                            else {
                                long v3 = huoa.b() + 10000L;
                                z = v - cjds0.b >= v3;
                            }
                        }
                        else if(v - v2 >= 60000L) {
                            z = true;
                        }
                        else {
                            z = false;
                        }
                        long v4 = huoa.a.c().f();
                        long v5 = v - this.p;
                        return this.b.k().mU() && !z && v5 < v4 ? this.m && this.k : false;
                    }
                    default: {
                        return v1 == 5;
                    }
                }
            }
            throw null;
        }
        return false;
    }

    private final boolean H(long v) {
        long v1 = huoa.a.c().g();
        long v2 = huoa.a.c().h() * 1000L;
        if(this.v) {
            v1 = v2;
        }
        return this.t == -1L || v - this.t > v1;
    }

    @Override  // fvqd
    public final int a() {
        return 5;
    }

    @Override  // fvqd
    public final void b(fwzf fwzf0) {
        if(fwzf0 == fwzf.k) {
            this.B.c();
        }
    }

    @Override  // fvqd
    public final void c(int v, int v1, boolean z) {
        huoa huoa0 = huoa.a;
        double f = huoa0.c().b();
        float f1 = fyaw.a(v, v1);
        boolean z1 = false;
        if(Float.compare(f1, 0.0f) >= 0) {
            this.k = z || ((double)f1) >= f;
            this.v = z && ((double)f1) >= 0.9;
        }
        this.r = z;
        fvqe fvqe0 = this.B;
        double f2 = huoa0.c().a();
        float f3 = fyaw.a(v, v1);
        if((f3 >= 0.0f)) {
            if(!z) {
                if((((double)f3) >= f2)) {
                    z1 = true;
                }
            }
            else if(((double)f3) < 0.2) {
            }
            else {
                z1 = true;
            }
            fvqe0.d = z1;
        }
        fvqe0.c();
    }

    @Override  // fvqd
    public final void d(fvtm fvtm0) {
        if(fvtm0 == null || !fvtm0.i()) {
            fvtm0 = null;
        }
        this.D = fvtm0;
    }

    @Override  // fvqd
    public final void f(boolean z) {
        this.m = z;
        this.B.b = z;
        this.B.c();
    }

    @Override  // fvqd
    public final void g(fuxg fuxg0) {
        if(fuxg0.c().a != fuxh.f) {
            this.F = fuxg0;
            fvqe fvqe0 = this.B;
            if(fvqe0.q == 2 || fvqe0.q == 3 || fvqe0.q == 4) {
                fvqe0.i = fuxg0.b().a;
                if(fvqe0.i == fuxh.a) {
                    fvqe0.h = true;
                }
                fvqe0.c();
            }
        }
    }

    @Override  // fvqd
    public final void h(boolean z) {
        this.g = z;
        this.B.f = z;
        this.B.c();
    }

    @Override  // fvqd
    public final void j(boolean z) {
        this.B.c();
    }

    @Override  // fvqd
    public final void l() {
        super.l();
        this.B.e = false;
        this.B.c();
    }

    @Override  // fvqd
    public final void m(boolean z) {
        this.B.c = z;
        this.B.c();
    }

    @Override  // fvqd
    public final void p(fvvj fvvj0) {
        this.E = fvvj0;
    }

    @Override  // fvqd
    public final void q(boolean z) {
    }

    @Override  // fvqd
    protected final boolean r(long v) {
        boolean z3;
        boolean z2;
        int v6;
        fuxg fuxg1;
        gwvh gwvh0;
        ArrayList arrayList0;
        int v9;
        fuxg fuxg3;
        fvvj fvvj2;
        long v1 = v;
        fvqg fvqg0 = this.o;
        cjds cjds0 = fvqg0.b();
        if(this.G(v)) {
            if(this.x) {
                fvqa fvqa0 = this.h;
                cjds cjds3 = fvqg0.b();
                fvtm fvtm1 = this.D;
                fvvj fvvj1 = this.E;
                fuxg fuxg2 = this.F;
                if(cjds3 != null) {
                    long v7 = huoa.b();
                    int v8 = fuxg2 == null || !fvqd.x(fuxg2, cjds3) || v1 - fvqg0.f < v7 || fvqg0.d.containsKey(cjds3) ? 0 : 1;
                    if(fvvj1 != null && fvqd.y(fvvj1, cjds3) && v1 - fvqg0.f >= v7 && !fvqg0.c.containsKey(cjds3) && !fvqg0.b.containsKey(cjds3) && fvvj1.d() != 0) {
                        fvvj2 = fvvj1;
                        fuxg3 = fuxg2;
                        v9 = (((double)fvqa0.c(fvvj1, v1)) / ((double)fvvj1.d()) > 0.3) ? 1 : 0;
                    }
                    else {
                        fvvj2 = fvvj1;
                        fuxg3 = fuxg2;
                        v9 = 0;
                    }
                    if(fvtm1 == null || fvqg0.b.containsKey(cjds3) || v1 - fvqg0.f < v7 || v9 == 0 && fvqa0.b(fvtm1, cjds3)) {
                        fvtm1 = null;
                    }
                    fvvj fvvj3 = 1 == v9 ? fvvj2 : null;
                    fuxg fuxg4 = 1 == v8 ? fuxg3 : null;
                    if(fvtm1 != null) {
                        fvqg0.b.put(cjds3, fvtm1);
                    }
                    if(fvvj3 != null) {
                        fvqg0.c.put(cjds3, fvvj3);
                        fvvj3.m();
                    }
                    if(fuxg4 != null) {
                        fvqg0.d.put(cjds3, fuxg4);
                    }
                    if(fvvj3 != null || fvtm1 != null || fuxg4 != null) {
                        fvqg0.f = v1;
                    }
                    fvqa0.a(cjds3, fvtm1, fvvj3);
                    if(v9 != 0) {
                        this.E = null;
                    }
                }
            }
            z3 = false;
        }
        else {
            this.B.b();
            boolean z = this.C;
            fwyd fwyd0 = this.c;
            long v2 = this.p;
            boolean z1 = this.r;
            cjds cjds1 = this.G;
            for(int v3 = 0; true; ++v3) {
                int v4 = -1;
                arrayList0 = fvqg0.a;
                if(v3 >= arrayList0.size()) {
                    break;
                }
                if(((cjds)arrayList0.get(v3)).b >= v2) {
                    v4 = v3;
                    break;
                }
            }
            if(v4 == -1) {
                gwvh0 = null;
            }
            else {
                gwvh0 = (gwvh)((ProtoLiteMessage)gwvi.a).v_newBuilder();
                int v5 = 0;
                while(v5 < arrayList0.size()) {
                    cjds cjds2 = (cjds)arrayList0.get(v5);
                    fvtm fvtm0 = (fvtm)fvqg0.b.get(cjds2);
                    fvvj fvvj0 = (fvvj)fvqg0.c.get(cjds2);
                    fuxg fuxg0 = (fuxg)fvqg0.d.get(cjds2);
                    if(v5 < v4) {
                        fuxg1 = fuxg0;
                        v6 = 17;
                    }
                    else if(v5 == v4) {
                        fuxg1 = fuxg0;
                        v6 = z ? 19 : 6;
                    }
                    else {
                        fuxg1 = fuxg0;
                        if(v5 != arrayList0.size() - 1) {
                            v6 = 8;
                        }
                        else if(cjds1 != null && fvqd.B(((cjds)arrayList0.get(arrayList0.size() - 1)), cjds1)) {
                            v6 = 10;
                        }
                        else {
                            v6 = 9;
                        }
                    }
                    gwvh0.a(fvqd.C(fwyd0, cjds2, fvtm0, fvvj0, fuxg1, z1, v6, hunx.c()));
                    ++v5;
                    cjds1 = cjds1;
                    z1 = z1;
                }
            }
            this.l = gwvh0;
            if(gwvh0 == null) {
                z2 = false;
            }
            else {
                this.e.a(fwyd0);
                fwyy fwyy0 = this.z;
                gwts gwts0 = fwyy0.b();
                if(!gwvh0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gwvh0).ensureMutable();
                }
                gwvi gwvi0 = (gwvi)gwvh0.b_message;
                gwts0.getClass();
                gwvi0.c = gwts0;
                gwvi0.b |= 1;
                gmcd gmcd0 = fwyy0.g(2, ((gwvi)((ProtoLiteBuilder)gwvh0).N_build()).getDefaultInstanceForType(), this.f);
                fvqf fvqf0 = new fvqf(this);
                fwzp fwzp0 = this.d;
                gmcd0.hB(fvqf0, fwzp0.a());
                this.A.b(gmcd0);
                this.j = 6;
                fwzp0.i(fwzf.c, 60000L, null);
                this.q = true;
                this.n = fwyd0.b();
                this.s = fvqg0.b();
                z2 = true;
            }
            arrayList0.clear();
            fvqg0.b.clear();
            fvqg0.c.clear();
            fvqg0.d.clear();
            fvqg0.f = 0L;
            if(!z2) {
                this.E(v);
            }
            z3 = true;
        }
        if(this.j == 3) {
            if(this.w == -1L) {
                long v10 = huoa.b() + 10000L;
                fwzp fwzp1 = this.d;
                fwzf fwzf0 = fwzf.c;
                if(cjds0 != null) {
                    v1 = cjds0.b;
                }
                fwzp1.c(fwzf0, 3, v1 + v10, fwzy.a);
            }
            else {
                this.d.c(fwzf.c, 3, this.w + 60000L, fwzy.a);
            }
        }
        this.x = false;
        return z3;
    }

    @Override  // fvqd
    protected final boolean s(long v) {
        cjds cjds0 = this.o.b();
        boolean z = false;
        if(this.G(v)) {
            if(Long.compare(this.y, -1L) != 0 && v - this.y <= 60000L && hunx.a.b().a()) {
                this.y = -1L;
                fvqe fvqe0 = this.B;
                if(fvqe0.q == 4 && fvqe0.a.k().mU()) {
                    fvqe0.l = true;
                    fvqe0.c();
                    this.w = v;
                    this.C = true;
                    z = true;
                }
                else {
                    fvqe0.b();
                }
            }
            else if(this.H(v) && cjds0 != null) {
                long v1 = cjds0.b;
                if(v - v1 < 30000L) {
                    cjds cjds1 = this.h.c;
                    if(v1 > (cjds1 == null ? -1L : cjds1.b) && (!hunx.a.b().c() || this.F != null && this.F.b().a == fuxh.a)) {
                        this.w = -1L;
                        this.C = false;
                        z = true;
                    }
                }
            }
            if(z) {
                this.j = 3;
                this.p = v;
            }
        }
        if((this.y != -1L && v - this.y > 60000L || !fvqi.a(2)) && !z) {
            this.y = -1L;
            this.B.b();
        }
        return z;
    }

    @Override  // fvqd
    protected final boolean t(long v) {
        if(this.l != null && this.u()) {
            if(Long.compare(v - this.n, 15000L) >= 0) {
                this.F();
                return false;
            }
            this.d.c(fwzf.c, 3, this.n + 15000L, fwzy.a);
            return false;
        }
        this.E(v);
        this.n = -1L;
        this.F();
        return true;
    }

    @Override  // fvqd
    public final void w(cjds cjds0) {
        if(cjds0 != null && this.u()) {
            boolean z = this.H(this.c.b());
            int v = this.j;
            if(v != 2) {
                if(v == 3) {
                label_7:
                    if(this.G == null || !fvqh.B(this.G, cjds0) || this.u < 2) {
                        fvqg fvqg0 = this.o;
                        ArrayList arrayList0 = fvqg0.a;
                        if(arrayList0.size() > 1) {
                            int v1 = arrayList0.size();
                            cjds cjds1 = (cjds)arrayList0.get(v1 - 1);
                            cjds cjds2 = (cjds)arrayList0.get(v1 - 2);
                            long v2 = cjds1.b - cjds2.b;
                            long v3 = cjds0.b - cjds1.b;
                            if((v2 + v3 <= ((long)(fvqg0.e + 500)) || v2 >= 60000L && v3 >= 60000L) && !fvqg0.b.containsKey(cjds1) && !fvqg0.c.containsKey(cjds1) && !fvqg0.d.containsKey(cjds1)) {
                                fvqg0.a(v1 - 1);
                            }
                        }
                        arrayList0.add(cjds0);
                        if(arrayList0.size() > 100) {
                            fvqg0.a(0);
                        }
                        this.x = true;
                        this.w = -1L;
                    }
                }
            }
            else if(z) {
                goto label_7;
            }
        }
    }
}

