final class jjm implements jkg {
    private final long a;

    public jjm(long v) {
        this.a = v;
        if(v != 16L) {
            return;
        }
        jie.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override  // jkg
    public final float a() {
        return hll.a(this.a);
    }

    @Override  // jkg
    public final long b() {
        return this.a;
    }

    @Override  // jkg
    public final hlf c() {
        return null;
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
        return (object0 instanceof jjm) ? ibog.c(this.a, ((jjm)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return ibof.a(this.a);
    }

    @Override
    public final String toString() {
        return "ColorStyle(value=" + hll.g(this.a) + ')';
    }
}

