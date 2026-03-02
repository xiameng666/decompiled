import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.ui.AuthenticateChimeraActivity;
import j..util.Objects;

public final class bngg implements bnct {
    final AuthenticateChimeraActivity a;

    public bngg(AuthenticateChimeraActivity authenticateChimeraActivity0) {
        Objects.requireNonNull(authenticateChimeraActivity0);
        this.a = authenticateChimeraActivity0;
        super();
    }

    @Override  // blyx
    public final void a() {
        this.a.b();
    }

    @Override  // blyx
    public final void b(blyu blyu0, int v) {
        this.a.c(blyu0, v);
    }

    @Override  // bnct
    public final void c(RegisterResponseData registerResponseData0) {
        this.a.u(registerResponseData0);
    }

    @Override  // bncw
    public final void d(ErrorResponseData errorResponseData0) {
        this.a.u(errorResponseData0);
    }

    @Override  // bncw
    public final void e(String s) {
        this.a.s(s, this.a.j);
    }
}

