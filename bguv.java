import com.google.android.gms.crisisalerts.settings.CrisisAlertsSettingsChimeraActivity;
import j..util.Objects;

public final class bguv implements gmbg {
    final CrisisAlertsSettingsChimeraActivity a;

    public bguv(CrisisAlertsSettingsChimeraActivity crisisAlertsSettingsChimeraActivity0) {
        Objects.requireNonNull(crisisAlertsSettingsChimeraActivity0);
        this.a = crisisAlertsSettingsChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.a.l.f();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        bguu bguu0 = new bguu(this, boolean0);
        this.a.runOnUiThread(bguu0);
        this.a.l.e(boolean0.booleanValue());
    }
}

