public final class aami extends aalp {
    public final grxw a;

    public aami() {
        throw null;
    }

    public aami(grxw grxw0) {
        if(grxw0 == null) {
            throw new NullPointerException("Null screenKey");
        }
        this.a = grxw0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof aami) ? ((ProtoLiteMessage)this.a).equals(((aami)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        grxw grxw0 = this.a;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            return ((ProtoLiteMessage)grxw0).s() ^ 1000003;
        }
        int v = grxw0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)grxw0).s();
            grxw0.memoizedHashCode = v;
        }
        return v ^ 1000003;
    }

    @Override
    public final String toString() {
        return "CardsScreenBlueprint{screenKey=" + this.a.toString() + "}";
    }
}

