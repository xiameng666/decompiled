import java.util.Locale;

final class igfc extends igfx {
    final igcp a;
    final igcw b;
    final igcy c;
    final boolean d;
    final igcy e;
    final igcy f;

    public igfc(igcp igcp0, igcw igcw0, igcy igcy0, igcy igcy1, igcy igcy2) {
        super(igcp0.v());
        if(!igcp0.A()) {
            throw new IllegalArgumentException();
        }
        this.a = igcp0;
        this.b = igcw0;
        this.c = igcy0;
        this.d = igfe.R(igcy0);
        this.e = igcy1;
        this.f = igcy2;
    }

    @Override  // igcp
    public final void B() {
    }

    private final int C(long v) {
        int v1 = this.b.a(v);
        if((v + ((long)v1) ^ v) < 0L && (v ^ ((long)v1)) >= 0L) {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        return v1;
    }

    @Override  // igfx
    public final int a(long v) {
        long v1 = this.b.j(v);
        return this.a.a(v1);
    }

    @Override  // igfx
    public final int b(Locale locale0) {
        return this.a.b(locale0);
    }

    @Override  // igfx
    public final int c() {
        return this.a.c();
    }

    @Override  // igfx
    public final int d(long v) {
        long v1 = this.b.j(v);
        return this.a.d(v1);
    }

    @Override  // igfx
    public final int e() {
        return this.a.e();
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof igfc) && this.a.equals(((igfc)object0).a) && this.b.equals(((igfc)object0).b) && this.c.equals(((igfc)object0).c) && this.e.equals(((igfc)object0).e);
    }

    @Override  // igfx
    public final int f(long v) {
        long v1 = this.b.j(v);
        return this.a.f(v1);
    }

    @Override  // igfx
    public final long g(long v, int v1) {
        if(this.d) {
            int v2 = this.C(v);
            return this.a.g(v + ((long)v2), v1) - ((long)v2);
        }
        long v3 = this.b.j(v);
        long v4 = this.a.g(v3, v1);
        return this.b.q(v4, v);
    }

    @Override  // igfx
    public final long h(long v, long v1) {
        if(this.d) {
            int v2 = this.C(v);
            return this.a.h(v + ((long)v2), v1) - ((long)v2);
        }
        long v3 = this.b.j(v);
        long v4 = this.a.h(v3, v1);
        return this.b.q(v4, v);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override  // igfx
    public final long i(long v) {
        long v1 = this.b.j(v);
        return this.a.i(v1);
    }

    @Override  // igfx
    public final long j(long v) {
        if(this.d) {
            int v1 = this.C(v);
            return this.a.j(v + ((long)v1)) - ((long)v1);
        }
        long v2 = this.b.j(v);
        long v3 = this.a.j(v2);
        return this.b.q(v3, v);
    }

    @Override  // igfx
    public final long k(long v) {
        if(this.d) {
            int v1 = this.C(v);
            return this.a.k(v + ((long)v1)) - ((long)v1);
        }
        long v2 = this.b.j(v);
        long v3 = this.a.k(v2);
        return this.b.q(v3, v);
    }

    @Override  // igfx
    public final long l(long v, int v1) {
        igcw igcw0 = this.b;
        igcp igcp0 = this.a;
        long v2 = igcp0.l(igcw0.j(v), v1);
        long v3 = igcw0.q(v2, v);
        if(this.a(v3) == v1) {
            return v3;
        }
        igdc igdc0 = new igdc(v2, igcw0.d);
        igdb igdb0 = new igdb(igcp0.v(), v1, igdc0.getMessage());
        igdb0.initCause(igdc0);
        throw igdb0;
    }

    @Override  // igfx
    public final long m(long v, String s, Locale locale0) {
        long v1 = this.b.j(v);
        long v2 = this.a.m(v1, s, locale0);
        return this.b.q(v2, v);
    }

    @Override  // igfx
    public final String o(int v, Locale locale0) {
        return this.a.o(v, locale0);
    }

    @Override  // igfx
    public final String p(long v, Locale locale0) {
        long v1 = this.b.j(v);
        return this.a.p(v1, locale0);
    }

    @Override  // igfx
    public final String r(int v, Locale locale0) {
        return this.a.r(v, locale0);
    }

    @Override  // igfx
    public final String s(long v, Locale locale0) {
        long v1 = this.b.j(v);
        return this.a.s(v1, locale0);
    }

    @Override  // igfx
    public final igcy w() {
        return this.c;
    }

    @Override  // igfx
    public final igcy x() {
        return this.f;
    }

    @Override  // igcp
    public final igcy y() {
        return this.e;
    }

    @Override  // igfx
    public final boolean z(long v) {
        long v1 = this.b.j(v);
        return this.a.z(v1);
    }
}

