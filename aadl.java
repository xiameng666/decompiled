public final class aadl {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public aadl(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof aadl)) {
            return false;
        }
        if(!ibog.c(this.a, ((aadl)object0).a)) {
            return false;
        }
        if(!ibog.c(this.b, ((aadl)object0).b)) {
            return false;
        }
        if(!ibog.c(this.c, ((aadl)object0).c)) {
            return false;
        }
        if(!ibog.c(this.d, ((aadl)object0).d)) {
            return false;
        }
        if(!ibog.c(this.e, ((aadl)object0).e)) {
            return false;
        }
        if(!ibog.c(this.f, ((aadl)object0).f)) {
            return false;
        }
        return ibog.c(this.g, ((aadl)object0).g) ? ibog.c(this.h, ((aadl)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        return ((((((ibof.a(this.a) * 0x1F + ibof.a(this.b)) * 0x1F + ibof.a(this.c)) * 0x1F + ibof.a(this.d)) * 0x1F + ibof.a(this.e)) * 0x1F + ibof.a(this.f)) * 0x1F + ibof.a(this.g)) * 0x1F + ibof.a(this.h);
    }

    @Override
    public final String toString() {
        return "AdviceSeverityColors(cardBackground=" + hll.g(this.a) + ", caretBackground=" + hll.g(this.b) + ", caretIcon=" + hll.g(this.c) + ", title=" + hll.g(this.d) + ", description=" + hll.g(this.e) + ", primaryButtonText=" + hll.g(this.f) + ", primaryButtonBackground=" + hll.g(this.g) + ", secondaryButtonText=" + hll.g(this.h) + ")";
    }
}

