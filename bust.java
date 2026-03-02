import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

public final class bust extends fpyq {
    private static final bboh a;
    private final xob b;
    private final fpyy c;

    static {
        bust.a = bboh.b("G1WebViewClient", bbcu.hd);
    }

    public bust(xob xob0, fpyy fpyy0, fpyy fpyy1) {
        super(fpyy1, fpyy1);
        this.b = xob0;
        this.c = fpyy0;
    }

    @Override  // fpyq
    public final boolean b(WebView webView0, WebResourceRequest webResourceRequest0) {
        ibuq.f(webView0, "webView");
        ibuq.f(webResourceRequest0, "req");
        Uri uri0 = webResourceRequest0.getUrl();
        if(this.c.c(uri0)) {
            Intent intent0 = new Intent("android.intent.action.VIEW", webResourceRequest0.getUrl());
            intent0.addCategory("android.intent.category.BROWSABLE");
            intent0.setFlags(0x10000000);
            this.b.startActivity(intent0);
            return true;
        }
        ((ggtj)bust.a.j()).B("Web view url blocked %s", webResourceRequest0.getUrl());
        return this.d(webResourceRequest0);
    }
}

