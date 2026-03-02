import android.accounts.AuthenticatorException;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class eprf implements Runnable {
    public final AuthenticatorException a;

    public eprf(AuthenticatorException authenticatorException0) {
        this.a = authenticatorException0;
    }

    @Override
    public final void run() {
        ConsentChimeraActivity.j.n("AuthenticatorException performing reauth", this.a, new Object[0]);
    }
}

