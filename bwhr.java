import android.content.Context;
import android.provider.Settings.Global;
import android.provider.Settings.SettingNotFoundException;

public final class bwhr {
    public static final boolean a(Context context0) {
        ibuq.f(context0, "context");
        try {
            if(Settings.Global.getInt(context0.getContentResolver(), "device_provisioned") == 1) {
                return true;
            }
        }
        catch(Settings.SettingNotFoundException settings$SettingNotFoundException0) {
            ((ggtj)((ggtj)bwht.a.i()).s(settings$SettingNotFoundException0)).B("Global.DEVICE_PROVISIONED not found, SHOULD NEVER HAPPEN: %s", settings$SettingNotFoundException0);
        }
        return false;
    }
}

