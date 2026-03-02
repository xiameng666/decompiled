import android.webkit.CookieManager;
import android.webkit.ValueCallback;

public final class cbhl implements ValueCallback {
    public final CookieManager a;

    public cbhl(CookieManager cookieManager0) {
        this.a = cookieManager0;
    }

    @Override  // android.webkit.ValueCallback
    public final void onReceiveValue(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        this.a.flush();
    }
}

