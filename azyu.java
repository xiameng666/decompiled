import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import j..util.Objects;
import java.util.Set;

final class azyu implements Runnable {
    final SignInResponse a;
    final azyv b;

    public azyu(azyv azyv0, SignInResponse signInResponse0) {
        this.a = signInResponse0;
        Objects.requireNonNull(azyv0);
        this.b = azyv0;
        super();
    }

    @Override
    public final void run() {
        SignInResponse signInResponse0 = this.a;
        ConnectionResult connectionResult0 = signInResponse0.b;
        azyv azyv0 = this.b;
        if(connectionResult0.d()) {
            ResolveAccountResponse resolveAccountResponse0 = signInResponse0.c;
            batl.s(resolveAccountResponse0);
            ConnectionResult connectionResult1 = resolveAccountResponse0.c;
            if(!connectionResult1.d()) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: " + connectionResult1, new Exception());
                azyv0.f.b(connectionResult1);
                azyv0.e.m();
                return;
            }
            azxl azxl0 = azyv0.f;
            bary bary0 = resolveAccountResponse0.a();
            Set set0 = azyv0.c;
            if(bary0 != null && set0 != null) {
                azxl0.c = bary0;
                azxl0.d = set0;
                azxl0.c();
            }
            else {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                azxl0.b(new ConnectionResult(4));
            }
        }
        else {
            azyv0.f.b(connectionResult0);
        }
        azyv0.e.m();
    }
}

