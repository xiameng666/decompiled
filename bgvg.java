import android.content.Context;
import com.google.android.gms.crisisalerts.settings.CrisisAlertsSettingsChimeraV31Activity;
import j..util.Objects;

final class bgvg implements acl {
    final bgvh a;

    public bgvg(bgvh bgvh0) {
        Objects.requireNonNull(bgvh0);
        this.a = bgvh0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        bgvh bgvh0 = this.a;
        if(!bgvh0.k) {
            bgvh0.k = true;
            ((bguz)bgvh0.h()).e(((CrisisAlertsSettingsChimeraV31Activity)bgvh0));
        }
    }
}

