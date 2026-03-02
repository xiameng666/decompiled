public final class ddbv {
    public final long a;
    public final long b;

    public ddbv(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ddbv)) {
            return false;
        }
        return ibog.c(this.a, ((ddbv)object0).a) ? ibog.c(this.b, ((ddbv)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return ibof.a(this.a) * 0x1F + ibof.a(this.b);
    }

    @Override
    public final String toString() {
        return "ColorPair(background=" + hll.g(this.a) + ", text=" + hll.g(this.b) + ")";
    }
}

