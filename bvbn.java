import android.content.Context;
import com.google.android.gms.googlesettings.ui.GoogleSettingsChimeraActivity;
import j..util.Objects;

final class bvbn implements acl {
    final bvbo a;

    public bvbn(bvbo bvbo0) {
        Objects.requireNonNull(bvbo0);
        this.a = bvbo0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        bvbo bvbo0 = this.a;
        if(!bvbo0.t) {
            bvbo0.t = true;
            ((bvbk)bvbo0.h()).d(((GoogleSettingsChimeraActivity)bvbo0));
        }
    }
}

