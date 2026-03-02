public final class fuie extends fuig {
    public final fryv a;
    public final frxs b;
    public final fryv c;
    public final frxs d;
    public final frxs e;
    public final frxs f;
    public final frxs g;
    public final fryk h;
    public final fryk i;

    public fuie() {
        this(null, null, null, 0x1FF);
    }

    public fuie(frxs frxs0, frxs frxs1, fryk fryk0, int v) {
        frxq frxq0 = (v & 2) == 0 ? null : new frxq(hll.a);
        frxq frxq1 = (v & 8) == 0 ? null : new frxq(hll.a);
        frxs frxs2 = (v & 16) == 0 ? frxs0 : new frxq(hll.c);
        frxs frxs3 = (v & 0x20) == 0 ? frxs1 : new frxq(hll.h);
        this(null, frxq0, null, frxq1, frxs2, frxs3, ((v & 0x40) == 0 ? null : new frxq(hll.h)), ((v & 0x80) == 0 ? fryk0 : null), null);
    }

    public fuie(fryv fryv0, frxs frxs0, fryv fryv1, frxs frxs1, frxs frxs2, frxs frxs3, frxs frxs4, fryk fryk0, fryk fryk1) {
        ibuq.f(frxs0, "titleColor");
        ibuq.f(frxs1, "subtitleColor");
        ibuq.f(frxs2, "headerBackgroundColor");
        ibuq.f(frxs3, "footerBackgroundColor");
        ibuq.f(frxs4, "photoBorderColor");
        super();
        this.a = fryv0;
        this.b = frxs0;
        this.c = fryv1;
        this.d = frxs1;
        this.e = frxs2;
        this.f = frxs3;
        this.g = frxs4;
        this.h = fryk0;
        this.i = fryk1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuie)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fuie)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fuie)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fuie)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((fuie)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((fuie)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((fuie)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((fuie)object0).g)) {
            return false;
        }
        return ibuq.m(this.h, ((fuie)object0).h) ? ibuq.m(this.i, ((fuie)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + this.b.hashCode()) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode()) * 0x1F;
        int v2 = this.h == null ? 0 : this.h.hashCode();
        fryk fryk0 = this.i;
        if(fryk0 != null) {
            v = fryk0.hashCode();
        }
        return (v1 + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "StudentId(title=" + this.a + ", titleColor=" + this.b + ", subtitle=" + this.c + ", subtitleColor=" + this.d + ", headerBackgroundColor=" + this.e + ", footerBackgroundColor=" + this.f + ", photoBorderColor=" + this.g + ", logo=" + this.h + ", photo=" + this.i + ")";
    }
}

