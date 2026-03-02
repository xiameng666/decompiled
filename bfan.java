public final class bfan extends bfap {
    public final bewj a;

    public bfan(bewj bewj0) {
        this.a = bewj0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bfan) ? ibuq.m(this.a, ((bfan)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Invalid(notImportableCredential=" + this.a + ")";
    }
}

