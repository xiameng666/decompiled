public final class fuhy {
    public final fuhq a;
    public final boolean b;
    public final fryv c;
    public final jjy d;
    public final frxs e;
    public final fryk f;
    public final dld g;
    public final fuhp h;
    public final fryv i;
    public final ibth j;
    private final dgg k;

    public fuhy(fuhq fuhq0, boolean z, fryv fryv0, jjy jjy0, frxs frxs0, fryk fryk0, dld dld0, fuhp fuhp0, fryv fryv1, ibth ibth0, int v) {
        if((v & 1) != 0) {
            fuhq0 = fuhq.a;
        }
        if((v & 4) != 0) {
            fryv0 = null;
        }
        if((v & 8) != 0) {
            jjy0 = new jjy(3);
        }
        if((v & 16) != 0) {
            frxs0 = null;
        }
        if((v & 0x20) != 0) {
            fryk0 = null;
        }
        if((v & 0x40) != 0) {
            dld0 = null;
        }
        if((v & 0x80) != 0) {
            fuhp0 = fuhp.b;
        }
        if((v & 0x200) != 0) {
            fryv1 = null;
        }
        ibuq.f(fuhq0, "buttonType");
        ibuq.f(fuhp0, "buttonSize");
        ibuq.f(ibth0, "onClick");
        super();
        this.a = fuhq0;
        this.b = ((int)z) | ((v & 2) == 0 ? 1 : 0) ^ 1;
        this.c = fryv0;
        this.d = jjy0;
        this.e = frxs0;
        this.f = fryk0;
        this.g = dld0;
        this.h = fuhp0;
        this.k = null;
        this.i = fryv1;
        this.j = ibth0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuhy)) {
            return false;
        }
        if(this.a != ((fuhy)object0).a) {
            return false;
        }
        if(this.b != ((fuhy)object0).b) {
            return false;
        }
        if(!ibuq.m(this.c, ((fuhy)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((fuhy)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((fuhy)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((fuhy)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((fuhy)object0).g)) {
            return false;
        }
        if(this.h != ((fuhy)object0).h) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        return ibuq.m(this.i, ((fuhy)object0).i) ? ibuq.m(this.j, ((fuhy)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((((this.a.hashCode() * 0x1F + (this.b ? 0x4CF : 0x4D5)) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.a)) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + this.h.hashCode();
        fryv fryv0 = this.i;
        if(fryv0 != null) {
            v = fryv0.hashCode();
        }
        return (v1 * 961 + v) * 0x1F + this.j.hashCode();
    }

    @Override
    public final String toString() {
        return "WalletButtonState(buttonType=" + this.a + ", isEnabled=" + this.b + ", text=" + this.c + ", textAlign=" + this.d + ", textColor=" + this.e + ", leadingIcon=" + this.f + ", contentPadding=" + this.g + ", buttonSize=" + this.h + ", interactionSource=null, leadingIconContentDescription=" + this.i + ", onClick=" + this.j + ")";
    }
}

