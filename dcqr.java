public final class dcqr implements dcqt {
    public final dcsl a;
    public final icig b;

    public dcqr(dcsl dcsl0, icig icig0) {
        ibuq.f(dcsl0, "receiver");
        ibuq.f(icig0, "uploadStateFlow");
        super();
        this.a = dcsl0;
        this.b = icig0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dcqr)) {
            return false;
        }
        return ibuq.m(this.a, ((dcqr)object0).a) ? ibuq.m(this.b, ((dcqr)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ReceiverRegistered(receiver=" + this.a + ", uploadStateFlow=" + this.b + ")";
    }
}

