import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

public final class cbjp extends fpyq {
    public static final List a;
    public boolean b;
    private static final bboh c;
    private final List d;
    private int e;

    static {
        cbjp.c = bboh.b("CustomWebViewClient", bbcu.ac);
        cbjp.a = new ArrayList();
    }

    public cbjp(fpyt fpyt0, List list0) {
        super(fpyt0, fpyt0);
        this.d = list0;
        this.i(fpyr.a);
    }

    @Override  // fpyq
    public final boolean a(String s) {
        ibuq.f(s, "url");
        ((ggtj)cbjp.c.h()).B("Blocked url: %s", s);
        for(Object object0: this.d) {
            ((cbjo)object0).K(s);
        }
        return true;
    }

    @Override  // fpyq
    public final boolean d(WebResourceRequest webResourceRequest0) {
        ibuq.f(webResourceRequest0, "request");
        String s = webResourceRequest0.getUrl().toString();
        ibuq.e(s, "toString(...)");
        this.a(s);
        return true;
    }

    @Override  // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView0, String s, boolean z) {
        ibuq.f(webView0, "view");
        ibuq.f(s, "url");
        int v = webView0.copyBackForwardList().getCurrentIndex();
        int v1 = this.e;
        if(v == v1 && !z) {
            return;
        }
        this.b = v < v1;
        this.e = v;
    }

    @Override  // fpyq
    public final void e(WebResourceRequest webResourceRequest0) {
        ibuq.f(webResourceRequest0, "request");
        String s = webResourceRequest0.getUrl().toString();
        ibuq.e(s, "toString(...)");
        this.f(s);
    }

    @Override  // fpyq
    public final void f(String s) {
        ibuq.f(s, "url");
        ((ggtj)cbjp.c.h()).B("Allowed url: %s", s);
        for(Object object0: this.d) {
            ((cbjo)object0).ao(s);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        ibuq.f(webView0, "webView");
        ibuq.f(s, "url");
        ((ggtj)cbjp.c.h()).B("Finished loading url: %s", s);
        for(Object object0: this.d) {
            ((cbjo)object0).J(webView0, s);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
        ibuq.f(webView0, "webView");
        ibuq.f(s, "url");
        ((ggtj)cbjp.c.h()).B("Start loading url: %s", s);
        for(Object object0: this.d) {
            ((cbjo)object0).an(webView0, s);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
        ibuq.f(webView0, "view");
        ibuq.f(s, "description");
        ibuq.f(s1, "failingUrl");
        ((ggtj)cbjp.c.h()).P("onReceivedError() for URL %s with error code %s", s1, v);
        for(Object object0: this.d) {
            ((cbjo)object0).am(s1, v);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
        ibuq.f(webView0, "view");
        ibuq.f(webResourceRequest0, "request");
        ibuq.f(webResourceResponse0, "errorResponse");
        if(webResourceRequest0.isForMainFrame()) {
            String s = webResourceRequest0.getUrl().toString();
            ibuq.e(s, "toString(...)");
            int v = webResourceResponse0.getStatusCode();
            ((ggtj)cbjp.c.h()).P("onReceivedHttpError() for URL %s with error code %s", s, v);
            for(Object object0: this.d) {
                ((cbjo)object0).am(s, v);
            }
        }
    }
}

