import android.content.Context;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;

public final class dmbd implements dmba {
    private static final bboh a;
    private final Context b;

    static {
        dmbd.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmbd(Context context0) {
        this.b = context0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        if(hjwe0.b == 67) {
            hjwh hjwh0 = (hjwh)hjwe0.c;
            try {
                return Settings.Secure.getInt(this.b.getContentResolver(), "smartspace_pref_wallet_suggestions_key") == 1 ? hjwh0.b : !hjwh0.b;
            }
            catch(Settings.SettingNotFoundException settings$SettingNotFoundException0) {
                a.e(dmbd.a.j(), "Failed to get smartspace setting %s", "smartspace_pref_wallet_suggestions_key", settings$SettingNotFoundException0);
            }
        }
        return false;
    }
}

