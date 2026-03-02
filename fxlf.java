import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class fxlf {
    public final int a;
    public final int b;
    public final boolean c;
    public final List d;
    @Deprecated
    public final List e;
    public final List f;
    public final List g;
    public long h;
    public ArrayList i;
    private final Random j;

    static {
        bboh.c("EAlert", bbcu.g, "RegGen");
    }

    public fxlf(Random random0, int v, int v1, boolean z, String s, List list0, String s1, String s2) {
        this.h = -1L;
        this.i = null;
        this.j = random0;
        this.a = v;
        this.b = v1;
        this.c = z;
        this.e = list0;
        this.f = fxlf.b(s1);
        this.d = fxlf.b(s);
        this.g = fxlf.b(s2);
    }

    public final double a(double f) {
        return this.j.nextDouble() * f * ((double)(this.j.nextBoolean() ? 1 : -1));
    }

    private static List b(String s) {
        return bbqr.d(s) ? Collections.EMPTY_LIST : gfud.e(',').i().d().n(s);
    }
}

