public final class fudz {
    public final fryv a;
    public final fryv b;

    public fudz(fryv fryv0, fryv fryv1) {
        this.a = fryv0;
        this.b = fryv1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fudz)) {
            return false;
        }
        return ibuq.m(this.a, ((fudz)object0).a) ? ibuq.m(this.b, ((fudz)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "RouteConnection(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}

