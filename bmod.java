import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;

public final class bmod implements lqj {
    public final AuthenticateChimeraActivity a;

    public bmod(AuthenticateChimeraActivity authenticateChimeraActivity0) {
        this.a = authenticateChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        bmfr bmfr0 = this.a.p;
        blpw blpw0 = (blpw)((bmux)object0).f.g();
        if(blpw0 != null) {
            bmfr0.h(((AuthenticatorResponse)blpw0.a().d()), ((bmhg)blpw0.b().f(bmhg.e)), blpw0.a, blpw0.b, gfqx.a);
        }
    }
}

