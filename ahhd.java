import android.accounts.Account;
import android.app.Application;
import android.webkit.CookieManager;

public final class ahhd extends lny {
    public final Account a;
    public final lqi b;
    public final lqi c;
    public final String d;
    public final actb e;
    public final gmcg f;
    public final CookieManager g;
    public final bxmu h;
    private final bxod i;

    public ahhd(Application application0, Account account0) {
        super(application0);
        this.a = account0;
        this.b = new lqi();
        this.c = new lqi();
        bxod bxod0 = bxoc.a(application0, null);
        this.i = bxod0;
        String s = bxol.a();
        this.d = s;
        this.e = new actb(application0);
        this.f = bxrz.C();
        this.g = CookieManager.getInstance();
        bxmt bxmt0 = new bxmt();
        bxmt0.a = bxrl.b;
        ahgw ahgw0 = new ahgw(this);
        bxmt0.c(bxrl.b, ahgw0);
        ahgx ahgx0 = new ahgx(this);
        bxmt0.c(bxrl.c, ahgx0);
        ahgy ahgy0 = new ahgy(this);
        bxmt0.c(bxrl.d, ahgy0);
        bxmt0.e(new ahgz(this));
        bxmt0.f(new ahha(this));
        bxmt0.b(new bxmx(bxod0, s, new ahhb()));
        bxmt0.b(new bxmh(aggi.a("UlpUpgrade_flowRunner")));
        this.h = bxmt0.a();
    }

    public final void b() {
        this.h.k(16, "Cancelled by user.");
    }

    public final void c() {
        this.h.k(8, "ULP upgrade flow ended in an error.");
    }
}

