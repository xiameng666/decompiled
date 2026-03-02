import android.net.Uri;

public final class bffc {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final boolean e;

    public bffc(herj herj0) {
        ibuq.f(herj0, "user");
        String s = herj0.c;
        ibuq.e(s, "getUserId(...)");
        String s1 = (herj0.d == null ? herh.a : herj0.d).b;
        ibuq.e(s1, "getEmail(...)");
        String s2 = (herj0.d == null ? herh.a : herj0.d).c;
        ibuq.e(s2, "getDisplayName(...)");
        String s3 = (herj0.d == null ? herh.a : herj0.d).d;
        ibuq.e(s3, "getProfileImageUrl(...)");
        Uri uri0 = Uri.parse(s3);
        int v = herj0.b & 4;
        ibuq.f(s, "userId");
        ibuq.f(s1, "email");
        ibuq.f(s2, "displayName");
        ibuq.f(uri0, "profileImageUrl");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = uri0;
        this.e = v != 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bffc)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bffc)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bffc)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bffc)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((bffc)object0).d) ? this.e == ((bffc)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        return this.e ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "Recipient(userId=" + this.a + ", email=" + this.b + ", displayName=" + this.c + ", profileImageUrl=" + this.d + ", isEligible=" + this.e + ")";
    }
}

