public final class bvgr {
    public final String a;
    public final ibts b;
    public final cmhx c;
    private final awkv d;

    public bvgr(awkv awkv0, String s, ibts ibts0, cmhx cmhx0) {
        ibuq.f(awkv0, "id");
        ibuq.f(s, "title");
        super();
        this.d = awkv0;
        this.a = s;
        this.b = ibts0;
        this.c = cmhx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvgr)) {
            return false;
        }
        if(this.d != ((bvgr)object0).d) {
            return false;
        }
        if(!ibuq.m(this.a, ((bvgr)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bvgr)object0).b) ? ibuq.m(this.c, ((bvgr)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return ((this.d.hashCode() * 0x1F + this.a.hashCode()) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ServicesEntryUiModel(id=" + this.d + ", title=" + this.a + ", onClick=" + this.b + ", veConfig=" + this.c + ")";
    }
}

