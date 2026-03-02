public final class fmgu {
    public static final String a = "fmgu";
    public final gged_interceptors b;
    public final int c;
    public final gfsx d;

    static {
    }

    public fmgu() {
        throw null;
    }

    public fmgu(gged_interceptors gged0, int v, gfsx gfsx0) {
        this.b = gged0;
        this.c = v;
        this.d = gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmgu) && ggia.i(this.b, ((fmgu)object0).b) && this.c == ((fmgu)object0).c && this.d.equals(((fmgu)object0).d);
    }

    @Override
    public final int hashCode() {
        return (this.c ^ (this.b.hashCode() ^ 1000003) * 1000003) * 1000003 ^ this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "RichCardButtons{buttons=" + this.b + ", orientation=" + this.c + ", horizontalAlignment=" + this.d + "}";
    }
}

