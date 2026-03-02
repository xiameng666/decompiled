import android.webkit.WebView;
import j..util.Objects;

final class egxf extends aaw {
    final WebView a;
    final egxg d;

    public egxf(egxg egxg0, WebView webView0) {
        this.a = webView0;
        Objects.requireNonNull(egxg0);
        this.d = egxg0;
        super(true);
    }

    @Override  // aaw
    public final void b() {
        WebView webView0 = this.a;
        if(webView0.canGoBack()) {
            webView0.goBack();
            return;
        }
        this.d.b.j();
    }
}

