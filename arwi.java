import com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity;

public final class arwi implements evqc {
    public final GoogleOneInterstitialChimeraActivity a;

    public arwi(GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity0) {
        this.a = googleOneInterstitialChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        GoogleOneInterstitialChimeraActivity.j.f("Error while retrieving token", new Object[0]);
        this.a.c();
    }
}

