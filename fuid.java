public final class fuid extends fuig {
    public final fryv a;
    public final frxs b;

    public fuid() {
        this(null, 3);
    }

    public fuid(fryv fryv0, int v) {
        frxq frxq0 = new frxq(hll.a);
        if(1 == (v & 1)) {
            fryv0 = null;
        }
        this(fryv0, frxq0);
    }

    public fuid(fryv fryv0, frxs frxs0) {
        this.a = fryv0;
        this.b = frxs0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuid)) {
            return false;
        }
        return ibuq.m(this.a, ((fuid)object0).a) ? ibuq.m(this.b, ((fuid)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() : this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "MobileDriversLicense(title=" + this.a + ", titleColor=" + this.b + ")";
    }
}

