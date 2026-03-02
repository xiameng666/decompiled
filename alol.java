import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.util.HashMap;

public final class alol {
    public static final baun a;
    public final frli b;
    private static final HashMap c;

    static {
        alol.c = new HashMap();
        alol.a = new baun("ProximityAuth", new String[]{"LocalFeatureStateManager"});
    }

    private alol(String s) {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("auth_proximity");
        frce0.e("local_feature_state.pb");
        frce0.c(new Account(s, "com.google"));
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.h(new frjp(cjtd.a));
        frie0.f(uri0);
        frie0.e(((MessageLite)alua.a));
        frie0.b(new almt(s));
        frif frif0 = frie0.a();
        this.b = cjtb.a.a(frif0);
    }

    public static alol a(String s) {
        alol alol0;
        synchronized(alol.class) {
            HashMap hashMap0 = alol.c;
            if(!hashMap0.containsKey(s)) {
                hashMap0.put(s, new alol(s));
            }
            alol0 = (alol)hashMap0.get(s);
        }
        return alol0;
    }

    public final gmcd b() {
        return glzd.f(gmbt.h(this.b.a()), new aloe(), gmap.a);
    }

    public final gmcd c() {
        return glzd.g(glzd.f(glzd.f(gmbt.h(this.b.a()), new alnx(), gmap.a), new alny(), gmap.a), new alnz(this), gmap.a);
    }

    public final gmcd d() {
        return glzd.f(gmbt.h(this.b.a()), new alnv(), gmap.a);
    }

    public final gmcd e() {
        return glzd.f(gmbt.h(this.b.a()), new alnu(), gmap.a);
    }

    public final gmcd f() {
        Boolean boolean0 = Boolean.valueOf(false);
        if(alrn.a()) {
            return alrv.c(AppContextProvider.a()).m() ? glzd.f(glzd.f(gmbt.h(this.b.a()), new aloi(), gmap.a), new aloj(), gmap.a) : gmbu.i(boolean0);
        }
        return alpd.c(AppContextProvider.a()).m() ? glzd.f(glzd.f(gmbt.h(this.b.a()), new aloi(), gmap.a), new aloj(), gmap.a) : gmbu.i(boolean0);
    }

    public final gmcd g(String s) {
        return glzd.g(gmbt.h(this.d()), new alnw(this, s), gmap.a);
    }

    public final gmcd h(boolean z) {
        alod alod0 = new alod(z);
        return this.b.b(alod0, gmap.a);
    }

    public final gmcd i(boolean z) {
        if(z && !almv.a(AppContextProvider.a())) {
            return gmbu.h(new IllegalStateException("Cannot enable Camera Roll when GMS Core does not have required permissions"));
        }
        aloh aloh0 = new aloh(z);
        return glzd.g(gmbt.h(this.b.b(aloh0, gmap.a)), new alob(this), gmap.a);
    }

    public final gmcd j(boolean z) {
        alnt alnt0 = new alnt(z);
        return glzd.g(gmbt.h(this.b.b(alnt0, gmap.a)), new alob(this), gmap.a);
    }

    public final void k(boolean z) {
        gmbu.t(this.h(z), new alok(this, z), gmap.a);
    }
}

