import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.crisisalerts.settings.CrisisAlertsSettingsChimeraActivity;
import com.google.android.gms.crisisalerts.state.CrisisAlertsSettingsChangeIntentOperation;
import j..util.Objects;

public final class bgux implements gmbg {
    final boolean a;
    final CrisisAlertsSettingsChimeraActivity b;

    public bgux(CrisisAlertsSettingsChimeraActivity crisisAlertsSettingsChimeraActivity0, boolean z) {
        this.a = z;
        Objects.requireNonNull(crisisAlertsSettingsChimeraActivity0);
        this.b = crisisAlertsSettingsChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        bguw bguw0 = new bguw(this, this.a);
        this.b.runOnUiThread(bguw0);
        a.ae(CrisisAlertsSettingsChimeraActivity.j.h(), "ux opt-in exception ", throwable0);
        this.b.l.h();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        CrisisAlertsSettingsChimeraActivity crisisAlertsSettingsChimeraActivity0 = this.b;
        Intent intent0 = IntentOperation.getStartIntent(crisisAlertsSettingsChimeraActivity0.n, CrisisAlertsSettingsChangeIntentOperation.class, "com.google.android.gms.crisisalerts.state.CRISIS_ALERTS_SETTINGS_CHANGED");
        if(intent0 != null) {
            crisisAlertsSettingsChimeraActivity0.startService(intent0);
        }
        crisisAlertsSettingsChimeraActivity0.l.d(this.a);
    }
}

