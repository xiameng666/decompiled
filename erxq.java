public final class erxq {
    public final String a;
    public final String b;
    public final String c;
    public final clxk d;

    public erxq(String s, String s1, String s2, clxk clxk0) {
        ibuq.f(s, "title");
        ibuq.f(s1, "message");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = clxk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof erxq)) {
            return false;
        }
        if(!ibuq.m(this.a, ((erxq)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((erxq)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((erxq)object0).c) ? ibuq.m(this.d, ((erxq)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        return this.c == null ? v * 0x1F * 0x1F + this.d.hashCode() : (v * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "InlineWarningCardModel(title=" + this.a + ", message=" + this.b + ", iconContentDescriptor=" + this.c + ", actionButton=" + this.d + ")";
    }
}

