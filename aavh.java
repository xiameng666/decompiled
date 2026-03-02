import android.content.Context;
import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;

public final class aavh implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Context context0 = AppContextProvider.a();
        boolean z = bbmn.t(context0);
        boolean z1 = true;
        if(hoju.a.b().q()) {
            int v = cchj.b(context0).p("com.google").length;
            if(!dlgw.a(context0) || v != 1 || z) {
                z1 = false;
            }
            return Boolean.valueOf(z1);
        }
        if(!dlgw.a(context0) || z) {
            z1 = false;
        }
        return Boolean.valueOf(z1);
    }
}

