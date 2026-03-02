import android.accounts.Account;

public final class ciyk implements ciyp {
    public static final bboh a;
    private final Account b;
    private static final fpgc c;
    private final fpgc d;

    static {
        ciyk.a = bboh.b("SwaaNcc", bbcu.eQ);
        fpga fpga0 = fpgb.a();
        fpga0.b = new fgvy();
        fpfm.b(ccva.a(), fpga0);
        fpfm.c("gmscorelogger", fpga0);
        fpga0.b = new fgvy();
        ciyk.c = fpfm.a(fpga0);
    }

    public ciyk(String s) {
        this.b = new Account(s, "com.google");
        this.d = ciyk.c;
    }

    @Override  // ciyp
    public final gmcd a() {
        gmbt gmbt0 = gmbt.h(this.d.a(this.b).i(4));
        ciyj ciyj0 = new ciyj();
        return glyi.f(gmbt0, Exception.class, ciyj0, gmap.a);
    }

    @Override  // ciyp
    public final hfki b() {
        return hfki.b(new hfke(76));
    }
}

