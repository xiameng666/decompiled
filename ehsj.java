public final class ehsj extends ehsy {
    public final long a;
    public final float b;
    public final float c;
    public final float d;

    public ehsj() {
        throw null;
    }

    public ehsj(long v, float f, float f1, float f2) {
        this.a = v;
        this.b = f;
        this.c = f1;
        this.d = f2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehsj) && this.a == ((ehsj)object0).a && Float.floatToIntBits(this.b) == Float.floatToIntBits(((ehsj)object0).b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(((ehsj)object0).c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(((ehsj)object0).d);
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ (((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ Float.floatToIntBits(this.c)) * 1000003;
    }

    @Override
    public final String toString() {
        return "AccelSample{eventTimeElapsedMillis=" + this.a + ", x=" + this.b + ", y=" + this.c + ", z=" + this.d + "}";
    }
}

