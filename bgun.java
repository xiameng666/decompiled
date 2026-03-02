import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.crisisalerts.state.CrisisAlertsSettingsChangeIntentOperation;
import j..util.Objects;

final class bgun implements gmbg {
    final boolean a;
    final bgus b;

    public bgun(bgus bgus0, boolean z) {
        this.a = z;
        Objects.requireNonNull(bgus0);
        this.b = bgus0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        bgum bgum0 = new bgum(this, this.a);
        this.b.L(bgum0);
        a.ae(bgus.d.h(), "ux opt-in exception ", throwable0);
        this.b.al.h();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        bgus bgus0 = this.b;
        Intent intent0 = IntentOperation.getStartIntent(bgus0.an, CrisisAlertsSettingsChangeIntentOperation.class, "com.google.android.gms.crisisalerts.state.CRISIS_ALERTS_SETTINGS_CHANGED");
        if(intent0 != null) {
            bgus0.an.startService(intent0);
        }
        bgus0.al.d(this.a);
    }
}

