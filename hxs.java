public final class hxs {
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public hxs(float f, float f1, long v, int v1) {
        this.a = f;
        this.b = f1;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof hxs) && ((hxs)object0).a == this.a && ((hxs)object0).b == this.b && ((hxs)object0).c == this.c && ((hxs)object0).d == this.d;
    }

    @Override
    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + ((int)(this.c ^ this.c >>> 0x20))) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ",deviceId=" + this.d + ')';
    }
}

