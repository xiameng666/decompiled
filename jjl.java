public final class jjl implements jkg {
    public final hms a;
    public final float b;

    public jjl(hms hms0, float f) {
        this.a = hms0;
        this.b = f;
    }

    @Override  // jkg
    public final float a() {
        return this.b;
    }

    @Override  // jkg
    public final long b() {
        return hll.i;
    }

    @Override  // jkg
    public final hlf c() {
        return this.a;
    }

    @Override  // jkg
    public final jkg d(jkg jkg0) {
        return jkd.a(this, jkg0);
    }

    @Override  // jkg
    public final jkg e(ibth ibth0) {
        return jkd.b(this, ibth0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jjl)) {
            return false;
        }
        return ibuq.m(this.a, ((jjl)object0).a) ? Float.compare(this.b, ((jjl)object0).b) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + Float.floatToIntBits(this.b);
    }

    @Override
    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ')';
    }
}

