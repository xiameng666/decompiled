public final class fwzl {
    public static final fwzl a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final fwzk g;
    public final fwzj h;

    static {
        fwzl.a = new fwzl(0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL, false, false, new fwzk(false, 0, 1), new fwzj(false, 0));
    }

    public fwzl(long v, long v1, long v2, boolean z, boolean z1, fwzk fwzk0, fwzj fwzj0) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = z;
        this.f = z1;
        this.g = fwzk0;
        this.h = fwzj0;
    }

    @Override
    public final String toString() {
        return "ScanEngineRequest: oneShot=" + this.e + ", intervalMs=" + this.b;
    }
}

