public final class znt implements znu {
    public final gged_interceptors a;

    public znt(gged_interceptors gged0) {
        ibuq.f(gged0, "items");
        super();
        this.a = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof znt) ? ibuq.m(this.a, ((znt)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Attributes(items=" + this.a + ")";
    }
}

