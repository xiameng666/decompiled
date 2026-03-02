public final class buld implements bulf {
    public final hivl a;

    public buld(hivl hivl0) {
        ibuq.f(hivl0, "detailsPageResponse");
        super();
        this.a = hivl0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof buld) ? ibuq.m(this.a, ((buld)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        hivl hivl0 = this.a;
        if(((ProtoLiteMessage)hivl0).isImmutable()) {
            return ((ProtoLiteMessage)hivl0).s();
        }
        int v = hivl0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)hivl0).s();
            hivl0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "Success(detailsPageResponse=" + this.a + ")";
    }
}

