import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epqp implements Runnable {
    public final TokenResponse a;

    public epqp(TokenResponse tokenResponse0) {
        this.a = tokenResponse0;
    }

    @Override
    public final void run() {
        String s = this.a.a().ak;
        ConsentChimeraActivity.j.m("Token response: %s, resolutionUrl=%s.", new Object[]{s, this.a.z.d});
    }
}

