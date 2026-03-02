public final class dlow {
    public final boolean a;
    public final String b;

    public dlow() {
        this(false, null);
    }

    public dlow(boolean z, String s) {
        this.a = z;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dlow)) {
            return false;
        }
        return this.a == ((dlow)object0).a ? ibuq.m(this.b, ((dlow)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b == null ? 0 : this.b.hashCode();
        return this.a ? 0x9511 + v : 0x95CB + v;
    }

    @Override
    public final String toString() {
        return "AccountLinkingParams(from3pIntent=" + this.a + ", vendorId=" + this.b + ")";
    }
}

