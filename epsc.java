import android.accounts.Account;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

public final class epsc implements gful_cronetEngineProvider {
    public final SignInChimeraActivity a;
    public final int b;

    public epsc(SignInChimeraActivity signInChimeraActivity0, int v) {
        this.a = signInChimeraActivity0;
        this.b = v;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        aztw aztw0 = this.a.t;
        Account account0 = this.a.o;
        gftb.check(account0);
        return bxky.b(aztw0.c(new eptf(eptd.a, aztw0, this.b, account0)));
    }
}

