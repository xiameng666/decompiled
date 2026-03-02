public final class hxk {
    public long a;
    public float b;

    public hxk(long v, float f) {
        this.a = v;
        this.b = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof hxk)) {
            return false;
        }
        return this.a == ((hxk)object0).a ? Float.compare(this.b, ((hxk)object0).b) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.a ^ this.a >>> 0x20)) * 0x1F + Float.floatToIntBits(this.b);
    }

    @Override
    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ')';
    }
}

