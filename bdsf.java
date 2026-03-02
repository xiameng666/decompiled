import android.graphics.drawable.Drawable;
import java.util.List;

public final class bdsf implements bdsg {
    public final Drawable a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final boolean i;

    public bdsf(Drawable drawable0, String s, String s1, String s2, List list0, List list1, List list2, List list3, boolean z) {
        ibuq.f(list2, "passwords");
        ibuq.f(list3, "passkeys");
        super();
        this.a = drawable0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = list0;
        this.f = list1;
        this.g = list2;
        this.h = list3;
        this.i = z;
    }

    @Override  // bdsg
    public final bdsb a() {
        return bdsb.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bdsf)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bdsf)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bdsf)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bdsf)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((bdsf)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((bdsf)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((bdsf)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((bdsf)object0).g)) {
            return false;
        }
        return ibuq.m(this.h, ((bdsf)object0).h) ? this.i == ((bdsf)object0).i : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        int v3 = (((((((v1 * 0x1F + v2) * 0x1F + v) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode()) * 0x1F;
        return this.i ? v3 + 0x4CF : v3 + 0x4D5;
    }

    @Override
    public final String toString() {
        return "PreviewState(importingPasswordManagerIcon=" + this.a + ", importingPasswordManagerDisplayName=" + this.b + ", avatarUrl=" + this.c + ", accountName=" + this.d + ", passwordUiCredentials=" + this.e + ", passkeyUiCredentials=" + this.f + ", passwords=" + this.g + ", passkeys=" + this.h + ", isProcessing=" + this.i + ")";
    }
}

