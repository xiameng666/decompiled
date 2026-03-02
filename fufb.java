public final class fufb {
    public final boolean a;
    public final fryh b;
    public final fryv c;
    public final fryv d;
    public final fryv e;
    public final fryv f;
    public final fuek g;
    public final fucg h;
    public final fule i;
    public final ibth j;

    public fufb() {
        this(null, null, null, null, null, null, null, null, null, 0x3FF);
    }

    public fufb(fryh fryh0, fryv fryv0, fryv fryv1, fryv fryv2, fryv fryv3, fuek fuek0, fucg fucg0, fule fule0, ibth ibth0, int v) {
        if((v & 2) != 0) {
            fryh0 = new fryh(0);
        }
        fuek fuek1 = (v & 0x40) == 0 ? fuek0 : fuej.a;
        fule fule1 = (v & 0x100) == 0 ? fule0 : fule.a;
        ibth ibth1 = (v & 0x200) == 0 ? ibth0 : new fufa();
        this(1 == (v & 1), fryh0, ((v & 4) == 0 ? fryv0 : null), ((v & 8) == 0 ? fryv1 : null), ((v & 16) == 0 ? fryv2 : null), ((v & 0x20) == 0 ? fryv3 : null), fuek1, ((v & 0x80) == 0 ? fucg0 : null), fule1, ibth1);
    }

    public fufb(boolean z, fryh fryh0, fryv fryv0, fryv fryv1, fryv fryv2, fryv fryv3, fuek fuek0, fucg fucg0, fule fule0, ibth ibth0) {
        ibuq.f(fryh0, "startIcon");
        ibuq.f(fuek0, "endContentState");
        ibuq.f(fule0, "position");
        super();
        this.a = z;
        this.b = fryh0;
        this.c = fryv0;
        this.d = fryv1;
        this.e = fryv2;
        this.f = fryv3;
        this.g = fuek0;
        this.h = fucg0;
        this.i = fule0;
        this.j = ibth0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fufb)) {
            return false;
        }
        if(this.a != ((fufb)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((fufb)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fufb)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((fufb)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((fufb)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((fufb)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((fufb)object0).g)) {
            return false;
        }
        if(!ibuq.m(this.h, ((fufb)object0).h)) {
            return false;
        }
        return this.i == ((fufb)object0).i ? ibuq.m(this.j, ((fufb)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((((this.a ? 0x4CF : 0x4D5) * 0x1F + this.b.a) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + this.g.hashCode()) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F + this.i.hashCode()) * 0x1F;
        ibth ibth0 = this.j;
        if(ibth0 != null) {
            v = ibth0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "TileStandardState(enabled=" + this.a + ", startIcon=" + this.b + ", superTitleStart=" + this.c + ", titleStart=" + this.d + ", subtitle=" + this.e + ", secondarySubtitle=" + this.f + ", endContentState=" + this.g + ", actionButtonState=" + this.h + ", position=" + this.i + ", tileClickAction=" + this.j + ")";
    }
}

