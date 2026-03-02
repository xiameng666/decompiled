public final class ehuw {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final long l;
    public final boolean m;
    private final long n;
    private final long o;

    public ehuw() {
        throw null;
    }

    public ehuw(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, boolean z, long v12, boolean z1) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.n = v5;
        this.f = v6;
        this.g = v7;
        this.h = v8;
        this.o = v9;
        this.i = v10;
        this.j = v11;
        this.k = z;
        this.l = v12;
        this.m = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehuw) && this.a == ((ehuw)object0).a && this.b == ((ehuw)object0).b && this.c == ((ehuw)object0).c && this.d == ((ehuw)object0).d && this.e == ((ehuw)object0).e && this.n == ((ehuw)object0).n && this.f == ((ehuw)object0).f && this.g == ((ehuw)object0).g && this.h == ((ehuw)object0).h && this.o == ((ehuw)object0).o && this.i == ((ehuw)object0).i && this.j == ((ehuw)object0).j && this.k == ((ehuw)object0).k && this.l == ((ehuw)object0).l && this.m == ((ehuw)object0).m;
    }

    @Override
    public final int hashCode() {
        int v = this.k ? 0x4CF : 0x4D5;
        long v1 = this.a >>> 0x20 ^ this.a;
        return this.m ? ((((((((((int)(this.f >>> 0x20 ^ this.f)) ^ ((((((((int)v1) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c))) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ ((int)(this.e >>> 0x20 ^ this.e))) * 1000003 ^ ((int)(this.n >>> 0x20 ^ this.n))) * 1000003) * 1000003 ^ ((int)(this.g >>> 0x20 ^ this.g))) * 1000003 ^ ((int)(this.h >>> 0x20 ^ this.h))) * 1000003 ^ ((int)(this.o >>> 0x20 ^ this.o))) * 1000003 ^ ((int)(this.i >>> 0x20 ^ this.i))) * 1000003 ^ ((int)(this.j >>> 0x20 ^ this.j))) * 1000003 ^ v) * 1000003 ^ ((int)(this.l >>> 0x20 ^ this.l))) * 1000003 ^ 0x4CF : ((((((((((int)(this.f >>> 0x20 ^ this.f)) ^ ((((((((int)v1) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c))) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ ((int)(this.e >>> 0x20 ^ this.e))) * 1000003 ^ ((int)(this.n >>> 0x20 ^ this.n))) * 1000003) * 1000003 ^ ((int)(this.g >>> 0x20 ^ this.g))) * 1000003 ^ ((int)(this.h >>> 0x20 ^ this.h))) * 1000003 ^ ((int)(this.o >>> 0x20 ^ this.o))) * 1000003 ^ ((int)(this.i >>> 0x20 ^ this.i))) * 1000003 ^ ((int)(this.j >>> 0x20 ^ this.j))) * 1000003 ^ v) * 1000003 ^ ((int)(this.l >>> 0x20 ^ this.l))) * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return "SignificantLocationChangeConfig{locationFastestIntervalMillis=" + this.a + ", locationChangeMinLocAccuracyMeters=" + this.b + ", locationChangeMinDistanceMeters=" + this.c + ", locationChangeMaxDistanceForStationaryMeters=" + this.d + ", locationChangeMinSightingsForStationary=" + this.e + ", locationChangeMaxLocAccuracyMeters=" + this.n + ", locationChangeDistanceMultiplierForHighError=" + this.f + ", locationChangeHighSpeedTravelThresholdKmh=" + this.g + ", locationChangeHighSpeedTravelMinTimeTraveledMillis=" + this.h + ", activityRecognitionUpdateIntervalMillis=" + this.o + ", minCountArStillForStationary=" + this.i + ", minDurationArStillForStationary=" + this.j + ", enableNoAlertZones=" + this.k + ", minutesInNoAlertZone=" + this.l + ", useConcurrentMapMotionLikelihoodEstimator=" + this.m + "}";
    }
}

