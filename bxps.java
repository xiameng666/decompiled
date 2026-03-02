import android.app.Application;
import android.webkit.CookieManager;

public final class bxps extends lny {
    public bxpr a;
    public final lqi b;
    public final CookieManager c;
    public final bxmu d;
    public final gmcg e;

    public bxps(Application application0) {
        super(application0);
        this.b = new lqi();
        this.e = new bblp(1, 9);
        this.c = CookieManager.getInstance();
        bxmt bxmt0 = new bxmt();
        bxmt0.a = bxrc.b;
        bxph bxph0 = new bxph(this);
        bxmt0.c(bxrc.b, bxph0);
        bxpi bxpi0 = new bxpi(this);
        bxmt0.c(bxrc.c, bxpi0);
        bxpj bxpj0 = new bxpj(this);
        bxmt0.c(bxrc.d, bxpj0);
        bxmt0.e(new bxpk(this));
        bxmt0.f(new bxpl(this));
        bxmt0.b(new bxmh(bboh.a("IdentityWebview_flowRunner")));
        this.d = bxmt0.a();
    }

    public final void b() {
        this.d.f(bxrc.d);
    }
}

