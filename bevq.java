public final class bevq extends bevs {
    public final bedg a;
    public final hhyo b;
    public final String c;

    public bevq(bedg bedg0, hhyo hhyo0, String s) {
        ibuq.f(bedg0, "credential");
        ibuq.f(hhyo0, "groupBrandingInfo");
        super();
        this.a = bedg0;
        this.b = hhyo0;
        this.c = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bevq)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bevq)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bevq)object0).b) ? ibuq.m(this.c, ((bevq)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        hhyo hhyo0 = this.b;
        if(((ProtoLiteMessage)hhyo0).isImmutable()) {
            return (v + ((ProtoLiteMessage)hhyo0).s()) * 0x1F + this.c.hashCode();
        }
        int v1 = hhyo0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)hhyo0).s();
            hhyo0.memoizedHashCode = v1;
        }
        return (v + v1) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "PasskeyEligibleCredential(credential=" + this.a + ", groupBrandingInfo=" + this.b + ", enrollUrl=" + this.c + ")";
    }
}

