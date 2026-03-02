public final class jjk {
    public final float a;

    public jjk(float f) {
        this.a = f;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof jjk) && Float.compare(this.a, ((jjk)object0).a) == 0;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    @Override
    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}

