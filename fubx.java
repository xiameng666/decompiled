public final class fubx extends fuca {
    public final boolean a;
    public final ibts b;

    public fubx(boolean z, ibts ibts0) {
        ibuq.f(ibts0, "onCheckedChange");
        super();
        this.a = z;
        this.b = ibts0;
    }

    public final fubx a() {
        return fubx.b(this, ((boolean)(this.a ^ 1)));
    }

    public static fubx b(fubx fubx0, boolean z) {
        ibuq.f(fubx0.b, "onCheckedChange");
        return new fubx(z, fubx0.b);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fubx)) {
            return false;
        }
        return this.a == ((fubx)object0).a ? ibuq.m(this.b, ((fubx)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode();
        return this.a ? 0x9511 + v : 0x95CB + v;
    }

    @Override
    public final String toString() {
        return "Switch(isChecked=" + this.a + ", onCheckedChange=" + this.b + ")";
    }
}

