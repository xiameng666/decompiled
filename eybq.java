public final class eybq {
    public final boolean a;
    public final exod b;
    public final boolean c;

    public eybq(boolean z, exod exod0, boolean z1) {
        ibuq.f(exod0, "rangingCapabilityInfo");
        super();
        this.a = z;
        this.b = exod0;
        this.c = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eybq)) {
            return false;
        }
        if(this.a != ((eybq)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((eybq)object0).b) ? this.c == ((eybq)object0).c : false;
    }

    @Override
    public final int hashCode() {
        exod exod0 = this.b;
        if(((ProtoLiteMessage)exod0).isImmutable()) {
            int v = ((ProtoLiteMessage)exod0).s();
            return (eybp.a(this.a) * 0x1F + v) * 0x1F + eybp.a(this.c);
        }
        int v1 = exod0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)exod0).s();
            exod0.memoizedHashCode = v1;
        }
        return (eybp.a(this.a) * 0x1F + v1) * 0x1F + eybp.a(this.c);
    }

    @Override
    public final String toString() {
        return "EnrollmentEnablementResult(requireUserConsent=" + this.a + ", rangingCapabilityInfo=" + this.b + ", shouldDowngrade=" + this.c + ")";
    }
}

