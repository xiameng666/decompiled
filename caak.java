public final class caak {
    public final String a;
    public final int b;
    public final int c;
    public final caao d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;

    public caak() {
        throw null;
    }

    public caak(String s, int v, int v1, caao caao0, boolean z, String s1, String s2, boolean z1) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = caao0;
        this.e = z;
        this.f = s1;
        this.g = s2;
        this.h = z1;
    }

    public static caaj a() {
        caaj caaj0 = new caaj();
        caaj0.e(true);
        caaj0.b(false);
        return caaj0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof caak) && this.a.equals(((caak)object0).a) && this.b == ((caak)object0).b && this.c == ((caak)object0).c && this.d.equals(((caak)object0).d) && this.e == ((caak)object0).e) {
            String s = this.f;
            if(s != null) {
                if(s.equals(((caak)object0).f)) {
                label_8:
                    String s1 = this.g;
                    if(s1 == null) {
                        return ((caak)object0).g == null ? this.h == ((caak)object0).h : false;
                    }
                    return s1.equals(((caak)object0).g) ? this.h == ((caak)object0).h : false;
                }
            }
            else if(((caak)object0).f == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d.hashCode();
        int v1 = 0;
        int v2 = this.f == null ? 0 : this.f.hashCode();
        int v3 = 0x4D5;
        int v4 = this.e ? 0x4CF : 0x4D5;
        String s = this.g;
        if(s != null) {
            v1 = s.hashCode();
        }
        if(this.h) {
            v3 = 0x4CF;
        }
        return (((v * 1000003 ^ v4) * 1000003 ^ v2) * 1000003 ^ v1) * 1000003 ^ v3;
    }

    @Override
    public final String toString() {
        return "AppInfoRequest{packageName=" + this.a + ", versionCode=" + this.b + ", derivedId=" + this.c + ", eventLog=" + this.d + ", populateRoutes=" + this.e + ", splitName=" + this.f + ", activityName=" + this.g + ", addSyntheticRoutes=" + this.h + "}";
    }
}

