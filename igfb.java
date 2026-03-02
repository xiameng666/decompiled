import java.util.HashMap;

public final class igfb extends igdv {
    final igco F;
    final igco G;
    private transient igfb H;
    private static final long serialVersionUID = 0x6A7464792AF0F66AL;

    private igfb(igcm igcm0, igco igco0, igco igco1) {
        super(igcm0, null);
        this.F = igco0;
        this.G = igco1;
    }

    @Override  // igdv
    protected final void P(igdu igdu0) {
        HashMap hashMap0 = new HashMap();
        igdu0.l = this.T(igdu0.l, hashMap0);
        igdu0.k = this.T(igdu0.k, hashMap0);
        igdu0.j = this.T(igdu0.j, hashMap0);
        igdu0.i = this.T(igdu0.i, hashMap0);
        igdu0.h = this.T(igdu0.h, hashMap0);
        igdu0.g = this.T(igdu0.g, hashMap0);
        igdu0.f = this.T(igdu0.f, hashMap0);
        igdu0.e = this.T(igdu0.e, hashMap0);
        igdu0.d = this.T(igdu0.d, hashMap0);
        igdu0.c = this.T(igdu0.c, hashMap0);
        igdu0.b = this.T(igdu0.b, hashMap0);
        igdu0.a = this.T(igdu0.a, hashMap0);
        igdu0.E = this.S(igdu0.E, hashMap0);
        igdu0.F = this.S(igdu0.F, hashMap0);
        igdu0.G = this.S(igdu0.G, hashMap0);
        igdu0.H = this.S(igdu0.H, hashMap0);
        igdu0.I = this.S(igdu0.I, hashMap0);
        igdu0.x = this.S(igdu0.x, hashMap0);
        igdu0.y = this.S(igdu0.y, hashMap0);
        igdu0.z = this.S(igdu0.z, hashMap0);
        igdu0.D = this.S(igdu0.D, hashMap0);
        igdu0.A = this.S(igdu0.A, hashMap0);
        igdu0.B = this.S(igdu0.B, hashMap0);
        igdu0.C = this.S(igdu0.C, hashMap0);
        igdu0.m = this.S(igdu0.m, hashMap0);
        igdu0.n = this.S(igdu0.n, hashMap0);
        igdu0.o = this.S(igdu0.o, hashMap0);
        igdu0.p = this.S(igdu0.p, hashMap0);
        igdu0.q = this.S(igdu0.q, hashMap0);
        igdu0.r = this.S(igdu0.r, hashMap0);
        igdu0.s = this.S(igdu0.s, hashMap0);
        igdu0.u = this.S(igdu0.u, hashMap0);
        igdu0.t = this.S(igdu0.t, hashMap0);
        igdu0.v = this.S(igdu0.v, hashMap0);
        igdu0.w = this.S(igdu0.w, hashMap0);
    }

    public static igfb Q(igcm igcm0, igdi igdi0, igdi igdi1) {
        if(igcm0 == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        if(igdi0 == null) {
            igdi0 = null;
        }
        if(igdi1 == null) {
            igdi1 = null;
        }
        if(igdi0 != null && igdi1 != null && !igdi0.f(igdi1)) {
            throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
        }
        return new igfb(igcm0, ((igco)igdi0), ((igco)igdi1));
    }

    final void R(long v, String s) {
        if(this.F != null && v < this.F.a) {
            throw new igfa(this, s, true);
        }
        if(this.G != null && v >= this.G.a) {
            throw new igfa(this, s, false);
        }
    }

    private final igcp S(igcp igcp0, HashMap hashMap0) {
        if(igcp0 != null && igcp0.A()) {
            if(hashMap0.containsKey(igcp0)) {
                return (igcp)hashMap0.get(igcp0);
            }
            igcp igcp1 = new igey(this, igcp0, this.T(igcp0.w(), hashMap0), this.T(igcp0.y(), hashMap0), this.T(igcp0.x(), hashMap0));
            hashMap0.put(igcp0, igcp1);
            return igcp1;
        }
        return igcp0;
    }

    private final igcy T(igcy igcy0, HashMap hashMap0) {
        if(igcy0 != null && igcy0.g()) {
            if(hashMap0.containsKey(igcy0)) {
                return (igcy)hashMap0.get(igcy0);
            }
            igcy igcy1 = new igez(this, igcy0);
            hashMap0.put(igcy0, igcy1);
            return igcy1;
        }
        return igcy0;
    }

    @Override  // igdv
    public final long a(int v, int v1, int v2, int v3) {
        long v4 = this.a.a(v, v1, v2, v3);
        this.R(v4, "resulting");
        return v4;
    }

    @Override  // igdv
    public final long b(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        long v7 = this.a.b(v, v1, v2, v3, v4, v5, v6);
        this.R(v7, "resulting");
        return v7;
    }

    @Override  // igcm
    public final igcm c() {
        return this.d(igcw.b);
    }

    @Override  // igcm
    public final igcm d(igcw igcw0) {
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        if(igcw0 == this.B()) {
            return this;
        }
        igcw igcw1 = igcw.b;
        if(igcw0 == igcw1) {
            igcm igcm0 = this.H;
            if(igcm0 != null) {
                return igcm0;
            }
        }
        igco igco0 = this.F;
        if(igco0 != null) {
            igdh igdh0 = igco0.j();
            igdh0.d(igcw0);
            igco0 = igdh0.g();
        }
        igco igco1 = this.G;
        if(igco1 != null) {
            igdh igdh1 = igco1.j();
            igdh1.d(igcw0);
            igco1 = igdh1.g();
        }
        igfb igfb0 = igfb.Q(this.a.d(igcw0), igco0, igco1);
        if(igcw0 == igcw1) {
            this.H = igfb0;
        }
        return igfb0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igfb) ? this.a.equals(((igfb)object0).a) && iggd.g(this.F, ((igfb)object0).F) && iggd.g(this.G, ((igfb)object0).G) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.F == null ? 0 : this.F.hashCode();
        igco igco0 = this.G;
        if(igco0 != null) {
            v = igco0.hashCode();
        }
        return v1 + 0x12EA67C5 + v + this.a.hashCode() * 7;
    }

    @Override  // igcm
    public final String toString() {
        String s = this.a.toString();
        String s1 = "NoLimit";
        String s2 = this.F == null ? "NoLimit" : this.F.toString();
        igco igco0 = this.G;
        if(igco0 != null) {
            s1 = igco0.toString();
        }
        return a.ak(s1, s2, new StringBuilder(), s, "LimitChronology[", ", ", ", ", "]");
    }
}

