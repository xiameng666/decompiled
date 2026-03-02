import java.util.Map;

public final class bybx {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final byby d;
    public final Map e;

    public bybx(String s, boolean z, boolean z1, byby byby0, Map map0) {
        this.a = s;
        this.b = z;
        this.c = z1;
        this.d = byby0;
        this.e = map0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bybx)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bybx)object0).a)) {
            return false;
        }
        if(this.b != ((bybx)object0).b) {
            return false;
        }
        if(this.c != ((bybx)object0).c) {
            return false;
        }
        return ibuq.m(this.d, ((bybx)object0).d) ? ibuq.m(this.e, ((bybx)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.d == null ? ((v + bybw.a(this.b)) * 0x1F + bybw.a(this.c)) * 0x1F * 0x1F + this.e.hashCode() : (((v + bybw.a(this.b)) * 0x1F + bybw.a(this.c)) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "RequestDisplayInfo(appName=" + this.a + ", preferImmediatelyAvailableCredentials=" + this.b + ", preferIdentityDocUi=" + this.c + ", preferTopBrandingContent=" + this.d + ", typePriorityMap=" + this.e + ")";
    }
}

