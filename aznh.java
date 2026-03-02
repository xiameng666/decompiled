final class aznh {
    public final genu a;
    public final azii b;

    public aznh() {
        throw null;
    }

    public aznh(genu genu0, azii azii0) {
        this.a = genu0;
        if(azii0 == null) {
            throw new NullPointerException("Null aggregateValue");
        }
        this.b = azii0;
    }

    static aznh a(azjq azjq0) {
        return new aznh(azjq0.a, azjq0.c);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aznh) && ((ProtoLiteMessage)this.a).equals(((aznh)object0).a) && ((ProtoLiteMessage)this.b).equals(((aznh)object0).b);
    }

    @Override
    public final int hashCode() {
        int v;
        genu genu0 = this.a;
        if(((ProtoLiteMessage)genu0).isImmutable()) {
            v = ((ProtoLiteMessage)genu0).s();
        }
        else {
            int v1 = genu0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)genu0).s();
                genu0.memoizedHashCode = v1;
            }
            v = v1;
        }
        azii azii0 = this.b;
        if(((ProtoLiteMessage)azii0).isImmutable()) {
            return ((ProtoLiteMessage)azii0).s() ^ (v ^ 1000003) * 1000003;
        }
        int v2 = azii0.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)azii0).s();
            azii0.memoizedHashCode = v2;
        }
        return v2 ^ (v ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "SystemProfileAndValue{systemProfile=" + this.a.toString() + ", aggregateValue=" + this.b.toString() + "}";
    }
}

