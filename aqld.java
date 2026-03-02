import android.content.Context;
import android.security.keystore.recovery.RecoveryController;

public final class aqld {
    public static final int a;
    private static final baun b;
    private final Context c;

    static {
        aqld.b = aqql.a("CryptoEnableCheck");
    }

    public aqld(Context context0) {
        this.c = context0;
    }

    public final boolean a() {
        return RecoveryController.isRecoverableKeyStoreEnabled(this.c);
    }

    public final boolean b() {
        if(this.a()) {
            if(hqjb.a.d().j() && !aqjl.a.o(this.c)) {
                aqld.b.h("Should not encrypt backups: user has not seen opt-in text.", new Object[0]);
                return false;
            }
            aqld.b.j("Should encrypt backups.", new Object[0]);
            return true;
        }
        aqld.b.h("Should not encrypt backups: device has no lock screen.", new Object[0]);
        return false;
    }
}

