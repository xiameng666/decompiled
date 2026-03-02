import android.accounts.Account;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

public final class epss implements gful_cronetEngineProvider {
    public final SignInChimeraActivity a;

    public epss(SignInChimeraActivity signInChimeraActivity0) {
        this.a = signInChimeraActivity0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        eptv eptv0 = this.a.w;
        Account account0 = this.a.o;
        gftb.check(account0);
        AuthAccountRequest authAccountRequest0 = new AuthAccountRequest(account0, this.a.p);
        azzc azzc0 = new azzc();
        azzc0.a = new epto(eptv0, authAccountRequest0);
        azzc0.d = 6307;
        return fhra.b(eptv0.iG(azzc0.a()));
    }
}

