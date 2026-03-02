import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epqo implements Runnable {
    public final TokenResponse a;

    public epqo(TokenResponse tokenResponse0) {
        this.a = tokenResponse0;
    }

    @Override
    public final void run() {
        Object[] arr_object = {this.a.a().ak};
        ConsentChimeraActivity.j.m("Token response: %s.", arr_object);
    }
}

