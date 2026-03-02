import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.util.HashMap;

public final class almp {
    public final frli a;
    public static final int b;
    private static final HashMap c;

    static {
        almp.c = new HashMap();
    }

    private almp(String s) {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("auth_proximity");
        frce0.e("camera_roll_access_state.pb");
        frce0.c(new Account(s, "com.google"));
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)altc.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public static almp a(String s) {
        HashMap hashMap0 = almp.c;
        if(!hashMap0.containsKey(s)) {
            hashMap0.put(s, new almp(s));
        }
        return (almp)hashMap0.get(s);
    }

    public final gmcd b() {
        return glzd.g(glzd.f(gmbt.h(this.a.a()), new almn(), gmap.a), new almo(this), gmap.a);
    }

    public final gmcd c(boolean z) {
        if(z && !almv.a(AppContextProvider.a())) {
            return gmbu.h(new IllegalStateException("Cannot enable Camera Roll when GMS Core does not have required permissions"));
        }
        almm almm0 = new almm(z);
        return this.a.b(almm0, gmap.a);
    }
}

