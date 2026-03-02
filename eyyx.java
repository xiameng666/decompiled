public final class eyyx {
    public final eyyw a;
    public final eyuk b;

    public eyyx(eyyw eyyw0, eyuk eyuk0) {
        ibuq.f(eyuk0, "enrollmentUiState");
        super();
        this.a = eyyw0;
        this.b = eyuk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eyyx)) {
            return false;
        }
        return ibuq.m(this.a, ((eyyx)object0).a) ? ibuq.m(this.b, ((eyyx)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ExplanationUiState(primaryButtonUiState=" + this.a + ", enrollmentUiState=" + this.b + ")";
    }
}

