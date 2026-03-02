public final class flag {
    public final ggeo a;
    public final long b;
    public final long c;
    public final long d;

    public flag() {
        throw null;
    }

    public flag(ggeo ggeo0, long v, long v1, long v2) {
        this.a = ggeo0;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    public static flaf a() {
        flaf flaf0 = new flaf();
        flaf0.b(ggnf.a);
        flaf0.e(0L);
        flaf0.d(0L);
        flaf0.c(0L);
        return flaf0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof flag) && this.a.equals(((flag)object0).a) && this.b == ((flag)object0).b && this.c == ((flag)object0).c && this.d == ((flag)object0).d;
    }

    @Override
    public final int hashCode() {
        return ((((int)(this.b ^ this.b >>> 0x20)) ^ (this.a.hashCode() ^ 1000003) * 1000003) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20));
    }

    @Override
    public final String toString() {
        return "SyncStats{activeEventsWithDelaysMs=" + this.a + ", syncDurationMs=" + this.b + ", elapsedTimeBetweenLastSuccessfulAndCurrentSyncCompletionMs=" + this.c + ", elapsedTimeBetweenLastFailedAndCurrentSyncCompletionMs=" + this.d + "}";
    }
}

