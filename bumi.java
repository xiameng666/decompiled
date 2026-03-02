public final class bumi implements bumj {
    public final hivx a;

    public bumi(hivx hivx0) {
        ibuq.f(hivx0, "storageManagerResponse");
        super();
        this.a = hivx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bumi) ? ibuq.m(this.a, ((bumi)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        hivx hivx0 = this.a;
        if(((ProtoLiteMessage)hivx0).isImmutable()) {
            return ((ProtoLiteMessage)hivx0).s();
        }
        int v = hivx0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)hivx0).s();
            hivx0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "Success(storageManagerResponse=" + this.a + ")";
    }
}

