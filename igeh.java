final class igeh extends iggf {
    protected final igdz a;

    public igeh(igdz igdz0) {
        long v = igdz0.ai();
        super(igcr.f, v);
        this.a = igdz0;
    }

    @Override  // igcp
    public final void B() {
    }

    @Override  // igfx
    public final int a(long v) {
        return this.a.ae(v);
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
        if(v1 == 0) {
            return v;
        }
        int v2 = this.a(v);
        int v3 = v2 + v1;
        if((v2 ^ v3) < 0 && (v2 ^ v1) >= 0) {
            throw new ArithmeticException(a.z(v1, v2, "The calculation caused an overflow: ", " + "));
        }
        return this.l(v, v3);
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
    public final long j(long v) {
        int v1 = this.a(v);
        return v == this.a.an(v1) ? v : this.a.an(v1 + 1);
    }

    @Override  // igfx
    public final long k(long v) {
        int v1 = this.a(v);
        return this.a.an(v1);
    }

    @Override  // igfx
    public final long l(long v, int v1) {
        iggd.e(this, v1, this.a.Y(), this.a.W());
        return this.a.ap(v, v1);
    }

    @Override  // igcp
    public final long n(long v, int v1) {
        iggd.e(this, v1, this.a.Y() - 1, this.a.W() + 1);
        return this.a.ap(v, v1);
    }

    @Override  // igfx
    public final igcy x() {
        return this.a.c;
    }

    @Override  // igcp
    public final igcy y() {
        return null;
    }

    @Override  // igfx
    public final boolean z(long v) {
        int v1 = this.a(v);
        return this.a.ar(v1);
    }
}

