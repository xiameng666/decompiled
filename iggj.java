public abstract class iggj extends igfx {
    final long a;
    private final igcy b;

    public iggj(igcr igcr0, igcy igcy0) {
        super(igcr0);
        if(!igcy0.f()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long v = igcy0.c();
        this.a = v;
        if(v < 1L) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.b = igcy0;
    }

    @Override  // igcp
    public final void B() {
    }

    protected int C(long v, int v1) {
        return this.d(v);
    }

    @Override  // igfx
    public int e() {
        return 0;
    }

    @Override  // igfx
    public long i(long v) {
        return v < 0L ? (v + 1L) % this.a + this.a - 1L : v % this.a;
    }

    @Override  // igfx
    public long j(long v) {
        return v <= 0L ? v - v % this.a : v - 1L - (v - 1L) % this.a + this.a;
    }

    @Override  // igfx
    public long k(long v) {
        return v < 0L ? v + 1L - (v + 1L) % this.a - this.a : v - v % this.a;
    }

    @Override  // igfx
    public long l(long v, int v1) {
        int v2 = this.C(v, v1);
        iggd.e(this, v1, this.e(), v2);
        return v + ((long)(v1 - this.a(v))) * this.a;
    }

    @Override  // igfx
    public final igcy w() {
        return this.b;
    }
}

