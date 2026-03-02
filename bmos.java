import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;

public final class bmos implements Runnable {
    public final bmot a;
    public final AuthenticatorErrorResponse b;
    public final RequestOptions c;

    public bmos(bmot bmot0, AuthenticatorErrorResponse authenticatorErrorResponse0, RequestOptions requestOptions0) {
        this.a = bmot0;
        this.b = authenticatorErrorResponse0;
        this.c = requestOptions0;
    }

    @Override
    public final void run() {
        int v1;
        bmih bmih0 = new bmih();
        bmih0.c = this.b;
        PublicKeyCredential publicKeyCredential0 = bmih0.a();
        bmot bmot0 = this.a;
        RequestOptions requestOptions0 = this.c;
        int v = this.b.c;
        if(v != 1 && v != 2) {
            AuthenticateChimeraActivity.u(requestOptions0.b(), publicKeyCredential0);
            bmot0.b.w(publicKeyCredential0);
            return;
        }
        AuthenticateChimeraActivity authenticateChimeraActivity0 = bmot0.b;
        authenticateChimeraActivity0.x = v == 1 ? "Screen lock is missing." : "Google account is missing.";
        bmih bmih1 = new bmih();
        bmhb bmhb0 = new bmhb();
        bmhb0.b(ErrorCode.i);
        bmhb0.a = authenticateChimeraActivity0.x;
        bmih1.c = bmhb0.a();
        authenticateChimeraActivity0.w = AuthenticateChimeraActivity.y(bmih1.a());
        if(v != 1) {
            v1 = 6;
        }
        else if(blwt.m(requestOptions0)) {
            v1 = 7;
        }
        else {
            v1 = 16;
        }
        authenticateChimeraActivity0.r.y(v1);
    }
}

