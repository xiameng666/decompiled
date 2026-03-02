public final class buxc {
    public final String a;
    public final String b;

    static {
        new buxc("", null);
    }

    public buxc(String s, String s1) {
        ibuq.f(s, "accountName");
        super();
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof buxc)) {
            return false;
        }
        return ibuq.m(this.a, ((buxc)object0).a) ? ibuq.m(this.b, ((buxc)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "AccountInfo(accountName=" + this.a + ", displayName=" + this.b + ")";
    }
}

