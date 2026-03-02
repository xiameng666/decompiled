import android.net.Uri;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;

public final class acuv {
    public static final ajcl a;
    public final frli b;

    static {
        acuv.a = new acuu();
    }

    public acuv() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("authaccount");
        frce0.e("AccountsSnapshot.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)adrv.a));
        frif frif0 = frie0.a();
        this.b = cjtb.a.a(frif0);
    }
}

