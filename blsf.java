import android.content.Intent;
import com.google.android.gms.fido.authenticator.service.AuthenticatorChimeraService;

public final class blsf implements Runnable {
    public final AuthenticatorChimeraService a;
    public final bnae b;

    public blsf(AuthenticatorChimeraService authenticatorChimeraService0, bnae bnae0) {
        this.a = authenticatorChimeraService0;
        this.b = bnae0;
    }

    @Override
    public final void run() {
        AuthenticatorChimeraService authenticatorChimeraService0 = this.a;
        Intent intent0 = (Intent)((gfsx)authenticatorChimeraService0.e.get()).g();
        authenticatorChimeraService0.e.set(gfqx.a);
        if(intent0 != null) {
            if(hsvd.f()) {
                new bnah(authenticatorChimeraService0).y(this.b, blhc.g);
            }
            authenticatorChimeraService0.a(intent0);
        }
    }
}

