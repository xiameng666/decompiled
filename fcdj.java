import com.google.android.gms.wallet.webview.WebViewWidgetFragment.WebViewWidgetPageDetails;
import j..util.Objects;

final class fcdj extends fbnw {
    final fcdl a;

    public fcdj(fcdl fcdl0) {
        Objects.requireNonNull(fcdl0);
        this.a = fcdl0;
        super();
    }

    @Override  // fbnw
    public final void M(hcic hcic0) {
        getj getj0;
        gete gete0 = hcic0.d == null ? gete.c : hcic0.d;
        hcid hcid0 = null;
        if((hcic0.b & 1) == 0) {
            getj0 = null;
        }
        else {
            getj0 = hcic0.c;
            if(getj0 == null) {
                getj0 = getj.a;
            }
        }
        hcdu hcdu0 = hcdu.b(hcic0.e) == null ? hcdu.a : hcdu.b(hcic0.e);
        if((hcic0.b & 8) != 0) {
            hcid0 = hcic0.f;
            if(hcid0 == null) {
                hcid0 = hcid.a;
            }
        }
        fcdl fcdl0 = this.a;
        fcdl0.cy(getj0, gete0);
        WebViewWidgetFragment.WebViewWidgetPageDetails webViewWidgetFragment$WebViewWidgetPageDetails0 = new WebViewWidgetFragment.WebViewWidgetPageDetails();
        webViewWidgetFragment$WebViewWidgetPageDetails0.i = hcid0;
        if(hcid0 != null) {
            webViewWidgetFragment$WebViewWidgetPageDetails0.l = hcid0.c == null ? gfdq.a : hcid0.c;
        }
        webViewWidgetFragment$WebViewWidgetPageDetails0.q = getj0;
        webViewWidgetFragment$WebViewWidgetPageDetails0.c = hcdu0;
        webViewWidgetFragment$WebViewWidgetPageDetails0.n = gete0;
        fcdl0.kZ(webViewWidgetFragment$WebViewWidgetPageDetails0, true, "onInitializeWebViewWidgetResponse");
    }

    @Override  // fbnw
    public final void b() {
        this.a.bS(22);
        this.a.bO(-1);
    }

    @Override  // fbnw
    public final void c() {
        this.a.bS(20);
        this.a.bO(-1);
    }

    @Override  // fbnw
    public final void f() {
        this.a.bS(21);
        this.a.lC();
    }
}

