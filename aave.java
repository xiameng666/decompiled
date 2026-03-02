public final class aave {
    public final String a;
    public final long b;

    public aave(String s, long v) {
        ibuq.f(s, "accountName");
        super();
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof aave)) {
            return false;
        }
        return ibuq.m(this.a, ((aave)object0).a) ? this.b == ((aave)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + ((int)(this.b ^ this.b >>> 0x20));
    }

    @Override
    public final String toString() {
        return "PrewarmingState(accountName=" + this.a + ", timestamp=" + this.b + ")";
    }
}

