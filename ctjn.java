import android.net.Uri;
import android.os.Looper;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

final class ctjn implements icih {
    final WebView a;

    public ctjn(WebView webView0) {
        this.a = webView0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        WebMessagePort[] arr_webMessagePort = null;
        pxz pxz0 = new pxz(((byte[])object0), null);
        Uri uri0 = Uri.parse("*");
        if(pyd.a.equals(uri0)) {
            uri0 = pyd.b;
        }
        WebView webView0 = this.a;
        pyf pyf0 = pza.b;
        if(pxz0.c == 0) {
            String s = pxz0.a();
            pya[] arr_pya = pxz0.a;
            if(arr_pya != null) {
                WebMessagePort[] arr_webMessagePort1 = new WebMessagePort[arr_pya.length];
                for(int v = 0; v < arr_pya.length; ++v) {
                    pya pya0 = arr_pya[v];
                    if(pya0.a == null) {
                        InvocationHandler invocationHandler0 = Proxy.getInvocationHandler(pya0.b);
                        pya0.a = (WebMessagePort)pzb.a.a.convertWebMessagePort(invocationHandler0);
                    }
                    arr_webMessagePort1[v] = pya0.a;
                }
                arr_webMessagePort = arr_webMessagePort1;
            }
            webView0.postWebMessage(new WebMessage(s, arr_webMessagePort), uri0);
            return ibom.a;
        }
        if(!pyf0.d() || !pza.a.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        Looper looper0 = webView0.getWebViewLooper();
        if(looper0 != Looper.myLooper()) {
            throw new RuntimeException("A WebView method was called on thread \'" + Thread.currentThread().getName() + "\'. All WebView methods must be called on the same thread. (Expected Looper " + looper0 + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
        }
        pyd.b(webView0).a.postMessageToMainFrame(new igbl(new pys(pxz0)), uri0);
        return ibom.a;
    }
}

