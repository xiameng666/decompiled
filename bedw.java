public final class bedw extends bedz {
    public final String a;
    private final String b;

    public bedw(String s, String s1) {
        ibuq.f(s, "certificateHash");
        ibuq.f(s1, "packageName");
        super();
        this.b = s;
        this.a = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bedw)) {
            return false;
        }
        return ibuq.m(this.b, ((bedw)object0).b) ? ibuq.m(this.a, ((bedw)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "android://" + this.b + "@" + this.a + "/";
    }
}

