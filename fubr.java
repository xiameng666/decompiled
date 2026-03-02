public final class fubr extends fuca {
    public final fryv a;
    public final fryv b;
    private final frxs c;

    public fubr(fryv fryv0, fryv fryv1) {
        this.a = fryv0;
        this.b = fryv1;
        this.c = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fubr)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fubr)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((fubr)object0).b) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v * 0x1F : (v + this.b.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Balance(title=" + this.a + ", subtitle=" + this.b + ", color=null)";
    }
}

