public final class iggk extends igfy {
    private final long a;
    private static final long serialVersionUID = 0x8C2C82CE195505FBL;

    public iggk(igda igda0, long v) {
        super(igda0);
        this.a = v;
    }

    @Override  // igcy
    public final long a(long v, int v1) {
        return iggd.b(v, ((long)v1) * this.a);
    }

    @Override  // igcy
    public final long b(long v, long v1) {
        return iggd.b(v, iggd.d(v1, this.a));
    }

    @Override  // igcy
    public final long c() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof iggk) && this.d == ((iggk)object0).d && this.a == ((iggk)object0).a;
    }

    @Override  // igcy
    public final boolean f() {
        return true;
    }

    @Override
    public final int hashCode() {
        return ((int)this.a) + this.d.hashCode();
    }
}

