import android.content.Intent;
import com.google.android.gms.cast.devicesuggestions.liaclient.LiaSettingStateIntentOperation;

public final class auem implements ibth {
    public final LiaSettingStateIntentOperation a;
    public final Intent b;

    public auem(LiaSettingStateIntentOperation liaSettingStateIntentOperation0, Intent intent0) {
        this.a = liaSettingStateIntentOperation0;
        this.b = intent0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.stopService(this.b);
        return ibom.a;
    }
}

