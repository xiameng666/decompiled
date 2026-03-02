import android.content.Context;
import com.google.android.gms.spatula.settings.ui.SpatulaSettingsChimeraActivity;
import j..util.Objects;

final class ervg implements acl {
    final ervh a;

    public ervg(ervh ervh0) {
        Objects.requireNonNull(ervh0);
        this.a = ervh0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        ervh ervh0 = this.a;
        if(!ervh0.j) {
            ervh0.j = true;
            ((ervj)ervh0.h()).d(((SpatulaSettingsChimeraActivity)ervh0));
        }
    }
}

