import java.util.List;

public final class gbhq {
    public final gbho a;
    public final boolean b;
    public final String c;
    public final gcvf d;
    public final boolean e;
    public final String f;
    public final List g;
    public final List h;

    public gbhq(gbho gbho0, boolean z, String s, gcvf gcvf0, boolean z1, String s1, List list0, List list1) {
        ibuq.f(s1, "serialNumber");
        ibuq.f(list0, "supportedAuthTypes");
        super();
        this.a = gbho0;
        this.b = z;
        this.c = s;
        this.d = gcvf0;
        this.e = z1;
        this.f = s1;
        this.g = list0;
        this.h = list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gbhq)) {
            return false;
        }
        if(!ibuq.m(this.a, ((gbhq)object0).a)) {
            return false;
        }
        if(this.b != ((gbhq)object0).b) {
            return false;
        }
        if(!ibuq.m(this.c, ((gbhq)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((gbhq)object0).d)) {
            return false;
        }
        if(this.e != ((gbhq)object0).e) {
            return false;
        }
        if(!ibuq.m(this.f, ((gbhq)object0).f)) {
            return false;
        }
        return ibuq.m(this.g, ((gbhq)object0).g) ? ibuq.m(this.h, ((gbhq)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        return ((((((this.a.hashCode() * 0x1F + gbhp.a(this.b)) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + gbhp.a(this.e)) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode();
    }

    @Override
    public final String toString() {
        return "DynamicSystemData(deviceStateData=" + this.a + ", isEmulated=" + this.b + ", languageCode=" + this.c + ", networkLinkRate=" + this.d + ", networkMetered=" + this.e + ", serialNumber=" + this.f + ", supportedAuthTypes=" + this.g + ", systemFeatures=" + this.h + ")";
    }
}

