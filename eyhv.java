import android.content.Context;
import android.provider.Settings.Global;

public final class eyhv {
    public static final String a(String s, Context context0, boolean z, eybs eybs0) {
        ibuq.f(context0, "context");
        switch(eyee.a(context0).ordinal()) {
            case 0: {
                return "";
            }
            case 1: {
                ibuq.e("Blocked by work policy", "getString(...)");
                return "Blocked by work policy";
            }
            case 2: {
                ibuq.e("Unavailable when trust agent is off", "getString(...)");
                return "Unavailable when trust agent is off";
            }
            case 3: {
                ibuq.e("Unavailable. Tap to update permission.", "getString(...)");
                return "Unavailable. Tap to update permission.";
            }
            case 4: {
                ibuq.e("Unavailable when Bluetooth is off", "getString(...)");
                return "Unavailable when Bluetooth is off";
            }
            case 5: {
                ibuq.e("Tap to set up. Reduces watch battery life.", "getString(...)");
                return "Tap to set up. Reduces watch battery life.";
            }
            case 6: {
                if(s == null) {
                    ibuq.e("Tap to set up. Reduces watch battery life.", "getString(...)");
                    return "Tap to set up. Reduces watch battery life.";
                }
                if(eybs0 != null && eybs0.a == exjx.f) {
                    if(eybs0.c == exjy.c || eybs0.b == exjy.c) {
                        ibuq.e("Unavailable when Ultra-Wideband is off", "getString(...)");
                        return "Unavailable when Ultra-Wideband is off";
                    }
                    if(eybs0.e) {
                        ibuq.e("Unavailable. Tap to use it without Ultra-Wideband.", "getString(...)");
                        return "Unavailable. Tap to use it without Ultra-Wideband.";
                    }
                }
                if(z) {
                    String s1 = context0.getString(0x7F15310D, new Object[]{Settings.Global.getString(context0.getContentResolver(), "device_name")});  // string:tile_subtitle_unlock_with_watch "Unlock %1$s with this watch"
                    ibuq.c(s1);
                    return s1;
                }
                String s2 = context0.getString(0x7F153109, new Object[]{s});  // string:tile_subtitle_device_unlocks "%1$s added"
                ibuq.c(s2);
                return s2;
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

