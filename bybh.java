public final class bybh {
    public final bxvs a;
    public final kvx b;
    public final kvi c;

    public bybh(bxvs bxvs0, kvx kvx0, kvi kvi0) {
        ibuq.f(bxvs0, "requestInfo");
        ibuq.f(kvx0, "callingAppInfo");
        ibuq.f(kvi0, "beginGetCredentialRequest");
        super();
        this.a = bxvs0;
        this.b = kvx0;
        this.c = kvi0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bybh)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bybh)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bybh)object0).b) ? ibuq.m(this.c, ((bybh)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "InternalGetRequestInfo(requestInfo=" + this.a + ", callingAppInfo=" + this.b + ", beginGetCredentialRequest=" + this.c + ")";
    }
}

