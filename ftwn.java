public final class ftwn {
    public final fryv a;
    public final ftwo b;

    public ftwn() {
        this(null);
    }

    public ftwn(fryv fryv0, ftwo ftwo0) {
        ibuq.f(ftwo0, "type");
        super();
        this.a = fryv0;
        this.b = ftwo0;
    }

    public ftwn(byte[] arr_b) {
        this(null, ftwo.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftwn)) {
            return false;
        }
        return ibuq.m(this.a, ((ftwn)object0).a) ? this.b == ((ftwn)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() : this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "DisclaimerState(text=" + this.a + ", type=" + this.b + ")";
    }
}

