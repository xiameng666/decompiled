import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epqu implements Runnable {
    public final TokenResponse a;

    public epqu(TokenResponse tokenResponse0) {
        this.a = tokenResponse0;
    }

    @Override
    public final void run() {
        ConsentChimeraActivity.j.m("Setting cookies to resolution url=%s", new Object[]{this.a.z.d});
    }
}

