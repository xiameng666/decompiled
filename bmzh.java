import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import j..util.Objects;

public final class bmzh implements bnem {
    public final bmzj a;

    public bmzh(bmzj bmzj0) {
        Objects.requireNonNull(bmzj0);
        this.a = bmzj0;
        super();
    }

    public final void a(Transport transport0, PublicKeyCredential publicKeyCredential0) {
        bmhg bmhg0;
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs0 = null;
        if(this.a.b.b != bncu.c) {
            if(transport0 == null) {
                bmhg0 = null;
            }
            else {
                try {
                    bmhg0 = bmhg.a(transport0.h);
                }
                catch(bmhf bmhf0) {
                    this.a.d.l.a(this.a.d.c, bmhf0);
                    this.a.b(ErrorCode.h, "Unsupported transport " + transport0.h);
                    return;
                }
            }
            if(bmhg0 != null) {
                AuthenticatorResponse authenticatorResponse0 = publicKeyCredential0.a();
                if(!(authenticatorResponse0 instanceof AuthenticatorAttestationResponse) && !(authenticatorResponse0 instanceof AuthenticatorErrorResponse)) {
                    this.a.c(ErrorCode.h, "Received invalid authenticator response.", bmhg0);
                    return;
                }
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs0 = publicKeyCredential0.h;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs0 = authenticationExtensionsClientOutputs0 == null ? null : authenticationExtensionsClientOutputs0.c;
                bmzj bmzj0 = this.a;
                boolean z = authenticationExtensionsCredPropsOutputs0 != null && authenticationExtensionsCredPropsOutputs0.a;
                gfsx gfsx0 = gfsx.l((authenticationExtensionsClientOutputs0 == null ? null : authenticationExtensionsClientOutputs0.b));
                if(authenticationExtensionsClientOutputs0 != null) {
                    authenticationExtensionsPrfOutputs0 = authenticationExtensionsClientOutputs0.d;
                }
                bmzj0.d(authenticatorResponse0, bmhg0, z, new bmgk(gfsx0, gfsx.l(authenticationExtensionsPrfOutputs0)), gfqx.a);
            }
        }
    }

    @Override  // bnem
    public final void b(Transport transport0, ResponseData responseData0) {
        this.a.e.b(transport0, responseData0);
    }
}

