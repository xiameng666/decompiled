public final class fvtz {
    public final long a;
    public final long b;
    public final long c;
    public final fwyc d;
    public long e;
    public final boolean f;

    public fvtz(long v, long v1, long v2, boolean z, fwyc fwyc0) {
        this.a = v;
        this.c = v1;
        this.b = v2;
        this.f = z;
        this.d = fwyc0;
        this.e = 0x7FFFFFFFFFFFFFFFL;
    }

    public fvtz(fwyc fwyc0) {
        this(0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL, false, fwyc0);
    }

    public final int a() {
        long v = this.c;
        long v1 = 0L;
        if(v != 0L && v != 0x7FFFFFFFFFFFFFFFL) {
            long v2 = v / this.a;
            if(v2 != 1L) {
                v1 = Math.min(v2, 10L);
            }
            return (int)v1;
        }
        return 0;
    }

    public final long b(long v) {
        long v1 = this.a;
        if(v1 == 0x7FFFFFFFFFFFFFFFL) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return v == 0x8000000000000000L ? 0x8000000000000000L : v + v1;
    }

    public final void c(long v) {
        this.e = this.b(v);
    }

    public final boolean d() {
        return this.a() > 0;
    }

    public final boolean e() {
        return this.a < 0x7FFFFFFFFFFFFFFFL;
    }

    public final boolean f(long v) {
        return v >= this.e;
    }

    @Override
    public final String toString() {
        return "periodMillis: " + this.a + ", batchIntervalMillis: " + this.c + ", originalPeriodMillis: " + this.b;
    }
}

