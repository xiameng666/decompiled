import java.util.HashSet;
import java.util.Set;

public final class bwud {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final Set i;
    public final Set j;
    private final int k;

    public bwud(int v, boolean z, boolean z1, boolean z2, String s, int v1, int v2, String s1, String s2) {
        this.i = new HashSet();
        this.j = new HashSet();
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = z2;
        batl.s(s);
        this.e = s;
        this.f = s1;
        this.g = s2;
        this.k = v2;
        this.h = v1;
    }

    public final int a() {
        batl.l(this.k != -1);
        return this.k;
    }

    public final boolean b() {
        return this.b || this.c;
    }

    @Override
    public final String toString() {
        return "ClientRequest[callingUid=" + this.a + ", isSuperUser=" + this.b + ", isGoogleSearchApp=" + this.c + ", packageName=" + this.e + "]";
    }
}

