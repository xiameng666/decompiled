public final class bvfz {
    public final String a;
    public final cmeu b;
    public final cmhx c;
    public final ibts d;

    public bvfz(String s, cmeu cmeu0, cmhx cmhx0, ibts ibts0) {
        ibuq.f(s, "text");
        ibuq.f(cmeu0, "actionId");
        super();
        this.a = s;
        this.b = cmeu0;
        this.c = cmhx0;
        this.d = ibts0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvfz)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bvfz)object0).a)) {
            return false;
        }
        if(this.b != ((bvfz)object0).b) {
            return false;
        }
        return ibuq.m(this.c, ((bvfz)object0).c) ? ibuq.m(this.d, ((bvfz)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "DropdownMenuItemUiModel(text=" + this.a + ", actionId=" + this.b + ", veConfig=" + this.c + ", onClick=" + this.d + ")";
    }
}

