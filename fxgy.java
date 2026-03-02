public final class fxgy {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final int j;
    public final boolean k;

    public fxgy() {
        throw null;
    }

    public fxgy(long v, boolean z, boolean z1, double f, double f1, double f2, double f3, double f4, double f5, int v1, boolean z2) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = f;
        this.e = f1;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = f5;
        this.j = v1;
        this.k = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fxgy) && this.a == ((fxgy)object0).a && this.b == ((fxgy)object0).b && this.c == ((fxgy)object0).c && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(((fxgy)object0).d) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(((fxgy)object0).e) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(((fxgy)object0).f) && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(((fxgy)object0).g) && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(((fxgy)object0).h) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(((fxgy)object0).i) && this.j == ((fxgy)object0).j && this.k == ((fxgy)object0).k;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.d) ^ Double.doubleToLongBits(this.d) >>> 0x20;
        long v1 = Double.doubleToLongBits(this.e) ^ Double.doubleToLongBits(this.e) >>> 0x20;
        long v2 = Double.doubleToLongBits(this.f) ^ Double.doubleToLongBits(this.f) >>> 0x20;
        long v3 = Double.doubleToLongBits(this.g) ^ Double.doubleToLongBits(this.g) >>> 0x20;
        long v4 = Double.doubleToLongBits(this.h) ^ Double.doubleToLongBits(this.h) >>> 0x20;
        long v5 = Double.doubleToLongBits(this.i) ^ Double.doubleToLongBits(this.i) >>> 0x20;
        int v6 = 0x4CF;
        int v7 = this.b ? 0x4CF : 0x4D5;
        long v8 = this.a;
        int v9 = this.c ? 0x4CF : 0x4D5;
        int v10 = this.j;
        if(!this.k) {
            v6 = 0x4D5;
        }
        return ((((((((((((int)(v8 >>> 0x20 ^ v8)) ^ 1000003) * 1000003 ^ v7) * 1000003 ^ v9) * 1000003 ^ ((int)v)) * 1000003 ^ ((int)v1)) * 1000003 ^ ((int)v2)) * 1000003 ^ ((int)v3)) * 1000003 ^ ((int)v4)) * 1000003 ^ ((int)v5)) * 1000003 ^ v10) * 1000003 ^ v6;
    }

    @Override
    public final String toString() {
        return "ShakeVettingHints{latestVibratorActivationTimestampMs=" + this.a + ", outlierAccel=" + this.b + ", spike=" + this.c + ", priorPhoneRollDegrees=" + this.d + ", priorPhonePitchDegrees=" + this.e + ", accelVarianceAverageThresholdM2s4=" + this.f + ", accelVarianceXThresholdM2s4=" + this.g + ", accelVarianceYThresholdM2s4=" + this.h + ", accelVarianceZThresholdM2s4=" + this.i + ", screenState=" + this.j + ", audioOn=" + this.k + "}";
    }
}

