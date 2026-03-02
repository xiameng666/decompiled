import android.content.Intent;
import com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity;

public final class arwb implements evqf {
    public final GoogleOneInterstitialChimeraActivity a;

    public arwb(GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity0) {
        this.a = googleOneInterstitialChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity0 = this.a;
        if(((Intent)object0) == null) {
            GoogleOneInterstitialChimeraActivity.j.f("Null intent returned by client", new Object[0]);
            googleOneInterstitialChimeraActivity0.c();
            return;
        }
        googleOneInterstitialChimeraActivity0.startActivity(((Intent)object0));
        googleOneInterstitialChimeraActivity0.overridePendingTransition(0, 0);
        googleOneInterstitialChimeraActivity0.finish();
    }
}

