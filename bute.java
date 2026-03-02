import android.content.Context;
import android.webkit.WebView;

public final class bute implements ibts {
    public final WebView a;
    public final xob b;
    public final String c;

    public bute(WebView webView0, xob xob0, String s) {
        this.a = webView0;
        this.b = xob0;
        this.c = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Context)object0), "context");
        fpyt fpyt0 = fpyt.b(htuh.e().i().b);
        fpyt fpyt1 = fpyt.b(htuh.e().h().b);
        bust bust0 = new bust(this.b, fpyt1, fpyt0);
        this.a.setWebViewClient(bust0);
        this.a.getSettings().setJavaScriptEnabled(true);
        this.a.loadUrl(this.c);
        return this.a;
    }
}

