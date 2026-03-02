public final class ftxr {
    public final fryk a;
    public final fryv b;
    public final fryv c;
    public final fryv d;
    public final ibth e;
    private final fryv f;
    private final int g;

    public ftxr(fryk fryk0, fryv fryv0, fryv fryv1, fryv fryv2, ibth ibth0) {
        ibuq.f(fryk0, "bannerImage");
        ibuq.f(fryv0, "title");
        ibuq.f(fryv1, "subtitle");
        ibuq.f(fryv2, "actionText");
        super();
        this.a = fryk0;
        this.f = null;
        this.b = fryv0;
        this.c = fryv1;
        this.d = fryv2;
        this.g = 0;
        this.e = ibth0;
    }

    public static ftxr a(ftxr ftxr0, fryk fryk0, fryv fryv0, fryv fryv1, fryv fryv2, ibth ibth0, int v) {
        if((v & 1) != 0) {
            fryk0 = ftxr0.a;
        }
        if((v & 4) != 0) {
            fryv0 = ftxr0.b;
        }
        if((v & 8) != 0) {
            fryv1 = ftxr0.c;
        }
        if((v & 16) != 0) {
            fryv2 = ftxr0.d;
        }
        if((v & 0x40) != 0) {
            ibth0 = ftxr0.e;
        }
        ibuq.f(fryk0, "bannerImage");
        ibuq.f(fryv0, "title");
        ibuq.f(fryv1, "subtitle");
        ibuq.f(fryv2, "actionText");
        return new ftxr(fryk0, fryv0, fryv1, fryv2, ibth0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftxr)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftxr)object0).a)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftxr)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ftxr)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((ftxr)object0).d) ? ibuq.m(this.e, ((ftxr)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = ((((fryh)this.a).a * 961 + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        return this.e == null ? v * 961 : v * 961 + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "ObjectEducationState(bannerImage=" + this.a + ", bannerContentDescription=null, title=" + this.b + ", subtitle=" + this.c + ", actionText=" + this.d + ", veLogConst=0, onClick=" + this.e + ")";
    }
}

