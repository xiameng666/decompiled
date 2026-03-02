public final class fuhn extends fuho {
    public final fryv a;
    public final fryv b;
    public final fryv c;
    public final fufu d;
    public final fujt e;
    public final boolean f;
    private final fryv g;

    public fuhn(fryv fryv0, fryv fryv1, fryv fryv2, fufu fufu0, fujt fujt0, boolean z) {
        this.a = fryv0;
        this.b = fryv1;
        this.c = fryv2;
        this.g = null;
        this.d = fufu0;
        this.e = fujt0;
        this.f = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuhn)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fuhn)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fuhn)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fuhn)object0).c)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.d, ((fuhn)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((fuhn)object0).e) ? this.f == ((fuhn)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        fujt fujt0 = this.e;
        if(fujt0 != null) {
            v1 = fujt0.hashCode();
        }
        return this.f ? ((((v + v2) * 0x1F + v3) * 961 + v4) * 0x1F + v1) * 0x1F + 0x4CF : ((((v + v2) * 0x1F + v3) * 961 + v4) * 0x1F + v1) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "Transaction(title=" + this.a + ", value=" + this.b + ", subtitle=" + this.c + ", body=null, transactionStatusDate=" + this.d + ", assistiveChip=" + this.e + ", shouldValueColorMatchStatusDate=" + this.f + ")";
    }
}

