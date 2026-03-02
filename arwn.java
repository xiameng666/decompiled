import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.backup.g1.interstitial.GoogleOneInterstitialChimeraActivity;
import j..util.Objects;

public final class arwn extends fpyq {
    final GoogleOneInterstitialChimeraActivity a;

    public arwn(GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity0) {
        Objects.requireNonNull(googleOneInterstitialChimeraActivity0);
        this.a = googleOneInterstitialChimeraActivity0;
        fpyt fpyt0 = fpyt.b(gged_interceptors.i(googleOneInterstitialChimeraActivity0.l.b));
        super(fpyt0, fpyt0);
    }

    @Override  // fpyq
    public final boolean a(String s) {
        GoogleOneInterstitialChimeraActivity.j.f("URL load blocked: %s", new Object[]{s});
        return true;
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        GoogleOneInterstitialChimeraActivity googleOneInterstitialChimeraActivity0 = this.a;
        if(googleOneInterstitialChimeraActivity0.n.getVisibility() == 0) {
            GoogleOneInterstitialChimeraActivity.j.f("Not showing webview since there was an error.", new Object[0]);
            return;
        }
        googleOneInterstitialChimeraActivity0.o.setVisibility(8);
        googleOneInterstitialChimeraActivity0.n.setVisibility(8);
        googleOneInterstitialChimeraActivity0.p.setVisibility(0);
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
        aqql aqql0 = GoogleOneInterstitialChimeraActivity.j;
        Integer integer0 = webResourceError0 == null ? "" : webResourceError0.getErrorCode();
        aqql0.f("Error %s while loading page: %s", new Object[]{integer0, webResourceRequest0.getUrl().toString()});
        if(webResourceRequest0.isForMainFrame()) {
            this.a.c();
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
        aqql aqql0 = GoogleOneInterstitialChimeraActivity.j;
        Integer integer0 = webResourceResponse0 == null ? "" : webResourceResponse0.getStatusCode();
        aqql0.f("HTTP error %s while loading page: %s", new Object[]{integer0, webResourceRequest0.getUrl().toString()});
        if(webResourceRequest0.isForMainFrame()) {
            this.a.c();
        }
    }
}

