public final class jkh {
    public static final jkh a;
    public final float b;
    public final float c;

    static {
        jkh.a = new jkh(1.0f, 0.0f);
    }

    public jkh() {
        this(1.0f, 0.0f);
    }

    public jkh(float f, float f1) {
        this.b = f;
        this.c = f1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jkh) ? this.b == ((jkh)object0).b && this.c == ((jkh)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) * 0x1F + Float.floatToIntBits(this.c);
    }

    @Override
    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.b + ", skewX=" + this.c + ')';
    }
}

