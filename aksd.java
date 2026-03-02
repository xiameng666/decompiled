public final class aksd {
    public final int a;
    public final boolean b;
    public final icxk c;
    public final aksn d;
    public final String e;
    public final int f;
    public final boolean g;

    public aksd() {
        this(-1, false, icxk.a, null, null, 0, false);
    }

    public aksd(int v, boolean z, icxk icxk0, aksn aksn0, String s, int v1, boolean z1) {
        ibuq.f(icxk0, "profileState");
        super();
        this.a = v;
        this.b = z;
        this.c = icxk0;
        this.d = aksn0;
        this.e = s;
        this.f = v1;
        this.g = z1;
    }

    public final aksd a(hlxd hlxd0) {
        return hlxd0 == null || (hlxd0.b & 1) == 0 ? this : aksd.b(this, 0, false, null, null, hlxd0.c, hlxd0.h, false, 0x4F);
    }

    public static aksd b(aksd aksd0, int v, boolean z, icxk icxk0, aksn aksn0, String s, int v1, boolean z1, int v2) {
        if((v2 & 1) != 0) {
            v = aksd0.a;
        }
        if((v2 & 2) != 0) {
            z = aksd0.b;
        }
        if((v2 & 4) != 0) {
            icxk0 = aksd0.c;
        }
        if((v2 & 8) != 0) {
            aksn0 = aksd0.d;
        }
        if((v2 & 16) != 0) {
            s = aksd0.e;
        }
        if((v2 & 0x20) != 0) {
            v1 = aksd0.f;
        }
        if((v2 & 0x40) != 0) {
            z1 = aksd0.g;
        }
        ibuq.f(icxk0, "profileState");
        return new aksd(v, z, icxk0, aksn0, s, v1, z1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof aksd)) {
            return false;
        }
        if(this.a != ((aksd)object0).a) {
            return false;
        }
        if(this.b != ((aksd)object0).b) {
            return false;
        }
        if(this.c != ((aksd)object0).c) {
            return false;
        }
        if(!ibuq.m(this.d, ((aksd)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((aksd)object0).e)) {
            return false;
        }
        return this.f == ((aksd)object0).f ? this.g == ((aksd)object0).g : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a * 0x1F + aksc.a(this.b)) * 0x1F + this.c.hashCode();
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        String s = this.e;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((v * 0x1F + v2) * 0x1F + v1) * 0x1F + this.f) * 0x1F + aksc.a(this.g);
    }

    @Override
    public final String toString() {
        return "EmmActivityLogContext(flowType=" + this.a + ", isGoogler=" + this.b + ", profileState=" + this.c + ", suwChecks=" + this.d + ", managingAppPackageName=" + this.e + ", managingAppVersionCode=" + this.f + ", isRecreated=" + this.g + ")";
    }
}

