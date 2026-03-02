public final class bdi {
    public static final bdi a;
    public static final bdi b;
    public static final bdi c;
    public final long d;
    public final boolean e;
    public final boolean f;

    static {
        bdi.a = new bdi(false, 0L);
        bdi.b = new bdi(true, 500L);
        new bdi(true, 100L);
        bdi.c = new bdi(false, 0L, true);
    }

    private bdi(boolean z, long v) {
        this(z, v, false);
    }

    private bdi(boolean z, long v, boolean z1) {
        this.e = (int)z;
        this.d = v;
        if(z1) {
            kay.b(((boolean)(((int)z) ^ 1)), "shouldRetry must be false when completeWithoutFailure is set to true");
        }
        this.f = z1;
    }
}

