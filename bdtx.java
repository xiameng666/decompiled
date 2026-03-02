public final class bdtx {
    public final String a;
    public final String b;

    public bdtx(String s, String s1) {
        ibuq.f(s, "origin");
        super();
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bdtx)) {
            return false;
        }
        return ibuq.m(this.a, ((bdtx)object0).a) ? ibuq.m(this.b, ((bdtx)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "UiCredential(origin=" + this.a + ", username=" + this.b + ")";
    }
}

