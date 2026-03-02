abstract class igdz extends igdv {
    public static final igcy F = null;
    public static final igcy G = null;
    public final int H;
    private static final igcy I = null;
    private static final igcy J = null;
    private static final igcy K = null;
    private static final igcy L = null;
    private static final igcy M = null;
    private static final igcp N = null;
    private static final igcp O = null;
    private static final igcp P = null;
    private static final igcp Q = null;
    private static final igcp R = null;
    private static final igcp S = null;
    private static final igcp T = null;
    private static final igcp U = null;
    private static final igcp V = null;
    private static final igcp W = null;
    private static final igcp X = null;
    private final transient igdy[] Y;
    private static final long serialVersionUID = 0x72F3ED8DA0B42F1FL;

    static {
        igdz.I = iggg.a;
        iggk iggk0 = new iggk(igda.k, 1000L);
        igdz.J = iggk0;
        iggk iggk1 = new iggk(igda.j, 60000L);
        igdz.K = iggk1;
        iggk iggk2 = new iggk(igda.i, 3600000L);
        igdz.L = iggk2;
        iggk iggk3 = new iggk(igda.h, 43200000L);
        igdz.F = iggk3;
        iggk iggk4 = new iggk(igda.g, 86400000L);
        igdz.G = iggk4;
        igdz.M = new iggk(igda.f, 604800000L);
        igdz.N = new iggi(igcr.x, iggg.a, iggk0);
        igdz.O = new iggi(igcr.w, iggg.a, iggk4);
        igdz.P = new iggi(igcr.v, iggk0, iggk1);
        igdz.Q = new iggi(igcr.u, iggk0, iggk4);
        igdz.R = new iggi(igcr.t, iggk1, iggk2);
        igdz.S = new iggi(igcr.s, iggk1, iggk4);
        iggi iggi0 = new iggi(igcr.r, iggk2, iggk4);
        igdz.T = iggi0;
        iggi iggi1 = new iggi(igcr.o, iggk2, iggk3);
        igdz.U = iggi1;
        igdz.V = new iggr(iggi0, igcr.q);
        igdz.W = new iggr(iggi1, igcr.p);
        igdz.X = new igdx();
    }

    public igdz(igcm igcm0, int v) {
        super(igcm0, null);
        this.Y = new igdy[0x400];
        if(v <= 0) {
            throw new IllegalArgumentException("Invalid min days in first week: 0");
        }
        this.H = v;
    }

    @Override  // igdv
    public final igcw B() {
        return this.a == null ? igcw.b : this.a.B();
    }

    @Override  // igdv
    protected void P(igdu igdu0) {
        igdu0.a = igdz.I;
        igdu0.b = igdz.J;
        igdu0.c = igdz.K;
        igdu0.d = igdz.L;
        igdu0.e = igdz.F;
        igdu0.f = igdz.G;
        igdu0.g = igdz.M;
        igdu0.m = igdz.N;
        igdu0.n = igdz.O;
        igdu0.o = igdz.P;
        igdu0.p = igdz.Q;
        igdu0.q = igdz.R;
        igdu0.r = igdz.S;
        igdu0.s = igdz.T;
        igdu0.u = igdz.U;
        igdu0.t = igdz.V;
        igdu0.v = igdz.W;
        igdu0.w = igdz.X;
        igdu0.E = new igeh(this);
        igdu0.F = new iges(igdu0.E, this);
        igdu0.H = new iggc(new iggh(igdu0.F, 99), igcr.d);
        igdu0.k = igdu0.H.w();
        igdu0.G = new iggh(new iggl(((iggc)igdu0.H)), igcr.e);
        igdu0.I = new igep(this);
        igdu0.x = new igeo(this, igdu0.f);
        igdu0.y = new igea(this, igdu0.f);
        igdu0.z = new igeb(this, igdu0.f);
        igdu0.D = new iger(this);
        igdu0.B = new igeg(this);
        igdu0.A = new igef(this, igdu0.g);
        igdu0.C = new iggh(new iggl(igdu0.B, igdu0.k, igcr.j), igcr.j);
        igdu0.j = igdu0.E.w();
        igdu0.i = igdu0.D.w();
        igdu0.h = igdu0.B.w();
    }

    final int Q(long v, int v1, int v2) {
        return ((int)((v - (this.an(v1) + this.am(v1, v2))) / 86400000L)) + 1;
    }

    final int R(long v) {
        if(Long.compare(v, 0L) >= 0) {
            return ((int)((v / 86400000L + 3L) % 7L)) + 1;
        }
        long v1 = (v - 0x5265BFFL) / 86400000L;
        return v1 < -3L ? ((int)((v1 + 4L) % 7L)) + 7 : ((int)((v1 + 3L) % 7L)) + 1;
    }

    final int S(long v, int v1) {
        return ((int)((v - this.an(v1)) / 86400000L)) + 1;
    }

    final int T(long v) {
        int v1 = this.ae(v);
        return this.V(v1, this.Z(v, v1));
    }

    public int U(long v, int v1) {
        throw null;
    }

    public abstract int V(int arg1, int arg2);

    public abstract int W();

    final int X(long v) {
        return Long.compare(v, 0L) < 0 ? ((int)((v + 1L) % 86400000L)) + 0x5265BFF : ((int)(v % 86400000L));
    }

    public abstract int Y();

    public abstract int Z(long arg1, int arg2);

    @Override  // igdv
    public final long a(int v, int v1, int v2, int v3) {
        igcm igcm0 = this.a;
        if(igcm0 != null) {
            return igcm0.a(v, v1, v2, v3);
        }
        iggd.f(igcr.w, v3, 0, 0x5265BFF);
        return this.as(v, v1, v2, v3);
    }

    final int aa(long v) {
        return this.ab(v, this.ae(v));
    }

    final int ab(long v, int v1) {
        long v2 = this.al(v1);
        if(v < v2) {
            return this.ac(v1 - 1);
        }
        return v < this.al(v1 + 1) ? ((int)((v - v2) / 604800000L)) + 1 : 1;
    }

    final int ac(int v) {
        long v1 = this.al(v);
        return (int)((this.al(v + 1) - v1) / 604800000L);
    }

    final int ad(long v) {
        int v1 = this.ae(v);
        int v2 = this.ab(v, v1);
        if(v2 == 1) {
            return this.ae(v + 604800000L);
        }
        return v2 <= 51 ? v1 : this.ae(v - 1209600000L);
    }

    final int ae(long v) {
        long v1 = (v >> 1) + this.ag();
        long v2 = this.aj();
        if(Long.compare(v1, 0L) < 0) {
            v1 = v1 - v2 + 1L;
        }
        long v3 = 31536000000L;
        int v4 = (int)(v1 / v2);
        long v5 = this.an(v4);
        long v6 = v - v5;
        if(v6 < 0L) {
            return v4 - 1;
        }
        if(v6 >= 31536000000L) {
            if(this.ar(v4)) {
                v3 = 31622400000L;
            }
            return v5 + v3 > v ? v4 : v4 + 1;
        }
        return v4;
    }

    public abstract long af(int arg1);

    public abstract long ag();

    public abstract long ah();

    public abstract long ai();

    public abstract long aj();

    public long ak(int v, int v1, int v2) {
        int v3 = this.Y();
        int v4 = this.W() + 1;
        iggd.f(igcr.f, v, v3 - 1, v4);
        iggd.f(igcr.h, v1, 1, 12);
        int v5 = this.V(v, v1);
        if(v2 <= 0 || v2 > v5) {
            throw new igdb(igcr.i, v2, ((int)1), v5, a.z(v1, v, "year: ", " month: "));
        }
        long v6 = this.ao(v, v1, v2);
        int v7 = Long.compare(v6, 0L);
        if(v7 < 0 && v == this.W() + 1) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return v7 <= 0 || v != this.Y() - 1 ? v6 : 0x8000000000000000L;
    }

    final long al(int v) {
        long v1 = this.an(v);
        int v2 = this.R(v1);
        return v2 <= 8 - this.H ? v1 - ((long)(v2 - 1)) * 86400000L : v1 + ((long)(8 - v2)) * 86400000L;
    }

    public abstract long am(int arg1, int arg2);

    final long an(int v) {
        igdy[] arr_igdy = this.Y;
        igdy igdy0 = arr_igdy[v & 0x3FF];
        if(igdy0 == null || igdy0.a != v) {
            igdy igdy1 = new igdy(v, this.af(v));
            arr_igdy[v & 0x3FF] = igdy1;
            igdy0 = igdy1;
        }
        return igdy0.b;
    }

    final long ao(int v, int v1, int v2) {
        return this.an(v) + this.am(v, v1) + ((long)(v2 - 1)) * 86400000L;
    }

    public abstract long ap(long arg1, int arg2);

    public boolean aq(long v) {
        throw null;
    }

    public abstract boolean ar(int arg1);

    private final long as(int v, int v1, int v2, int v3) {
        long v4 = this.ak(v, v1, v2);
        if(v4 == 0x8000000000000000L) {
            v4 = this.ak(v, v1, v2 + 1);
            v3 += -86400000;
        }
        long v5 = ((long)v3) + v4;
        int v6 = Long.compare(v5, 0L);
        if(v6 < 0 && v4 > 0L) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return v6 <= 0 || v4 >= 0L ? v5 : 0x8000000000000000L;
    }

    @Override  // igdv
    public final long b(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        igcm igcm0 = this.a;
        if(igcm0 != null) {
            return igcm0.b(v, v1, v2, v3, v4, v5, v6);
        }
        iggd.f(igcr.r, v3, 0, 23);
        iggd.f(igcr.t, v4, 0, 59);
        iggd.f(igcr.v, v5, 0, 59);
        iggd.f(igcr.x, v6, 0, 999);
        return this.as(v, v1, v2, ((int)(((long)v3) * 3600000L + ((long)v4) * 60000L + ((long)v5) * 1000L + ((long)v6))));
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.H == ((igdz)object0).H && this.B().equals(((igdz)object0).B());
    }

    @Override
    public final int hashCode() {
        return this.getClass().getName().hashCode() * 11 + this.B().hashCode() + this.H;
    }

    @Override  // igcm
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(60);
        String s = this.getClass().getName();
        int v = s.lastIndexOf(46);
        if(v >= 0) {
            s = s.substring(v + 1);
        }
        stringBuilder0.append(s);
        stringBuilder0.append('[');
        igcw igcw0 = this.B();
        if(igcw0 != null) {
            stringBuilder0.append(igcw0.d);
        }
        int v1 = this.H;
        if(v1 != 4) {
            stringBuilder0.append(",mdfw=");
            stringBuilder0.append(v1);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

