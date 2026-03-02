public final class dxrc extends dxrg {
    public final eagu a;

    public dxrc(eagu eagu0) {
        ibuq.f(eagu0, "provisionData");
        super();
        this.a = eagu0;
    }

    @Override  // frxf
    public final void a(du du0) {
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dxrc) ? ibuq.m(this.a, ((dxrc)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        eagu eagu0 = this.a;
        if(((ProtoLiteMessage)eagu0).isImmutable()) {
            return ((ProtoLiteMessage)eagu0).s();
        }
        int v = eagu0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)eagu0).s();
            eagu0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "ProvisionTopupFinished(provisionData=" + this.a + ")";
    }
}

