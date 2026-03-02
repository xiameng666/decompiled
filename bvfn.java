public final class bvfn {
    public final String a;
    public final ibts b;
    public final cmhx c;

    public bvfn(String s, ibts ibts0, cmhx cmhx0) {
        ibuq.f(s, "label");
        super();
        this.a = s;
        this.b = ibts0;
        this.c = cmhx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvfn)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bvfn)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bvfn)object0).b) ? ibuq.m(this.c, ((bvfn)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "CardButtonUiModel(label=" + this.a + ", action=" + this.b + ", veConfig=" + this.c + ")";
    }
}

