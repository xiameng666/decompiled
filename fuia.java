public final class fuia extends fuig {
    private final fryv a;
    private final frxs b;

    public fuia() {
        frxq frxq0 = new frxq(hll.a);
        super();
        this.a = null;
        this.b = frxq0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuia)) {
            return false;
        }
        return ibuq.m(null, null) ? ibuq.m(this.b, ((fuia)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "CarKey(title=null, titleColor=" + this.b + ")";
    }
}

