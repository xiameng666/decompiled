final class dxwq {
    public final fsvb a;
    public final ibtw b;

    public dxwq() {
        this(null, null, 3);
    }

    public dxwq(fsvb fsvb0, ibtw ibtw0) {
        ibuq.f(fsvb0, "proposal");
        super();
        this.a = fsvb0;
        this.b = ibtw0;
    }

    public dxwq(fsvb fsvb0, ibtw ibtw0, int v) {
        if((v & 1) != 0) {
            fsvb0 = fssm.a;
        }
        if((v & 2) != 0) {
            ibtw0 = null;
        }
        this(fsvb0, ibtw0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dxwq)) {
            return false;
        }
        return ibuq.m(this.a, ((dxwq)object0).a) ? ibuq.m(this.b, ((dxwq)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        fsvb fsvb0 = this.a;
        if(((ProtoLiteMessage)fsvb0).isImmutable()) {
            int v = ((ProtoLiteMessage)fsvb0).s();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }
        int v1 = fsvb0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)fsvb0).s();
            fsvb0.memoizedHashCode = v1;
        }
        return this.b == null ? v1 * 0x1F : v1 * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "WalletPageProposal(proposal=" + this.a + ", composable=" + this.b + ")";
    }
}

