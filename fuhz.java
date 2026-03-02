public final class fuhz extends fuig {
    public final fryk a;

    public fuhz(fryk fryk0) {
        this.a = fryk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fuhz) ? ibuq.m(this.a, ((fuhz)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Bank(icon=" + this.a + ")";
    }
}

