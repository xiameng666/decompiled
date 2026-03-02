public final class dxnb {
    public final boolean a;
    public final dsqo b;

    public dxnb() {
        this(null);
    }

    public dxnb(boolean z, dsqo dsqo0) {
        this.a = z;
        this.b = dsqo0;
    }

    public dxnb(byte[] arr_b) {
        this(false, new dsqo(0, null, 14));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dxnb)) {
            return false;
        }
        return this.a == ((dxnb)object0).a ? ibuq.m(this.b, ((dxnb)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode();
        return this.a ? 0x9511 + v : 0x95CB + v;
    }

    @Override
    public final String toString() {
        return "ConfirmPaymentScreenState(showLoadingScreen=" + this.a + ", detailState=" + this.b + ")";
    }
}

