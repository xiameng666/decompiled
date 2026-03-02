import java.util.HashMap;

public final class igfe extends igdv {
    private static final long serialVersionUID = 0xF105B3CBF0791080L;

    private igfe(igcm igcm0, igcw igcw0) {
        super(igcm0, igcw0);
    }

    @Override  // igdv
    public final igcw B() {
        return (igcw)this.b;
    }

    @Override  // igdv
    protected final void P(igdu igdu0) {
        HashMap hashMap0 = new HashMap();
        igdu0.l = this.U(igdu0.l, hashMap0);
        igdu0.k = this.U(igdu0.k, hashMap0);
        igdu0.j = this.U(igdu0.j, hashMap0);
        igdu0.i = this.U(igdu0.i, hashMap0);
        igdu0.h = this.U(igdu0.h, hashMap0);
        igdu0.g = this.U(igdu0.g, hashMap0);
        igdu0.f = this.U(igdu0.f, hashMap0);
        igdu0.e = this.U(igdu0.e, hashMap0);
        igdu0.d = this.U(igdu0.d, hashMap0);
        igdu0.c = this.U(igdu0.c, hashMap0);
        igdu0.b = this.U(igdu0.b, hashMap0);
        igdu0.a = this.U(igdu0.a, hashMap0);
        igdu0.E = this.T(igdu0.E, hashMap0);
        igdu0.F = this.T(igdu0.F, hashMap0);
        igdu0.G = this.T(igdu0.G, hashMap0);
        igdu0.H = this.T(igdu0.H, hashMap0);
        igdu0.I = this.T(igdu0.I, hashMap0);
        igdu0.x = this.T(igdu0.x, hashMap0);
        igdu0.y = this.T(igdu0.y, hashMap0);
        igdu0.z = this.T(igdu0.z, hashMap0);
        igdu0.D = this.T(igdu0.D, hashMap0);
        igdu0.A = this.T(igdu0.A, hashMap0);
        igdu0.B = this.T(igdu0.B, hashMap0);
        igdu0.C = this.T(igdu0.C, hashMap0);
        igdu0.m = this.T(igdu0.m, hashMap0);
        igdu0.n = this.T(igdu0.n, hashMap0);
        igdu0.o = this.T(igdu0.o, hashMap0);
        igdu0.p = this.T(igdu0.p, hashMap0);
        igdu0.q = this.T(igdu0.q, hashMap0);
        igdu0.r = this.T(igdu0.r, hashMap0);
        igdu0.s = this.T(igdu0.s, hashMap0);
        igdu0.u = this.T(igdu0.u, hashMap0);
        igdu0.t = this.T(igdu0.t, hashMap0);
        igdu0.v = this.T(igdu0.v, hashMap0);
        igdu0.w = this.T(igdu0.w, hashMap0);
    }

    public static igfe Q(igcm igcm0, igcw igcw0) {
        if(igcm0 == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        igcm igcm1 = igcm0.c();
        if(igcm1 == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if(igcw0 != null) {
            return new igfe(igcm1, igcw0);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    static boolean R(igcy igcy0) {
        return igcy0 != null && igcy0.c() < 43200000L;
    }

    private final long S(long v) {
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        if(v == 0x8000000000000000L) {
            return 0x8000000000000000L;
        }
        igcw igcw0 = this.B();
        int v1 = igcw0.i(v);
        long v2 = v - ((long)v1);
        if(Long.compare(v, 604800000L) > 0 && v2 < 0L) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        if(v < -604800000L && v2 > 0L) {
            return 0x8000000000000000L;
        }
        if(v1 == igcw0.a(v2)) {
            return v2;
        }
        throw new igdc(v, igcw0.d);
    }

    private final igcp T(igcp igcp0, HashMap hashMap0) {
        if(igcp0 != null && igcp0.A()) {
            if(hashMap0.containsKey(igcp0)) {
                return (igcp)hashMap0.get(igcp0);
            }
            igcp igcp1 = new igfc(igcp0, this.B(), this.U(igcp0.w(), hashMap0), this.U(igcp0.y(), hashMap0), this.U(igcp0.x(), hashMap0));
            hashMap0.put(igcp0, igcp1);
            return igcp1;
        }
        return igcp0;
    }

    private final igcy U(igcy igcy0, HashMap hashMap0) {
        if(igcy0 != null && igcy0.g()) {
            if(hashMap0.containsKey(igcy0)) {
                return (igcy)hashMap0.get(igcy0);
            }
            igcy igcy1 = new igfd(igcy0, this.B());
            hashMap0.put(igcy0, igcy1);
            return igcy1;
        }
        return igcy0;
    }

    @Override  // igdv
    public final long a(int v, int v1, int v2, int v3) {
        return this.S(this.a.a(v, v1, v2, v3));
    }

    @Override  // igdv
    public final long b(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        return this.S(this.a.b(v, v1, v2, v3, v4, v5, v6));
    }

    @Override  // igcm
    public final igcm c() {
        return this.a;
    }

    @Override  // igcm
    public final igcm d(igcw igcw0) {
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        if(igcw0 == this.b) {
            return this;
        }
        igcm igcm0 = this.a;
        return igcw0 == igcw.b ? igcm0 : new igfe(igcm0, igcw0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igfe) ? this.a.equals(((igfe)object0).a) && this.B().equals(((igfe)object0).B()) : false;
    }

    @Override
    public final int hashCode() {
        return this.B().hashCode() * 11 + 0x4FBA5 + this.a.hashCode() * 7;
    }

    @Override  // igcm
    public final String toString() {
        String s = this.B().d;
        return "ZonedChronology[" + this.a + ", " + s + "]";
    }
}

