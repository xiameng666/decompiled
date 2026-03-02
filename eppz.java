import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j..util.Objects;
import java.util.regex.Pattern;

final class eppz extends WebViewClient {
    final epqa a;

    public eppz(epqa epqa0) {
        Objects.requireNonNull(epqa0);
        this.a = epqa0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView0, String s) {
        if(hyex.g()) {
            this.a.y();
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        if(!hyfg.a.b().d()) {
            this.a.y();
        }
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
        return this.shouldOverrideUrlLoading(webView0, webResourceRequest0.getUrl().toString());
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        baun baun0 = epqa.a;
        baun0.d("Overriding URL: [%s].", new Object[]{s});
        if(Pattern.compile(hyft.a.b().a()).matcher(s).find()) {
            return false;
        }
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
        epqa epqa0 = this.a;
        Context context0 = epqa0.getContext();
        gftb.check(context0);
        if(intent0.resolveActivity(context0.getPackageManager()) != null) {
            epqa0.startActivity(intent0);
            return true;
        }
        baun0.f("Unable to find the browser.", new Object[0]);
        return true;
    }
}

