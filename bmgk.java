public final class bmgk {
    public final gfsx a;
    public final gfsx b;

    public bmgk() {
        throw null;
    }

    public bmgk(gfsx gfsx0, gfsx gfsx1) {
        this.a = gfsx0;
        this.b = gfsx1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bmgk) && this.a.equals(((bmgk)object0).a) && this.b.equals(((bmgk)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "UnsignedOutputs{dpk=" + this.a.toString() + ", prf=" + this.b.toString() + "}";
    }
}

