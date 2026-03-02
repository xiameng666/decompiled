import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.gms.mobiledataplan.ui.ConsentWebView;
import j..util.Objects;

public final class csav extends fpyq {
    final ConsentWebView a;

    public csav(ConsentWebView consentWebView0, fpyy fpyy0) {
        Objects.requireNonNull(consentWebView0);
        this.a = consentWebView0;
        super(fpyy0, fpyy0);
    }

    @Override  // fpyq
    public final boolean a(String s) {
        bboh bboh0 = ConsentWebView.a;
        bboh0.g(cslm.h()).B("Not whitelisted url: %s", s);
        if(hvkk.a.d().i()) {
            crxn.c().O(hhct.ch, 9, "Ui", "MDP_UiAction");
        }
        if(URLUtil.isNetworkUrl(s)) {
            try {
                this.a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
                return true;
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                a.e(ConsentWebView.a.i(), "Can\'t launch url \'%s externally", s, activityNotFoundException0);
                Toast.makeText(this.a.getContext(), "Can\'t handle URL", 1).show();
                return false;
            }
        }
        ((ggtj)bboh0.j()).B("Not a network url: %s", s);
        Toast.makeText(this.a.getContext(), "Can\'t handle URL", 1).show();
        return false;
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView0, String s) {
        super.onPageCommitVisible(webView0, s);
        ConsentWebView.a(webView0, this.a.b);
    }
}

