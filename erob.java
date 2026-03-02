import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup.MarginLayoutParams;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.setup.ui.views.MagicArchChallengeView;
import j..util.Objects;

public final class erob extends WebViewClient {
    final MagicArchChallengeView a;

    public erob(MagicArchChallengeView magicArchChallengeView0) {
        Objects.requireNonNull(magicArchChallengeView0);
        this.a = magicArchChallengeView0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        if(hyhp.j()) {
            String s1 = Uri.parse(s).getQueryParameter("wv_action");
            if(s1 != null && s1.equals("close")) {
                FallbackAccount fallbackAccount0 = (FallbackAccount)this.a.i.get(this.a.k);
                this.a.m.add(fallbackAccount0);
                this.a.b();
                return;
            }
        }
        MagicArchChallengeView magicArchChallengeView0 = this.a;
        if(magicArchChallengeView0.k >= magicArchChallengeView0.i.size()) {
            MagicArchChallengeView.a.m("Ignoring onPageFinished as all challenges are completed", new Object[0]);
            return;
        }
        FallbackAccount fallbackAccount1 = (FallbackAccount)magicArchChallengeView0.i.get(magicArchChallengeView0.k);
        String s2 = fallbackAccount1.b;
        String s3 = eqqz.a(s, CookieManager.getInstance()).a;
        if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s2)) {
            Context context0 = magicArchChallengeView0.getContext();
            if(hyhp.j()) {
                magicArchChallengeView0.m.add(fallbackAccount1);
            }
            else {
                ernz ernz0 = new ernz(magicArchChallengeView0, fallbackAccount1, context0, s3);
                bbll bbll0 = new bbll(2, 9);
                bbll0.d(ernz0).hB(new eroa(magicArchChallengeView0), bbll0);
            }
            magicArchChallengeView0.b();
            return;
        }
        hyhp hyhp0 = hyhp.a;
        if(!s.contains(hyhp0.g().n())) {
            for(Object object0: hyhp0.g().l().b) {
                if(s.contains(((String)object0))) {
                    MagicArchChallengeView.a.f("Webview landed on the Something Went Wrong page", new Object[0]);
                    magicArchChallengeView0.c.setVisibility(8);
                    magicArchChallengeView0.h.a(10599);
                    return;
                }
            }
            magicArchChallengeView0.c.bringToFront();
            magicArchChallengeView0.c.setVisibility(0);
            magicArchChallengeView0.d.N(false);
            magicArchChallengeView0.d.D().setVisibility(4);
            magicArchChallengeView0.d.C().setVisibility(4);
            magicArchChallengeView0.e.setVisibility(8);
            magicArchChallengeView0.f.setPadding(0, 0, 0, 0);
            if(magicArchChallengeView0.f != null && (magicArchChallengeView0.f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && magicArchChallengeView0.g()) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)magicArchChallengeView0.f.getLayoutParams();
                if(viewGroup$MarginLayoutParams0 != null) {
                    viewGroup$MarginLayoutParams0.setMargins(0, viewGroup$MarginLayoutParams0.topMargin, 0, viewGroup$MarginLayoutParams0.bottomMargin);
                }
            }
            String s4 = magicArchChallengeView0.c.getTitle();
            if(!TextUtils.isEmpty(s4)) {
                erpa.a(magicArchChallengeView0.b.getContainerActivity(), s4);
            }
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
        MagicArchChallengeView.a.f(a.s(s, v, "onReceivedError errorCode: ", " description: "), new Object[0]);
        this.a.c.setVisibility(8);
        this.a.h.a(v);
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        if(hyhp.i()) {
            String s1 = Uri.parse(s).getQueryParameter("wv_action");
            if(s1 != null && s1.equals("close")) {
                FallbackAccount fallbackAccount0 = (FallbackAccount)this.a.i.get(this.a.k);
                this.a.m.add(fallbackAccount0);
                this.a.j.countDown();
                this.a.b();
                return true;
            }
        }
        return false;
    }
}

