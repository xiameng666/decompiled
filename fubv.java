public final class fubv extends fuca {
    public final fryk a;
    public final fryv b;
    public final frxs c;
    public final fryv d;
    public final fuaw e;
    public final frxs f;
    private final frxs g;

    public fubv(fryk fryk0, fryv fryv0, frxs frxs0, fryv fryv1, fuaw fuaw0, int v) {
        if((v & 0x20) != 0) {
            fuaw0 = fuaw.a;
        }
        if((v & 16) != 0) {
            fryv1 = null;
        }
        if((v & 8) != 0) {
            frxs0 = null;
        }
        if((v & 2) != 0) {
            fryv0 = null;
        }
        frxq frxq0 = new frxq(hll.h);
        ibuq.f(fryk0, "icon");
        ibuq.f(fuaw0, "variant");
        super();
        this.a = fryk0;
        this.b = fryv0;
        this.g = null;
        this.c = frxs0;
        this.d = fryv1;
        this.e = fuaw0;
        this.f = frxq0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fubv)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fubv)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fubv)object0).b)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fubv)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((fubv)object0).d)) {
            return false;
        }
        return this.e == ((fubv)object0).e ? ibuq.m(this.f, ((fubv)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : ((fryr)this.b).a;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        fryv fryv0 = this.d;
        if(fryv0 != null) {
            v1 = fryv0.hashCode();
        }
        return ((((v + v2) * 961 + v3) * 0x1F + v1) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "Icon(icon=" + this.a + ", subtitle=" + this.b + ", subtitleColor=null, tint=" + this.c + ", contentDescription=" + this.d + ", variant=" + this.e + ", backgroundColor=" + this.f + ")";
    }
}

