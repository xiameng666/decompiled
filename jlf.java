public final class jlf {
    public final long a;

    public jlf(long v) {
        this.a = v;
    }

    public static final int a(long v) {
        return (int)(v >> 0x20);
    }

    public static final int b(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public static final long c(long v, long v1) {
        return ((long)(((int)(v >> 0x20)) - ((int)(v1 >> 0x20)))) << 0x20 | ((long)(((int)(v & 0xFFFFFFFFL)) - ((int)(v1 & 0xFFFFFFFFL)))) & 0xFFFFFFFFL;
    }

    public static final long d(long v, long v1) {
        return ((long)(((int)(v >> 0x20)) + ((int)(v1 >> 0x20)))) << 0x20 | ((long)(((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL)))) & 0xFFFFFFFFL;
    }

    public static String e(long v) {
        return "(" + jlf.a(v) + ", " + jlf.b(v) + ')';
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof jlf) && this.a == ((jlf)object0).a;
    }

    public static final boolean f(long v, long v1) {
        return v == v1;
    }

    public static long g(long v, int v1, int v2, int v3) {
        if((v3 & 1) != 0) {
            v1 = (int)(v >> 0x20);
        }
        if((v3 & 2) != 0) {
            v2 = (int)(v & 0xFFFFFFFFL);
        }
        return ((long)v1) << 0x20 | ((long)v2) & 0xFFFFFFFFL;
    }

    @Override
    public final int hashCode() {
        return jle.a(this.a);
    }

    @Override
    public final String toString() {
        return jlf.e(this.a);
    }
}

