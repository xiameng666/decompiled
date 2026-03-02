public final class dmfw extends dmgd {
    public final fsyk a;

    public dmfw(fsyk fsyk0) {
        this.a = fsyk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dmfw) ? ibuq.m(this.a, ((dmfw)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        fsyk fsyk0 = this.a;
        if(((ProtoLiteMessage)fsyk0).isImmutable()) {
            return ((ProtoLiteMessage)fsyk0).s();
        }
        int v = fsyk0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)fsyk0).s();
            fsyk0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "ClosedLoop(card=" + this.a + ")";
    }
}

