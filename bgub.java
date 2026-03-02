import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.crisisalerts.state.CrisisAlertsSettingsChangeIntentOperation;
import j..util.Objects;

final class bgub implements gmbg {
    final boolean a;
    final bgug b;

    public bgub(bgug bgug0, boolean z) {
        this.a = z;
        Objects.requireNonNull(bgug0);
        this.b = bgug0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        bgua bgua0 = new bgua(this, this.a);
        this.b.L(bgua0);
        a.ae(bgug.d.h(), "ux opt-in exception ", throwable0);
        this.b.ak.h();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        bgug bgug0 = this.b;
        Intent intent0 = IntentOperation.getStartIntent(bgug0.am, CrisisAlertsSettingsChangeIntentOperation.class, "com.google.android.gms.crisisalerts.state.CRISIS_ALERTS_SETTINGS_CHANGED");
        if(intent0 != null) {
            bgug0.am.startService(intent0);
        }
        bgug0.ak.d(this.a);
    }
}

