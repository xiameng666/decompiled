import java.util.Locale;

final class fxht {
    public final float a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final hfst e;
    public final boolean f;

    public fxht() {
        throw null;
    }

    public fxht(float f, boolean z, boolean z1, boolean z2, hfst hfst0, boolean z3) {
        this.a = f;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = hfst0;
        this.f = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fxht) && Float.floatToIntBits(this.a) == Float.floatToIntBits(((fxht)object0).a) && this.b == ((fxht)object0).b && this.c == ((fxht)object0).c && this.d == ((fxht)object0).d && ((ProtoLiteMessage)this.e).equals(((fxht)object0).e) && this.f == ((fxht)object0).f;
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = Float.floatToIntBits(this.a) ^ 1000003;
        hfst hfst0 = this.e;
        if(((ProtoLiteMessage)hfst0).isImmutable()) {
            v1 = ((ProtoLiteMessage)hfst0).s();
        }
        else {
            int v2 = hfst0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)hfst0).s();
                hfst0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        boolean z = this.b;
        int v3 = 0x4D5;
        int v4 = this.d ? 0x4CF : 0x4D5;
        int v5 = this.c ? 0x4CF : 0x4D5;
        if(this.f) {
            v3 = 0x4CF;
        }
        return ((((v * 1000003 ^ (z ? 0x4CF : 0x4D5)) * 1000003 ^ v5) * 1000003 ^ v4) * 1000003 ^ v1) * 1000003 ^ v3;
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.getDefault();
        Long long0 = hfyf.e(this.e);
        return String.format(locale0, "dEpicM=%f isLate=%b inA=%b inN=%b ltnc=%dms all=%b", ((float)this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), long0, Boolean.valueOf(this.f));
    }
}

