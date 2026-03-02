import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j..util.Objects;
import java.util.regex.Pattern;

public final class bxpw extends WebViewClient {
    final bxpx a;

    public bxpw(bxpx bxpx0) {
        Objects.requireNonNull(bxpx0);
        this.a = bxpx0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView0, String s) {
        this.a.ah.b();
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
        return this.shouldOverrideUrlLoading(webView0, webResourceRequest0.getUrl().toString());
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        bxpx bxpx0 = this.a;
        if(Pattern.compile(bxpx0.ah.a.g).matcher(s).find()) {
            return false;
        }
        bxpx0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
        return true;
    }
}

