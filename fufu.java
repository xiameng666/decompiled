public final class fufu {
    public final fufj a;
    public final fryv b;

    public fufu(fufj fufj0, fryv fryv0) {
        this.a = fufj0;
        this.b = fryv0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fufu)) {
            return false;
        }
        return ibuq.m(this.a, ((fufu)object0).a) ? ibuq.m(this.b, ((fufu)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "TransactionStatusDateState(content=" + this.a + ", date=" + this.b + ")";
    }
}

