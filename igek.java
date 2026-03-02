import j..util.Objects;
import java.util.Locale;

class igek extends igfx {
    final igcp a;
    final igcp b;
    final long c;
    final boolean d;
    protected igcy e;
    protected igcy f;
    final igen g;

    public igek(igen igen0, igcp igcp0, igcp igcp1, long v) {
        this(igen0, igcp0, igcp1, v, false);
    }

    public igek(igen igen0, igcp igcp0, igcp igcp1, long v, boolean z) {
        this(igen0, igcp0, igcp1, null, v, z);
    }

    public igek(igen igen0, igcp igcp0, igcp igcp1, igcy igcy0, long v, boolean z) {
        Objects.requireNonNull(igen0);
        this.g = igen0;
        super(igcp1.v());
        this.a = igcp0;
        this.b = igcp1;
        this.c = v;
        this.d = z;
        this.e = igcp1.w();
        if(igcy0 == null) {
            igcy0 = igcp1.y();
            if(igcy0 == null) {
                igcy0 = igcp0.y();
            }
        }
        this.f = igcy0;
    }

    @Override  // igcp
    public final void B() {
    }

    protected final long C(long v) {
        return this.d ? igen.R(v, this.g.H, this.g.G) : igen.S(v, this.g.H, this.g.G);
    }

    protected final long D(long v) {
        return this.d ? igen.R(v, this.g.G, this.g.H) : this.g.T(v);
    }

    @Override  // igfx
    public final int a(long v) {
        return v < this.c ? this.a.a(v) : this.b.a(v);
    }

    @Override  // igfx
    public final int b(Locale locale0) {
        return Math.max(this.a.b(locale0), this.b.b(locale0));
    }

    @Override  // igfx
    public final int c() {
        return this.b.c();
    }

    @Override  // igfx
    public int d(long v) {
        long v1 = this.c;
        if(v >= v1) {
            return this.b.d(v);
        }
        int v2 = this.a.d(v);
        return this.a.l(v, v2) < v1 ? v2 : this.a.a(this.a.g(v1, -1));
    }

    @Override  // igfx
    public final int e() {
        return this.a.e();
    }

    @Override  // igfx
    public int f(long v) {
        long v1 = this.c;
        if(v < v1) {
            return this.a.f(v);
        }
        int v2 = this.b.f(v);
        return this.b.l(v, v2) >= v1 ? v2 : this.b.a(v1);
    }

    @Override  // igfx
    public long g(long v, int v1) {
        return this.b.g(v, v1);
    }

    @Override  // igfx
    public long h(long v, long v1) {
        return this.b.h(v, v1);
    }

    @Override  // igfx
    public final long j(long v) {
        long v1 = this.c;
        if(v >= v1) {
            return this.b.j(v);
        }
        long v2 = this.a.j(v);
        return v2 < v1 || v2 - this.g.I < v1 ? v2 : this.D(v2);
    }

    @Override  // igfx
    public final long k(long v) {
        long v1 = this.c;
        if(v >= v1) {
            long v2 = this.b.k(v);
            return v2 >= v1 || this.g.I + v2 >= v1 ? v2 : this.C(v2);
        }
        return this.a.k(v);
    }

    @Override  // igfx
    public final long l(long v, int v1) {
        long v2 = this.c;
        if(Long.compare(v, v2) >= 0) {
            igcp igcp0 = this.b;
            long v3 = igcp0.l(v, v1);
            if(v3 < v2) {
                if(this.g.I + v3 < v2) {
                    v3 = this.C(v3);
                }
                if(this.a(v3) == v1) {
                    return v3;
                }
                throw new igdb(igcp0.v(), v1, null, null);
            }
            return v3;
        }
        igcp igcp1 = this.a;
        long v4 = igcp1.l(v, v1);
        if(v4 >= v2) {
            if(v4 - this.g.I >= v2) {
                v4 = this.D(v4);
            }
            if(this.a(v4) == v1) {
                return v4;
            }
            throw new igdb(igcp1.v(), v1, null, null);
        }
        return v4;
    }

    @Override  // igfx
    public final long m(long v, String s, Locale locale0) {
        long v1 = this.c;
        if(v >= v1) {
            long v2 = this.b.m(v, s, locale0);
            return v2 >= v1 || this.g.I + v2 >= v1 ? v2 : this.C(v2);
        }
        long v3 = this.a.m(v, s, locale0);
        return v3 < v1 || v3 - this.g.I < v1 ? v3 : this.D(v3);
    }

    @Override  // igfx
    public final String o(int v, Locale locale0) {
        return this.b.o(v, locale0);
    }

    @Override  // igfx
    public final String p(long v, Locale locale0) {
        return v < this.c ? this.a.p(v, locale0) : this.b.p(v, locale0);
    }

    @Override  // igfx
    public final String r(int v, Locale locale0) {
        return this.b.r(v, locale0);
    }

    @Override  // igfx
    public final String s(long v, Locale locale0) {
        return v < this.c ? this.a.s(v, locale0) : this.b.s(v, locale0);
    }

    @Override  // igfx
    public final igcy w() {
        return this.e;
    }

    @Override  // igfx
    public final igcy x() {
        return this.b.x();
    }

    @Override  // igcp
    public final igcy y() {
        return this.f;
    }

    @Override  // igfx
    public final boolean z(long v) {
        return v < this.c ? this.a.z(v) : this.b.z(v);
    }
}

