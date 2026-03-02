public final class azqr {
    public final boolean a;
    public final azqq b;

    public azqr(boolean z, azqq azqq0) {
        this.a = z;
        this.b = azqq0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof azqr)) {
            return false;
        }
        return this.a == ((azqr)object0).a ? ibuq.m(this.b, ((azqr)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b == null ? 0 : this.b.hashCode();
        return this.a ? 0x9511 + v : 0x95CB + v;
    }

    @Override
    public final String toString() {
        return "MaybeVerifySourceStampResult(allowed=" + this.a + ", sourceStampResult=" + this.b + ")";
    }
}

