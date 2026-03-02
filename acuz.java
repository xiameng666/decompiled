import android.net.Uri;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import j..util.DesugarCollections;
import j..util.Map.-EL;
import java.util.Map;

public final class acuz {
    public static final ajcl a;
    public final frli b;
    private static final frlp c;

    static {
        acuz.c = new frlp(((MessageLite)adry.a));
        acuz.a = new acuy();
    }

    public acuz() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("authaccount");
        frce0.e("GoogleAccountDataStore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)adry.a));
        frie0.h(new frjp(cjtd.a));
        frie0.d(acuz.c);
        frif frif0 = frie0.a();
        this.b = cjtb.a.a(frif0);
    }

    public final String a(GoogleAccount googleAccount0) {
        batl.j();
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/auth/aang/data/accountdata/GoogleAccountDataStore", "getLst", 100, "GoogleAccountDataStore.getLst")) {
            adrz adrz0 = ((adrw)Map.-EL.getOrDefault(this.b(), googleAccount0.a, adrw.a)).c;
            if(adrz0 == null) {
                adrz0 = adrz.a;
            }
            if((adrz0.b & 1) != 0) {
                return adrz0.c;
            }
        }
        return null;
    }

    public final Map b() {
        batl.j();
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/auth/aang/data/accountdata/GoogleAccountDataStore", "getAllGoogleAccountData", 0xB3, "GoogleAccountDataStore.getAllGoogleAccountData")) {
            return DesugarCollections.unmodifiableMap(((adry)acyn.a(this.b.a())).b);
        }
    }

    public final void c(GoogleAccount googleAccount0) {
        batl.j();
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/auth/aang/data/accountdata/GoogleAccountDataStore", "removeGoogleAccountData", 0x9B, "GoogleAccountDataStore.removeGoogleAccountData")) {
            acuw acuw0 = new acuw(googleAccount0);
            acyn.a(this.b.b(acuw0, gmap.a));
        }
    }
}

