public final class bujp {
    public static final bboh a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    static {
        bujp.a = bboh.b("AcquisitionInfo", bbcu.hd);
    }

    public bujp(String s, String s1, String s2, String s3) {
        ibuq.f(s2, "product");
        super();
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
    }

    public final hitf a() {
        try {
            return (hitf)Enum.valueOf(hitf.class, this.d);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            ((ggtj)((ggtj)bujp.a.j()).s(illegalArgumentException0)).B("Failed to convert product ID %s", this.d);
            return hitf.F;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bujp)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bujp)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bujp)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((bujp)object0).d) ? ibuq.m(this.e, ((bujp)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return ((this.b.hashCode() * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "AcquisitionInfo(onramp=" + this.b + ", platform=" + this.c + ", product=" + this.d + ", campaignId=" + this.e + ")";
    }
}

