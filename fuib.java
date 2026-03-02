public final class fuib extends fuig {
    public final fryv a;
    public final frxs b;

    public fuib() {
        this(null, 3);
    }

    public fuib(fryv fryv0, int v) {
        frxq frxq0 = new frxq(hll.a);
        if(1 == (v & 1)) {
            fryv0 = null;
        }
        this(fryv0, frxq0);
    }

    public fuib(fryv fryv0, frxs frxs0) {
        this.a = fryv0;
        this.b = frxs0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuib)) {
            return false;
        }
        return ibuq.m(this.a, ((fuib)object0).a) ? ibuq.m(this.b, ((fuib)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() : this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "CreditCard(title=" + this.a + ", titleColor=" + this.b + ")";
    }
}

