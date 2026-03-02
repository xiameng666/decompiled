public final class epet {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public epet() {
        throw null;
    }

    public epet(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof epet) && this.a == ((epet)object0).a && this.b == ((epet)object0).b && this.c == ((epet)object0).c && this.d == ((epet)object0).d && this.e == ((epet)object0).e && this.f == ((epet)object0).f && this.g == ((epet)object0).g && this.h == ((epet)object0).h;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = this.a ? 0x4CF : 0x4D5;
        int v2 = this.b ? 0x4CF : 0x4D5;
        int v3 = this.c ? 0x4CF : 0x4D5;
        int v4 = this.d ? 0x4CF : 0x4D5;
        int v5 = this.e ? 0x4CF : 0x4D5;
        int v6 = this.f ? 0x4CF : 0x4D5;
        int v7 = this.g ? 0x4CF : 0x4D5;
        if(this.h) {
            v = 0x4CF;
        }
        return (((((((v1 ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v7) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "ElCapitanPreconditionInfo{googleDevice=" + this.a + ", platformAtLeastU=" + this.b + ", platformAtLeastV=" + this.c + ", jointPermissionEnabled=" + this.d + ", jointPermissionV2Enabled=" + this.e + ", setupWizard=" + this.f + ", preOtaElCapitanConsentV2=" + this.g + ", postOtaElCapitanConsentV2=" + this.h + "}";
    }
}

