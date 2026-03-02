import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.gms.udc.ui.AuthenticatingWebViewChimeraActivity;
import j..util.Objects;

public final class ezsu extends WebChromeClient {
    final AuthenticatingWebViewChimeraActivity a;

    public ezsu(AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity0) {
        Objects.requireNonNull(authenticatingWebViewChimeraActivity0);
        this.a = authenticatingWebViewChimeraActivity0;
        super();
    }

    @Override  // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView0, int v) {
        AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity0 = this.a;
        if(authenticatingWebViewChimeraActivity0.l) {
            authenticatingWebViewChimeraActivity0.m.setProgress(v);
            if(v == 100) {
                authenticatingWebViewChimeraActivity0.m.setVisibility(8);
            }
        }
    }
}

