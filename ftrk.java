import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.provider.Settings.Secure;

public final class ftrk {
    public static final ftrk a;
    private static final gfsx b;
    private static final gfsx c;

    static {
        ftrk.a = new ftrk();
        ftrk.b = gfqx.a;
        ftrk.c = gfqx.a;
    }

    public static final gtmx a(Context context0) {
        int v1;
        ibuq.f(context0, "context");
        try {
            if(Resources.getSystem().getInteger(Resources.getSystem().getIdentifier("config_doubleTapPowerGestureMode", "integer", "android")) == 2) {
                goto label_7;
            }
        }
        catch(Resources.NotFoundException unused_ex) {
            Boolean boolean0 = Boolean.valueOf(false);
            ftrk.b.f(boolean0);
            boolean0.getClass();
        }
        return gtmx.b;
    label_7:
        int v = Settings.Secure.getInt(context0.getContentResolver(), "double_tap_power_button_gesture_enabled", 1);
        if(v == 1) {
            try {
                v1 = Resources.getSystem().getInteger(Resources.getSystem().getIdentifier("config_doubleTapPowerGestureMultiTargetDefaultAction", "integer", "android"));
            }
            catch(Resources.NotFoundException unused_ex) {
                Integer integer0 = (int)-1;
                ftrk.c.f(integer0);
                v1 = integer0.intValue();
            }
            switch(Settings.Secure.getInt(context0.getContentResolver(), "double_tap_power_button_gesture", v1)) {
                case 0: {
                    return gtmx.d;
                }
                case 1: {
                    return gtmx.e;
                }
                default: {
                    return gtmx.a;
                }
            }
        }
        return v == 0 ? gtmx.c : gtmx.a;
    }
}

