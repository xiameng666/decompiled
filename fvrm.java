public final class fvrm {
    private final long a;
    private final fvrp b;
    private long c;

    public fvrm(fvrp fvrp0, long v) {
        this.b = fvrp0;
        this.a = v;
        this.c = 0L;
    }

    public final long a(long v) {
        long v3;
        synchronized(this) {
            long v2 = Math.min(this.a - this.c, v);
            this.c = Math.min(this.c + v2, this.a);
            v3 = this.b.b(v2);
        }
        return v3;
    }
}

