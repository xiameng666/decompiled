public final class ehva {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;

    public ehva() {
        throw null;
    }

    public ehva(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, boolean z) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehva) && this.a == ((ehva)object0).a && this.b == ((ehva)object0).b && this.c == ((ehva)object0).c && this.d == ((ehva)object0).d && this.e == ((ehva)object0).e && this.f == ((ehva)object0).f && this.g == ((ehva)object0).g && this.h == ((ehva)object0).h && this.i == ((ehva)object0).i;
    }

    @Override
    public final int hashCode() {
        return this.i ? (this.h ^ (((((((this.a ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003 ^ this.g) * 1000003) * 1000003 ^ 0x4CF : (this.h ^ (((((((this.a ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003 ^ this.g) * 1000003) * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return "TrackingDetectionConfig{numMinSightingsForReporting=" + this.a + ", minTraveledDistanceForReportingMeters=" + this.b + ", minTraveledTimeForReportingMillis=" + this.c + ", minDistanceBetweenSightingsMeters=" + this.d + ", locationChangeMinLocAccuracyMeters=" + this.e + ", locationChangeDistanceMultiplierForHighError=" + this.f + ", locationChangeMinDistanceMeters=" + this.g + ", maxTimeBetweenBleAndLocationMillis=" + this.h + ", trackingDetectorLocationUpdateBugfix=" + this.i + "}";
    }
}

