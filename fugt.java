public final class fugt extends fugv {
    public final fryk a;
    public final fryv b;
    public final frxs c;
    public final fugw d;
    public final frxs e;

    public fugt(fryk fryk0, fryv fryv0, frxs frxs0, fugw fugw0, int v) {
        if((v & 8) != 0) {
            fugw0 = fugw.a;
        }
        if((v & 4) != 0) {
            frxs0 = null;
        }
        this(fryk0, fryv0, frxs0, fugw0, new frxq(hll.h));
    }

    public fugt(fryk fryk0, fryv fryv0, frxs frxs0, fugw fugw0, frxs frxs1) {
        ibuq.f(fryk0, "icon");
        ibuq.f(fugw0, "variant");
        super();
        this.a = fryk0;
        this.b = fryv0;
        this.c = frxs0;
        this.d = fugw0;
        this.e = frxs1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fugt)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fugt)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fugt)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fugt)object0).c)) {
            return false;
        }
        return this.d == ((fugt)object0).d ? ibuq.m(this.e, ((fugt)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        frxs frxs0 = this.c;
        if(frxs0 != null) {
            v1 = frxs0.hashCode();
        }
        return (((v + v2) * 0x1F + v1) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "Icon(icon=" + this.a + ", contentDescription=" + this.b + ", tint=" + this.c + ", variant=" + this.d + ", backgroundColor=" + this.e + ")";
    }
}

