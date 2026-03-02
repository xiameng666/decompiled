public final class azef {
    public final boolean a;
    public final double b;
    public final boolean c;

    public azef() {
        throw null;
    }

    public azef(boolean z, double f, boolean z1) {
        this.a = z;
        this.b = f;
        this.c = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azef) && this.a == ((azef)object0).a && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(((azef)object0).b) && this.c == ((azef)object0).c;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.b) ^ Double.doubleToLongBits(this.b) >>> 0x20;
        int v1 = 0x4D5;
        int v2 = this.a ? 0x4CF : 0x4D5;
        if(this.c) {
            v1 = 0x4CF;
        }
        return (((int)v) ^ (v2 ^ 1000003) * 1000003) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "SamplerResult{shouldLogEvent=" + this.a + ", appliedSamplingRate=" + this.b + ", includeSamplingRateOnLogEvent=" + this.c + "}";
    }
}

