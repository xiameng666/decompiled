public final class zob {
    public final zhr a;
    public final String b;
    public final String c;
    public final zht d;
    public final gged_interceptors e;
    public final gged_interceptors f;

    public zob(zhr zhr0, String s, String s1, zht zht0, gged_interceptors gged0, gged_interceptors gged1) {
        ibuq.f(s, "description");
        ibuq.f(s1, "hyperlinkText");
        ibuq.f(gged0, "contentUnits");
        ibuq.f(gged1, "trailingUnits");
        super();
        this.a = zhr0;
        this.b = s;
        this.c = s1;
        this.d = zht0;
        this.e = gged0;
        this.f = gged1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zob)) {
            return false;
        }
        if(!ibuq.m(this.a, ((zob)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((zob)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((zob)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((zob)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((zob)object0).e) ? ibuq.m(this.f, ((zob)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((this.a == null ? 0 : this.a.hashCode()) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
        zht zht0 = this.d;
        if(zht0 != null) {
            v = zht0.hashCode();
        }
        return ((v1 * 0x1F + v) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "StackFooter(image=" + this.a + ", description=" + this.b + ", hyperlinkText=" + this.c + ", hyperlink=" + this.d + ", contentUnits=" + this.e + ", trailingUnits=" + this.f + ")";
    }
}

