public final class ggbi extends ggbl {
    private static final long serialVersionUID;

    public ggbi(Comparable comparable0) {
        gftb.check(comparable0);
        super(comparable0);
    }

    @Override  // ggbl
    public final gfzd b() {
        return gfzd.a;
    }

    @Override  // ggbl
    public final gfzd c() {
        return gfzd.b;
    }

    @Override  // ggbl
    public final ggbl d(gfzd gfzd0, ggbv ggbv0) {
        switch(gfzd0.ordinal()) {
            case 0: {
                return this;
            }
            case 1: {
                Comparable comparable0 = ggbv0.a(this.b);
                return comparable0 == null ? ggbj.a : new ggbk(comparable0);
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    @Override  // ggbl
    public final ggbl e(gfzd gfzd0, ggbv ggbv0) {
        switch(gfzd0.ordinal()) {
            case 0: {
                Comparable comparable0 = ggbv0.a(this.b);
                return comparable0 == null ? ggbh.a : new ggbk(comparable0);
            }
            case 1: {
                return this;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    @Override  // ggbl
    public final Comparable g(ggbv ggbv0) {
        return this.b;
    }

    @Override  // ggbl
    public final Comparable h(ggbv ggbv0) {
        return ggbv0.a(this.b);
    }

    @Override  // ggbl
    public final int hashCode() {
        return ~this.b.hashCode();
    }

    @Override  // ggbl
    public final void i(StringBuilder stringBuilder0) {
        stringBuilder0.append('(');
        stringBuilder0.append(this.b);
    }

    @Override  // ggbl
    public final void j(StringBuilder stringBuilder0) {
        stringBuilder0.append(this.b);
        stringBuilder0.append(']');
    }

    @Override  // ggbl
    public final boolean k(Comparable comparable0) {
        return TimeRange.b(this.b, comparable0) < 0;
    }

    @Override
    public final String toString() {
        return "/" + this.b.toString() + "\\";
    }
}

