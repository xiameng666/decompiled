public final class fubz extends fuca {
    public final fryv a;
    public final fryv b;
    public final fucb c;
    public final boolean d;

    public fubz(fryv fryv0, fryv fryv1, fucb fucb0, int v) {
        if((v & 4) != 0) {
            fucb0 = fucb.a;
        }
        if((v & 2) != 0) {
            fryv1 = null;
        }
        this(fryv0, fryv1, fucb0, false);
    }

    public fubz(fryv fryv0, fryv fryv1, fucb fucb0, boolean z) {
        ibuq.f(fryv0, "title");
        ibuq.f(fucb0, "transactionStatus");
        super();
        this.a = fryv0;
        this.b = fryv1;
        this.c = fucb0;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fubz)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fubz)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fubz)object0).b)) {
            return false;
        }
        return this.c == ((fubz)object0).c ? this.d == ((fubz)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c.hashCode()) * 0x1F;
        return this.d ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        return "Transaction(title=" + this.a + ", subtitle=" + this.b + ", transactionStatus=" + this.c + ", isLargeText=" + this.d + ")";
    }
}

