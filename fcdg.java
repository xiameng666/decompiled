import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import com.google.android.chimera.android.Activity;

public final class fcdg extends fccx {
    public static final int c;

    @JavascriptInterface
    public void completeFlowWithCallbackData(String s) {
        byte[] arr_b = Base64.decode(s, 8);
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_CALLBACK_DATA", arr_b);
        this.T(23, bundle0);
    }

    @JavascriptInterface
    public void completeFlowWithError(String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_ERROR", s);
        this.T(24, bundle0);
    }

    @Override  // gdfk
    public final boolean la() {
        return false;
    }

    @JavascriptInterface
    public void setPageTitle(String s) {
        Activity activity0 = (Activity)this.getContext();
        activity0.runOnUiThread(new fcdf(activity0, s));
    }

    @Override  // fccx
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = super.y(layoutInflater0, viewGroup0, bundle0);
        this.d.a.addJavascriptInterface(this, "comGoogleAndroidGmsWalletWebviewWebViewComponent");
        WebSettings webSettings0 = this.d.a.getSettings();
        webSettings0.setSupportMultipleWindows(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(true);
        return view0;
    }
}

