import android.content.Context;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;

public final class cbwi implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Context context0 = AppContextProvider.a();
        if(hrnt.f()) {
            frcb frcb0 = new frcb(context0);
            frce frce0 = new frce(context0);
            frce0.d("languageprofile");
            frce0.e("mobstore_accounts.pb");
            frcb0.d = frco.b(context0, frce0.a());
            return new frbx(gged_interceptors.l(new ccsd(new frcc(frcb0))));
        }
        frcb frcb1 = new frcb(context0);
        frce frce1 = new frce(context0);
        frce1.d("languageprofile");
        frce1.e("mobstore_accounts.pb");
        frcb1.d = frco.b(context0, frce1.a());
        return new frbx(gged_interceptors.l(new frcc(frcb1)));
    }
}

