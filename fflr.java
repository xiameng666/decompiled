public final class fflr {
    public final fflv a;
    public final Integer b;

    public fflr(Integer integer0, fflv fflv0) {
        this.a = fflv0;
        this.b = integer0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fflr) ? ((fflr)object0).b.equals(this.b) && ((fflr)object0).a.equals(this.a) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override
    public final String toString() {
        return ffmr.a(this.a.e.b) + ":" + fflv.a[((int)this.b)];
    }
}

