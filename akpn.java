import android.content.Context;
import com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity;
import j..util.Objects;

final class akpn implements acl {
    final akpo a;

    public akpn(akpo akpo0) {
        Objects.requireNonNull(akpo0);
        this.a = akpo0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        akpo akpo0 = this.a;
        if(!akpo0.h) {
            akpo0.h = true;
            ((akpt)akpo0.h()).g(((SetupWorkProfileChimeraActivity)akpo0));
        }
    }
}

