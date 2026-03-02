public final class zht {
    public final zhv a;
    public final zhs b;
    public final String c;

    public zht(zhv zhv0, zhs zhs0, String s) {
        ibuq.f(s, "ariaLabel");
        super();
        this.a = zhv0;
        this.b = zhs0;
        this.c = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zht)) {
            return false;
        }
        if(!ibuq.m(this.a, ((zht)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((zht)object0).b) ? ibuq.m(this.c, ((zht)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ASLink(target=" + this.a + ", anchorParams=" + this.b + ", ariaLabel=" + this.c + ")";
    }
}

