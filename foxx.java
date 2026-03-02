public final class foxx {
    public gfsx a;
    public boolean b;
    public byte c;
    public int d;
    private int e;

    public foxx() {
        throw null;
    }

    public foxx(byte[] arr_b) {
        this.a = gfqx.a;
    }

    public final foxy a() {
        if(this.c == 0x7F) {
            int v = this.d;
            if(v != 0) {
                return new foxy(v, this.e, this.a, this.b);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.d == 0) {
            stringBuilder0.append(" enablement");
        }
        if((this.c & 1) == 0) {
            stringBuilder0.append(" rateLimitPerSecond");
        }
        if((this.c & 2) == 0) {
            stringBuilder0.append(" recordMetricPerProcess");
        }
        if((this.c & 4) == 0) {
            stringBuilder0.append(" forceGcBeforeRecordMemory");
        }
        if((this.c & 8) == 0) {
            stringBuilder0.append(" captureDebugMetrics");
        }
        if((this.c & 16) == 0) {
            stringBuilder0.append(" captureMemoryInfo");
        }
        if((this.c & 0x20) == 0) {
            stringBuilder0.append(" recordMemoryPeriodically");
        }
        if((this.c & 0x40) == 0) {
            stringBuilder0.append(" randomizePeriodicMemoryMetricStartTime");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.e = v;
        this.c = (byte)(this.c | 1);
    }

    public final void c(boolean z) {
        this.d = z ? 3 : 2;
    }
}

