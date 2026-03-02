import android.content.Context;
import java.util.logging.Level;

public final class crxd {
    public static final bboh a;
    crxu b;
    public crwy c;
    public final cslg d;
    final gfug e;
    private static crxd f;
    private String g;

    static {
        crxd.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    private crxd() {
        this.e = new gfug(gfqs.a);
        this.d = new cslg();
    }

    public static crxd a() {
        synchronized(crxd.class) {
            if(crxd.f == null) {
                crxd.f = new crxd();
            }
        }
        return crxd.f;
    }

    public static haut b(haut haut0) {
        return hvjw.k() ? haut0 : null;
    }

    public final String c(Context context0) {
        synchronized(this) {
            if(this.g == null) {
                synchronized(this) {
                    String s = this.g;
                    String s1 = context0 == null ? null : bsoa.a(context0);
                    this.g = s1;
                    if(s1 != null && !s1.equals(s)) {
                        Level level0 = cslm.h();
                        crxd.a.g(level0).B("Token changed from: %s.", s);
                    }
                }
            }
        }
        return this.g;
    }

    public static boolean d() {
        return hvjw.n() && crvw.c().l() != null;
    }

    public static boolean e(haut haut0) {
        return (gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e)) == gsoj.o ? true : (gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e)) == gsoj.p;
    }

    public static boolean f(haut haut0) {
        return hvjw.j() ? (gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e)) == gsoj.m && haus.a(haut0.b) == haus.d : false;
    }
}

