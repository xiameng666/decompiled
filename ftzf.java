public final class ftzf {
    public final fryv a;
    public final fryv b;
    public final ftze c;
    public final frxs d;

    public ftzf(fryv fryv0, fryv fryv1, ftze ftze0) {
        ibuq.f(ftze0, "iconStyle");
        super();
        this.a = fryv0;
        this.b = fryv1;
        this.c = ftze0;
        this.d = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftzf)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftzf)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftzf)object0).b)) {
            return false;
        }
        return this.c == ((ftzf)object0).c ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? (v * 0x1F + this.c.hashCode()) * 0x1F : ((v + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "LegState(origin=" + this.a + ", destination=" + this.b + ", iconStyle=" + this.c + ", textColor=null)";
    }
}

