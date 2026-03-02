import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

final class foft {
    private final Context a;
    private final fkvs b;

    public foft(fkvs fkvs0, Context context0) {
        gftb.check(fkvs0);
        this.b = fkvs0;
        this.a = context0;
    }

    final gmcd a(fofs fofs0, String s, int v) {
        Account account0 = new Account(s, "com.google");
        gdta gdta0 = gdta.g(fofs0.a(this.b.a(account0), new fkuf(iaeq.a.b().a(this.a)), fodu.a(v)));
        fofn fofn0 = new fofn();
        gdta gdta1 = gdta0.e(fkug.class, fofn0, gmap.a);
        fofo fofo0 = new fofo();
        gdta gdta2 = gdta1.f(aztb.class, fofo0, gmap.a);
        fofp fofp0 = new fofp();
        gmcd gmcd0 = gdta2.f(IOException.class, fofp0, gmap.a).h(new fofq(), gmap.a);
        gdtf.l(gmcd0, new fofr(this), gmap.a);
        return gmcd0;
    }
}

