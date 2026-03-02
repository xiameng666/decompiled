import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.cryptauth.AppContextProvider;
import java.util.concurrent.TimeUnit;

public final class ajkt {
    public static final int a;
    private static final cllc b;

    static {
        ajkt.b = cllb.a(0, ((int)TimeUnit.MILLISECONDS.toSeconds(hpta.d())), ((int)TimeUnit.MILLISECONDS.toSeconds(hpta.e())));
    }

    public static String a(String s) {
        String s1 = "cryptauth_syncKeys_" + s.hashCode();
        return s1.length() <= 100 ? s1 : s1.substring(0, 100);
    }

    public static void b(String s, gmkj gmkj0) {
        long v = hpta.d();
        Bundle bundle0 = new Bundle();
        bundle0.putString("account_name", s);
        bundle0.putInt("invocation_reason", gmkj0.a());
        clkn clkn0 = new clkn();
        clkn0.p = true;
        clkn0.e(TimeUnit.MILLISECONDS.toSeconds(v), TimeUnit.MILLISECONDS.toSeconds(v + hptz.a.b().a()));
        clkn0.t(ajkt.a(s));
        clkn0.w("com.google.android.gms.auth.cryptauth.synckeys.SyncKeysChimeraService");
        clkn0.u = bundle0;
        clkn0.t = ajkt.b;
        clkn0.g(0);
        clkn0.v(2);
        clkn0.x(0, 1);
        ajkt.c(clkn0.a());
    }

    public static void c(cllp cllp0) {
        cljp.a(AppContextProvider.a()).f(cllp0);
    }

    public static void d(Uri uri0, Bundle bundle0) {
        clja clja0 = new clja();
        clja0.p = true;
        clja0.c(new cliz(uri0, 0));
        clja0.t("cryptauth_sync_phonetheft_toggled");
        clja0.w("com.google.android.gms.auth.cryptauth.synckeys.SyncKeysChimeraService");
        clja0.u = bundle0;
        clja0.t = ajkt.b;
        clja0.g(0);
        clja0.v(2);
        clja0.x(0, 1);
        ajkt.c(clja0.a());
    }
}

