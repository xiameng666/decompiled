public final class ftxi implements fulf {
    public final fujl a;
    public final fryv b;
    public final fryv c;
    public final fryv d;
    public final fryv e;
    public final frxs f;
    public final fuca g;
    public final boolean h;
    public final boolean i;
    public final ibth j;
    public final ftxg k;
    public final int l;
    public final gged_interceptors m;
    public fule n;
    public boolean o;

    public ftxi(fujl fujl0, fryv fryv0, fryv fryv1, fryv fryv2, fryv fryv3, frxs frxs0, fuca fuca0, boolean z, boolean z1, ibth ibth0, ftxg ftxg0, int v, fule fule0, boolean z2, int v1) {
        ftxg ftxg1 = (v1 & 0x400) == 0 ? ftxg0 : ftxg.b;
        int v2 = 0;
        fryv fryv4 = null;
        gged_interceptors gged0 = (v1 & 0x1000) == 0 ? null : ggna.a;
        fule fule1 = (v1 & 0x2000) == 0 ? fule0 : fule.a;
        if((v1 & 4) == 0) {
            fryv4 = fryv1;
        }
        if((v1 & 0x4000) == 0) {
            v2 = 1;
        }
        this(fujl0, fryv0, fryv4, ((v1 & 8) == 0 ? fryv2 : null), ((v1 & 16) == 0 ? fryv3 : null), ((v1 & 0x20) == 0 ? frxs0 : null), ((v1 & 0x40) == 0 ? fuca0 : null), ((boolean)(((v1 & 0x80) == 0 ? 1 : 0) ^ 1 | ((int)z))), ((boolean)(((v1 & 0x100) == 0 ? 1 : 0) ^ 1 | ((int)z1))), ((v1 & 0x200) == 0 ? ibth0 : null), ftxg1, ((v1 & 0x800) == 0 ? v : 0), gged0, fule1, ((boolean)(v2 & ((int)z2))));
    }

    public ftxi(fujl fujl0, fryv fryv0, fryv fryv1, fryv fryv2, fryv fryv3, frxs frxs0, fuca fuca0, boolean z, boolean z1, ibth ibth0, ftxg ftxg0, int v, gged_interceptors gged0, fule fule0, boolean z2) {
        ibuq.f(fujl0, "card");
        ibuq.f(fryv0, "title");
        ibuq.f(ftxg0, "size");
        ibuq.f(gged0, "veMetadata");
        ibuq.f(fule0, "position");
        super();
        this.a = fujl0;
        this.b = fryv0;
        this.c = fryv1;
        this.d = fryv2;
        this.e = fryv3;
        this.f = frxs0;
        this.g = fuca0;
        this.h = z;
        this.i = z1;
        this.j = ibth0;
        this.k = ftxg0;
        this.l = v;
        this.m = gged0;
        this.n = fule0;
        this.o = z2;
    }

    @Override  // fulf
    public final void a(fule fule0) {
        ibuq.f(fule0, "<set-?>");
        this.n = fule0;
    }

    @Override  // fulf
    public final void b() {
        this.o = true;
    }

    public static ftxi c(ftxi ftxi0, fuca fuca0, ibth ibth0, fule fule0, boolean z, int v) {
        gged_interceptors gged0 = null;
        fujl fujl0 = (v & 1) == 0 ? null : ftxi0.a;
        fryv fryv0 = (v & 2) == 0 ? null : ftxi0.b;
        fryv fryv1 = (v & 4) == 0 ? null : ftxi0.c;
        fryv fryv2 = (v & 8) == 0 ? null : ftxi0.d;
        fryv fryv3 = (v & 16) == 0 ? null : ftxi0.e;
        frxs frxs0 = (v & 0x20) == 0 ? null : ftxi0.f;
        fuca fuca1 = (v & 0x40) == 0 ? fuca0 : ftxi0.g;
        int v1 = 0;
        boolean z1 = (v & 0x80) == 0 ? false : ftxi0.h;
        boolean z2 = (v & 0x100) == 0 ? false : ftxi0.i;
        ibth ibth1 = (v & 0x200) == 0 ? ibth0 : ftxi0.j;
        ftxg ftxg0 = (v & 0x400) == 0 ? null : ftxi0.k;
        if((v & 0x800) != 0) {
            v1 = ftxi0.l;
        }
        if((v & 0x1000) != 0) {
            gged0 = ftxi0.m;
        }
        fule fule1 = (v & 0x2000) == 0 ? fule0 : ftxi0.n;
        boolean z3 = (v & 0x4000) == 0 ? z : ftxi0.o;
        ibuq.f(fujl0, "card");
        ibuq.f(fryv0, "title");
        ibuq.f(ftxg0, "size");
        ibuq.f(gged0, "veMetadata");
        ibuq.f(fule1, "position");
        return new ftxi(fujl0, fryv0, fryv1, fryv2, fryv3, frxs0, fuca1, z1, z2, ibth1, ftxg0, v1, gged0, fule1, z3);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftxi)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftxi)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftxi)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ftxi)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((ftxi)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((ftxi)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((ftxi)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((ftxi)object0).g)) {
            return false;
        }
        if(this.h != ((ftxi)object0).h) {
            return false;
        }
        if(this.i != ((ftxi)object0).i) {
            return false;
        }
        if(!ibuq.m(this.j, ((ftxi)object0).j)) {
            return false;
        }
        if(this.k != ((ftxi)object0).k) {
            return false;
        }
        if(this.l != ((ftxi)object0).l) {
            return false;
        }
        if(!ibuq.m(this.m, ((ftxi)object0).m)) {
            return false;
        }
        return this.n == ((ftxi)object0).n ? this.o == ((ftxi)object0).o : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + ftxh.a(this.h)) * 0x1F + ftxh.a(this.i)) * 0x1F;
        ibth ibth0 = this.j;
        if(ibth0 != null) {
            v = ibth0.hashCode();
        }
        return (((((v1 + v) * 0x1F + this.k.hashCode()) * 0x1F + this.l) * 0x1F + this.m.hashCode()) * 0x1F + this.n.hashCode()) * 0x1F + ftxh.a(this.o);
    }

    @Override
    public final String toString() {
        return "FopRowState(card=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", subtitleChip=" + this.d + ", secondarySubtitle=" + this.e + ", secondarySubtitleColor=" + this.f + ", trailingElement=" + this.g + ", isActive=" + this.h + ", isInteractable=" + this.i + ", onClick=" + this.j + ", size=" + this.k + ", veLogConst=" + this.l + ", veMetadata=" + this.m + ", position=" + this.n + ", isContained=" + this.o + ")";
    }
}

