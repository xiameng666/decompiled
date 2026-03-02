public abstract class futo {
    long a;
    protected final futd b;

    public futo(futd futd0) {
        this.a = -1L;
        this.b = futd0;
    }

    public final long a() {
        futd futd0 = this.b;
        long v = futd0.H;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        if(futd0.m.a) {
            return v;
        }
        if(futd0.u.h()) {
            return futd0.H;
        }
        return futd0.M ? Math.max(0L, futd0.H - futo.c(futd0.B.a)) : Math.max(0L, futd0.H - futo.c(futd0.z.a));
    }

    protected final long b() {
        futd futd0 = this.b;
        long v = futd0.V;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        if(futd0.b() != 0x7FFFFFFFFFFFFFFFL) {
            if(futd0.m.a) {
                return fyaw.b(v, futd0.b());
            }
            v1 = Math.max(0L, futd0.b() - futo.c(futd0.z.a));
        }
        return fyaw.b(v, v1);
    }

    public static final long c(long v) {
        return v / 1000000L + 1500L;
    }

    public abstract futn d();

    protected static final boolean e(long v, long v1, long v2, long v3) {
        long v4 = 0x7FFFFFFFFFFFFFFFL;
        if(Long.compare(v, 0x7FFFFFFFFFFFFFFFL) != 0 && v1 != 0x7FFFFFFFFFFFFFFFL) {
            if(v1 >= 0L) {
                v4 = 0x8000000000000000L;
                if(v > v1 + 0x8000000000000000L) {
                    v4 = v - v1;
                }
            }
            else if(v < v1 + 0x7FFFFFFFFFFFFFFFL) {
                v4 = v - v1;
            }
            long v5 = Math.abs(v4);
            return v5 <= v2 / 2L && v5 <= v3 / 2L;
        }
        return false;
    }
}

