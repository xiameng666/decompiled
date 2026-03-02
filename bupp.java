public final class bupp implements bupq {
    public final hivr a;
    public final hivx b;
    public final hiwb c;

    public bupp(hivr hivr0, hivx hivx0, hiwb hiwb0) {
        ibuq.f(hivr0, "landingPageResponse");
        ibuq.f(hivx0, "storageManagerSignalsResponse");
        ibuq.f(hiwb0, "storageMeterResponse");
        super();
        this.a = hivr0;
        this.b = hivx0;
        this.c = hiwb0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bupp)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bupp)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bupp)object0).b) ? ibuq.m(this.c, ((bupp)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v2;
        int v;
        hivr hivr0 = this.a;
        if(((ProtoLiteMessage)hivr0).isImmutable()) {
            v = ((ProtoLiteMessage)hivr0).s();
        }
        else {
            int v1 = hivr0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)hivr0).s();
                hivr0.memoizedHashCode = v1;
            }
            v = v1;
        }
        hivx hivx0 = this.b;
        if(((ProtoLiteMessage)hivx0).isImmutable()) {
            v2 = ((ProtoLiteMessage)hivx0).s();
        }
        else {
            int v3 = hivx0.memoizedHashCode;
            if(v3 == 0) {
                v3 = ((ProtoLiteMessage)hivx0).s();
                hivx0.memoizedHashCode = v3;
            }
            v2 = v3;
        }
        hiwb hiwb0 = this.c;
        if(((ProtoLiteMessage)hiwb0).isImmutable()) {
            return (v * 0x1F + v2) * 0x1F + ((ProtoLiteMessage)hiwb0).s();
        }
        int v4 = hiwb0.memoizedHashCode;
        if(v4 == 0) {
            v4 = ((ProtoLiteMessage)hiwb0).s();
            hiwb0.memoizedHashCode = v4;
        }
        return (v * 0x1F + v2) * 0x1F + v4;
    }

    @Override
    public final String toString() {
        return "Success(landingPageResponse=" + this.a + ", storageManagerSignalsResponse=" + this.b + ", storageMeterResponse=" + this.c + ")";
    }
}

