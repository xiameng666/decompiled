import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;

public final class blqh implements lqj {
    public final bmzg a;

    public blqh(bmzg bmzg0) {
        this.a = bmzg0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        AuthenticatorResponse authenticatorResponse0 = (AuthenticatorResponse)((bmux)object0).d.g();
        blpw blpw0 = (blpw)((bmux)object0).f.g();
        bmzg bmzg0 = this.a;
        if(blpw0 != null && blpw0.a().i()) {
            bmzg0.a(((AuthenticatorResponse)blpw0.a().d()), ((bmhg)blpw0.b().f(bmhg.e)), blpw0.b, gfqx.a);
            return;
        }
        if(authenticatorResponse0 != null) {
            bmgk bmgk0 = new bmgk(gfqx.a, gfqx.a);
            bmzg0.a(authenticatorResponse0, bmhg.e, bmgk0, gfqx.a);
            return;
        }
        bmhb bmhb0 = new bmhb();
        bmhb0.b(ErrorCode.k);
        bmhb0.a = "Cannot find credential in local KeyStore or database";
        AuthenticatorErrorResponse authenticatorErrorResponse0 = bmhb0.a();
        bmgk bmgk1 = new bmgk(gfqx.a, gfqx.a);
        bmzg0.a(authenticatorErrorResponse0, bmhg.a, bmgk1, gfqx.a);
    }
}

