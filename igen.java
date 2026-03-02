import j..util.concurrent.ConcurrentHashMap;

public final class igen extends igdv {
    static final igdd F = null;
    public igex G;
    public iget H;
    public long I;
    private static final ConcurrentHashMap J = null;
    private igdd K;
    private long L;
    private static final long serialVersionUID = 0xDCAC4D2E655A2629L;

    static {
        igen.F = new igdd(-12219292800000L);
        igen.J = new ConcurrentHashMap();
    }

    private igen(igcm igcm0, igex igex0, iget iget0, igdd igdd0) {
        super(igcm0, new Object[]{igex0, iget0, igdd0});
    }

    private igen(igex igex0, iget iget0, igdd igdd0) {
        super(null, new Object[]{igex0, iget0, igdd0});
    }

    @Override  // igdv
    public final igcw B() {
        return this.a == null ? igcw.b : this.a.B();
    }

    @Override  // igdv
    protected final void P(igdu igdu0) {
        igex igex0 = (igex)((Object[])this.b)[0];
        iget iget0 = (iget)((Object[])this.b)[1];
        igdd igdd0 = (igdd)((Object[])this.b)[2];
        long v = igdd0.b;
        this.L = v;
        this.G = igex0;
        this.H = iget0;
        this.K = igdd0;
        if(this.a == null) {
            if(igex0.H != iget0.H) {
                throw new IllegalArgumentException();
            }
            this.I = v - this.T(v);
            igdu0.a(iget0);
            if(iget0.j.a(this.L) == 0) {
                igdu0.m = new igek(this, igex0.i, igdu0.m, this.L);
                igdu0.n = new igek(this, igex0.j, igdu0.n, this.L);
                igdu0.o = new igek(this, igex0.k, igdu0.o, this.L);
                igdu0.p = new igek(this, igex0.l, igdu0.p, this.L);
                igdu0.q = new igek(this, igex0.m, igdu0.q, this.L);
                igdu0.r = new igek(this, igex0.n, igdu0.r, this.L);
                igdu0.s = new igek(this, igex0.o, igdu0.s, this.L);
                igdu0.u = new igek(this, igex0.q, igdu0.u, this.L);
                igdu0.t = new igek(this, igex0.p, igdu0.t, this.L);
                igdu0.v = new igek(this, igex0.r, igdu0.v, this.L);
                igdu0.w = new igek(this, igex0.s, igdu0.w, this.L);
            }
            igdu0.I = new igek(this, igex0.E, igdu0.I, this.L);
            igdu0.E = new igel(this, igex0.A, igdu0.E, this.L);
            igdu0.j = igdu0.E.w();
            igdu0.F = new igel(this, igex0.B, igdu0.F, igdu0.j, this.L, false);
            igdu0.H = new igel(this, igex0.D, igdu0.H, this.L);
            igdu0.k = igdu0.H.w();
            igdu0.G = new igel(this, igex0.C, igdu0.G, igdu0.j, igdu0.k, this.L);
            igdu0.D = new igel(this, igex0.z, igdu0.D, null, igdu0.j, this.L);
            igdu0.i = igdu0.D.w();
            igdu0.B = new igel(this, igex0.x, igdu0.B, null, this.L, true);
            igdu0.h = igdu0.B.w();
            igdu0.C = new igel(this, igex0.y, igdu0.C, igdu0.h, igdu0.k, this.L);
            long v1 = iget0.A.j(this.L);
            igdu0.z = new igek(this, igex0.v, igdu0.z, igdu0.j, v1, false);
            long v2 = iget0.x.j(this.L);
            igdu0.A = new igek(this, igex0.w, igdu0.A, igdu0.h, v2, true);
            igek igek0 = new igek(this, igex0.u, igdu0.y, this.L);
            igek0.f = igdu0.i;
            igdu0.y = igek0;
        }
    }

    public final int Q() {
        return this.H.H;
    }

    public static long R(long v, igcm igcm0, igcm igcm1) {
        long v1 = igcm1.w().l(0L, igcm0.w().a(v));
        long v2 = igcm1.v().l(v1, igcm0.v().a(v));
        long v3 = igcm1.i().l(v2, igcm0.i().a(v));
        return igcm1.o().l(v3, igcm0.o().a(v));
    }

