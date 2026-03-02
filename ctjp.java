import android.webkit.WebView;

final class ctjp implements icih {
    final WebView a;
    final String b;

    public ctjp(WebView webView0, String s) {
        this.a = webView0;
        this.b = s;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if(((Boolean)object0).booleanValue()) {
            this.a.loadUrl(this.b);
        }
        return ibom.a;
    }
}

