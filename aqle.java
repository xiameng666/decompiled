import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;

public final class aqle {
    public static final baun a;
    public static final ggfp b;
    public final bakc c;
    private final Context d;
    private RecoveryController e;

    static {
        aqle.a = aqql.a("CryptoSettings");
        aqle.b = ggfp.M("isInitialized", "activeSecondary", "nextSecondary", "secondaryKeyLastRotatedAt");
    }

    private aqle(bakc bakc0, Context context0) {
        this.c = bakc0;
        batl.s(context0);
        this.d = context0;
    }

    public static aqle a(Context context0) {
        return new aqle(new bakc(context0, "crypto_settings", true), context0);
    }

    public final gfsx b() {
        return this.k("activeSecondary");
    }

    public final gfsx c() {
        return this.k("nextSecondary");
    }

    public final void d(String s) {
        try {
            if(this.j().getAliases().contains(s)) {
                return;
            }
            throw new aqlh(s + " is not in RecoveryController");
        }
        catch(InternalRecoveryServiceException internalRecoveryServiceException0) {
            throw new aqlh(((Throwable)internalRecoveryServiceException0));
        }
    }

    public final void e() {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.c.edit();
        sharedPreferences$Editor0.remove("nextSecondary");
        sharedPreferences$Editor0.apply();
    }

    public final void f(String s) {
        this.d(s);
        SharedPreferences.Editor sharedPreferences$Editor0 = this.c.edit();
        sharedPreferences$Editor0.putString("activeSecondary", s);
        sharedPreferences$Editor0.apply();
    }

    public final void g(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.c.edit();
        sharedPreferences$Editor0.putString("ancestral_secondary_key_version", s);
        sharedPreferences$Editor0.apply();
    }

    public final void h(long v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.c.edit();
        sharedPreferences$Editor0.putLong("secondaryKeyLastRotatedAt", v);
        sharedPreferences$Editor0.apply();
    }

    public final boolean i() {
        return this.c.getBoolean("isInitialized", false);
    }

    private final RecoveryController j() {
        synchronized(this) {
            if(this.e == null) {
                this.e = RecoveryController.getInstance(this.d);
            }
        }
        return this.e;
    }

    private final gfsx k(String s) {
        return gfsx.l(this.c.getString(s, null));
    }
}

