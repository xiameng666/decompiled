import android.net.Uri;
import com.google.android.gms.chimera.modules.platformconfigurator.AppContextProvider;

public final class eivz {
    public final frli a;

    public eivz() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("platformconfigurator");
        frce0.e("platform_config_ota_state.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)eiwg.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public final eiwg a() {
        return (eiwg)this.a.a().get();
    }
}

