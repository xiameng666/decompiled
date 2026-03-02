import android.content.ActivityNotFoundException;
import android.os.Message;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import j..util.Objects;
import java.util.Arrays;
import java.util.List;

public final class bxpv extends WebChromeClient {
    final bxpx a;

    public bxpv(bxpx bxpx0) {
        Objects.requireNonNull(bxpx0);
        this.a = bxpx0;
        super();
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView0, boolean z, boolean z1, Message message0) {
        message0.obj = webView0;
        message0.sendToTarget();
        return true;
    }

    @Override  // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest0) {
        ggfp ggfp0 = ggfp.H(permissionRequest0.getResources());
        if(this.a.ah.a.h.containsAll(ggfp0)) {
            permissionRequest0.grant(permissionRequest0.getResources());
            return;
        }
        permissionRequest0.deny();
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView0, ValueCallback valueCallback0, WebChromeClient.FileChooserParams webChromeClient$FileChooserParams0) {
        if(webChromeClient$FileChooserParams0 != null && valueCallback0 != null) {
            bxpx bxpx0 = this.a;
            if(bxpx0.ah.a.a) {
                List list0 = Arrays.asList(webChromeClient$FileChooserParams0.getAcceptTypes());
                if(!bxpx.a.containsAll(list0)) {
                    return false;
                }
                ValueCallback valueCallback1 = bxpx0.d;
                if(valueCallback1 != null) {
                    valueCallback1.onReceiveValue(null);
                }
                try {
                    bxpx0.d = valueCallback0;
                    bxpx0.ag.b(webChromeClient$FileChooserParams0.createIntent());
                    return true;
                }
                catch(ActivityNotFoundException unused_ex) {
                    this.a.d.onReceiveValue(null);
                    this.a.d = null;
                }
            }
        }
        return false;
    }
}

