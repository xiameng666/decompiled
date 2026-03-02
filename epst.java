import android.accounts.Account;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

public final class epst implements gful_cronetEngineProvider {
    public final SignInChimeraActivity a;

    public epst(SignInChimeraActivity signInChimeraActivity0) {
        this.a = signInChimeraActivity0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        aztw aztw0 = this.a.t;
        Account account0 = this.a.o;
        gftb.check(account0);
        AuthAccountRequest authAccountRequest0 = new AuthAccountRequest(account0, this.a.p);
        return bxky.b(aztw0.c(new eptj(eptd.a, aztw0, authAccountRequest0)));
    }
}

