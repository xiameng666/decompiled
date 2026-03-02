public final class bvgd {
    public final String a;
    public final bvgc b;

    public bvgd(String s, bvgc bvgc0) {
        ibuq.f(s, "title");
        super();
        this.a = s;
        this.b = bvgc0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvgd)) {
            return false;
        }
        return ibuq.m(this.a, ((bvgd)object0).a) ? ibuq.m(this.b, ((bvgd)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "HeaderUiModel(title=" + this.a + ", menuItems=" + this.b + ")";
    }
}

