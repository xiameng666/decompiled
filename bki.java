public final class bki {
    private final Object a;

    public bki() {
        throw null;
    }

    public bki(Object object0) {
        this.a = object0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof bki) ? this.a.equals(((bki)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "Identifier{value=" + this.a + "}";
    }
}

