import com.google.android.gms.auth.blockstore.AppRestoreInfo;
import java.util.HashSet;

public final class aint implements glzn {
    public final ainy a;
    public final int b;
    public final AppRestoreInfo c;
    public final HashSet d;

    public aint(ainy ainy0, int v, AppRestoreInfo appRestoreInfo0, HashSet hashSet0) {
        this.a = ainy0;
        this.b = v;
        this.c = appRestoreInfo0;
        this.d = hashSet0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gfsx gfsx0;
        Void void0 = (Void)object0;
        ainy ainy0 = this.a;
        if(this.b == 1 && hpsd.g()) {
            ((ggtj)ainy.a.h()).x("triggering cloud sync.");
            aivq aivq0 = aivr.a();
            aivq0.c = 3;
            aivq0.a = this.c.b;
            try {
                aivq0.b(Long.parseLong(this.c.a));
                aivq0.b = 2;
            }
            catch(NumberFormatException numberFormatException0) {
                a.ae(ainy.a.i(), "Invalid Android Id.", numberFormatException0);
                gfsx0 = gfqx.a;
                goto label_15;
            }
            gfsx0 = gfsx.m(aivq0.a());
        label_15:
            if(!gfsx0.i()) {
                ((ggtj)ainy.a.j()).x("Failed to make a valid cloudRestoreRequest. Exiting.");
                return ainy0.b();
            }
            aino aino0 = new aino(aivp.b(), gfsx0);
            gmbu.t(glzd.g(gmbt.h(ainy0.g.e(aino0)), new ainp(ainy0, this.d), ainy0.g), new ainx(ainy0), ainy0.g);
        }
        return ainy0.b();
    }
}

