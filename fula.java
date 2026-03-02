public final class fula implements fulf {
    public final fulb a;
    public final fryk b;
    public final fryv c;
    public final fryv d;
    public final fryv e;
    public final fryv f;
    public final boolean g;
    public final ibth h;
    public final int i;
    public final int j;
    public final long k;
    public final ibth l;
    public final ibth m;
    public final frxs n;
    public final fryv o;
    public fule p;
    public boolean q;

    public fula(fulb fulb0, fryk fryk0, fryv fryv0, fryv fryv1, fryv fryv2, boolean z, ibth ibth0, int v, int v1, long v2, ibth ibth1, frxs frxs0, fryv fryv3, fule fule0, boolean z1) {
        ibuq.f(fulb0, "variant");
        ibuq.f(fryk0, "icon");
        ibuq.f(fule0, "position");
        super();
        this.a = fulb0;
        this.b = fryk0;
        this.c = fryv0;
        this.d = fryv1;
        this.e = fryv2;
        this.f = null;
        this.g = z;
        this.h = ibth0;
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.l = ibth1;
        this.m = null;
        this.n = frxs0;
        this.o = fryv3;
        this.p = fule0;
        this.q = z1;
    }

    public fula(fulb fulb0, fryk fryk0, fryv fryv0, fryv fryv1, fryv fryv2, boolean z, ibth ibth0, int v, int v1, long v2, ibth ibth1, frxs frxs0, fryv fryv3, boolean z1, int v3) {
        this(fulb0, fryk0, fryv0, ((v3 & 8) == 0 ? fryv1 : null), ((v3 & 16) == 0 ? fryv2 : null), ((boolean)(((v3 & 0x40) == 0 ? 1 : 0) & ((int)z))), ((v3 & 0x80) == 0 ? ibth0 : null), ((v3 & 0x100) == 0 ? v : 0), ((v3 & 0x200) == 0 ? v1 : 0), ((v3 & 0x400) == 0 ? v2 : 0L), ((v3 & 0x800) == 0 ? ibth1 : null), ((v3 & 0x2000) == 0 ? frxs0 : null), ((v3 & 0x4000) == 0 ? fryv3 : null), ((0x8000 & v3) == 0 ? null : fule.a), ((boolean)(((v3 & 0x10000) == 0 ? 1 : 0) & ((int)z1))));
    }

    @Override  // fulf
    public final void a(fule fule0) {
        ibuq.f(fule0, "<set-?>");
        this.p = fule0;
    }

    @Override  // fulf
    public final void b() {
        this.q = true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fula)) {
            return false;
        }
        if(this.a != ((fula)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((fula)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fula)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((fula)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((fula)object0).e)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(this.g != ((fula)object0).g) {
            return false;
        }
        if(!ibuq.m(this.h, ((fula)object0).h)) {
            return false;
        }
        if(this.i != ((fula)object0).i) {
            return false;
        }
        if(this.j != ((fula)object0).j) {
            return false;
        }
        if(this.k != ((fula)object0).k) {
            return false;
        }
        if(!ibuq.m(this.l, ((fula)object0).l)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.n, ((fula)object0).n)) {
            return false;
        }
        if(!ibuq.m(this.o, ((fula)object0).o)) {
            return false;
        }
        return this.p == ((fula)object0).p ? this.q == ((fula)object0).q : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 961 + fukz.a(this.g)) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F + this.i) * 0x1F + this.j) * 0x1F + ((int)(this.k ^ this.k >>> 0x20))) * 0x1F;
        int v2 = this.l == null ? 0 : this.l.hashCode();
        int v3 = this.n == null ? 0 : this.n.hashCode();
        fryv fryv0 = this.o;
        if(fryv0 != null) {
            v = fryv0.hashCode();
        }
        return ((((v1 + v2) * 961 + v3) * 0x1F + v) * 0x1F + this.p.hashCode()) * 0x1F + fukz.a(this.q);
    }

    @Override
    public final String toString() {
        return "WalletTipState(variant=" + this.a + ", icon=" + this.b + ", title=" + this.c + ", body=" + this.d + ", actionText=" + this.e + ", bottomActionText=null, isDismissible=" + this.g + ", onDismiss=" + this.h + ", veLogConstWalletTip=" + this.i + ", veLogConstCloseButton=" + this.j + ", treatmentId=" + this.k + ", onClick=" + this.l + ", bottomActionOnClick=null, graphicImageContainerBackgroundColor=" + this.n + ", imageContentDescription=" + this.o + ", position=" + this.p + ", isContained=" + this.q + ")";
    }
}

