public final class bxs {
    public final long a;

    public bxs(long v) {
        this.a = v;
    }

    public static final int a(long v) {
        return (int)(v >> 0x20);
    }

    public static final int b(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public static long c(int v, int v1) {
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bxs) && this.a == ((bxs)object0).a;
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        return "(" + bxs.a(this.a) + ", " + bxs.b(this.a) + ')';
    }
}

