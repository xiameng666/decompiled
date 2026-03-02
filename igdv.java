import java.io.ObjectInputStream;

public abstract class igdv extends igdw {
    public transient igcp A;
    public transient igcp B;
    public transient igcp C;
    public transient igcp D;
    public transient igcp E;
    private transient igcy F;
    private transient igcy G;
    private transient igcy H;
    public final igcm a;
    private transient igcy aan;
    private transient igcy aao;
    private transient igcy aap;
    private transient int aaq;
    public final Object b;
    public transient igcy c;
    public transient igcy d;
    public transient igcy e;
    public transient igcy f;
    public transient igcy g;
    public transient igcy h;
    public transient igcp i;
    public transient igcp j;
    public transient igcp k;
    public transient igcp l;
    public transient igcp m;
    public transient igcp n;
    public transient igcp o;
    public transient igcp p;
    public transient igcp q;
    public transient igcp r;
    public transient igcp s;
    private static final long serialVersionUID = 0xA29FAFD9A2B7B8F9L;
    public transient igcp t;
    public transient igcp u;
    public transient igcp v;
    public transient igcp w;
    public transient igcp x;
    public transient igcp y;
    public transient igcp z;

    protected igdv(igcm igcm0, Object object0) {
        this.a = igcm0;
        this.b = object0;
        this.Q();
    }

    @Override  // igdw
    public final igcp A() {
        return this.B;
    }

    @Override  // igcm
    public igcw B() {
        return this.a == null ? null : this.a.B();
    }

    @Override  // igdw
    public final igcy C() {
        return this.aap;
    }

    @Override  // igdw
    public final igcy D() {
        return this.c;
    }

    @Override  // igdw
    public final igcy E() {
        return this.h;
    }

    @Override  // igdw
    public final igcy F() {
        return this.aao;
    }

    @Override  // igdw
    public final igcy G() {
        return this.aan;
    }

    @Override  // igdw
    public final igcy H() {
        return this.F;
    }

    @Override  // igdw
    public final igcy I() {
        return this.H;
    }

    @Override  // igdw
    public final igcy J() {
        return this.f;
    }

    @Override  // igdw
    public final igcy K() {
        return this.G;
    }

    @Override  // igdw
    public final igcy L() {
        return this.d;
    }

    @Override  // igdw
    public final igcy M() {
        return this.e;
    }

    @Override  // igdw
    public final igcy N() {
        return this.g;
    }

    protected abstract void P(igdu arg1);

