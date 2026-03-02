public final class azjq {
    public final genu a;
    public final azki b;
    public final azii c;

    public azjq() {
        throw null;
    }

    public azjq(genu genu0, azki azki0, azii azii0) {
        if(genu0 == null) {
            throw new NullPointerException("Null systemProfile");
        }
        this.a = genu0;
        this.b = azki0;
        if(azii0 == null) {
            throw new NullPointerException("Null aggregateValue");
        }
        this.c = azii0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azjq) && ((ProtoLiteMessage)this.a).equals(((azjq)object0).a) && this.b.equals(((azjq)object0).b) && ((ProtoLiteMessage)this.c).equals(((azjq)object0).c);
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
        int v2 = (v ^ 1000003) * 1000003 ^ this.b.hashCode();
        azii azii0 = this.c;
        if(((ProtoLiteMessage)azii0).isImmutable()) {
            return ((ProtoLiteMessage)azii0).s() ^ v2 * 1000003;
        }
        int v3 = azii0.memoizedHashCode;
        if(v3 == 0) {
            v3 = ((ProtoLiteMessage)azii0).s();
            azii0.memoizedHashCode = v3;
        }
        return v3 ^ v2 * 1000003;
    }

    @Override
    public final String toString() {
        return "AggregateRecordAndSystemProfile{systemProfile=" + this.a.toString() + ", eventVector=" + this.b + ", aggregateValue=" + this.c.toString() + "}";
    }
}

