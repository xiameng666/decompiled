import android.accounts.Account;

public final class cixi implements ciyp {
    public static final bboh a;
    private static final fpgc b;
    private final fpgc c;

    static {
        cixi.a = bboh.b("DeviceContactsInfoNcc", bbcu.eQ);
        fpga fpga0 = fpgb.a();
        fpga0.b = new fgvy();
        fpfm.b(ccva.a(), fpga0);
        fpfm.c("gmscorelogger", fpga0);
        fpga0.b = new fgvy();
        cixi.b = fpfm.a(fpga0);
    }

    public cixi() {
        this.c = cixi.b;
    }

    @Override  // ciyp
    public final gmcd a() {
        Account[] arr_account = cchj.b(ccva.a()).o();
        ggdy ggdy0 = new ggdy();
        for(int v = 0; v < arr_account.length; ++v) {
            gmbt gmbt0 = gmbt.h(this.c.a(arr_account[v]).i(11));
            cixg cixg0 = new cixg();
            ggdy0.i(glyi.f(gmbt0, Exception.class, cixg0, gmap.a));
        }
        gged_interceptors gged0 = ggdy0.h();
        gmbt gmbt1 = gmbt.h(gmbu.a(gged0).a(new cixh(gged0), gmap.a));
        cixg cixg1 = new cixg();
        return glyi.f(gmbt1, Exception.class, cixg1, gmap.a);
    }

    @Override  // ciyp
    public final hfki b() {
        return hfki.b(new hfke(17));
    }
}

