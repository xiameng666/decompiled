import android.webkit.WebView;
import android.webkit.WebViewClient;
import j..util.Objects;

final class egoz extends WebViewClient {
    final egpa a;

    public egoz(egpa egpa0) {
        Objects.requireNonNull(egpa0);
        this.a = egpa0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        this.a.c.postDelayed(this.a.d, 200L);
    }
}

