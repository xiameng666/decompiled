public final class jbk {
    public static final long a;
    public final long b;

    static {
        jbk.a = jbl.a(0, 0);
    }

    public jbk(long v) {
        this.b = v;
    }

    public static final int a(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public static final int b(long v) {
        return jbk.c(v) - jbk.d(v);
    }

    public static final int c(long v) {
        return Math.max(jbk.e(v), jbk.a(v));
    }

    public static final int d(long v) {
        return Math.min(jbk.e(v), jbk.a(v));
    }

    public static final int e(long v) {
        return (int)(v >> 0x20);
    }

    @Override
    public final boolean equals(Object object0) {
        return jbk.h(this.b, object0);
    }

    public static String f(long v) {
        return "TextRange(" + jbk.e(v) + ", " + jbk.a(v) + ')';
    }

    public static final boolean g(long v, long v1) {
        int v2 = 1;
        int v3 = jbk.d(v) > jbk.d(v1) ? 0 : 1;
        if(jbk.c(v1) > jbk.c(v)) {
            v2 = 0;
        }
        return v3 & v2;
    }

    public static boolean h(long v, Object object0) {
        return (object0 instanceof jbk) ? v == ((jbk)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return jbj.a(this.b);
    }

    public static final boolean i(long v, long v1) {
        return v == v1;
    }

    public static final boolean j(long v) {
        return jbk.e(v) == jbk.a(v);
    }

    public static final boolean k(long v) {
        return jbk.e(v) > jbk.a(v);
    }

    @Override
    public final String toString() {
        return jbk.f(this.b);
    }
}

