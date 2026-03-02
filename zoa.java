public final class zoa {
    public final gged_interceptors a;
    public final gged_interceptors b;

    public zoa(gged_interceptors gged0, gged_interceptors gged1) {
        ibuq.f(gged0, "items");
        ibuq.f(gged1, "footers");
        super();
        this.a = gged0;
        this.b = gged1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zoa)) {
            return false;
        }
        return ibuq.m(this.a, ((zoa)object0).a) ? ibuq.m(this.b, ((zoa)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Stack(items=" + this.a + ", footers=" + this.b + ")";
    }
}

