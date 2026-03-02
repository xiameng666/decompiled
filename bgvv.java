import android.content.Context;
import android.content.Intent;
import com.google.android.gms.crisisalerts.state.CrisisAlertsSettingsChangeIntentOperation;

public final class bgvv implements Runnable {
    public final bgvx a;

    public bgvv(bgvx bgvx0) {
        this.a = bgvx0;
    }

    @Override
    public final void run() {
        Context context0 = this.a.a;
        Intent intent0 = CrisisAlertsSettingsChangeIntentOperation.getStartIntent(context0, CrisisAlertsSettingsChangeIntentOperation.class, "com.google.android.gms.crisisalerts.state.CRISIS_ALERTS_SETTINGS_CHANGED");
        if(intent0 != null) {
            context0.startService(intent0);
        }
    }
}

