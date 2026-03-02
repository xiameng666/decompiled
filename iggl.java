public final class iggl extends igfz {
    final igcy a;
    final igcy c;

    public iggl(igcp igcp0, igcy igcy0, igcr igcr0) {
        super(igcp0, igcr0);
        this.c = igcy0;
        this.a = igcp0.w();
    }

    public iggl(iggc iggc0) {
        this(iggc0, iggc0.i);
    }

    public iggl(iggc iggc0, igcr igcr0) {
        this(iggc0, iggc0.b.w(), igcr0);
    }

    public iggl(iggc iggc0, igcy igcy0, igcr igcr0) {
        super(iggc0.b, igcr0);
        this.a = igcy0;
        this.c = iggc0.c;
    }

    @Override  // igfz
    public final int a(long v) {
        int v1 = this.b.a(v);
        return v1 < 0 ? (v1 + 1) % 100 + 99 : v1 % 100;
    }

    @Override  // igfz
    public final int c() {
        return 99;
    }

    @Override  // igfz
    public final int e() {
        return 0;
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
        iggd.e(this, v1, 0, 99);
        int v2 = this.b.a(v);
        return v2 < 0 ? this.b.l(v, ((v2 + 1) / 100 - 1) * 100 + v1) : this.b.l(v, v2 / 100 * 100 + v1);
    }

    @Override  // igfz
    public final igcy w() {
        return this.a;
    }

    @Override  // igfz
    public final igcy y() {
        return this.c;
    }
}

