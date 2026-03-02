public final class flaf {
    private ggeo a;
    private long b;
    private long c;
    private long d;
    private byte e;

    public final flag a() {
        if(this.e == 7) {
            ggeo ggeo0 = this.a;
            if(ggeo0 != null) {
                return new flag(ggeo0, this.b, this.c, this.d);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" activeEventsWithDelaysMs");
        }
        if((this.e & 1) == 0) {
            stringBuilder0.append(" syncDurationMs");
        }
        if((this.e & 2) == 0) {
            stringBuilder0.append(" elapsedTimeBetweenLastSuccessfulAndCurrentSyncCompletionMs");
        }
        if((this.e & 4) == 0) {
            stringBuilder0.append(" elapsedTimeBetweenLastFailedAndCurrentSyncCompletionMs");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(ggeo ggeo0) {
        if(ggeo0 == null) {
            throw new NullPointerException("Null activeEventsWithDelaysMs");
        }
        this.a = ggeo0;
    }

    public final void c(long v) {
        this.d = v;
        this.e = (byte)(this.e | 4);
    }

    public final void d(long v) {
        this.c = v;
        this.e = (byte)(this.e | 2);
    }

    public final void e(long v) {
        this.b = v;
        this.e = (byte)(this.e | 1);
    }
}

