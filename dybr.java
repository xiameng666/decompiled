import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;

public final class dybr {
    public final frli a;

    public dybr(String s, String s1) {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("tapandpay");
        frce0.e(String.format("%s_%s_%s", s, s1, "se_account_settings_datastore.pb"));
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dylt.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }
}

