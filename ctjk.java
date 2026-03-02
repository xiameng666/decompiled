import android.webkit.WebView;

public final class ctjk implements ibts {
    public final ibvd a;
    public final String b;

    public ctjk(ibvd ibvd0, String s) {
        this.a = ibvd0;
        this.b = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((WebView)object0), "it");
        if(((Boolean)((icnl)this.a.a).b()).booleanValue()) {
            ((WebView)object0).loadUrl(this.b);
        }
        return ibom.a;
    }
}

