public final class zpt extends aaex {
    public final String a;
    public final String b;
    public final zhu c;
    public final zht d;
    public final String e;
    private final grxw f;

    public zpt(grxw grxw0, String s, String s1, zhu zhu0, zht zht0, String s2) {
        ibuq.f(s, "displayName");
        ibuq.f(s2, "profilePictureAccessibilityLabel");
        super(grxw0);
        this.f = grxw0;
        this.a = s;
        this.b = s1;
        this.c = zhu0;
        this.d = zht0;
        this.e = s2;
    }

    @Override  // aaem
    public final int a() {
        return 8;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zpt)) {
            return false;
        }
        if(!ibuq.m(this.f, ((zpt)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.a, ((zpt)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((zpt)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((zpt)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((zpt)object0).d) ? ibuq.m(this.e, ((zpt)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v;
        grxw grxw0 = this.f;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            v = ((ProtoLiteMessage)grxw0).s();
        }
        else {
            int v1 = grxw0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)grxw0).s();
                grxw0.memoizedHashCode = v1;
            }
            v = v1;
        }
        int v2 = v * 0x1F + this.a.hashCode();
        int v3 = 0;
        int v4 = this.b == null ? 0 : this.b.hashCode();
        int v5 = this.c == null ? 0 : this.c.hashCode();
        zht zht0 = this.d;
        if(zht0 != null) {
            v3 = zht0.hashCode();
        }
        return (((v2 * 0x1F + v4) * 0x1F + v5) * 0x1F + v3) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "WelcomeScreenIntroListItem(resourceKey=" + this.f + ", displayName=" + this.a + ", displayEmail=" + this.b + ", profilePictureData=" + this.c + ", profilePictureLink=" + this.d + ", profilePictureAccessibilityLabel=" + this.e + ")";
    }
}

