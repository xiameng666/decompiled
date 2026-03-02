import android.util.Range;

public final class ave {
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Range i;
    public final boolean j;

    public ave() {
        throw null;
    }

    public ave(boolean z, int v, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, Range range0, boolean z6) {
        this.a = 0;
        this.b = z;
        this.c = v;
        this.d = z1;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        if(range0 == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.i = range0;
        this.j = z6;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ave) && this.b == ((ave)object0).b && this.c == ((ave)object0).c && this.d == ((ave)object0).d && this.e == ((ave)object0).e && this.f == ((ave)object0).f && this.g == ((ave)object0).g && this.h == ((ave)object0).h && this.i.equals(((ave)object0).i) && this.j == ((ave)object0).j;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = (((((((((this.b ? 0x4CF : 0x4D5) ^ 0xD5009D89) * 1000003 ^ this.c) * 1000003 ^ (this.d ? 0x4CF : 0x4D5)) * 1000003 ^ (this.e ? 0x4CF : 0x4D5)) * 1000003 ^ (this.f ? 0x4CF : 0x4D5)) * 1000003 ^ (this.g ? 0x4CF : 0x4D5)) * 1000003 ^ (this.h ? 0x4CF : 0x4D5)) * 1000003 ^ this.i.hashCode()) * 1000003;
        if(this.j) {
            v = 0x4CF;
        }
        return v1 ^ v;
    }

    @Override
    public final String toString() {
        return "FeatureSettings{getCameraMode=0, hasVideoCapture=" + this.b + ", getRequiredMaxBitDepth=" + this.c + ", isPreviewStabilizationOn=" + this.d + ", isUltraHdrOn=" + this.e + ", isHighSpeedOn=" + this.f + ", isFeatureComboInvocation=" + this.g + ", requiresFeatureComboQuery=" + this.h + ", getTargetFpsRange=" + this.i + ", isStrictFpsRequired=" + this.j + "}";
    }
}

