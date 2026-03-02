public final class iggc extends igfz {
    final int a;
    final igcy c;
    final igcy d;
    private final int e;
    private final int f;

    public iggc(igcp igcp0, igcr igcr0) {
        this(igcp0, igcp0.y(), igcr0);
    }

    public iggc(igcp igcp0, igcy igcy0, igcr igcr0) {
        super(igcp0, igcr0);
        igcy igcy1 = igcp0.w();
        this.c = igcy1 == null ? null : new iggm(igcy1, ((igcq)igcr0).a);
        this.d = igcy0;
        this.a = 100;
        int v = igcp0.e();
        int v1 = igcp0.c();
        this.e = v < 0 ? (v + 1) / 100 - 1 : v / 100;
        this.f = v1 < 0 ? (v1 + 1) / 100 - 1 : v1 / 100;
    }

    @Override  // igfz
    public final int a(long v) {
        int v1 = this.b.a(v);
        return v1 < 0 ? (v1 + 1) / 100 - 1 : v1 / 100;
    }

    @Override  // igfz
    public final int c() {
        return this.f;
    }

    @Override  // igfz
    public final int e() {
        return this.e;
    }

    @Override  // igfx
    public final long g(long v, int v1) {
        return this.b.g(v, v1 * 100);
    }

    @Override  // igfx
    public final long h(long v, long v1) {
        return this.b.h(v, v1 * 100L);
    }

    @Override  // igfx
    public final long i(long v) {
        return this.l(v, this.a(this.b.i(v)));
    }

    @Override  // igfz
    public final long k(long v) {
        int v1 = this.a(v) * 100;
        long v2 = this.b.l(v, v1);
        return this.b.k(v2);
    }

    @Override  // igfz
    public final long l(long v, int v1) {
        iggd.e(this, v1, this.e, this.f);
        int v2 = this.b.a(v);
        return v2 < 0 ? this.b.l(v, v1 * 100 + ((v2 + 1) % 100 + 99)) : this.b.l(v, v1 * 100 + v2 % 100);
    }

    @Override  // igfz
    public final igcy w() {
        return this.c;
    }

    @Override  // igfz
    public final igcy y() {
        return this.d == null ? super.y() : this.d;
    }
}

