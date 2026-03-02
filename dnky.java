public final class dnky {
    public final hkhl a;

    public dnky() {
        throw null;
    }

    public dnky(hkhl hkhl0) {
        ibuq.f(hkhl0, "instrumentOffer");
        super();
        this.a = hkhl0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dnky) ? ibuq.m(this.a, ((dnky)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        hkhl hkhl0 = this.a;
        if(((ProtoLiteMessage)hkhl0).isImmutable()) {
            return ((ProtoLiteMessage)hkhl0).s();
        }
        int v = hkhl0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)hkhl0).s();
            hkhl0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "StandardReward(instrumentOffer=" + this.a + ")";
    }
}

