public final class fuba extends fubd {
    public final fryk a;
    public final frxs b;
    public final fryv c;
    public final boolean d;
    private final frxs e;

    public fuba(fryk fryk0, frxs frxs0, fryv fryv0, boolean z) {
        ibuq.f(fryk0, "icon");
        super();
        this.a = fryk0;
        this.b = frxs0;
        this.e = null;
        this.c = fryv0;
        this.d = z;
    }

    public fuba(fryk fryk0, frxs frxs0, fryv fryv0, boolean z, int v) {
        if((v & 2) != 0) {
            frxs0 = null;
        }
        if((v & 8) != 0) {
            fryv0 = null;
        }
        this(fryk0, frxs0, fryv0, ((boolean)(((int)z) & ((v & 16) == 0 ? 1 : 0))));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuba)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fuba)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fuba)object0).b)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        return ibuq.m(this.c, ((fuba)object0).c) ? this.d == ((fuba)object0).d : false;
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
        return this.d ? ((v + v2) * 961 + v1) * 0x1F + 0x4CF : ((v + v2) * 961 + v1) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "IconInCircle(icon=" + this.a + ", tint=" + this.b + ", circleTint=null, contentDescription=" + this.c + ", isWide=" + this.d + ")";
    }
}

