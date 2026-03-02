public class iggi extends iggj {
    private final int b;
    private final igcy c;

    public iggi(igcr igcr0, igcy igcy0, igcy igcy1) {
        super(igcr0, igcy0);
        if(!igcy1.f()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int v = (int)(igcy1.c() / this.a);
        this.b = v;
        if(v < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.c = igcy1;
    }

    @Override  // igfx
    public final int a(long v) {
        return v < 0L ? this.b - 1 + ((int)((v + 1L) / this.a % ((long)this.b))) : ((int)(v / this.a % ((long)this.b)));
    }

    @Override  // igfx
    public final int c() {
        return this.b - 1;
    }

    @Override  // iggj
    public final long l(long v, int v1) {
        iggd.e(this, v1, 0, this.c());
        return v + ((long)(v1 - this.a(v))) * this.a;
    }

    @Override  // igcp
    public final igcy y() {
        return this.c;
    }
}

