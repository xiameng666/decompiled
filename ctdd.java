public final class ctdd {
    public final ctdf a;
    public final ctde b;
    public final int c;

    public ctdd(ctdf ctdf0, ctde ctde0, int v) {
        ibuq.f(ctdf0, "accountType");
        ibuq.f(ctde0, "accountEnrollmentStatus");
        super();
        this.a = ctdf0;
        this.b = ctde0;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ctdd)) {
            return false;
        }
        if(this.a != ((ctdd)object0).a) {
            return false;
        }
        return this.b == ((ctdd)object0).b ? this.c == ((ctdd)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c;
    }

    @Override
    public final String toString() {
        return "AccountEnrollment(accountType=" + this.a + ", accountEnrollmentStatus=" + this.b + ", numDevices=" + this.c + ")";
    }
}

