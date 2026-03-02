final class igea extends iggj {
    private final igdz b;

    public igea(igdz igdz0, igcy igcy0) {
        super(igcr.i, igcy0);
        this.b = igdz0;
    }

    @Override  // iggj
    protected final int C(long v, int v1) {
        return this.b.U(v, v1);
    }

    @Override  // igfx
    public final int a(long v) {
        int v1 = this.b.ae(v);
        int v2 = this.b.Z(v, v1);
        return this.b.Q(v, v1, v2);
    }

    @Override  // igfx
    public final int c() {
        return 0x1F;
    }

    @Override  // igfx
    public final int d(long v) {
        return this.b.T(v);
    }

    @Override  // iggj
    public final int e() {
        return 1;
    }

    @Override  // igcp
    public final igcy y() {
        return this.b.f;
    }

    @Override  // igfx
    public final boolean z(long v) {
        return this.b.aq(v);
    }
}

