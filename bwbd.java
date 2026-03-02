import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import com.google.android.gms.growth.uiflow.ui.widget.WebViewWrapper;

public final class bwbd implements ibth {
    public final WebResourceRequest a;
    public final WebResourceError b;

    public bwbd(WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
        this.a = webResourceRequest0;
        this.b = webResourceError0;
    }

    @Override  // ibth
    public final Object a() {
        ((ggtj)WebViewWrapper.a.j()).R("Failed loading WebView main frame: %s (%s)", this.a.getUrl(), this.b.getDescription());
        return ibom.a;
    }
}

