import android.net.Uri;
import com.google.android.gms.auth.api.credentials.ulp.ui.UlpUpgradeChimeraActivity;
import java.util.Locale;

public final class ahgs implements lqj {
    public final UlpUpgradeChimeraActivity a;

    public ahgs(UlpUpgradeChimeraActivity ulpUpgradeChimeraActivity0) {
        this.a = ulpUpgradeChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        int v = (int)(((Integer)object0));
        UlpUpgradeChimeraActivity ulpUpgradeChimeraActivity0 = this.a;
        switch(v) {
            case 1: {
                String s = Uri.parse(hpnf.a.b().c()).buildUpon().appendQueryParameter("package", ulpUpgradeChimeraActivity0.l).appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("theme", "mn").build().toString();
                ulpUpgradeChimeraActivity0.j.loadUrl(bxpe.b(s, ulpUpgradeChimeraActivity0.getResources()));
                return;
            }
            case 2: {
                ulpUpgradeChimeraActivity0.j.setVisibility(0);
                ulpUpgradeChimeraActivity0.k.setVisibility(8);
                return;
            }
            default: {
                throw new IllegalStateException("Unrecognized fragment type: " + v);
            }
        }
    }
}

