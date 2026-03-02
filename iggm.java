public final class iggm extends igga {
    private final int a;
    private static final long serialVersionUID = 0xD384BEF1064F7503L;

    public iggm(igcy igcy0, igda igda0) {
        super(igcy0, igda0);
        this.a = 100;
    }

    @Override  // igga
    public final long a(long v, int v1) {
        return this.b.b(v, ((long)v1) * 100L);
    }

    @Override  // igga
    public final long b(long v, long v1) {
        long v2 = iggd.c(v1, 100);
        return this.b.b(v, v2);
    }

    @Override  // igga
    public final long c() {
        return this.b.c() * 100L;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof iggm) && this.b.equals(((iggm)object0).b) && this.d == ((iggm)object0).d;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + 100 + this.b.hashCode();
    }
}

