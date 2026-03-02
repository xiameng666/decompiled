public final class hluq {
    public final String a;

    public hluq() {
        throw null;
    }

    public hluq(String s) {
        ibuq.f(s, "canonicDeviceId");
        super();
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof hluq) ? ibuq.m(this.a, ((hluq)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "DeepLinkSpotIdentifier(canonicDeviceId=" + this.a + ")";
    }
}

