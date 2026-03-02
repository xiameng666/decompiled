public final class aztm {
    public final boolean a;
    public final bbdq b;
    public final azud c;
    public final int d;
    public final int e;
    public final hfkb f;
    public final boolean g;
    public final boolean h;

    public aztm() {
        throw null;
    }

    public aztm(boolean z, bbdq bbdq0, azud azud0, int v, int v1, hfkb hfkb0, boolean z1, boolean z2) {
        this.a = z;
        this.b = bbdq0;
        this.c = azud0;
        this.d = v;
        this.e = v1;
        this.f = hfkb0;
        this.g = z1;
        this.h = z2;
    }

    public final hfkb a() {
        return this.c == null ? this.f : this.c.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aztm) && this.a == ((aztm)object0).a && this.b.equals(((aztm)object0).b)) {
            azud azud0 = this.c;
            if(azud0 == null) {
                return ((aztm)object0).c == null ? this.d == ((aztm)object0).d && this.e == ((aztm)object0).e && ((ProtoLiteMessage)this.f).equals(((aztm)object0).f) && this.g == ((aztm)object0).g && this.h == ((aztm)object0).h : false;
            }
            return azud0.equals(((aztm)object0).c) ? this.d == ((aztm)object0).d && this.e == ((aztm)object0).e && ((ProtoLiteMessage)this.f).equals(((aztm)object0).f) && this.g == ((aztm)object0).g && this.h == ((aztm)object0).h : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v2;
        int v = 0x4CF;
        int v1 = (((((((this.a ? 0x4CF : 0x4D5) ^ 1000003) * 1000003 ^ 0x4D5) * 1000003 ^ this.b.hashCode()) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003;
        hfkb hfkb0 = this.f;
        if(((ProtoLiteMessage)hfkb0).isImmutable()) {
            v2 = ((ProtoLiteMessage)hfkb0).s();
        }
        else {
            int v3 = hfkb0.memoizedHashCode;
            if(v3 == 0) {
                v3 = ((ProtoLiteMessage)hfkb0).s();
                hfkb0.memoizedHashCode = v3;
            }
            v2 = v3;
        }
        int v4 = this.g ? 0x4CF : 0x4D5;
        if(!this.h) {
            v = 0x4D5;
        }
        return ((v1 ^ v2) * 1000003 ^ v4) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "ComplianceMetadata{dataWasForwardedFromClient=" + this.a + ", dataForwardingDenialExpected=false, processingProductId=" + this.b + ", policyEvaluationExemption=" + this.c + ", callerProductId=" + this.d + ", dataOwnerProductId=" + this.e + ", processingPurpose=" + this.f + ", isUserData=" + this.g + ", metadataIsPropagatedFromClient=" + this.h + "}";
    }
}

