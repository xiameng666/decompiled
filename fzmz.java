import android.net.Uri;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;

public final class fzmz implements ibth {
    @Override  // ibth
    public final Object a() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("personalsafety");
        frce0.e("identity_check_settings.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)fzqw.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        return new fznm(frli0);
    }
}

