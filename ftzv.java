public final class ftzv implements fulf {
    public final fryv a;
    public final fryv b;
    public final fryv c;
    public final fubd d;
    public final fuca e;
    public final boolean f;
    public final ftzm g;
    public fule h;
    public boolean i;
    public final ibth j;
    public final int k;
    private final String l;

    public ftzv() {
        this(null, null, null, null, null, null, null, false, null, 0, null, 0xFFF);
    }

    public ftzv(fryv fryv0, fryv fryv1, fryv fryv2, fubd fubd0, fuca fuca0, ftzm ftzm0, fule fule0, boolean z, ibth ibth0, int v, String s, int v1) {
        this((1 == (v1 & 1) ? null : fryv0), ((v1 & 2) == 0 ? fryv1 : null), ((v1 & 4) == 0 ? fryv2 : null), ((v1 & 8) == 0 ? fubd0 : null), ((v1 & 16) == 0 ? fuca0 : null), false, ((v1 & 0x40) == 0 ? ftzm0 : ftzm.a), ((v1 & 0x80) == 0 ? fule0 : fule.a), ((boolean)(((v1 & 0x100) == 0 ? 1 : 0) & ((int)z))), ((v1 & 0x200) == 0 ? ibth0 : null), ((v1 & 0x400) == 0 ? v : 0), ((v1 & 0x800) == 0 ? s : null));
    }

    public ftzv(fryv fryv0, fryv fryv1, fryv fryv2, fubd fubd0, fuca fuca0, boolean z, ftzm ftzm0, fule fule0, boolean z1, ibth ibth0, int v, String s) {
        ibuq.f(ftzm0, "contentState");
        ibuq.f(fule0, "position");
        super();
        this.a = fryv0;
        this.b = fryv1;
        this.c = fryv2;
        this.d = fubd0;
        this.e = fuca0;
        this.f = z;
        this.g = ftzm0;
        this.h = fule0;
        this.i = z1;
        this.j = ibth0;
        this.k = v;
        this.l = s;
    }

    public ftzv(fryv fryv0, fryv fryv1, fubd fubd0, ftzm ftzm0, fule fule0) {
        ibuq.f(ftzm0, "contentState");
        ibuq.f(fule0, "position");
        this(fryv0, fryv1, null, fubd0, null, ftzm0, fule0, true, null, 0, null, 0xE00);
    }

    @Override  // fulf
    public final void a(fule fule0) {
        ibuq.f(fule0, "<set-?>");
        this.h = fule0;
    }

    @Override  // fulf
    public final void b() {
        this.i = true;
    }

    public static ftzv c(ftzv ftzv0, fryv fryv0, fubd fubd0, boolean z, fule fule0, boolean z1, ibth ibth0, int v) {
        fryv fryv1 = (v & 1) == 0 ? fryv0 : ftzv0.a;
        ftzm ftzm0 = null;
        fryv fryv2 = (v & 2) == 0 ? null : ftzv0.b;
        fryv fryv3 = (v & 4) == 0 ? null : ftzv0.c;
        fubd fubd1 = (v & 8) == 0 ? fubd0 : ftzv0.d;
        fuca fuca0 = (v & 16) == 0 ? null : ftzv0.e;
        boolean z2 = (v & 0x20) == 0 ? z : ftzv0.f;
        if((v & 0x40) != 0) {
            ftzm0 = ftzv0.g;
        }
        fule fule1 = (v & 0x80) == 0 ? fule0 : ftzv0.h;
        boolean z3 = (v & 0x100) == 0 ? z1 : ftzv0.i;
        ibuq.f(ftzm0, "contentState");
        ibuq.f(fule1, "position");
        return new ftzv(fryv1, fryv2, fryv3, fubd1, fuca0, z2, ftzm0, fule1, z3, ibth0, ftzv0.k, ftzv0.l);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftzv)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftzv)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftzv)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ftzv)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((ftzv)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((ftzv)object0).e)) {
            return false;
        }
        if(this.f != ((ftzv)object0).f) {
            return false;
        }
        if(this.g != ((ftzv)object0).g) {
            return false;
        }
        if(this.h != ((ftzv)object0).h) {
            return false;
        }
        if(this.i != ((ftzv)object0).i) {
            return false;
        }
        if(!ibuq.m(this.j, ((ftzv)object0).j)) {
            return false;
        }
        return this.k == ((ftzv)object0).k ? ibuq.m(this.l, ((ftzv)object0).l) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + ftzu.a(this.f)) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode()) * 0x1F + ftzu.a(this.i)) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F + this.k) * 0x1F;
        String s = this.l;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "RowPrimaryState(title=" + this.a + ", subtitle=" + this.b + ", tertiaryTitle=" + this.c + ", leadingElement=" + this.d + ", trailingElement=" + this.e + ", isSelected=" + this.f + ", contentState=" + this.g + ", position=" + this.h + ", isContained=" + this.i + ", onClick=" + this.j + ", veLogConst=" + this.k + ", tag=" + this.l + ")";
    }
}

