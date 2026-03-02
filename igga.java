public class igga extends igfy {
    public final igcy b;
    private static final long serialVersionUID = 0x6F4CB35DBE61C66FL;

    public igga(igcy igcy0, igda igda0) {
        super(igda0);
        if(igcy0 == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if(!igcy0.g()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.b = igcy0;
    }

    @Override  // igcy
    public long a(long v, int v1) {
        return this.b.a(v, v1);
    }

    @Override  // igcy
    public long b(long v, long v1) {
        return this.b.b(v, v1);
    }

    @Override  // igcy
    public long c() {
        return this.b.c();
    }

    @Override  // igcy
    public final boolean f() {
        return this.b.f();
    }
}

