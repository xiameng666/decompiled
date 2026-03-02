public final class ces {
    public final cii a;
    private final float b;

    public ces(cii cii0) {
        this.b = 0.0f;
        this.a = cii0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ces)) {
            return false;
        }
        return Float.compare(0.0f, 0.0f) == 0 ? ibuq.m(this.a, ((ces)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(0.0f) * 0x1F + this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}

