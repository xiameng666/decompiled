public final class fufv {
    public final ibth a;

    public fufv() {
        this(null);
    }

    public fufv(ibth ibth0) {
        this.a = ibth0;
    }

    public fufv(byte[] arr_b) {
        this(null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fufv) ? ibuq.m(this.a, ((fufv)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "VeLogInteraction(logTap=" + this.a + ")";
    }
}

