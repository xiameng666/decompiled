public final class jlk {
    public final long a;

    public jlk(long v) {
        this.a = v;
    }

    public static String a(long v) {
        return ((int)(v >> 0x20)) + " x " + ((int)(v & 0xFFFFFFFFL));
    }

    public static boolean b(long v, Object object0) {
        return (object0 instanceof jlk) ? v == ((jlk)object0).a : false;
    }

    public static final boolean c(long v, long v1) {
        return v == v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return jlk.b(this.a, object0);
    }

    @Override
    public final int hashCode() {
        return jlj.a(this.a);
    }

    @Override
    public final String toString() {
        return jlk.a(this.a);
    }
}

