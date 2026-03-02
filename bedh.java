public final class bedh {
    public final gqmd a;
    public final hhyo b;

    public bedh() {
        throw null;
    }

    public bedh(gqmd gqmd0, hhyo hhyo0) {
        if(gqmd0 == null) {
            throw new NullPointerException("Null credentialGroup");
        }
        this.a = gqmd0;
        if(hhyo0 == null) {
            throw new NullPointerException("Null brandingInfo");
        }
        this.b = hhyo0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bedh) && this.a.equals(((bedh)object0).a) && ((ProtoLiteMessage)this.b).equals(((bedh)object0).b);
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        hhyo hhyo0 = this.b;
        if(((ProtoLiteMessage)hhyo0).isImmutable()) {
            return ((ProtoLiteMessage)hhyo0).s() ^ v * 1000003;
        }
        int v1 = hhyo0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)hhyo0).s();
            hhyo0.memoizedHashCode = v1;
        }
        return v1 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "CredentialGroupBrandingInfoPair{credentialGroup=" + this.a.toString() + ", brandingInfo=" + this.b.toString() + "}";
    }
}

