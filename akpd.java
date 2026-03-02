import android.content.Context;
import com.google.android.gms.auth.managed.ui.DeviceEnrollmentChimeraActivity;
import j..util.Objects;

final class akpd implements acl {
    final akpe a;

    public akpd(akpe akpe0) {
        Objects.requireNonNull(akpe0);
        this.a = akpe0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        akpe akpe0 = this.a;
        if(!akpe0.k) {
            akpe0.k = true;
            ((akmc)akpe0.h()).J(((DeviceEnrollmentChimeraActivity)akpe0));
        }
    }
}

