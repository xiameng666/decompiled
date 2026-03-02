public final class dlqh {
    public final dlqt a;

    public dlqh() {
        this(null);
    }

    public dlqh(dlqt dlqt0) {
        this.a = dlqt0;
    }

    public dlqh(byte[] arr_b) {
        this(dlqr.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dlqh) ? ibuq.m(this.a, ((dlqh)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AddBankAccountScreenState(phase=" + this.a + ")";
    }
}

