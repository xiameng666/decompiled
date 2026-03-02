public final class ddxw {
    public final long a;
    public final long b;
    public final long c;
    private final long d;
    private final long e;

    public ddxw(long v, long v1, long v2, long v3, long v4) {
        this.d = v;
        this.a = v1;
        this.b = v2;
        this.e = v3;
        this.c = v4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ddxw)) {
            return false;
        }
        if(!ibog.c(this.d, ((ddxw)object0).d)) {
            return false;
        }
        if(!ibog.c(this.a, ((ddxw)object0).a)) {
            return false;
        }
        if(!ibog.c(this.b, ((ddxw)object0).b)) {
            return false;
        }
        return ibog.c(this.e, ((ddxw)object0).e) ? ibog.c(this.c, ((ddxw)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (((ibof.a(this.d) * 0x1F + ibof.a(this.a)) * 0x1F + ibof.a(this.b)) * 0x1F + ibof.a(this.e)) * 0x1F + ibof.a(this.c);
    }

    @Override
    public final String toString() {
        return "FixedColorScheme(primaryFixed=" + hll.g(this.d) + ", onTertiaryFixed=" + hll.g(this.a) + ", onTertiaryFixedVariant=" + hll.g(this.b) + ", tertiaryFixedDim=" + hll.g(this.e) + ", tertiaryFixed=" + hll.g(this.c) + ")";
    }
}

