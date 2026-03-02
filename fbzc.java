import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class fbzc extends WebViewClient {
    boolean a;
    private final fccx b;

    public fbzc(fccx fccx0) {
        this.b = fccx0;
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        if(!this.a) {
            gcfz.j(this.b.cM(), true);
            this.b.b = true;
            this.b.R();
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
        this.a = true;
        this.b.S();
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
        this.a = true;
        this.b.S();
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
        this.a = true;
        this.b.S();
    }
}

