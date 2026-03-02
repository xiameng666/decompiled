public final class bewj extends bewf {
    public final String a;
    public final String b;
    public final bewg c;

    public bewj(String s, String s1, bewg bewg0) {
        ibuq.f(s, "url");
        ibuq.f(bewg0, "failureReason");
        super();
        this.a = s;
        this.b = s1;
        this.c = bewg0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bewj)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bewj)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bewj)object0).b) ? this.c == ((bewj)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v * 0x1F + this.c.hashCode() : (v + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "NotImportableCredential(url=" + this.a + ", username=" + this.b + ", failureReason=" + this.c + ")";
    }
}

