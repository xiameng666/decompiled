import android.content.ComponentName;
import android.content.Intent;

public final class eyny {
    public final String a;
    public final boolean b;
    public final eynx c;
    private final Intent d;
    private final ComponentName e;

    public eyny(Intent intent0, ComponentName componentName0) {
        ibuq.f(intent0, "intent");
        super();
        this.d = intent0;
        this.e = componentName0;
        this.a = intent0.getStringExtra("EXTRA_COMPANION_DEVICE_BT_ADDRESS");
        eynx eynx0 = null;
        boolean z = ibuq.m((componentName0 == null ? null : componentName0.getClassName()), "com.android.settings.Settings$CombinedBiometricSettingsActivity") && ibuq.m(componentName0.getPackageName(), "com.android.settings");
        this.b = z;
        if(z) {
            eynx0 = eynx.c;
        }
        else {
            String s = intent0.getStringExtra("EXTRA_ACTIVE_UNLOCK_SETTINGS_ENTRY_POINT");
            if(s != null) {
                eynx0 = (eynx)Enum.valueOf(eynx.class, s);
            }
        }
        this.c = eynx0;
    }
}

