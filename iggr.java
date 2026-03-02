public final class iggr extends igfz {
    public iggr(igcp igcp0, igcr igcr0) {
        super(igcp0, igcr0);
    }

    @Override  // igfz
    public final int a(long v) {
        int v1 = this.b.a(v);
        return v1 == 0 ? this.c() : v1;
    }

    @Override  // igfz
    public final int c() {
        return this.b.c() + 1;
    }

    @Override  // igfx
    public final int d(long v) {
        return this.b.d(v) + 1;
    }

    @Override  // igfz
    public final int e() {
        return 1;
    }

    @Override  // igfx
    public final int f(long v) {
        return 1;
    }

    @Override  // igfx
    public final long g(long v, int v1) {
        return this.b.g(v, v1);
    }

    @Override  // igfx
    public final long h(long v, long v1) {
        return this.b.h(v, v1);
    }

    @Override  // igfx
    public final long i(long v) {
        return this.b.i(v);
    }

    @Override  // igfx
    public final long j(long v) {
        return this.b.j(v);
    }

    @Override  // igfz
    public final long k(long v) {
        return this.b.k(v);
    }

    @Override  // igfz
    public final long l(long v, int v1) {
        int v2 = this.c();
        iggd.e(this, v1, 1, v2);
        if(v1 == v2) {
            v1 = 0;
        }
        return this.b.l(v, v1);
    }

    @Override  // igfx
    public final igcy x() {
        return this.b.x();
    }

    @Override  // igfx
    public final boolean z(long v) {
        return this.b.z(v);
    }
}

