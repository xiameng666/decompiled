import android.webkit.WebView;

public final class cbiz {
    public final WebView a;

    static {
        bboh.b("WebViewBridgeCallback", bbcu.ac);
    }

    public cbiz(WebView webView0) {
        ibuq.f(webView0, "webView");
        super();
        this.a = webView0;
    }

    public final String a(String s) {
        return a.a(s, "window.ksb.", "()");
    }

    public final String b(String s, int v) {
        return "window.ksb." + s + "(" + v + ")";
    }

    public final String c(String s, String s1) {
        return a.d(s1, s, "window.ksb.", "(\'", "\')");
    }

    public final void d(gvlv gvlv0) {
        ibuq.f(gvlv0, "result");
        this.h(this.b("onActivateProfileOwnerResult", gvlv0.f));
    }

    public final void e(gvlx gvlx0) {
        ibuq.f(gvlx0, "supervisionState");
        this.h(this.b("onFetchSupervisionStateResult", gvlx0.d));
    }

    public final void f(Integer integer0, Integer integer1) {
        this.h(cbiz.i("onShowClockTimePickerResult", integer0, integer1));
    }

    public final void g(Integer integer0, Integer integer1) {
        this.h(cbiz.i("onShowDurationTimePickerResult", integer0, integer1));
    }

    public final void h(String s) {
        cbiy cbiy0 = new cbiy(s, this);
        this.a.post(cbiy0);
    }

    private static final String i(String s, Integer integer0, Integer integer1) {
        return "window.ksb." + s + "(" + integer0 + ", " + integer1 + ")";
    }
}

