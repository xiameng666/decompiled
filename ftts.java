public final class ftts {
    public final fryv a;
    public final frxs b;
    public final boolean c;
    public final ftvc d;
    public final fryk e;
    public final ftva f;
    public final int g;
    public final gged_interceptors h;
    public final ibth i;
    public final ibth j;

    public ftts(fryv fryv0, frxs frxs0, boolean z, ftvc ftvc0, fryk fryk0, ftva ftva0, int v, gged_interceptors gged0, ibth ibth0, ibth ibth1) {
        ibuq.f(fryv0, "text");
        ibuq.f(ftvc0, "buttonStyle");
        ibuq.f(ftva0, "buttonContent");
        ibuq.f(gged0, "veLogMetadata");
        ibuq.f(ibth1, "onClick");
        super();
        this.a = fryv0;
        this.b = frxs0;
        this.c = z;
        this.d = ftvc0;
        this.e = fryk0;
        this.f = ftva0;
        this.g = v;
        this.h = gged0;
        this.i = ibth0;
        this.j = ibth1;
    }

    public ftts(fryv fryv0, frxs frxs0, boolean z, ftvc ftvc0, fryk fryk0, ftva ftva0, int v, gged_interceptors gged0, ibth ibth0, ibth ibth1, int v1) {
        ftts ftts0;
        ibth ibth3;
        fryv fryv1;
        ibth ibth2;
        ftvc ftvc1 = (v1 & 8) == 0 ? ftvc0 : ftvc.c;
        ftva ftva1 = (v1 & 0x20) == 0 ? ftva0 : ftva.a;
        int v2 = 0;
        gged_interceptors gged1 = (v1 & 0x80) == 0 ? gged0 : ggna.a;
        if((v1 & 4) == 0) {
            v2 = 1;
        }
        if((v1 & 0x100) == 0) {
            ibth2 = ibth0;
            ftts0 = this;
            fryv1 = fryv0;
            ibth3 = ibth1;
        }
        else {
            ibth2 = null;
            fryv1 = fryv0;
            ibth3 = ibth1;
            ftts0 = this;
        }
        this(fryv1, ((v1 & 2) == 0 ? frxs0 : null), ((boolean)(v2 ^ 1 | ((int)z))), ftvc1, ((v1 & 16) == 0 ? fryk0 : null), ftva1, ((v1 & 0x40) == 0 ? v : 0), gged1, ibth2, ibth3);
    }

    @ibni
    public static final ftux a(fryv fryv0, ibth ibth0) {
        ftux ftux0 = new ftux();
        ftux0.a = fryv0;
        ftux0.b = ibth0;
        ftux0.c = (short)(ftux0.c | 0x201);
        return ftux0;
    }

    public static ftts b(ftts ftts0, fryv fryv0, boolean z, ibth ibth0, int v) {
        if((v & 1) != 0) {
            fryv0 = ftts0.a;
        }
        ibth ibth1 = null;
        frxs frxs0 = (v & 2) == 0 ? null : ftts0.b;
        if((v & 4) != 0) {
            z = ftts0.c;
        }
        ftvc ftvc0 = (v & 8) == 0 ? null : ftts0.d;
        fryk fryk0 = (v & 16) == 0 ? null : ftts0.e;
        ftva ftva0 = (v & 0x20) == 0 ? null : ftts0.f;
        int v1 = (v & 0x40) == 0 ? 0 : ftts0.g;
        gged_interceptors gged0 = (v & 0x80) == 0 ? null : ftts0.h;
        if((v & 0x100) != 0) {
            ibth1 = ftts0.i;
        }
        if((v & 0x200) != 0) {
            ibth0 = ftts0.j;
        }
        ibuq.f(fryv0, "text");
        ibuq.f(ftvc0, "buttonStyle");
        ibuq.f(ftva0, "buttonContent");
        ibuq.f(gged0, "veLogMetadata");
        ibuq.f(ibth0, "onClick");
        return new ftts(fryv0, frxs0, z, ftvc0, fryk0, ftva0, v1, gged0, ibth1, ibth0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftts)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftts)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftts)object0).b)) {
            return false;
        }
        if(this.c != ((ftts)object0).c) {
            return false;
        }
        if(this.d != ((ftts)object0).d) {
            return false;
        }
        if(!ibuq.m(this.e, ((ftts)object0).e)) {
            return false;
        }
        if(this.f != ((ftts)object0).f) {
            return false;
        }
        if(this.g != ((ftts)object0).g) {
            return false;
        }
        if(!ibuq.m(this.h, ((ftts)object0).h)) {
            return false;
        }
        return ibuq.m(this.i, ((ftts)object0).i) ? ibuq.m(this.j, ((ftts)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c ? 0x4CF : 0x4D5)) * 0x1F + this.d.hashCode()) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + this.f.hashCode()) * 0x1F + this.g) * 0x1F + this.h.hashCode()) * 0x1F;
        ibth ibth0 = this.i;
        if(ibth0 != null) {
            v = ibth0.hashCode();
        }
        return (v1 + v) * 0x1F + this.j.hashCode();
    }

    @Override
    public final String toString() {
        return "ActionBarButtonState(text=" + this.a + ", textColor=" + this.b + ", isEnabled=" + this.c + ", buttonStyle=" + this.d + ", leadingIcon=" + this.e + ", buttonContent=" + this.f + ", veLogConst=" + this.g + ", veLogMetadata=" + this.h + ", interactionInfoProvider=" + this.i + ", onClick=" + this.j + ")";
    }
}

