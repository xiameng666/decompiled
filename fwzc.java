public final class fwzc {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public fwzc() {
        throw null;
    }

    public fwzc(boolean z, boolean z1, int v, boolean z2, boolean z3, int v1, boolean z4, boolean z5) {
        this.a = z;
        this.b = z1;
        this.c = v;
        this.d = z2;
        this.e = z3;
        this.f = v1;
        this.g = z4;
        this.h = z5;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fwzc) && this.a == ((fwzc)object0).a && this.b == ((fwzc)object0).b && this.c == ((fwzc)object0).c && this.d == ((fwzc)object0).d && this.e == ((fwzc)object0).e && this.f == ((fwzc)object0).f && this.g == ((fwzc)object0).g && this.h == ((fwzc)object0).h;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = (((((((this.a ? 0x4CF : 0x4D5) ^ 1000003) * 1000003 ^ (this.b ? 0x4CF : 0x4D5)) * 1000003 ^ this.c) * 1000003 ^ (this.d ? 0x4CF : 0x4D5)) * 1000003 ^ (this.e ? 0x4CF : 0x4D5)) * 1000003 ^ this.f) * 1000003;
        int v2 = this.g ? 0x4CF : 0x4D5;
        if(this.h) {
            v = 0x4CF;
        }
        return (v1 ^ v2) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "ApOutlierDetectionMetadata{blockedLocation=" + this.a + ", inVehicle=" + this.b + ", numAps=" + this.c + ", usedCellEvidence=" + this.d + ", usedGpsEvidence=" + this.e + ", consecutiveBlockedLocations=" + this.f + ", hasPseudoGroundTruth=" + this.g + ", hasApConsistentWithPseudoGroundTruth=" + this.h + "}";
    }
}

