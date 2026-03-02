public final class fugs extends fugv {
    public final ftsr a;
    public final fryv b;

    public fugs() {
        this(null, null, 3);
    }

    public fugs(ftsr ftsr0, fryv fryv0) {
        ibuq.f(ftsr0, "productName");
        super();
        this.a = ftsr0;
        this.b = fryv0;
    }

    public fugs(ftsr ftsr0, fryv fryv0, int v) {
        if((v & 1) != 0) {
            ftsr0 = ftsr.b;
        }
        if((v & 2) != 0) {
            fryv0 = null;
        }
        this(ftsr0, fryv0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fugs)) {
            return false;
        }
        return this.a == ((fugs)object0).a ? ibuq.m(this.b, ((fugs)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + ((fryr)this.b).a;
    }

    @Override
    public final String toString() {
        return "GoogleWalletLogo(productName=" + this.a + ", logoContentDescription=" + this.b + ")";
    }
}

