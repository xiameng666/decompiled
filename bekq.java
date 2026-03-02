public final class bekq {
    public final String a;
    private final String b;

    public bekq(String s, String s1) {
        ibuq.f(s1, "signOnRealmName");
        super();
        this.b = s;
        this.a = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bekq)) {
            return false;
        }
        return ibuq.m(this.b, ((bekq)object0).b) ? ibuq.m(this.a, ((bekq)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "CredentialConflict(username=" + this.b + ", signOnRealmName=" + this.a + ")";
    }
}

