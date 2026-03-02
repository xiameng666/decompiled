public final class ghht {
    private final TimeRange a;
    private final gfsx b;
    private final boolean c;

    public ghht() {
        throw null;
    }

    public ghht(TimeRange ggmr0, gfsx gfsx0, boolean z) {
        this.a = ggmr0;
        this.b = gfsx0;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ghht) && this.a.equals(((ghht)object0).a) && this.b.equals(((ghht)object0).b) && this.c == ((ghht)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
        return this.c ? 0x4CF ^ v * 1000003 : 0x4D5 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "AttributeLocation{nameLocation=" + this.a.toString() + ", valueLocation=" + this.b.toString() + ", isValueQuoted=" + this.c + "}";
    }
}

