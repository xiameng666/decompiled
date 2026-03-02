import android.os.SystemClock;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;

public final class cbiu {
    public static final bboh a;
    public final WebView b;
    public final Map c;
    private final icck d;
    private final cbir e;

    static {
        cbiu.a = bboh.b("BridgeInterface", bbcu.ac);
    }

    public cbiu(WebView webView0, icck icck0, cbir cbir0) {
        ibuq.f(webView0, "webView");
        super();
        this.b = webView0;
        this.d = icck0;
        this.e = cbir0;
        this.c = new LinkedHashMap();
    }

    public final void a(gvme gvme0, long v) {
        gvmd gvmd0;
        cbis cbis0 = new cbis(Base64.encodeToString(gvme0.toBytesArray(), 2), this);
        this.b.post(cbis0);
        if(hujq.d()) {
            cbir cbir0 = this.e;
            if(cbir0 != null) {
                gvlr gvlr0 = gvlr.b(gvme0.d) == null ? gvlr.A : gvlr.b(gvme0.d);
                ibuq.e(gvlr0, "getMessageType(...)");
                gvgx gvgx0 = cbiv.a(gvlr0);
                int v1 = gvme0.f;
                if(v1 == 0) {
                    gvmd0 = gvmd.a;
                }
                else {
                    switch(v1) {
                        case 1: {
                            gvmd0 = gvmd.b;
                            break;
                        }
                        case 2: {
                            gvmd0 = gvmd.c;
                            break;
                        }
                        case 3: {
                            gvmd0 = gvmd.d;
                            break;
                        }
                        case 4: {
                            gvmd0 = gvmd.e;
                            break;
                        }
                        default: {
                            gvmd0 = null;
                        }
                    }
                }
                if(gvmd0 == null) {
                    gvmd0 = gvmd.f;
                }
                ibuq.e(gvmd0, "getStatus(...)");
                gvgz gvgz0 = gvgz.b(gvmd0.a());
                if(gvgz0 == null) {
                    gvgz0 = gvgz.a;
                }
                long v2 = SystemClock.elapsedRealtime() - v;
                ibuq.f(gvgx0, "type");
                ibuq.f(gvgz0, "status");
                cbio cbio0 = new cbio(gvgx0, gvgz0, v2);
                cbir0.a(gvkq.dX, cbio0);
            }
        }
    }

    @JavascriptInterface
    public final void send(String s) {
        gvmc gvmc0;
        ibuq.f(s, "message");
        try {
            byte[] arr_b = Base64.decode(s, 2);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gvmc.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            gvmc0 = (gvmc)hftv0;
            ibuq.e(gvmc0, "parseFrom(...)");
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException("Failed to parse message.", hfur0);
        }
        if(hujq.d()) {
            cbir cbir0 = this.e;
            if(cbir0 != null) {
                gvlr gvlr0 = gvlr.b(gvmc0.c) == null ? gvlr.A : gvlr.b(gvmc0.c);
                ibuq.e(gvlr0, "getMessageType(...)");
                gvgx gvgx0 = cbiv.a(gvlr0);
                ibuq.f(gvgx0, "type");
                cbil cbil0 = new cbil(gvgx0);
                cbir0.a(gvkq.dW, cbil0);
            }
        }
        cbit cbit0 = new cbit(gvmc0, this, SystemClock.elapsedRealtime(), null);
        icbb.b(this.d, null, null, cbit0, 3);
    }
}

