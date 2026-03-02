public final class fufz {
    public final fhxi a;
    public final fhvw b;

    public fufz(fhxi fhxi0, fhvw fhvw0) {
        ibuq.f(fhxi0, "composeVisualElements");
        ibuq.f(fhvw0, "interactionLogger");
        super();
        this.a = fhxi0;
        this.b = fhvw0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fufz)) {
            return false;
        }
        return ibuq.m(this.a, ((fufz)object0).a) ? ibuq.m(this.b, ((fufz)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "VeLogProviderState(composeVisualElements=" + this.a + ", interactionLogger=" + this.b + ")";
    }
}

