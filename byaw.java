import android.graphics.drawable.Drawable;
import java.util.Set;

public final class byaw {
    public final String a;
    public final String b;
    public final bxzs c;
    public final String d;
    public final Drawable e;
    public final boolean f;
    public final String g;
    public final Set h;
    public final boolean i;

    public byaw(String s, String s1, bxzs bxzs0, String s2, Drawable drawable0, boolean z, String s3, Set set0, boolean z1) {
        ibuq.f(s, "title");
        ibuq.f(bxzs0, "type");
        ibuq.f(drawable0, "typeIcon");
        ibuq.f(set0, "userSetDefaultProviderIds");
        super();
        this.a = s;
        this.b = s1;
        this.c = bxzs0;
        this.d = s2;
        this.e = drawable0;
        this.f = z;
        this.g = s3;
        this.h = set0;
        this.i = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byaw)) {
            return false;
        }
        if(!ibuq.m(this.a, ((byaw)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((byaw)object0).b)) {
            return false;
        }
        if(this.c != ((byaw)object0).c) {
            return false;
        }
        if(!ibuq.m(this.d, ((byaw)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((byaw)object0).e)) {
            return false;
        }
        if(this.f != ((byaw)object0).f) {
            return false;
        }
        if(!ibuq.m(this.g, ((byaw)object0).g)) {
            return false;
        }
        return ibuq.m(this.h, ((byaw)object0).h) ? this.i == ((byaw)object0).i : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + byav.a(this.f)) * 0x1F;
        String s = this.g;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 + v) * 0x1F + this.h.hashCode()) * 0x1F + byav.a(this.i);
    }

    @Override
    public final String toString() {
        return "RequestDisplayInfo(title=" + this.a + ", subtitle=" + this.b + ", type=" + this.c + ", appName=" + this.d + ", typeIcon=" + this.e + ", preferImmediatelyAvailableCredentials=" + this.f + ", appPreferredDefaultProviderId=" + this.g + ", userSetDefaultProviderIds=" + this.h + ", isAutoSelectRequest=" + this.i + ")";
    }
}

