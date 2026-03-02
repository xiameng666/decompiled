public final class znx implements znu {
    public final gged_interceptors a;
    public final int b;

    public znx(gged_interceptors gged0, int v) {
        ibuq.f(gged0, "items");
        super();
        this.a = gged0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof znx)) {
            return false;
        }
        return ibuq.m(this.a, ((znx)object0).a) ? this.b == ((znx)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "ListPreview(items=" + this.a + ", total=" + this.b + ")";
    }
}

