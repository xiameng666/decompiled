public final class fuaz extends fubd {
    public final fryk a;
    public final frxs b;
    public final fryv c;
    public final fuaw d;
    public final frxs e;

    public fuaz(fryk fryk0, frxs frxs0, fryv fryv0, fuaw fuaw0) {
        ibuq.f(fuaw0, "variant");
        this(fryk0, frxs0, fryv0, fuaw0, 16);
    }

    public fuaz(fryk fryk0, frxs frxs0, fryv fryv0, fuaw fuaw0, int v) {
        if((v & 8) != 0) {
            fuaw0 = fuaw.a;
        }
        this(fryk0, ((v & 2) == 0 ? frxs0 : null), ((v & 4) == 0 ? fryv0 : null), fuaw0, new frxq(hll.h));
    }

    public fuaz(fryk fryk0, frxs frxs0, fryv fryv0, fuaw fuaw0, frxs frxs1) {
        ibuq.f(fryk0, "icon");
        ibuq.f(fuaw0, "variant");
        super();
        this.a = fryk0;
        this.b = frxs0;
        this.c = fryv0;
        this.d = fuaw0;
        this.e = frxs1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuaz)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fuaz)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fuaz)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fuaz)object0).c)) {
            return false;
        }
        return this.d == ((fuaz)object0).d ? ibuq.m(this.e, ((fuaz)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        fryv fryv0 = this.c;
        if(fryv0 != null) {
            v1 = fryv0.hashCode();
        }
        return (((v + v2) * 0x1F + v1) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "Icon(icon=" + this.a + ", tint=" + this.b + ", contentDescription=" + this.c + ", variant=" + this.d + ", backgroundColor=" + this.e + ")";
    }
}

