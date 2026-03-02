import android.graphics.drawable.Drawable;
import java.util.List;

public final class bybv {
    public final String a;
    public final Drawable b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final bxzv g;

    public bybv(String s, Drawable drawable0, String s1, List list0, List list1, bxzv bxzv0, List list2) {
        ibuq.f(s, "id");
        ibuq.f(drawable0, "icon");
        ibuq.f(s1, "displayName");
        ibuq.f(list0, "credentialEntryList");
        ibuq.f(list2, "actionEntryList");
        super();
        this.a = s;
        this.b = drawable0;
        this.c = s1;
        this.d = list0;
        this.e = list1;
        this.g = bxzv0;
        this.f = list2;
    }

    public static bybv a(bybv bybv0, List list0, List list1, bxzv bxzv0, List list2, int v) {
        String s = null;
        String s1 = (v & 1) == 0 ? null : bybv0.a;
        Drawable drawable0 = (v & 2) == 0 ? null : bybv0.b;
        if((v & 4) != 0) {
            s = bybv0.c;
        }
        if((v & 8) != 0) {
            list0 = bybv0.d;
        }
        if((v & 16) != 0) {
            list1 = bybv0.e;
        }
        if((v & 0x20) != 0) {
            bxzv0 = bybv0.g;
        }
        if((v & 0x40) != 0) {
            list2 = bybv0.f;
        }
        ibuq.f(s1, "id");
        ibuq.f(drawable0, "icon");
        ibuq.f(s, "displayName");
        ibuq.f(list0, "credentialEntryList");
        ibuq.f(list2, "actionEntryList");
        return new bybv(s1, drawable0, s, list0, list1, bxzv0, list2);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bybv)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bybv)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bybv)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bybv)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((bybv)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((bybv)object0).e)) {
            return false;
        }
        return ibuq.m(this.g, ((bybv)object0).g) ? ibuq.m(this.f, ((bybv)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
        return this.g == null ? v * 0x1F * 0x1F + this.f.hashCode() : (v * 0x1F + this.g.hashCode()) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "ProviderInfo(id=" + this.a + ", icon=" + this.b + ", displayName=" + this.c + ", credentialEntryList=" + this.d + ", authenticationEntryList=" + this.e + ", remoteEntry=" + this.g + ", actionEntryList=" + this.f + ")";
    }
}

