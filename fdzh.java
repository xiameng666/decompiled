import android.os.SystemProperties;
import java.util.Arrays;
import java.util.List;

final class fdzh {
    public static String a() {
        ffei ffei0 = ffei.d();
        if(ffei0 != null && ffei0.b) {
            String s = ffei0.f();
            return s == null ? SystemProperties.get("ro.oem.companion_package", "com.google.android.wearable.app") : s;
        }
        return SystemProperties.get("ro.oem.companion_package", "com.google.android.wearable.app");
    }

    public static List b(String s) {
        return Arrays.asList(s.split(":"));
    }
}

