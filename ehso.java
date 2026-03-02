public final class ehso {
    public final long a;
    public final int b;
    public final float c;
    public final float d;
    public final String e;
    public final ehtb f;
    public final ehtb g;
    public final int h;

    public ehso() {
        throw null;
    }

    public ehso(long v, int v1, float f, float f1, int v2, String s, ehtb ehtb0, ehtb ehtb1) {
        this.a = v;
        this.b = v1;
        this.c = f;
        this.d = f1;
        this.h = v2;
        this.e = s;
        this.f = ehtb0;
        this.g = ehtb1;
    }

    public static ehsm a() {
        ehsm ehsm0 = new ehsm();
        ehsm0.c(0L);
        ehsm0.d(0);
        ehsm0.b(0.0f);
        ehsm0.e(0.0f);
        ehsm0.b = 1;
        ehsm0.a = "";
        ehsm0.g(new ehtb());
        ehsm0.f(new ehtb());
        return ehsm0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof ehso) && this.a == ((ehso)object0).a && this.b == ((ehso)object0).b && Float.floatToIntBits(this.c) == Float.floatToIntBits(((ehso)object0).c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(((ehso)object0).d)) {
            int v = this.h;
            int v1 = ((ehso)object0).h;
            if(v != 0) {
                return v == v1 && this.e.equals(((ehso)object0).e) && this.f.equals(((ehso)object0).f) && this.g.equals(((ehso)object0).g);
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ Float.floatToIntBits(this.c)) * 1000003 ^ Float.floatToIntBits(this.d);
        int v1 = this.h;
        if(v1 != 0) {
            return this.g.hashCode() ^ (((v * 1000003 ^ v1) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        return "DetectedSndEvent{eventTimeElapsedMillis=" + this.a + ", modelNumber=" + this.b + ", confidence=" + this.c + ", peakMagnitude=" + this.d + ", classificationResult=" + ehsn.a(this.h) + ", additionalInfo=" + this.e + ", prePeakFeatures=" + this.f + ", postPeakFeatures=" + this.g + "}";
    }
}

