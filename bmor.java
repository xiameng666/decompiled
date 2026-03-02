import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;
import j..util.Objects;

final class bmor {
    final AuthenticateChimeraActivity a;

    public bmor(AuthenticateChimeraActivity authenticateChimeraActivity0) {
        Objects.requireNonNull(authenticateChimeraActivity0);
        this.a = authenticateChimeraActivity0;
        super();
    }

    public final void a() {
        this.a.r.q(new bmux(Status.f, gfqx.a, gfqx.a, gfqx.a, gfqx.a, gfqx.a));
    }

    public final void b(AuthenticatorErrorResponse authenticatorErrorResponse0) {
        bmuz bmuz0 = this.a.r;
        gfsx gfsx0 = gfsx.m(authenticatorErrorResponse0);
        bmuz0.q(new bmux(Status.b, gfqx.a, gfqx.a, gfsx0, gfqx.a, gfqx.a));
    }
}

