import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.googleone.smui.SmuiChimeraActivity;

final class buik implements icih {
    final SmuiChimeraActivity a;

    public buik(SmuiChimeraActivity smuiChimeraActivity0) {
        this.a = smuiChimeraActivity0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if((((buiv)object0) instanceof buit)) {
            UserRecoverableAuthException userRecoverableAuthException0 = ((buit)(((buiv)object0))).a;
            Intent intent0 = userRecoverableAuthException0.a();
            if(intent0 != null) {
                ((ggtj)SmuiChimeraActivity.k.h()).x("Invalid authentication, asking user to re-login");
                acp acp0 = this.a.l;
                if(acp0 == null) {
                    ibuq.j("reAuthResultLauncher");
                    acp0 = null;
                }
                acp0.b(intent0);
                return ibom.a;
            }
            a.ae(SmuiChimeraActivity.k.j(), "User recoverable auth exception encountered but no recoverable intent was provided.", userRecoverableAuthException0);
            this.a.f();
            return ibom.a;
        }
        if(!(((buiv)object0) instanceof buir) && !(((buiv)object0) instanceof buiu)) {
            if(!(((buiv)object0) instanceof buis)) {
                throw new ibnq();
            }
            ((ggtj)SmuiChimeraActivity.k.h()).x("Fetching user account state");
            return ibom.a;
        }
        this.a.f();
        return ibom.a;
    }
}

