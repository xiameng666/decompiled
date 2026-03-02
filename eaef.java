public final class eaef {
    public final dygo a;

    public eaef() {
        this(null);
    }

    public eaef(dygo dygo0) {
        this.a = dygo0;
    }

    public eaef(byte[] arr_b) {
        this(null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof eaef) ? this.a == ((eaef)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ProvisionOnboardTosScreenState(chipIssuer=" + this.a + ")";
    }
}

