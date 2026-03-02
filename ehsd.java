import java.io.Serializable;

public final class ehsd implements Serializable {
    public final long a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final gged_interceptors h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    private final long n;

    public ehsd() {
        throw null;
    }

    public ehsd(long v, long v1, long v2, boolean z, long v3, long v4, long v5, long v6, gged_interceptors gged0, long v7, boolean z1, boolean z2, boolean z3, long v8) {
        this.a = v;
        this.n = v1;
        this.b = v2;
        this.c = z;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = gged0;
        this.i = v7;
        this.j = z1;
        this.k = z2;
        this.l = z3;
        this.m = v8;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehsd) && this.a == ((ehsd)object0).a && this.n == ((ehsd)object0).n && this.b == ((ehsd)object0).b && this.c == ((ehsd)object0).c && this.d == ((ehsd)object0).d && this.e == ((ehsd)object0).e && this.f == ((ehsd)object0).f && this.g == ((ehsd)object0).g && ggia.i(this.h, ((ehsd)object0).h) && this.i == ((ehsd)object0).i && this.j == ((ehsd)object0).j && this.k == ((ehsd)object0).k && this.l == ((ehsd)object0).l && this.m == ((ehsd)object0).m;
    }

    @Override
    public final int hashCode() {
        int v = ((((((((((int)(this.a >>> 0x20 ^ this.a)) ^ 1000003) * 1000003 ^ ((int)(this.n >>> 0x20 ^ this.n))) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003 ^ (this.c ? 0x4CF : 0x4D5)) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ ((int)(this.e >>> 0x20 ^ this.e))) * 1000003 ^ ((int)(this.f >>> 0x20 ^ this.f))) * 1000003 ^ ((int)(this.g >>> 0x20 ^ this.g))) * 1000003 ^ this.h.hashCode();
        int v1 = this.j ? 0x4CF : 0x4D5;
        int v2 = this.k ? 0x4CF : 0x4D5;
        return this.l ? ((int)(this.m ^ this.m >>> 0x20)) ^ ((((v * 1000003 ^ ((int)(this.i ^ this.i >>> 0x20))) * 1000003 ^ v1) * 1000003 ^ v2) * 1000003 ^ 0x4CF) * 1000003 : ((int)(this.m ^ this.m >>> 0x20)) ^ ((((v * 1000003 ^ ((int)(this.i ^ this.i >>> 0x20))) * 1000003 ^ v1) * 1000003 ^ v2) * 1000003 ^ 0x4D5) * 1000003;
    }

    @Override
    public final String toString() {
        return "SnatchPostProcessingConfig{postProcessingLatencyMillis=" + this.a + ", bluetoothReinforceMaxMillis=" + this.n + ", bluetoothExclusionMaxMillis=" + this.b + ", excludeSndWithoutEscape=" + this.c + ", stillExclusionMinMillis=" + this.d + ", inVehicleLookbackWindowMinutes=" + this.e + ", inVehicleExclusionMinConfidence=" + this.f + ", minDurationBetweenAlertsMillis=" + this.g + ", escapeActivities=" + this.h + ", escapeMinConfidence=" + this.i + ", enableApConnectednessCheck=" + this.j + ", enablePostSnatchMotionAnalyzer=" + this.k + ", enableCustomEscapeDetection=" + this.l + ", enableSlowWalkExclusion=" + this.m + "}";
    }
}

