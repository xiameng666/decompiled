public final class bevr extends bevs {
    public final bedg a;
    public final hhyo b;

    public bevr(bedg bedg0, hhyo hhyo0) {
        ibuq.f(bedg0, "credential");
        ibuq.f(hhyo0, "groupBrandingInfo");
        super();
        this.a = bedg0;
        this.b = hhyo0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bevr)) {
            return false;
        }
        return ibuq.m(this.a, ((bevr)object0).a) ? ibuq.m(this.b, ((bevr)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        hhyo hhyo0 = this.b;
        if(((ProtoLiteMessage)hhyo0).isImmutable()) {
            return v + ((ProtoLiteMessage)hhyo0).s();
        }
        int v1 = hhyo0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)hhyo0).s();
            hhyo0.memoizedHashCode = v1;
        }
        return v + v1;
    }

    @Override
    public final String toString() {
        return "PasskeyEnrolledCredential(credential=" + this.a + ", groupBrandingInfo=" + this.b + ")";
    }
}

