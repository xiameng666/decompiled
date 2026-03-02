public final class fuif extends fuig {
    public final fryv a;
    public final frxs b;
    public final fryv c;
    public final frxs d;
    public final fryk e;

    public fuif() {
        this(null, null, null, 0x1F);
    }

    public fuif(fryv fryv0, fryv fryv1, fryk fryk0, int v) {
        frxq frxq0 = (v & 2) == 0 ? null : new frxq(hll.a);
        if((v & 4) != 0) {
            fryv1 = null;
        }
        frxq frxq1 = (v & 8) == 0 ? null : new frxq(hll.a);
        if(1 == (v & 1)) {
            fryv0 = null;
        }
        if((v & 16) != 0) {
            fryk0 = null;
        }
        ibuq.f(frxq0, "titleColor");
        ibuq.f(frxq1, "subtitleColor");
        super();
        this.a = fryv0;
        this.b = frxq0;
        this.c = fryv1;
        this.d = frxq1;
        this.e = fryk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuif)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fuif)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fuif)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fuif)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((fuif)object0).d) ? ibuq.m(this.e, ((fuif)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + this.b.hashCode()) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + this.d.hashCode()) * 0x1F;
        fryk fryk0 = this.e;
        if(fryk0 != null) {
            v = fryk0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "UntokenizedFop(title=" + this.a + ", titleColor=" + this.b + ", subtitle=" + this.c + ", subtitleColor=" + this.d + ", logo=" + this.e + ")";
    }
}

