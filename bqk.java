public final class bqk implements beo {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public bqk() {
        throw null;
    }

    public bqk(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public static beo a(beo beo0) {
        awd awd0 = (awd)beo0;
        return new bqk(awd0.a, awd0.b, awd0.c, awd0.d);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bqk) && Float.floatToIntBits(this.a) == Float.floatToIntBits(((bqk)object0).a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(((bqk)object0).b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(((bqk)object0).c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(((bqk)object0).d);
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ (((Float.floatToIntBits(this.a) ^ 1000003) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ Float.floatToIntBits(this.c)) * 1000003;
    }

    @Override
    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}

