public final class cet {
    public final float a;
    public final float b;
    public final long c;

    public cet(float f, float f1, long v) {
        this.a = f;
        this.b = f1;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cet)) {
            return false;
        }
        if(Float.compare(this.a, ((cet)object0).a) != 0) {
            return false;
        }
        return Float.compare(this.b, ((cet)object0).b) == 0 ? this.c == ((cet)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
    }

    @Override
    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}

