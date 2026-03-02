public final class fugr extends fugv {
    public final fujl a;

    public fugr(fujl fujl0) {
        this.a = fujl0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fugr) ? ibuq.m(this.a, ((fugr)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Card(card=" + this.a + ")";
    }
}

