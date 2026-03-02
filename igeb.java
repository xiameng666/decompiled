final class igeb extends iggj {
    private final igdz b;

    public igeb(igdz igdz0, igcy igcy0) {
        super(igcr.g, igcy0);
        this.b = igdz0;
    }

    @Override  // iggj
    protected final int C(long v, int v1) {
        return v1 > 365 || v1 <= 0 ? this.d(v) : 365;
    }

    @Override  // igfx
    public final int a(long v) {
        int v1 = this.b.ae(v);
        return this.b.S(v, v1);
    }

    @Override  // igfx
    public final int c() {
        return 366;
    }

    @Override  // igfx
    public final int d(long v) {
        int v1 = this.b.ae(v);
        return this.b.ar(v1) ? 366 : 365;
    }

    @Override  // iggj
    public final int e() {
        return 1;
    }

    @Override  // igcp
    public final igcy y() {
        return this.b.g;
    }

    @Override  // igfx
    public final boolean z(long v) {
        return this.b.aq(v);
    }
}

