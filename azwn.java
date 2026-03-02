import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import j..util.Objects;

final class azwn extends azwy {
    final azwr a;
    final SignInResponse b;

    public azwn(azwo azwo0, azwx azwx0, azwr azwr0, SignInResponse signInResponse0) {
        this.a = azwr0;
        this.b = signInResponse0;
        Objects.requireNonNull(azwo0);
        super(azwx0);
    }

    @Override  // azwy
    public final void a() {
        azwr azwr0 = this.a;
        if(!azwr0.m(0)) {
            return;
        }
        SignInResponse signInResponse0 = this.b;
        ConnectionResult connectionResult0 = signInResponse0.b;
        if(connectionResult0.d()) {
            ResolveAccountResponse resolveAccountResponse0 = signInResponse0.c;
            batl.s(resolveAccountResponse0);
            ConnectionResult connectionResult1 = resolveAccountResponse0.c;
            if(!connectionResult1.d()) {
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: " + connectionResult1, new Exception());
                azwr0.j(connectionResult1);
                return;
            }
            azwr0.f = true;
            bary bary0 = resolveAccountResponse0.a();
            batl.s(bary0);
            azwr0.g = bary0;
            azwr0.h = resolveAccountResponse0.d;
            azwr0.i = resolveAccountResponse0.e;
            azwr0.l();
            return;
        }
        if(azwr0.o(connectionResult0)) {
            azwr0.i();
            azwr0.l();
            return;
        }
        azwr0.j(connectionResult0);
    }
}

