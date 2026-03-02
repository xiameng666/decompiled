public final class fujt {
    public final fryv a;
    public final fujo b;
    public final ibth c;

    public fujt(fryv fryv0, fujo fujo0, ibth ibth0) {
        ibuq.f(fryv0, "title");
        ibuq.f(ibth0, "onClickListener");
        super();
        this.a = fryv0;
        this.b = fujo0;
        this.c = ibth0;
    }

    public fujt(ibth ibth0) {
        this(new fryu(""), null, ibth0);
    }

    public static fujt a(fujt fujt0, fryv fryv0, fujo fujo0, ibth ibth0, int v) {
        if((v & 1) != 0) {
            fryv0 = fujt0.a;
        }
        if((v & 2) != 0) {
            fujo0 = fujt0.b;
        }
        if((v & 4) != 0) {
            ibth0 = fujt0.c;
        }
        ibuq.f(fryv0, "title");
        ibuq.f(ibth0, "onClickListener");
        return new fujt(fryv0, fujo0, ibth0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fujt)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fujt)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((fujt)object0).b) ? ibuq.m(this.c, ((fujt)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v * 0x1F + this.c.hashCode() : (v + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "WalletChipState(title=" + this.a + ", leadingElement=" + this.b + ", onClickListener=" + this.c + ")";
    }
}