    public static long S(long v, igcm igcm0, igcm igcm1) {
        return igcm1.a(igcm0.y().a(v), igcm0.s().a(v), igcm0.h().a(v), igcm0.o().a(v));
    }

    final long T(long v) {
        return igen.S(v, this.G, this.H);
    }

    public static igen U(igcw igcw0, igdk igdk0, int v) {
        igen igen1;
        igcw igcw1 = igct.e(igcw0);
        if(igdk0 == null) {
            igdk0 = igen.F;
        }
        else {
            iget iget0 = iget.as(igcw1);
            if(new igde(((igdd)igdk0).b, iget0).f() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        igej igej0 = new igej(igcw1, ((igdd)igdk0), v);
        ConcurrentHashMap concurrentHashMap0 = igen.J;
        igen igen0 = (igen)concurrentHashMap0.get(igej0);
        if(igen0 == null) {
            igcw igcw2 = igcw.b;
            if(igcw1 == igcw2) {
                igen1 = new igen(igex.at(igcw1, v), iget.at(igcw1, v), ((igdd)igdk0));
            }
            else {
                igen igen2 = igen.U(igcw2, igdk0, v);
                igen1 = new igen(igfe.Q(igen2, igcw1), igen2.G, igen2.H, igen2.K);
            }
            igen igen3 = (igen)concurrentHashMap0.putIfAbsent(igej0, igen1);
            return igen3 == null ? igen1 : igen3;
        }
        return igen0;
    }

    @Override  // igdv
    public final long a(int v, int v1, int v2, int v3) {
        igcm igcm0 = this.a;
        if(igcm0 != null) {
            return igcm0.a(v, v1, v2, v3);
        }
        long v4 = this.H.a(v, v1, v2, v3);
        if(v4 < this.L) {
            long v5 = this.G.a(v, v1, v2, v3);
            if(v5 < this.L) {
                return v5;
            }
            throw new IllegalArgumentException("Specified date does not exist");
        }
        return v4;
    }

    @Override  // igdv
    public final long b(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        long v9;
        int v8;
        int v7;
        igcm igcm0 = this.a;
        if(igcm0 != null) {
            return igcm0.b(v, v1, v2, v3, v4, v5, v6);
        }
        try {
            v7 = v1;
            v8 = v2;
            v9 = this.H.b(v, v7, v8, v3, v4, v5, v6);
        }
        catch(igdb igdb0) {
            if(v7 != 2 || v8 != 29) {
                throw igdb0;
            }
            long v10 = this.H.b(v, 2, 28, v3, v4, v5, v6);
            if(v10 >= this.L) {
                throw igdb0;
            }
            v7 = 2;
            v8 = 29;
            v9 = v10;
        }
        if(v9 < this.L) {
            v9 = this.G.b(v, v7, v8, v3, v4, v5, v6);
            if(v9 >= this.L) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return v9;
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
        int v = this.Q();
        return igen.U(igcw0, this.K, v);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof igen) && this.L == ((igen)object0).L && this.Q() == ((igen)object0).Q() && this.B().equals(((igen)object0).B());
    }

    @Override
    public final int hashCode() {
        return this.B().hashCode() + 25025 + this.Q() + this.K.hashCode();
    }

    private Object readResolve() {
        igcw igcw0 = this.B();
        int v = this.Q();
        return igen.U(igcw0, this.K, v);
    }

    @Override  // igcm
    public final String toString() {
        StringBuffer stringBuffer0 = new StringBuffer(60);
        stringBuffer0.append("GJChronology[");
        stringBuffer0.append(this.B().d);
        if(this.L != igen.F.b) {
            stringBuffer0.append(",cutover=");
            (((igdv)this.c()).v.i(this.L) == 0L ? igho.a : igho.b).d(this.c()).f(stringBuffer0, this.L);
        }
        if(this.Q() != 4) {
            stringBuffer0.append(",mdfw=");
            stringBuffer0.append(this.Q());
        }
        stringBuffer0.append(']');
        return stringBuffer0.toString();
    }
}

