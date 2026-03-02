public final class znr implements znu {
    public final gged_interceptors a;

    public znr(gged_interceptors gged0) {
        ibuq.f(gged0, "chips");
        super();
        this.a = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof znr) ? ibuq.m(this.a, ((znr)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ActionChips(chips=" + this.a + ")";
    }
}

