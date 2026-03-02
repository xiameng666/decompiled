public final class cgr {
    public final ibts a;
    public final cii b;

    public cgr(ibts ibts0, cii cii0) {
        this.a = ibts0;
        this.b = cii0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cgr)) {
            return false;
        }
        return ibuq.m(this.a, ((cgr)object0).a) ? ibuq.m(this.b, ((cgr)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}

