import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

public final class fxly {
    public static void a(Context context0, boolean z, bboh bboh0, fcer fcer0) {
        fxng.b((z ? 3 : 4), bbpg.a(context0));
        if(huqb.H()) {
            fcfh fcfh0 = fcfh.a("/ealert_sync_setting_from_phone");
            fcfh0.a.j("EALERT_SETTING_OPTIN", z);
            evql evql0 = fcer0.h(fcfh0.b());
            evql0.b(new fxlv());
            evql0.A(new fxlw(bboh0));
        }
        fxly.b(context0, z, bboh0);
    }

    public static void b(Context context0, boolean z, bboh bboh0) {
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.location.quake.ealert.EAlertSettingChangeIntentOperation", "com.google.android.settings.EALERT_SETTING_CHANGED");
        if(intent0 != null) {
            intent0.putExtra("EALERT_SETTING_OPTIN", z);
            context0.startService(intent0);
            return;
        }
        ((ggtj)bboh0.j()).x("Setting change Intent is null. Should not happen.");
    }
}

