final class igew extends igfz {
    static final igcp a;

    static {
        igew.a = new igew();
    }

    private igew() {
        super(iget.I.A, igcr.c);
    }

    @Override  // igfz
    public final int a(long v) {
        int v1 = this.b.a(v);
        return v1 >= 0 ? v1 : -v1;
    }

    @Override  // igfz
    public final int c() {
        return this.b.c();
    }

    @Override  // igfz
    public final int e() {
        return 0;
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
        iggd.e(this, v1, 0, this.c());
        if(this.b.a(v) < 0) {
            v1 = -v1;
        }
        return super.l(v, v1);
    }

    @Override  // igfz
    public final igcy y() {
        return iget.I.h;
    }
}

