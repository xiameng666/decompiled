public final class iggh extends igfz {
    private final int a;
    private final int c;
    private final int d;

    public iggh(igcp igcp0, int v) {
        this(igcp0, (igcp0 == null ? null : igcp0.v()), v);
    }

    public iggh(igcp igcp0, igcr igcr0) {
        this(igcp0, igcr0, 1);
    }

    public iggh(igcp igcp0, igcr igcr0, int v) {
        super(igcp0, igcr0);
        this.a = v;
        this.c = igcp0.e() + v > 0x80000000 ? igcp0.e() + v : 0x80000000;
        if(igcp0.c() + v < 0x7FFFFFFF) {
            this.d = igcp0.c() + v;
            return;
        }
        this.d = 0x7FFFFFFF;
    }

    @Override  // igfz
    public final int a(long v) {
        return this.b.a(v) + this.a;
    }

    @Override  // igfz
    public final int c() {
        return this.d;
    }

    @Override  // igfz
    public final int e() {
        return this.c;
    }

    @Override  // igfx
    public final long g(long v, int v1) {
        long v2 = super.g(v, v1);
        iggd.e(this, this.a(v2), this.c, this.d);
        return v2;
    }

    @Override  // igfx
    public final long h(long v, long v1) {
        long v2 = super.h(v, v1);
        iggd.e(this, this.a(v2), this.c, this.d);
        return v2;
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
        iggd.e(this, v1, this.c, this.d);
        return super.l(v, v1 - this.a);
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

