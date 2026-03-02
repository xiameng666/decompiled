public final class fuch {
    public final fryv a;
    public final fryk b;

    public fuch() {
        this(null, null);
    }

    public fuch(fryv fryv0, fryk fryk0) {
        this.a = fryv0;
        this.b = fryk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuch)) {
            return false;
        }
        return ibuq.m(this.a, ((fuch)object0).a) ? ibuq.m(this.b, ((fuch)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        fryk fryk0 = this.b;
        if(fryk0 != null) {
            v = ((fryh)fryk0).a;
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "EmptyTileListState(body=" + this.a + ", icon=" + this.b + ")";
    }
}

