import android.content.Context;
import com.google.android.gms.googlesettings.ui.GoogleSettingsLauncherChimeraActivity;
import j..util.Objects;

final class bvbp implements acl {
    final bvbq a;

    public bvbp(bvbq bvbq0) {
        Objects.requireNonNull(bvbq0);
        this.a = bvbq0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        bvbq bvbq0 = this.a;
        if(!bvbq0.l) {
            bvbq0.l = true;
            ((bvbm)bvbq0.h()).e(((GoogleSettingsLauncherChimeraActivity)bvbq0));
        }
    }
}

