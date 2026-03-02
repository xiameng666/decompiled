public final class dxrf extends dxrg {
    public final dymg a;

    public dxrf(dymg dymg0) {
        ibuq.f(dymg0, "newBalance");
        super();
        this.a = dymg0;
    }

    @Override  // frxf
    public final void a(du du0) {
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dxrf) ? ibuq.m(this.a, ((dxrf)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        dymg dymg0 = this.a;
        if(((ProtoLiteMessage)dymg0).isImmutable()) {
            return ((ProtoLiteMessage)dymg0).s();
        }
        int v = dymg0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)dymg0).s();
            dymg0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "UpdateBalanceSuccess(newBalance=" + this.a + ")";
    }
}

