public final class ree {
    public long a;
    public long b;
    public int c;
    public long d;
    public final long e;
    public final long f;

    public ree() {
        this.a = 0L;
        this.b = 5000L;
        this.c = 0;
        this.d = 86400000L;
        this.e = 0L;
        this.f = 0L;
    }

    @Override
    public final String toString() {
        Double double0 = (double)0.0;
        return this.c <= 0 ? String.format("OperationScheduler.Options[backoff=%.1f+%.1f max=%.1f min=%.1f period=%.1f]", ((double)(((double)this.a) / 1000.0)), ((double)(((double)this.b) / 1000.0)), ((double)(((double)this.d) / 1000.0)), double0, double0) : String.format("OperationScheduler.Options[backoff=%.1f+%.1f+%.1f max=%.1f min=%.1f period=%.1f]", ((double)(((double)this.a) / 1000.0)), ((double)(((double)this.b) / 1000.0)), ((double)(((double)this.c) / 1000.0)), ((double)(((double)this.d) / 1000.0)), double0, double0);
    }
}

