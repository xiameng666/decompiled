import android.content.Context;
import com.google.android.gms.crisisalerts.settings.CrisisAlertsSettingsChimeraActivity;
import j..util.Objects;

final class bgve implements acl {
    final bgvf a;

    public bgve(bgvf bgvf0) {
        Objects.requireNonNull(bgvf0);
        this.a = bgvf0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        bgvf bgvf0 = this.a;
        if(!bgvf0.o) {
            bgvf0.o = true;
            ((bguy)bgvf0.h()).d(((CrisisAlertsSettingsChimeraActivity)bgvf0));
        }
    }
}

