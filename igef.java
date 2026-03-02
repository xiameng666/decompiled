final class igef extends iggj {
    private final igdz b;

    public igef(igdz igdz0, igcy igcy0) {
        super(igcr.l, igcy0);
        this.b = igdz0;
    }

    @Override  // iggj
    protected final int C(long v, int v1) {
        return v1 <= 52 ? 52 : this.d(v);
    }

    @Override  // igfx
    public final int a(long v) {
        return this.b.aa(v);
    }

    @Override  // igfx
    public final int c() {
        return 53;
    }

    @Override  // igfx
    public final int d(long v) {
        int v1 = this.b.ad(v);
        return this.b.ac(v1);
    }

    @Override  // iggj
    public final int e() {
        return 1;
    }

    @Override  // iggj
    public final long i(long v) {
        return super.i(v + 259200000L);
    }

    @Override  // iggj
    public final long j(long v) {
        return super.j(v + 259200000L) - 259200000L;
    }

    @Override  // iggj
    public final long k(long v) {
        return super.k(v + 259200000L) - 259200000L;
    }

    @Override  // igcp
    public final igcy y() {
        return this.b.e;
    }
}

