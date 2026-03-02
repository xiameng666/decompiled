public final class fmln {
    public final gged_interceptors a;

    public fmln() {
        throw null;
    }

    public fmln(gged_interceptors gged0) {
        this.a = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fmln) ? ggia.i(this.a, ((fmln)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "HorizontalLayoutButtons{verticalLayoutButtons=" + this.a + "}";
    }
}

