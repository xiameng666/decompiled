import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import java.util.List;

public class abun extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        return null;
    }

    @Override  // avzc
    public final void onHandleIntent(Intent intent0) {
        Object object0 = abuo.b;
        synchronized(object0) {
            if("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent0.getAction()) && !abun.j(intent0, "GoogleSettingsIndexGetter")) {
                Bundle bundle0 = intent0.getExtras();
                if(bundle0 == null) {
                    throw new IllegalArgumentException("Bundle must not be null.");
                }
                List list0 = cjah.a(bundle0);
                if(abuo.a == list0) {
                    object0.notify();
                }
            }
        }
    }
}

