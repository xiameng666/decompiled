public final class hvu {
    public static final long a(hwe hwe0) {
        return hvu.i(hwe0, false);
    }

    public static final long b(hwe hwe0) {
        return hvu.i(hwe0, true);
    }

    public static final boolean c(hwe hwe0) {
        return !hwe0.c() && !hwe0.h && hwe0.d;
    }

    public static final boolean d(hwe hwe0) {
        return !hwe0.h && hwe0.d;
    }

    public static final boolean e(hwe hwe0) {
        return !hwe0.c() && hwe0.h && !hwe0.d;
    }

    public static final boolean f(hwe hwe0) {
        return hwe0.h && !hwe0.d;
    }

    public static final boolean g(hwe hwe0, long v, long v1) {
        int v2 = 1;
        float f = Float.intBitsToFloat(((int)(hwe0.c >> 0x20)));
        float f1 = Float.intBitsToFloat(((int)(hwe0.c & 0xFFFFFFFFL)));
        float f2 = (float)(hwe0.i == 1);
        float f3 = Float.intBitsToFloat(((int)(v1 >> 0x20))) * f2;
        float f4 = Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))) * f2;
        int v3 = Float.compare(f, -f3) >= 0 ? 0 : 1;
        if(f1 <= ((float)(((int)(v & 0xFFFFFFFFL)))) + f4) {
            v2 = 0;
        }
        return (f > ((float)(((int)(v >> 0x20)))) + f3 ? 1 : 0) | v3 | (f1 < -f4 ? 1 : 0) | v2;
    }

    public static final boolean h(hwe hwe0) {
        return !hjz.g(hvu.i(hwe0, true), 0L);
    }

    private static final long i(hwe hwe0, boolean z) {
        return z || !hwe0.c() ? hjz.c(hwe0.c, hwe0.g) : 0L;
    }
}

