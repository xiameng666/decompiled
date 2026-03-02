import j..util.Objects;
import java.util.Locale;

final class igey extends igfz {
    final igfb a;
    private final igcy c;
    private final igcy d;
    private final igcy e;

    public igey(igfb igfb0, igcp igcp0, igcy igcy0, igcy igcy1, igcy igcy2) {
        Objects.requireNonNull(igfb0);
        this.a = igfb0;
        super(igcp0, igcp0.v());
        this.c = igcy0;
        this.d = igcy1;
        this.e = igcy2;
    }

    @Override  // igfz
    public final int a(long v) {
        this.a.R(v, null);
        return this.b.a(v);
    }

    @Override  // igfx
    public final int b(Locale locale0) {
        return this.b.b(locale0);
    }

    @Override  // igfx
    public final int d(long v) {
        this.a.R(v, null);
        return this.b.d(v);
    }

    @Override  // igfx
    public final int f(long v) {
        this.a.R(v, null);
        return this.b.f(v);
    }

    @Override  // igfx
    public final long g(long v, int v1) {
        this.a.R(v, null);
        long v2 = this.b.g(v, v1);
        this.a.R(v2, "resulting");
        return v2;
    }

    @Override  // igfx
    public final long h(long v, long v1) {
        this.a.R(v, null);
        long v2 = this.b.h(v, v1);
        this.a.R(v2, "resulting");
        return v2;
    }

    @Override  // igfx
    public final long i(long v) {
        this.a.R(v, null);
        long v1 = this.b.i(v);
        this.a.R(v1, "resulting");
        return v1;
    }

    @Override  // igfx
    public final long j(long v) {
        this.a.R(v, null);
        long v1 = this.b.j(v);
        this.a.R(v1, "resulting");
        return v1;
    }

    @Override  // igfz
    public final long k(long v) {
        this.a.R(v, null);
        long v1 = this.b.k(v);
        this.a.R(v1, "resulting");
        return v1;
    }

    @Override  // igfz
    public final long l(long v, int v1) {
        this.a.R(v, null);
        long v2 = this.b.l(v, v1);
        this.a.R(v2, "resulting");
        return v2;
    }

    @Override  // igfx
    public final long m(long v, String s, Locale locale0) {
        this.a.R(v, null);
        long v1 = this.b.m(v, s, locale0);
        this.a.R(v1, "resulting");
        return v1;
    }

    @Override  // igfx
    public final String p(long v, Locale locale0) {
        this.a.R(v, null);
        return this.b.p(v, locale0);
    }

    @Override  // igfx
    public final String s(long v, Locale locale0) {
        this.a.R(v, null);
        return this.b.s(v, locale0);
    }

    @Override  // igfz
    public final igcy w() {
        return this.c;
    }

    @Override  // igfx
    public final igcy x() {
        return this.e;
    }

    @Override  // igfz
    public final igcy y() {
        return this.d;
    }

    @Override  // igfx
    public final boolean z(long v) {
        this.a.R(v, null);
        return this.b.z(v);
    }
}

