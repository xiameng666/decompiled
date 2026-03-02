public final class fuic extends fuig {
    public final fryv a;
    public final frxs b;
    public final frxs c;
    public final fryk d;
    private final fryv e;
    private final frxs f;
    private final fryk g;

    public fuic() {
        this(null, null, null, 0x7F);
    }

    public fuic(fryv fryv0, frxs frxs0, fryk fryk0, int v) {
        if((v & 2) != 0) {
            frxs0 = new frxq(hll.a);
        }
        frxq frxq0 = (v & 8) == 0 ? null : new frxq(hll.a);
        frxq frxq1 = (v & 16) == 0 ? null : new frxq(hll.h);
        if(1 == (v & 1)) {
            fryv0 = null;
        }
        if((v & 0x40) != 0) {
            fryk0 = null;
        }
        ibuq.f(frxs0, "titleColor");
        ibuq.f(frxq0, "subtitleColor");
        ibuq.f(frxq1, "footerBackgroundColor");
        super();
        this.a = fryv0;
        this.b = frxs0;
        this.e = null;
        this.f = frxq0;
        this.c = frxq1;
        this.g = null;
        this.d = fryk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuic)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fuic)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fuic)object0).b)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.f, ((fuic)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fuic)object0).c)) {
            return false;
        }
        return ibuq.m(null, null) ? ibuq.m(this.d, ((fuic)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((this.a == null ? 0 : this.a.hashCode()) * 0x1F + this.b.hashCode()) * 961 + this.f.hashCode()) * 0x1F + this.c.hashCode();
        fryk fryk0 = this.d;
        if(fryk0 != null) {
            v = fryk0.hashCode();
        }
        return v1 * 961 + v;
    }

    @Override
    public final String toString() {
        return "IDCard(title=" + this.a + ", titleColor=" + this.b + ", subtitle=null, subtitleColor=" + this.f + ", footerBackgroundColor=" + this.c + ", logo=null, photo=" + this.d + ")";
    }
}

