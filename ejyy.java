import java.util.ArrayList;

public final class ejyy {
    public final String a;
    public final Long b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final ArrayList h;
    public final ArrayList i;
    public String j;
    public final aqfl k;

    public ejyy(ejyx ejyx0) {
        this.a = ejyx0.a;
        this.j = ejyx0.c;
        this.c = ejyx0.d;
        this.e = ejyx0.e;
        this.f = ejyx0.f;
        this.g = ejyx0.g;
        this.h = ejyx0.j;
        this.i = ejyx0.k;
        this.d = ejyx0.h;
        this.k = ejyx0.l;
        this.b = ejyx0.b;
    }

    public static boolean a(aqfl aqfl0) {
        if(aqfl0 != null && (aqfl0.b & 0x400) != 0) {
            int v = aqfl0.h;
            if(aqfk.a(v) == 3) {
                return true;
            }
            int v1 = aqfk.a(v);
            return v1 == 0 ? false : v1 == 4;
        }
        return false;
    }
}

