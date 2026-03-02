import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity;

public final class arwk implements View.OnClickListener {
    public final GoogleOneInterstitialChimeraActivity a;

    public arwk(GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity0) {
        this.a = googleOneInterstitialChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.n.setVisibility(8);
        this.a.a();
    }
}

