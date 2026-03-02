import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import j..util.Objects;

public final class ernp extends WebViewClient {
    final AccountChallengeWebView a;

    public ernp(AccountChallengeWebView accountChallengeWebView0) {
        Objects.requireNonNull(accountChallengeWebView0);
        this.a = accountChallengeWebView0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        eqqy eqqy0 = eqqz.a(s, CookieManager.getInstance());
        String s1 = eqqy0.a;
        String s2 = eqqy0.b;
        if(s1 == null && s2 == null) {
            AccountChallengeWebView accountChallengeWebView0 = this.a;
            erir erir0 = accountChallengeWebView0.q;
            if(erir0 != null) {
                String s3 = erir0.b.d.n.getTitle();
                erir0.b.y(s3);
                erir0.b.d.setOnApplyWindowInsetsListener(new gafz());
            }
            accountChallengeWebView0.n.bringToFront();
            accountChallengeWebView0.n.setVisibility(0);
            accountChallengeWebView0.o.setImportantForAccessibility(2);
            accountChallengeWebView0.o.D().setVisibility(4);
            accountChallengeWebView0.o.C().setVisibility(4);
            return;
        }
        if(!TextUtils.isEmpty(s1)) {
            this.a.h.add(this.a.m);
            String s4 = this.a.m.getString("name");
            new ernw(this.a, s4, s1).execute(new Void[0]);
            return;
        }
        if(!TextUtils.isEmpty(s2)) {
            this.a.m.putString("sessionCheckpoint", s2);
            this.a.m.putString("url", null);
            this.a.h.add(this.a.m);
            this.a.g();
            this.a.b();
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
        AccountChallengeWebView.a.f(a.s(s, v, "onReceivedError errorCode: ", " description: "), new Object[0]);
        this.a.n.setVisibility(8);
        ((eriv)this.a.q.a).p(v);
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        String s1 = Uri.parse(s).getQueryParameter(AccountChallengeWebView.b);
        if(!TextUtils.isEmpty(s1) && TextUtils.isDigitsOnly(s1) && ((int)Integer.valueOf(s1)) == 1) {
            this.a.e();
            return true;
        }
        return false;
    }
}

