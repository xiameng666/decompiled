public final class crk {
    public final float a;
    public final hlf b;

    public crk(float f, hlf hlf0) {
        this.a = f;
        this.b = hlf0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof crk)) {
            return false;
        }
        return jkv.c(this.a, ((crk)object0).a) ? ibuq.m(this.b, ((crk)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "BorderStroke(width=" + jkv.b(this.a) + ", brush=" + this.b + ')';
    }
}

