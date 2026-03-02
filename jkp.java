public final class jkp {
    public final long a;

    public jkp(long v) {
        this.a = v;
    }

    public static final int a(long v) {
        int v1 = ((int)(3L & v)) & 1;
        int v2 = v1 + v1 + ((((int)(3L & v)) & 2) >> 1) * 3;
        int v3 = ((int)(v >> v2 + 46)) & (1 << 18 - v2) - 1;
        return v3 == 0 ? 0x7FFFFFFF : v3 - 1;
    }

    public static final int b(long v) {
        int v1 = ((int)(3L & v)) & 1;
        int v2 = ((int)(v >> 33)) & (1 << v1 + v1 + ((((int)(3L & v)) & 2) >> 1) * 3 + 13) - 1;
        return v2 == 0 ? 0x7FFFFFFF : v2 - 1;
    }

    public static final int c(long v) {
        int v1 = (int)(3L & v);
        int v2 = v1 & 1;
        int v3 = v2 + v2 + ((v1 & 2) >> 1) * 3;
        return ((int)(v >> v3 + 15)) & (1 << 18 - v3) - 1;
    }

    public static final int d(long v) {
        int v1 = (int)(3L & v);
        int v2 = v1 & 1;
        return ((int)(v >> 2)) & (1 << v2 + v2 + ((v1 & 2) >> 1) * 3 + 13) - 1;
    }

    public final long e() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return jkp.g(this.a, object0);
    }

    public static String f(long v) {
        int v1 = jkp.b(v);
        String s = "Infinity";
        String s1 = v1 == 0x7FFFFFFF ? "Infinity" : String.valueOf(v1);
        int v2 = jkp.a(v);
        if(v2 != 0x7FFFFFFF) {
            s = String.valueOf(v2);
        }
        return "Constraints(minWidth = " + jkp.d(v) + ", maxWidth = " + s1 + ", minHeight = " + jkp.c(v) + ", maxHeight = " + s + ')';
    }

    public static boolean g(long v, Object object0) {
        return (object0 instanceof jkp) ? v == ((jkp)object0).a : false;
    }

    public static final boolean h(long v, long v1) {
        return v == v1;
    }

    @Override
    public final int hashCode() {
        return jkn.a(this.a);
    }

    public static final boolean i(long v) {
        int v1 = ((int)(3L & v)) & 1;
        int v2 = v1 + v1 + ((((int)(3L & v)) & 2) >> 1) * 3;
        return (((int)(v >> v2 + 46)) & (1 << 18 - v2) - 1) != 0;
    }

    public static final boolean j(long v) {
        int v1 = ((int)(3L & v)) & 1;
        return (((int)(v >> 33)) & (1 << v1 + v1 + ((((int)(3L & v)) & 2) >> 1) * 3 + 13) - 1) != 0;
    }

    public static final boolean k(long v) {
        int v1 = ((int)(3L & v)) & 1;
        int v2 = v1 + v1 + ((((int)(3L & v)) & 2) >> 1) * 3;
        int v3 = (1 << 18 - v2) - 1;
        int v4 = ((int)(v >> v2 + 46)) & v3;
        return (((int)(v >> v2 + 15)) & v3) == (v4 == 0 ? 0x7FFFFFFF : v4 - 1);
    }

    public static final boolean l(long v) {
        int v1 = ((int)(3L & v)) & 1;
        int v2 = (1 << v1 + v1 + ((((int)(3L & v)) & 2) >> 1) * 3 + 13) - 1;
        int v3 = ((int)(v >> 33)) & v2;
        return (((int)(v >> 2)) & v2) == (v3 == 0 ? 0x7FFFFFFF : v3 - 1);
    }

    public static final long m(int v, int v1, int v2, int v3) {
        if(v1 < v || v3 < v2 || v < 0 || v2 < 0) {
            jld.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return jkq.g(v, v1, v2, v3);
    }

    public static long n(long v, int v1, int v2, int v3, int v4, int v5) {
        if((v5 & 1) != 0) {
            v1 = jkp.d(v);
        }
        if((v5 & 2) != 0) {
            v2 = jkp.b(v);
        }
        if((v5 & 4) != 0) {
            v3 = jkp.c(v);
        }
        if((v5 & 8) != 0) {
            v4 = jkp.a(v);
        }
        return jkp.m(v1, v2, v3, v4);
    }

    @Override
    public final String toString() {
        return jkp.f(this.a);
    }
}

