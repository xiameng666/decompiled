public class igfz extends igfx {
    public final igcp b;

    protected igfz(igcp igcp0, igcr igcr0) {
        super(igcr0);
        if(igcp0 == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if(!igcp0.A()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.b = igcp0;
    }

    @Override  // igcp
    public final void B() {
    }

    @Override  // igfx
    public int a(long v) {
        throw null;
    }

    @Override  // igfx
    public int c() {
        return this.b.c();
    }

    @Override  // igfx
    public int e() {
        return this.b.e();
    }

    @Override  // igfx
    public long k(long v) {
        throw null;
    }

    @Override  // igfx
    public long l(long v, int v1) {
        return this.b.l(v, v1);
    }

    @Override  // igfx
    public igcy w() {
        return this.b.w();
    }

    @Override  // igcp
    public igcy y() {
        return this.b.y();
    }
}

