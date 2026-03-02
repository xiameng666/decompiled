public final class dlpu extends dlpz {
    public final hkgq a;

    public dlpu(hkgq hkgq0) {
        this.a = hkgq0;
    }

    @Override  // frxf
    public final void a(du du0) {
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dlpu) ? ibuq.m(this.a, ((dlpu)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        hkgq hkgq0 = this.a;
        if(((ProtoLiteMessage)hkgq0).isImmutable()) {
            return ((ProtoLiteMessage)hkgq0).s();
        }
        int v = hkgq0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)hkgq0).s();
            hkgq0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "LaunchOrchestrationFlow(actionToken=" + this.a + ")";
    }
}

