import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;
import j..util.Objects;

public final class bmot implements bmgg {
    final RequestOptions a;
    final AuthenticateChimeraActivity b;

    public bmot(AuthenticateChimeraActivity authenticateChimeraActivity0, RequestOptions requestOptions0) {
        this.a = requestOptions0;
        Objects.requireNonNull(authenticateChimeraActivity0);
        this.b = authenticateChimeraActivity0;
        super();
    }

    @Override  // blyx
    public final void a() {
        this.b.b();
    }

    @Override  // blyx
    public final void b(blyu blyu0, int v) {
        this.b.c(blyu0, v);
    }

    @Override  // bmgg
    public final void c(AuthenticatorErrorResponse authenticatorErrorResponse0) {
        bmos bmos0 = new bmos(this, authenticatorErrorResponse0, this.a);
        this.b.runOnUiThread(bmos0);
    }

    @Override  // bmgg
    public final void d() {
        this.b.j.a();
    }

    @Override  // bmgg
    public final void e(PublicKeyCredential publicKeyCredential0) {
        AuthenticateChimeraActivity.u(this.a.b(), publicKeyCredential0);
        this.b.w(publicKeyCredential0);
    }

    @Override  // bmgg
    public final void f(String s) {
        this.b.s(s, this.b.j);
    }
}

