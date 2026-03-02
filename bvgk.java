public final class bvgk {
    public final String a;
    public final String b;
    public final boolean c;
    public final Integer d;
    public final Integer e;
    public final bvga f;
    public final ibts g;
    public final bvfr h;
    public final boolean i;
    public final cmhx j;
    private final bvfs k;

    public bvgk(String s, String s1, boolean z, Integer integer0, Integer integer1, bvga bvga0, ibts ibts0, bvfr bvfr0, boolean z1, cmhx cmhx0, bvfs bvfs0) {
        ibuq.f(s, "title");
        ibuq.f(s1, "description");
        ibuq.f(bvfs0, "severity");
        super();
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = integer0;
        this.e = integer1;
        this.f = bvga0;
        this.g = ibts0;
        this.h = bvfr0;
        this.i = z1;
        this.j = cmhx0;
        this.k = bvfs0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvgk)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bvgk)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bvgk)object0).b)) {
            return false;
        }
        if(this.c != ((bvgk)object0).c) {
            return false;
        }
        if(!ibuq.m(this.d, ((bvgk)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((bvgk)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((bvgk)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((bvgk)object0).g)) {
            return false;
        }
        if(!ibuq.m(this.h, ((bvgk)object0).h)) {
            return false;
        }
        if(this.i != ((bvgk)object0).i) {
            return false;
        }
        return ibuq.m(this.j, ((bvgk)object0).j) ? this.k == ((bvgk)object0).k : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + bvgj.a(this.c)) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        int v3 = this.f == null ? 0 : this.f.hashCode();
        ibts ibts0 = this.g;
        if(ibts0 != null) {
            v = ibts0.hashCode();
        }
        return ((((((v1 + v2) * 0x1F + v3) * 0x1F + v) * 0x1F + this.h.hashCode()) * 0x1F + bvgj.a(this.i)) * 0x1F + this.j.hashCode()) * 0x1F + this.k.hashCode();
    }

    @Override
    public final String toString() {
        return "RecommendationsEntryUiModel(title=" + this.a + ", description=" + this.b + ", isBanner=" + this.c + ", iconId=" + this.d + ", imageId=" + this.e + ", progress=" + this.f + ", cardAction=" + this.g + ", buttons=" + this.h + ", fullWidth=" + this.i + ", veConfig=" + this.j + ", severity=" + this.k + ")";
    }
}

