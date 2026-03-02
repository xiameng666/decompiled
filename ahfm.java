import android.content.Intent;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;

public final class ahfm extends lsb {
    public final Intent a;
    public final String b;
    public final lqi c;
    public final lqi d;
    public final aeqm e;
    public final bxod f;
    public final bxmu g;
    public ahbd h;
    public ahbr i;
    public kjx j;

    public ahfm(Intent intent0, String s) {
        this.a = intent0;
        this.b = s;
        this.c = new lqi();
        this.d = new lqi();
        this.e = new aeqm(new ahfd(this));
        bxod bxod0 = bxoc.a(AppContextProvider.a(), null);
        this.f = bxod0;
        bxmt bxmt0 = new bxmt();
        bxmt0.a = bxqz.b;
        ahfe ahfe0 = new ahfe(this);
        bxmt0.c(bxqz.b, ahfe0);
        ahff ahff0 = new ahff(this);
        bxmt0.c(bxqz.c, ahff0);
        ahfg ahfg0 = new ahfg(this);
        bxmt0.c(bxqz.d, ahfg0);
        ahfh ahfh0 = new ahfh(this);
        bxmt0.c(bxqz.e, ahfh0);
        bxmt0.e(new ahfi(this));
        bxmt0.f(new ahfj(this));
        bxmt0.b(new bxmx(bxod0, s, new ahfk()));
        bxmt0.b(new bxmh(aggi.a("GetVerifiableCredential_flowRunner")));
        this.g = bxmt0.a();
    }
}

