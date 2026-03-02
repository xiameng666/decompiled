public final class hfke {
    public final int a;

    public hfke() {
        throw null;
    }

    public hfke(int v) {
        this.a = v;
    }

    public static hfke a(int v) {
        return new hfke(v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof hfke) ? this.a == ((hfke)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a ^ 1000003;
    }

    @Override
    public final String toString() {
        return a.a(Integer.toString(this.a - 1), "UnboxableCollectionBasis{collectionBasis=", "}");
    }
}

