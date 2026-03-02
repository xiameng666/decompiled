import com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity;

public final class arwh implements evqf {
    public final GoogleOneInterstitialChimeraActivity a;

    public arwh(GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity0) {
        this.a = googleOneInterstitialChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity0 = this.a;
        if(((String)object0) != null && ((String)object0).length() > 0) {
            googleOneInterstitialChimeraActivity0.p.loadUrl(((String)object0));
            return;
        }
        GoogleOneInterstitialChimeraActivity.j.f("Error while retrieving token", new Object[0]);
        googleOneInterstitialChimeraActivity0.c();
    }
}

