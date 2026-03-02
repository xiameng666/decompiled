final class igeg extends iggf {
    private final igdz a;

    public igeg(igdz igdz0) {
        long v = igdz0.ai();
        super(igcr.k, v);
        this.a = igdz0;
    }

    @Override  // igcp
    public final void B() {
    }

    @Override  // igfx
    public final int a(long v) {
        return this.a.ad(v);
    }

    @Override  // igfx
    public final int c() {
        return this.a.W();
    }

    @Override  // igfx
    public final int e() {
        return this.a.Y();
    }

    @Override  // igfx
    public final long g(long v, int v1) {
        return v1 == 0 ? v : this.l(v, this.a(v) + v1);
    }

    @Override  // igfx
    public final long h(long v, long v1) {
        return this.g(v, iggd.a(v1));
    }

    @Override  // igfx
    public final long i(long v) {
        return v - this.k(v);
    }

    @Override  // igfx
    public final long k(long v) {
        long v1 = this.a.w.k(v);
        int v2 = this.a.aa(v1);
        return v2 <= 1 ? v1 : v1 - ((long)(v2 - 1)) * 604800000L;
    }

    @Override  // igfx
    public final long l(long v, int v1) {
        igdz igdz0 = this.a;
        iggd.e(this, Math.abs(v1), igdz0.Y(), igdz0.W());
        int v2 = this.a(v);
        if(v2 == v1) {
            return v;
        }
        int v3 = igdz0.R(v);
        int v4 = igdz0.ac(v2);
        int v5 = igdz0.ac(v1);
        if(v5 < v4) {
            v4 = v5;
        }
        int v6 = igdz0.aa(v);
        if(v6 <= v4) {
            v4 = v6;
        }
        long v7 = igdz0.ap(v, v1);
        int v8 = this.a(v7);
        if(v8 < v1) {
            v7 += 604800000L;
        }
        else if(v8 > v1) {
            v7 += -604800000L;
        }
        long v9 = ((long)(v4 - igdz0.aa(v7))) * 604800000L;
        return igdz0.t.l(v7 + v9, v3);
    }

    @Override  // igfx
    public final igcy x() {
        return this.a.d;
    }

    @Override  // igcp
    public final igcy y() {
        return null;
    }

    @Override  // igfx
    public final boolean z(long v) {
        int v1 = this.a.ad(v);
        return this.a.ac(v1) > 52;
    }
}

