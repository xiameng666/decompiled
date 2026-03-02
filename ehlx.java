public final class ehlx {
    public final hgiq a;
    public final String b;
    public final String c;
    public final bbde d;
    public final String e;
    public final String f;

    public ehlx(hgiq hgiq0, String s, String s1, bbde bbde0, String s2, String s3) {
        ibuq.f(hgiq0, "id");
        ibuq.f(s, "title");
        ibuq.f(s1, "summary");
        ibuq.f(bbde0, "treatment");
        ibuq.f(s2, "learnMoreDescription");
        ibuq.f(s3, "additionalDescription");
        super();
        this.a = hgiq0;
        this.b = s;
        this.c = s1;
        this.d = bbde0;
        this.e = s2;
        this.f = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ehlx)) {
            return false;
        }
        if(this.a != ((ehlx)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((ehlx)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ehlx)object0).c)) {
            return false;
        }
        if(this.d != ((ehlx)object0).d) {
            return false;
        }
        return ibuq.m(this.e, ((ehlx)object0).e) ? ibuq.m(this.f, ((ehlx)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "ServiceInfo(id=" + this.a + ", title=" + this.b + ", summary=" + this.c + ", treatment=" + this.d + ", learnMoreDescription=" + this.e + ", additionalDescription=" + this.f + ")";
    }
}

