public final class fltn {
    public final gged_interceptors a;

    public fltn() {
        throw null;
    }

    public fltn(gged_interceptors gged0) {
        this.a = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fltn) ? ggia.i(this.a, ((fltn)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "GroupInfo{contactIds=" + this.a + "}";
    }
}

