import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Locale;

public final class arwj implements Runnable {
    public final GoogleOneInterstitialChimeraActivity a;
    public final Account b;

    public arwj(GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity0, Account account0) {
        this.a = googleOneInterstitialChimeraActivity0;
        this.b = account0;
    }

    @Override
    public final void run() {
        GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity0;
        try {
            googleOneInterstitialChimeraActivity0 = this.a;
            evqp evqp0 = googleOneInterstitialChimeraActivity0.m;
            adgg adgg0 = new adgg(googleOneInterstitialChimeraActivity0);
            String s = String.format(Locale.getDefault(), "weblogin:service=gaia&continue=%s", Uri.encode(googleOneInterstitialChimeraActivity0.k));
            evqp0.b(adgg0.b(googleOneInterstitialChimeraActivity0, this.b, s));
        }
        catch(UserRecoverableAuthException userRecoverableAuthException0) {
            if(userRecoverableAuthException0.a() != null) {
                googleOneInterstitialChimeraActivity0.startActivityForResult(userRecoverableAuthException0.a(), 0x7B);
                return;
            }
            azzf.c(Status.d, null, googleOneInterstitialChimeraActivity0.m);
        }
        catch(IOException | acse unused_ex) {
            azzf.c(Status.d, null, googleOneInterstitialChimeraActivity0.m);
        }
    }
}

