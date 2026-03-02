public final class erxm {
    public static final erxm a;
    public final boolean b;
    public final clzk c;
    public final erxp d;
    public final clwn e;
    public final ibth f;
    private final clyi g;
    private final String h;

    static {
        erxm.a = new erxm(false, null, null, 0x7F);
    }

    public erxm() {
        this(false, null, null, 0x7F);
    }

    public erxm(boolean z, clzk clzk0, erxp erxp0, clwn clwn0, ibth ibth0) {
        ibuq.f(ibth0, "onVisitResourcesClick");
        super();
        this.b = z;
        this.c = clzk0;
        this.g = null;
        this.d = erxp0;
        this.h = null;
        this.e = clwn0;
        this.f = ibth0;
    }

    public erxm(boolean z, clzk clzk0, ibth ibth0, int v) {
        if((v & 0x40) != 0) {
            ibth0 = new erxl();
        }
        boolean z1 = true;
        if((v & 2) != 0) {
            clzk0 = null;
        }
        if(1 != (((int)z) & (v & 1 ^ 1))) {
            z1 = false;
        }
        this(z1, clzk0, null, null, ibth0);
    }

    public static erxm a(erxm erxm0, erxp erxp0, clwn clwn0, int v) {
        boolean z = (v & 1) == 0 ? false : erxm0.b;
        clzk clzk0 = (v & 2) == 0 ? null : erxm0.c;
        if((v & 8) != 0) {
            erxp0 = erxm0.d;
        }
        if((v & 0x20) != 0) {
            clwn0 = erxm0.e;
        }
        ibuq.f(erxm0.f, "onVisitResourcesClick");
        return new erxm(z, clzk0, erxp0, clwn0, erxm0.f);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof erxm)) {
            return false;
        }
        if(this.b != ((erxm)object0).b) {
            return false;
        }
        if(!ibuq.m(this.c, ((erxm)object0).c)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.d, ((erxm)object0).d)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        return ibuq.m(this.e, ((erxm)object0).e) ? ibuq.m(this.f, ((erxm)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.c == null ? 0 : this.c.hashCode();
        int v2 = this.b ? 0x4CF : 0x4D5;
        int v3 = this.d == null ? 0 : this.d.hashCode();
        clwn clwn0 = this.e;
        if(clwn0 != null) {
            v = clwn0.hashCode();
        }
        return (((v2 * 0x1F + v1) * 961 + v3) * 961 + v) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "SpatulaSettingsScreenUiModel(isLoading=" + this.b + ", switch=" + this.c + ", errorCard=null, alertCard=" + this.d + ", errorMessage=null, warningCard=" + this.e + ", onVisitResourcesClick=" + this.f + ")";
    }
}