    private final void Q() {
        igdu igdu0 = new igdu();
        igcm igcm0 = this.a;
        if(igcm0 != null) {
            igdu0.a(igcm0);
        }
        this.P(igdu0);
        this.F = igdu0.a == null ? super.H() : igdu0.a;
        this.G = igdu0.b == null ? super.K() : igdu0.b;
        this.H = igdu0.c == null ? super.I() : igdu0.c;
        this.aan = igdu0.d == null ? super.G() : igdu0.d;
        this.aao = igdu0.e == null ? super.F() : igdu0.e;
        this.c = igdu0.f == null ? super.D() : igdu0.f;
        this.d = igdu0.g == null ? super.L() : igdu0.g;
        this.e = igdu0.h == null ? super.M() : igdu0.h;
        this.f = igdu0.i == null ? super.J() : igdu0.i;
        this.g = igdu0.j == null ? super.N() : igdu0.j;
        this.aap = igdu0.k == null ? super.C() : igdu0.k;
        this.h = igdu0.l == null ? super.E() : igdu0.l;
        this.i = igdu0.m == null ? super.p() : igdu0.m;
        this.j = igdu0.n == null ? super.o() : igdu0.n;
        this.k = igdu0.o == null ? super.u() : igdu0.o;
        this.l = igdu0.p == null ? super.t() : igdu0.p;
        this.m = igdu0.q == null ? super.r() : igdu0.q;
        this.n = igdu0.r == null ? super.q() : igdu0.r;
        this.o = igdu0.s == null ? super.m() : igdu0.s;
        this.p = igdu0.t == null ? super.f() : igdu0.t;
        this.q = igdu0.u == null ? super.n() : igdu0.u;
        this.r = igdu0.v == null ? super.g() : igdu0.v;
        this.s = igdu0.w == null ? super.l() : igdu0.w;
        this.t = igdu0.x == null ? super.i() : igdu0.x;
        this.u = igdu0.y == null ? super.h() : igdu0.y;
        this.v = igdu0.z == null ? super.j() : igdu0.z;
        this.w = igdu0.A == null ? super.v() : igdu0.A;
        this.x = igdu0.B == null ? super.w() : igdu0.B;
        this.y = igdu0.C == null ? super.x() : igdu0.C;
        this.z = igdu0.D == null ? super.s() : igdu0.D;
        this.A = igdu0.E == null ? super.y() : igdu0.E;
        this.B = igdu0.F == null ? super.A() : igdu0.F;
        this.C = igdu0.G == null ? super.z() : igdu0.G;
        this.D = igdu0.H == null ? super.e() : igdu0.H;
        this.E = igdu0.I == null ? super.k() : igdu0.I;
        int v = 0;
        if(igcm0 != null) {
            int v1 = this.o != igcm0.m() || this.m != igcm0.r() || this.k != igcm0.u() || this.i != igcm0.p() ? 0 : 1;
            int v2 = this.j == igcm0.o() ? 2 : 0;
            if(this.A == igcm0.y() && this.z == igcm0.s() && this.u == igcm0.h()) {
                v = 4;
            }
            v |= v1 | v2;
        }
        this.aaq = v;
    }

    @Override  // igdw
    public long a(int v, int v1, int v2, int v3) {
        return this.a == null || (this.aaq & 6) != 6 ? super.a(v, v1, v2, v3) : this.a.a(v, v1, v2, v3);
    }

    @Override  // igdw
    public long b(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        return this.a == null || (this.aaq & 5) != 5 ? super.b(v, v1, v2, v3, v4, v5, v6) : this.a.b(v, v1, v2, v3, v4, v5, v6);
    }

    @Override  // igdw
    public final igcp e() {
        return this.D;
    }

    @Override  // igdw
    public final igcp f() {
        return this.p;
    }

    @Override  // igdw
    public final igcp g() {
        return this.r;
    }

    @Override  // igdw
    public final igcp h() {
        return this.u;
    }

    @Override  // igdw
    public final igcp i() {
        return this.t;
    }

    @Override  // igdw
    public final igcp j() {
        return this.v;
    }

    @Override  // igdw
    public final igcp k() {
        return this.E;
    }

    @Override  // igdw
    public final igcp l() {
        return this.s;
    }

    @Override  // igdw
    public final igcp m() {
        return this.o;
    }

    @Override  // igdw
    public final igcp n() {
        return this.q;
    }

    @Override  // igdw
    public final igcp o() {
        return this.j;
    }

    @Override  // igdw
    public final igcp p() {
        return this.i;
    }

    @Override  // igdw
    public final igcp q() {
        return this.n;
    }

    @Override  // igdw
    public final igcp r() {
        return this.m;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        this.Q();
    }

    @Override  // igdw
    public final igcp s() {
        return this.z;
    }

    @Override  // igdw
    public final igcp t() {
        return this.l;
    }

    @Override  // igdw
    public final igcp u() {
        return this.k;
    }

    @Override  // igdw
    public final igcp v() {
        return this.w;
    }

    @Override  // igdw
    public final igcp w() {
        return this.x;
    }

    @Override  // igdw
    public final igcp x() {
        return this.y;
    }

    @Override  // igdw
    public final igcp y() {
        return this.A;
    }

    @Override  // igdw
    public final igcp z() {
        return this.C;
    }
}

