import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class gcrd extends WebChromeClient {
    @Override  // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView0, int v) {
        ibuq.f(webView0, "webView");
        super.onProgressChanged(webView0, v);
        if((webView0 instanceof gcre) && ((gcre)webView0).g != v) {
            ((gcre)webView0).g = v;
            ((gcre)webView0).h();
        }
    }

    @Override  // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView0, String s) {
        ibuq.f(webView0, "webView");
        ibuq.f(s, "title");
        super.onReceivedTitle(webView0, s);
        if((webView0 instanceof gcre)) {
            ((gcre)webView0).h();
        }
    }
}

