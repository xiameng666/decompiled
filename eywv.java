public final class eywv {
    public final eyuk a;
    public final eyxg b;

    public eywv(eyuk eyuk0, eyxg eyxg0) {
        ibuq.f(eyuk0, "enrollmentUiState");
        ibuq.f(eyxg0, "screenLockSetUpUiState");
        super();
        this.a = eyuk0;
        this.b = eyxg0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eywv)) {
            return false;
        }
        return ibuq.m(this.a, ((eywv)object0).a) ? this.b == ((eywv)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "AssociatedScreenLockSetUpUiState(enrollmentUiState=" + this.a + ", screenLockSetUpUiState=" + this.b + ")";
    }
}

