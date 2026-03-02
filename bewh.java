public final class bewh {
    public final bedo a;
    public final String b;
    public final String c;
    public final String d;

    public bewh(bedo bedo0, String s, String s1, String s2) {
        ibuq.f(s1, "password");
        super();
        this.a = bedo0;
        this.b = s;
        this.c = s1;
        this.d = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bewh)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bewh)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bewh)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((bewh)object0).c) ? ibuq.m(this.d, ((bewh)object0).d) : false;
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
        return "ImportableCredential(origin=" + this.a + ", username=" + this.b + ", password=" + this.c + ", note=" + this.d + ")";
    }
}

