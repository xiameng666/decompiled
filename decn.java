public final class decn implements dcwb {
    public final dffg a;

    public decn(dffg dffg0) {
        ibuq.f(dffg0, "shareTargetItem");
        super();
        this.a = dffg0;
    }

    @Override  // dcwb
    public final icig a(dcmf dcmf0) {
        ibuq.f(dcmf0, "sharingClient");
        return new icht(new decm(this, dcmf0, null));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof decn) ? ibuq.m(this.a, ((decn)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AcceptTransferRequest(shareTargetItem=" + this.a + ")";
    }
}

