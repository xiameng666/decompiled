import android.util.Log;
import android.view.ViewOverlay;
import java.lang.reflect.Method;

public final class furi implements ibth {
    @Override  // ibth
    public final Object a() {
        try {
            Method method0 = ViewOverlay.class.getDeclaredMethod("getOverlayView", null);
            method0.setAccessible(true);
            return new furj(method0);
        }
        catch(NoSuchMethodException unused_ex) {
            Log.w(furx.a, "Can\'t access ViewOverlay, run \"adb shell settings put global hidden_api_policy 0\" to access more view properties, see https://developer.android.com/guide/app-compatibility/restrictions-non-sdk-interfaces#how_can_i_enable_access_to_non-sdk_interfaces");
            return new furj(null);
        }
    }
}

