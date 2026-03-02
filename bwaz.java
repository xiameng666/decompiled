import android.net.Uri;
import com.google.android.chimera.WebView;

public final class bwaz implements ibts {
    public final String a;

    public bwaz(String s) {
        this.a = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        WebView webView0 = (WebView)object0;
        ibuq.f(webView0, "$this$initializeWebView");
        Uri uri0 = Uri.parse(this.a);
        ibuq.e(uri0, "parse(...)");
        String s = bwba.b(webView0, uri0).toString();
        ibuq.c(s);
        webView0.loadUrl(s);
        return ibom.a;
    }
}

