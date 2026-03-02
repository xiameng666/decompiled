public final class gprl {
    public gprk a;

    public static long a(gprk gprk0, int v, int v1, long v2, long v3, long v4, int v5, boolean z) {
        long v6 = gprl.i(v, v1);
        if(!z && !gprl.e(v, v1, v5) || v3 <= 0L) {
            return v4 + v6;
        }
        return v4 >= v2 || gprk0 == null || gprk0.c != v2 + v3 ? Math.max(v2 + ((long)(((double)v3) * 0.8)), v4 + v6) : gprk0.b;
    }

    public final gprk b(gpst gpst0, long v, long v1, long v2, long v3, int v4, int v5, boolean z) {
        int v6 = gpst0.a(v4).b;
        long v7 = this.a != null || z ? gprl.a(this.a, v6, v4, v1, v, v2, v5, z) : gprl.i(v6, v4) + v1;
        gprk gprk0 = new gprk(gpst0.a(v4), v7, v + v1, v3);
        this.a = gprk0;
        return gprk0;
    }

    public final void c() {
        this.a = null;
    }

    static boolean d(int v, int v1) {
        return gprl.h(v, v1) == 0;
    }

    public static boolean e(int v, int v1, int v2) {
        return gprl.d(v, v1) && gprl.g(v, v1) != 0 && v > v2;
    }

    private static int f(int v, int v1, int v2) {
        return v1 <= Integer.numberOfLeadingZeros(v) - 1 ? Math.min(v << v1, v2) : v2;
    }

    private static int g(int v, int v1) {
        return v1 != 0 || v < 3 ? v / 3 : v - 2;
    }

    private static int h(int v, int v1) {
        return v1 != 0 || v < 3 ? v % 3 : 0;
    }

    private static long i(int v, int v1) {
        int v2 = gprl.h(v, v1);
        if(v2 == 0) {
            int v3 = gprl.g(v, v1);
            if(v3 == 0) {
                return 0L;
            }
            switch(v1) {
                case 0: {
                    return 20000L;
                }
                case 2: {
                    return (long)gprl.f(1000, v3 - 1, 60000);
                }
                default: {
                    return (long)gprl.f(5000, v3 - 1, 20000);
                }
            }
        }
        if(v2 == 1 && v1 == 2) {
            return 0L;
        }
        return v1 == 2 ? 100L : 1000L;
    }
}

