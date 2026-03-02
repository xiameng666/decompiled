public final class byap {
    public final Long a;
    public final int b;

    public byap(Long long0, int v) {
        this.a = long0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byap)) {
            return false;
        }
        return ibuq.m(this.a, ((byap)object0).a) ? this.b == ((byap)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b : this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "BiometricRequestInfo(opId=" + this.a + ", allowedAuthenticators=" + this.b + ")";
    }
}

