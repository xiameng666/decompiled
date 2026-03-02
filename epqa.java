import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.signin.activity.BrowserConsentFragment.HiddenApiActivityIntentBlockingContext;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epqa extends du implements epqb {
    public static final baun a;
    public final gmcu b;
    public WebView c;
    private View d;

    static {
        epqa.a = epul.a("BrowserConsentFragment");
    }

    public epqa() {
        this.b = new gmcu();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        Bundle bundle1 = this.getArguments();
        gftb.check(bundle1);
        String s = bundle1.getString("url");
        gftb.check(s);
        View view0 = (RelativeLayout)layoutInflater0.inflate(0x7F0E01A4, null);  // layout:browser_consent_view
        this.d = ((RelativeLayout)view0).findViewById(0x7F0B1D37);  // id:progress_bar_container
        WebView webView0 = new WebView(new BrowserConsentFragment.HiddenApiActivityIntentBlockingContext(this.requireContext().getApplicationContext()));
        webView0.setWebViewClient(new eppz(this));
        webView0.setWebChromeClient(new eppy(this));
        webView0.setFocusable(true);
        webView0.setFocusableInTouchMode(true);
        webView0.setMapTrackballToArrowKeys(false);
        WebSettings webSettings0 = webView0.getSettings();
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setSupportMultipleWindows(false);
        webSettings0.setSaveFormData(false);
        webSettings0.setSavePassword(false);
        webSettings0.setAllowFileAccess(false);
        webSettings0.setDatabaseEnabled(false);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings0.setLoadsImagesAutomatically(true);
        webSettings0.setNeedInitialFocus(false);
        webSettings0.setSupportZoom(false);
        webSettings0.setUseWideViewPort(false);
        webSettings0.setDisabledActionModeMenuItems(7);
        Context context0 = this.getContext();
        gftb.check(context0);
        webView0.addJavascriptInterface(new epqc(context0.getApplicationContext(), this), "OAuthConsent");
        ConsentChimeraActivity.p(new eppu(s));
        webView0.loadUrl(s);
        webView0.setVisibility(4);
        webView0.setScrollbarFadingEnabled(false);
        ((RelativeLayout)view0).addView(webView0);
        this.c = webView0;
        ((RelativeLayout)view0).setFilterTouchesWhenObscured(true);
        return view0;
    }

    @Override  // du
    public final void onDestroyView() {
        WebView webView0 = this.c;
        if(webView0 != null) {
            webView0.destroy();
            this.c = null;
        }
        super.onDestroyView();
    }

    public final void y() {
        WebView webView0 = this.c;
        if(webView0 != null) {
            webView0.setVisibility(0);
            this.d.setVisibility(8);
            ConsentChimeraActivity.p(new eppw());
        }
    }
}

