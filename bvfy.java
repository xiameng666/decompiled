public final class bvfy {
    public final String a;
    public final cmeu b;
    public final ibts c;

    public bvfy(String s, cmeu cmeu0, ibts ibts0) {
        ibuq.f(s, "text");
        ibuq.f(cmeu0, "actionId");
        super();
        this.a = s;
        this.b = cmeu0;
        this.c = ibts0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvfy)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bvfy)object0).a)) {
            return false;
        }
        return this.b == ((bvfy)object0).b ? ibuq.m(this.c, ((bvfy)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "DropdownMenuItem(text=" + this.a + ", actionId=" + this.b + ", onClick=" + this.c + ")";
    }
}

