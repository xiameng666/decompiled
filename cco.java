public final class cco {
    public final hel a;
    public final ibts b;
    public final cii c;
    private final boolean d;

    public cco(hel hel0, ibts ibts0, cii cii0) {
        this.a = hel0;
        this.b = ibts0;
        this.c = cii0;
        this.d = true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cco)) {
            return false;
        }
        if(!ibuq.m(this.a, ((cco)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((cco)object0).b) ? ibuq.m(this.c, ((cco)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + 0x4CF;
    }

    @Override
    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}

