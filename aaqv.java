public final class aaqv extends aaqy {
    public final grxw a;

    public aaqv(grxw grxw0) {
        ibuq.f(grxw0, "screenKey");
        super();
        this.a = grxw0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof aaqv) ? ibuq.m(this.a, ((aaqv)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        grxw grxw0 = this.a;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            return ((ProtoLiteMessage)grxw0).s();
        }
        int v = grxw0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)grxw0).s();
            grxw0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "CardsScreenContent(screenKey=" + this.a + ")";
    }
}

