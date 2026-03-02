public final class foxy implements fort {
    public final gfsx a;
    public final boolean b;
    private final int c;
    private final int d;

    public foxy() {
        throw null;
    }

    public foxy(int v, int v1, gfsx gfsx0, boolean z) {
        this.d = v;
        this.c = v1;
        this.a = gfsx0;
        this.b = z;
    }

    @Override  // fort
    public final int a() {
        return this.c;
    }

    @Override  // fort
    public final boolean b() {
        return this.d != 2;
    }

    @Override  // fort
    public final void c() {
    }

    public static foxx d() {
        foxx foxx0 = new foxx(null);
        foxx0.b(3);
        foxx0.a = gfqx.a;
        foxx0.b = true;
        foxx0.d = 1;
        foxx0.c = (byte)(foxx0.c | 0x7E);
        return foxx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof foxy)) {
            int v = this.d;
            int v1 = ((foxy)object0).d;
            if(v != 0) {
                return v == v1 && this.c == ((foxy)object0).c && this.a.equals(((foxy)object0).a) && this.b == ((foxy)object0).b;
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        foru.b(this.d);
        return this.b ? (((((((this.c ^ (this.d ^ 1000003) * 1000003) * 1000003 ^ 0x4D5) * 1000003 ^ 2040732332) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4CF) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5 : (((((((this.c ^ (this.d ^ 1000003) * 1000003) * 1000003 ^ 0x4D5) * 1000003 ^ 2040732332) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return "MemoryConfigurations{enablement=" + foru.a(this.d) + ", rateLimitPerSecond=" + this.c + ", recordMetricPerProcess=false, metricExtensionProvider=" + this.a + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=" + this.b + ", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }
}

