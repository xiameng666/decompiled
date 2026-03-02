import android.content.Intent;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.TimeUnit;

public final class bwbe extends WebViewClient {
    public static final int a;
    private final ViewGroup b;
    private final String c;
    private final gfug d;
    private final bvpc e;

    public bwbe(ViewGroup viewGroup0, bvpc bvpc0, String s) {
        ibuq.f(bvpc0, "clientStreamz");
        super();
        this.b = viewGroup0;
        this.e = bvpc0;
        this.c = s;
        this.d = new gfug(gfqs.a);
    }

    // Detected as a lambda impl.
    public static final ibom a(bwbe bwbe0, WebView webView0, String s) {
        bwbe0.super.onPageFinished(webView0, s);
        webView0.setBackgroundColor(-1);
        return ibom.a;
    }

    private final void b(String s, bvwh bvwh0, ibth ibth0) {
        long v = this.d.a(TimeUnit.MILLISECONDS);
        ibth0.a();
        this.e.a(((double)v), bvwg.c, s, bvwh0);
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        ibuq.f(webView0, "view");
        ibuq.f(s, "url");
        bwbc bwbc0 = () -> {
            this.super.onPageFinished(webView0, s);
            webView0.setBackgroundColor(-1);
            return ibom.a;
        };
        this.b(s, bvwh.a, bwbc0);
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
        ibuq.f(webView0, "view");
        this.d.e();
        this.d.f();
        this.b.findViewById(0x7F0B24F1).setVisibility(8);  // id:webview_loader
        super.onPageStarted(webView0, s, bitmap0);
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
        ibuq.f(webView0, "view");
        ibuq.f(webResourceRequest0, "request");
        ibuq.f(webResourceError0, "error");
        super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
        if(!webResourceRequest0.isForMainFrame()) {
            return;
        }
        String s = webResourceRequest0.getUrl().toString();
        ibuq.e(s, "toString(...)");
        bwbd bwbd0 = new bwbd(webResourceRequest0, webResourceError0);
        this.b(s, bvwh.b, bwbd0);
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
        ibuq.f(webView0, "view");
        ibuq.f(webResourceRequest0, "request");
        if(!webResourceRequest0.isForMainFrame()) {
            return super.shouldOverrideUrlLoading(webView0, webResourceRequest0);
        }
        if(ibuq.m(webResourceRequest0.getUrl().getHost(), this.c)) {
            return super.shouldOverrideUrlLoading(webView0, webResourceRequest0);
        }
        Intent intent0 = new Intent("android.intent.action.VIEW", webResourceRequest0.getUrl());
        webView0.getContext().startActivity(intent0);
        return true;
    }
}

