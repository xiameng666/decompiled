public final class fobe {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    private final String e;
    private final String f;

    public fobe() {
        throw null;
    }

    public fobe(String s, String s1, String s2, String s3, boolean z, boolean z1) {
        if(s == null) {
            throw new NullPointerException("Null accountIdentifier");
        }
        this.e = s;
        if(s1 == null) {
            throw new NullPointerException("Null accountName");
        }
        this.a = s1;
        this.b = s2;
        this.f = s3;
        this.c = z;
        this.d = z1;
    }

    public static fobe a(Object object0, fnfm fnfm0) {
        return new fobe(fnfm0.c(object0), fnfm0.d(object0), fnfm0.f(object0), fnfm0.e(object0), fnfm0.j(object0), fnfm0.k(object0));
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fobe) && this.e.equals(((fobe)object0).e) && this.a.equals(((fobe)object0).a)) {
            String s = this.b;
            if(s != null) {
                if(s.equals(((fobe)object0).b)) {
                label_8:
                    String s1 = this.f;
                    if(s1 == null) {
                        return ((fobe)object0).f == null ? this.c == ((fobe)object0).c && this.d == ((fobe)object0).d : false;
                    }
                    return s1.equals(((fobe)object0).f) ? this.c == ((fobe)object0).c && this.d == ((fobe)object0).d : false;
                }
            }
            else if(((fobe)object0).b == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (this.e.hashCode() ^ 1000003) * 1000003 ^ this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.f;
        if(s != null) {
            v1 = s.hashCode();
        }
        int v3 = 0x4D5;
        int v4 = this.c ? 0x4CF : 0x4D5;
        if(this.d) {
            v3 = 0x4CF;
        }
        return (((v * 1000003 ^ v2) * 1000003 ^ v1) * 1000003 ^ v4) * 1000003 ^ v3;
    }

    @Override
    public final String toString() {
        return "OneGoogleAvatarImageLoaderKey{accountIdentifier=" + this.e + ", accountName=" + this.a + ", displayName=" + this.b + ", avatarUrl=" + this.f + ", isGaiaAccount=" + this.c + ", isMetadataAvailable=" + this.d + "}";
    }
}

