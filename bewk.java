public final class bewk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bewk(String s, String s1, String s2, String s3) {
        ibuq.f(s, "url");
        ibuq.f(s2, "password");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bewk)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bewk)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bewk)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((bewk)object0).c) ? ibuq.m(this.d, ((bewk)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c.hashCode()) * 0x1F;
        String s = this.d;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "ParsedCredential(url=" + this.a + ", username=" + this.b + ", password=" + this.c + ", note=" + this.d + ")";
    }
}

