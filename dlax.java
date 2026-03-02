import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class dlax {
    public final WebView a;

    public dlax(WebView webView0) {
        ibuq.f(webView0, "inner");
        super();
        this.a = webView0;
    }

    public final void a(String s) {
        this.a.removeJavascriptInterface(s);
    }

    public final void b(WebViewClient webViewClient0) {
        this.a.setWebViewClient(webViewClient0);
    }

    public final void c() {
        this.a.stopLoading();
    }

    public final void d(String s) {
        ibuq.f(s, "script");
        this.a.evaluateJavascript(s, null);
    }
}

