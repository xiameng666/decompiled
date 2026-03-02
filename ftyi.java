public final class ftyi {
    public final fubd a;
    public final ftyn b;
    public final fryv c;
    public final fryv d;
    public final ftxs e;
    public final ftyl f;
    public final frxs g;
    public final boolean h;
    public final gged_interceptors i;
    public final ibth j;
    private final fryv k;
    private final fryv l;
    private final ftyo m;
    private final boolean n;
    private final int o;

    public ftyi(fubd fubd0, ftyn ftyn0, fryv fryv0, fryv fryv1, ftxs ftxs0, ftyl ftyl0, frxs frxs0, boolean z, gged_interceptors gged0, ibth ibth0) {
        ibuq.f(fubd0, "leadingElement");
        ibuq.f(ftyn0, "title");
        ibuq.f(ftxs0, "contentState");
        ibuq.f(gged0, "veLogMetadata");
        super();
        this.a = fubd0;
        this.k = null;
        this.b = ftyn0;
        this.c = fryv0;
        this.d = fryv1;
        this.l = null;
        this.e = ftxs0;
        this.f = ftyl0;
        this.g = frxs0;
        this.m = null;
        this.n = false;
        this.h = z;
        this.o = 0;
        this.i = gged0;
        this.j = ibth0;
    }

    public static ftyi a(ftyi ftyi0, fubd fubd0, ftyn ftyn0, fryv fryv0, fryv fryv1, ftxs ftxs0, ftyl ftyl0, frxs frxs0, boolean z, ibth ibth0, int v) {
        if((v & 1) != 0) {
            fubd0 = ftyi0.a;
        }
        if((v & 4) != 0) {
            ftyn0 = ftyi0.b;
        }
        if((v & 8) != 0) {
            fryv0 = ftyi0.c;
        }
        if((v & 16) != 0) {
            fryv1 = ftyi0.d;
        }
        ftxs ftxs1 = (v & 0x40) == 0 ? ftxs0 : ftyi0.e;
        gged_interceptors gged0 = (v & 0x2000) == 0 ? null : ftyi0.i;
        ibuq.f(fubd0, "leadingElement");
        ibuq.f(ftyn0, "title");
        ibuq.f(ftxs1, "contentState");
        ibuq.f(gged0, "veLogMetadata");
        return new ftyi(fubd0, ftyn0, fryv0, fryv1, ftxs1, ((v & 0x80) == 0 ? ftyl0 : ftyi0.f), ((v & 0x100) == 0 ? frxs0 : ftyi0.g), ((v & 0x800) == 0 ? z : ftyi0.h), gged0, ((v & 0x4000) == 0 ? ibth0 : ftyi0.j));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftyi)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftyi)object0).a)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftyi)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ftyi)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((ftyi)object0).d)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(this.e != ((ftyi)object0).e) {
            return false;
        }
        if(!ibuq.m(this.f, ((ftyi)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((ftyi)object0).g)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(this.h != ((ftyi)object0).h) {
            return false;
        }
        return ibuq.m(this.i, ((ftyi)object0).i) ? ibuq.m(this.j, ((ftyi)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((((this.a.hashCode() * 961 + this.b.hashCode()) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 961 + this.e.hashCode()) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : ((frxp)this.g).a)) * 961 + 0x4D5) * 0x1F + ftyh.a(this.h)) * 961 + this.i.hashCode()) * 0x1F;
        ibth ibth0 = this.j;
        if(ibth0 != null) {
            v = ibth0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "PassListItemState(leadingElement=" + this.a + ", superTitle=null, title=" + this.b + ", subtitle=" + this.c + ", tertiaryTitle=" + this.d + ", badgeLabel=null, contentState=" + this.e + ", sourceIconState=" + this.f + ", backgroundColor=" + this.g + ", trailingContent=null, isImportant=false, isLoading=" + this.h + ", veLogConst=0, veLogMetadata=" + this.i + ", onClick=" + this.j + ")";
    }
}

