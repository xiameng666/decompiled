public final class bppd {
    public final gsyz a;
    public final boolean b;

    public bppd() {
        throw null;
    }

    public bppd(gsyz gsyz0, boolean z) {
        if(gsyz0 == null) {
            throw new NullPointerException("Null canonicDeviceId");
        }
        this.a = gsyz0;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bppd) && ((ProtoLiteMessage)this.a).equals(((bppd)object0).a) && this.b == ((bppd)object0).b;
    }

    @Override
    public final int hashCode() {
        gsyz gsyz0 = this.a;
        if(((ProtoLiteMessage)gsyz0).isImmutable()) {
            int v = ((ProtoLiteMessage)gsyz0).s();
            return this.b ? 0x4CF ^ (v ^ 1000003) * 1000003 : 0x4D5 ^ (v ^ 1000003) * 1000003;
        }
        int v1 = gsyz0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)gsyz0).s();
            gsyz0.memoizedHashCode = v1;
        }
        return this.b ? 0x4CF ^ (v1 ^ 1000003) * 1000003 : 0x4D5 ^ (v1 ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "SecretRotationRequirements{canonicDeviceId=" + this.a.toString() + ", secretsRotationRequired=" + this.b + "}";
    }
}

