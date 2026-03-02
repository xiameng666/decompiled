import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import java.util.List;

public class abus extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        return null;
    }

    @Override  // avzc
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.kU);
        if("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent0.getAction())) {
            abut abut0 = abut.k;
            if(!abus.j(intent0, "GoogleSettingsActivity") && abut0 != null) {
                Bundle bundle0 = intent0.getExtras();
                if(bundle0 == null) {
                    throw new IllegalArgumentException("Bundle passed from GoogleSettingsActivity must not be null.");
                }
                List list0 = cjah.a(bundle0);
                if(abut0.n == list0) {
                    abut0.runOnUiThread(new abur(this, abut0));
                }
            }
        }
    }
}

