public final class foup implements fort {
    public final float a;
    public final int b;
    public final gfsx c;
    private final int d;

    public foup() {
        throw null;
    }

    public foup(int v, float f, int v1, gfsx gfsx0) {
        this.d = v;
        this.a = f;
        this.b = v1;
        this.c = gfsx0;
    }

    @Override  // fort
    public final int a() {
        return 0x7FFFFFFF;
    }

    @Override  // fort
    public final boolean b() {
        return this.d == 1 || this.d == 3;
    }

    @Override  // fort
    public final void c() {
    }

    public static final fouo d() {
        fouo fouo0 = new fouo(null);
        fouo0.a = 100.0f;
        fouo0.d = 1;
        fouo0.b = 100;
        fouo0.c = 3;
        return fouo0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof foup)) {
            int v = this.d;
            int v1 = ((foup)object0).d;
            if(v != 0) {
                return v == v1 && Float.floatToIntBits(this.a) == Float.floatToIntBits(((foup)object0).a) && this.b == ((foup)object0).b && this.c.equals(((foup)object0).c);
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        foru.b(this.d);
        return (this.b ^ ((this.d ^ 1000003) * 1000003 ^ Float.floatToIntBits(this.a)) * 1000003) * 0xD5009D89 ^ 2040732332;
    }

    @Override
    public final String toString() {
        return "CrashConfigurations{enablement=" + foru.a(this.d) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=null, crashLoopListener=" + this.c + "}";
    }
}

