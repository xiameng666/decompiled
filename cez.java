public final class cez {
    public final float a;
    public final long b;
    public final cii c;

    public cez(float f, long v, cii cii0) {
        this.a = f;
        this.b = v;
        this.c = cii0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cez)) {
            return false;
        }
        if(Float.compare(this.a, ((cez)object0).a) != 0) {
            return false;
        }
        return hnd.d(this.b, ((cez)object0).b) ? ibuq.m(this.c, ((cez)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 0x1F + hnc.a(this.b)) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + hnd.c(this.b) + ", animationSpec=" + this.c + ')';
    }
}

