public final class dlpy extends dlpz {
    public final dxev a;

    public dlpy(dxev dxev0) {
        this.a = dxev0;
    }

    @Override  // frxf
    public final void a(du du0) {
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dlpy) ? ibuq.m(this.a, ((dlpy)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        dxev dxev0 = this.a;
        if(((ProtoLiteMessage)dxev0).isImmutable()) {
            return ((ProtoLiteMessage)dxev0).s();
        }
        int v = dxev0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)dxev0).s();
            dxev0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "ShowSuccessScreenUiEvent(paymentMethodData=" + this.a + ")";
    }
}

