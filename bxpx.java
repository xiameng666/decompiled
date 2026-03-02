import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

public abstract class bxpx extends du {
    public static final ggfp a;
    public acp ag;
    protected bxps ah;
    protected lso ai;
    public WebView b;
    public View c;
    public ValueCallback d;

    static {
        bxpx.a = ggfp.L("image/png", "image/jpeg", "application/pdf");
    }

    protected abstract String A();

    protected abstract View C(LayoutInflater arg1, ViewGroup arg2);

    protected final void D() {
        this.b.setVisibility(8);
        this.c.setVisibility(0);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setRetainInstance(true);
        xob xob0 = (xob)this.requireContext();
        lso lso0 = new lso(xob0, new bxpn(xob0.getApplication()));
        this.ai = lso0;
        bxps bxps0 = (bxps)lso0.a(bxps.class);
        this.ah = bxps0;
        bxpu bxpu0 = new bxpu(this);
        bxps0.b.g(this, bxpu0);
    }

    @Override  // du
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = this.C(layoutInflater0, viewGroup0);
        this.b = this.z(view0);
        this.c = this.y(view0);
        WebView webView0 = this.b;
        WebSettings webSettings0 = webView0.getSettings();
        webView0.setWebViewClient(new bxpw(this));
        webView0.setWebChromeClient(new bxpv(this));
        webView0.addJavascriptInterface(this, this.A());
        webSettings0.setUseWideViewPort(false);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setAllowFileAccess(false);
        webSettings0.setNeedInitialFocus(false);
        webSettings0.setSupportZoom(false);
        this.ag = this.registerForActivityResult(new adt(), new bxpt(this));
        return view0;
    }

    @JavascriptInterface
    public void showView() {
        this.ah.b();
    }

    protected abstract View y(View arg1);

    protected abstract WebView z(View arg1);
}

