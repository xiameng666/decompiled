final class fxhr {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final double e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    private final long j;

    public fxhr() {
        throw null;
    }

    public fxhr(long v, long v1, long v2, long v3, long v4, double f, long v5, long v6, long v7, long v8) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.j = v4;
        this.e = f;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fxhr) && this.a == ((fxhr)object0).a && this.b == ((fxhr)object0).b && this.c == ((fxhr)object0).c && this.d == ((fxhr)object0).d && this.j == ((fxhr)object0).j && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(((fxhr)object0).e) && this.f == ((fxhr)object0).f && this.g == ((fxhr)object0).g && this.h == ((fxhr)object0).h && this.i == ((fxhr)object0).i;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.i ^ this.i >>> 0x20)) ^ ((((((int)(Double.doubleToLongBits(this.e) ^ Double.doubleToLongBits(this.e) >>> 0x20)) ^ (((((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c))) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ ((int)(this.j >>> 0x20 ^ this.j))) * 1000003) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003 ^ ((int)(this.g ^ this.g >>> 0x20))) * 1000003 ^ ((int)(this.h ^ this.h >>> 0x20))) * 1000003;
    }

    @Override
    public final String toString() {
        return "AlertMessageHandlerParam{takeActionAlertThrottleMillis=" + this.a + ", nearbyNotificationThrottleMillis=" + this.b + ", occurredNotificationThrottleMillis=" + this.c + ", followupThrottleMillis=" + this.d + ", alertS2CellLevel=" + this.j + ", alertUiCutoffMag=" + this.e + ", maxAlertLatencyMillis=" + this.f + ", clockInversionToleranceMillis=" + this.g + ", farBoundaryM=" + this.h + ", maxFollowupDelayMillis=" + this.i + "}";
    }
}

