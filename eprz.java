import android.accounts.Account;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

public final class eprz implements gful_cronetEngineProvider {
    public final SignInChimeraActivity a;
    public final int b;

    public eprz(SignInChimeraActivity signInChimeraActivity0, int v) {
        this.a = signInChimeraActivity0;
        this.b = v;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        eptv eptv0 = this.a.w;
        Account account0 = this.a.o;
        gftb.check(account0);
        azzc azzc0 = new azzc();
        azzc0.a = new eptp(eptv0, this.b, account0);
        azzc0.d = 6303;
        return fhra.b(eptv0.jn(azzc0.a()));
    }
}

