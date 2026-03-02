public final class bvge {
    public final String a;
    public final ibts b;
    private final cmhx c;

    public bvge(String s, ibts ibts0, cmhx cmhx0) {
        ibuq.f(s, "title");
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
        if(!(object0 instanceof bvge)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bvge)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bvge)object0).b) ? ibuq.m(this.c, ((bvge)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ManageGoogleAccountButtonUiModel(title=" + this.a + ", onClick=" + this.b + ", veConfig=" + this.c + ")";
    }
}

