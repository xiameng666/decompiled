import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.GlifLoadingLayout;
import java.util.List;

public abstract class cbhk extends du implements cbja, cbjo {
    private final ibnn a;
    public static final bboh ah;
    public iw ai;
    public String aj;
    public cbjp ak;
    private final ibnn b;
    private final ibnn c;
    private final ibnn d;

    static {
        cbhk.ah = bboh.b("BaseWebViewFragment", bbcu.ac);
    }

    public cbhk() {
        this.a = new ibnz(new cbgt(this));
        this.b = new ibnz(new cbgu(this));
        this.c = new ibnz(new cbgv(this));
        cbgy cbgy0 = new cbgy(this);
        this.d = new lsd(new ibuk(cbij.class), new cbgz(this), cbgy0, new cbha(this));
    }

    protected abstract List A();

    protected List B() {
        return null;
    }

    @Override  // cbja
    public void C() {
        ((ggtj)cbhk.ah.i()).x("No implementation for activateProfileOwner.");
        throw new ibnr(null);
    }

    @Override  // cbja
    public void D() {
        ((ggtj)cbhk.ah.i()).x("No implementation for fetchSupervisionState.");
        throw new ibnr(null);
    }

    public void E(int v, Intent intent0) {
        xob xob0 = xoc.b(this);
        if(intent0 == null) {
            intent0 = new Intent();
        }
        xob0.setResult((v == -1 ? -1 : 0), intent0);
        cbir cbir0 = this.R();
        if(cbir0 != null) {
            cbir.e(cbir0, (v == -1 ? gvkq.az : gvkq.aA));
        }
        xob0.finish();
    }

    @Override  // cbja
    public abstract void F();

    private final GlifLayout G() {
        if(this.M()) {
            Object object0 = kfb.b(this.requireView(), 0x7F0B24F0);  // id:webview_expressive_container
            ibuq.e(object0, "requireViewById(...)");
            return (GlifLayout)object0;
        }
        Object object1 = kfb.b(this.requireView(), 0x7F0B24EF);  // id:webview_container
        ibuq.e(object1, "requireViewById(...)");
        return (GlifLayout)object1;
    }

    public abstract void H();

    @Override  // cbja
    public void I() {
        ((ggtj)cbhk.ah.i()).x("No implementation for notifyBridgeReady.");
        throw new ibnr(null);
    }

    @Override  // cbjo
    public void J(WebView webView0, String s) {
        cbjn.a(webView0, s);
    }

    @Override  // cbjo
    public void K(String s) {
        ibuq.f(s, "url");
        cbir cbir0 = this.R();
        if(cbir0 != null) {
            ibuq.f(s, "url");
            cbip cbip0 = new cbip(s);
            cbir0.a(gvkq.dT, cbip0);
        }
        this.ae().g();
    }

    @Override  // cbja
    public void L(gvlp gvlp0) {
        ibuq.f(gvlp0, "flowState");
        cbij cbij0 = this.ae();
        ibuq.f(gvlp0, "flowState");
        icbb.b(lsc.a(cbij0), null, null, new cbii(cbij0, gvlp0, null), 3);
    }

    private final boolean M() {
        return huju.a.b().a() && this.ab() && gaec.t(this.requireContext());
    }

    @Override  // cbja
    public boolean O() {
        ((ggtj)cbhk.ah.i()).x("No implementation for isNetworkLocationOptIn.");
        throw new ibnr(null);
    }

    @Override  // cbja
    public int P() {
        ((ggtj)cbhk.ah.i()).x("No implementation for getLocationMode.");
        throw new ibnr(null);
    }

    protected cbir R() {
        throw null;
    }

    @Override  // cbja
    public void S(gvls gvls0) {
        ibuq.f(gvls0, "packageNames");
        ((ggtj)cbhk.ah.i()).x("No implementation for fetchAppDataList.");
        throw new ibnr(null);
    }

    @Override  // cbja
    public void T() {
        ((ggtj)cbhk.ah.i()).x("No implementation for fetchFailedToBlockAppsList.");
        throw new ibnr(null);
    }

    @Override  // cbja
    public void U() {
        ((ggtj)cbhk.ah.i()).x("No implementation for fetchForcedUpdateAppsList.");
        throw new ibnr(null);
    }

    @Override  // cbja
    public void V() {
        ((ggtj)cbhk.ah.i()).x("No implementation for fetchReviewAppsList.");
        throw new ibnr(null);
    }

    public void X() {
        if(this.ad().canGoBack()) {
            this.ad().goBack();
            return;
        }
        this.F();
    }

    @Override  // cbja
    public void Y(String s, int v, int v1) {
        ibuq.f(s, "title");
        ((ggtj)cbhk.ah.i()).x("No implementation for showClockTimePicker.");
        throw new ibnr(null);
    }

    @Override  // cbja
    public void Z(String s, int v, int v1) {
        ibuq.f(s, "title");
        ((ggtj)cbhk.ah.i()).x("No implementation for showDurationTimePicker.");
        throw new ibnr(null);
    }

    public static void aA(cbhk cbhk0, int v) {
        cbhk0.E(v, null);
    }

    @Override  // cbja
    public void aa() {
        ((ggtj)cbhk.ah.i()).x("No implementation for startGoogleServices.");
        throw new ibnr(null);
    }

    public boolean ab() {
        return false;
    }

    public final WebView ad() {
        Object object0 = kfb.b(this.requireView(), 0x7F0B24EE);  // id:webview
        ibuq.e(object0, "requireViewById(...)");
        return (WebView)object0;
    }

    public final cbij ae() {
        return (cbij)this.d.a();
    }

    public final cbiz af() {
        return (cbiz)this.b.a();
    }

    @Override  // cbja
    public final void ag() {
        ((ggtj)cbhk.ah.i()).x("No implementation for enableKidsSpace.");
        throw new ibnr(null);
    }

    @Override  // cbja
    public final void ah(int v) {
        this.ae().f(v);
    }

    @Override  // cbja
    public final void ai() {
        ((ggtj)cbhk.ah.i()).x("No implementation for getAccounts.");
        throw new ibnr(null);
    }

    public final void aj() {
        cbij cbij0 = this.ae();
        icbb.b(lsc.a(cbij0), null, null, new cbif(cbij0, null), 3);
    }

    @Override  // cbja
    public final void ak() {
        ((ggtj)cbhk.ah.i()).x("No implementation for installKidsSpace.");
        throw new ibnr(null);
    }

    public final void al(Uri uri0) {
        ibuq.f(uri0, "uri");
        String s = uri0.toString();
        ibuq.e(s, "toString(...)");
        if(!ibuq.m(Looper.myLooper(), Looper.getMainLooper())) {
            this.ad().post(new cbgw(this, s));
            return;
        }
        this.ad().loadUrl(s);
    }

    @Override  // cbjo
    public final void am(String s, int v) {
        ibuq.f(s, "url");
        cbir cbir0 = this.R();
        if(cbir0 != null) {
            ibuq.f(s, "url");
            cbin cbin0 = new cbin(v, s);
            cbir0.a(gvkq.dU, cbin0);
        }
        this.ae().g();
    }

    @Override  // cbjo
    public final void an(WebView webView0, String s) {
        ibuq.f(webView0, "unused");
        ibuq.f(s, "url");
        cbij cbij0 = this.ae();
        icbb.b(lsc.a(cbij0), null, null, new cbid(cbij0, null), 3);
    }

    @Override  // cbjo
    public final void ao(String s) {
        ibuq.f(s, "url");
        cbir cbir0 = this.R();
        if(cbir0 != null) {
            ibuq.f(s, "url");
            cbim cbim0 = new cbim(s);
            cbir0.a(gvkq.dV, cbim0);
        }
    }

    @Override  // cbja
    public final void ap(String s, String s1) {
        ibuq.f(s, "contentUrl");
        ibuq.f(s1, "context");
        ((ggtj)cbhk.ah.i()).x("No implementation for openHelpArticle.");
        throw new ibnr(null);
    }

    @Override  // cbja
    public void aq() {
        ((ggtj)cbhk.ah.i()).x("No implementation for prefetchSupervisionApp.");
        throw new ibnr(null);
    }

    protected final void ar(gvlr gvlr0, cbiw cbiw0) {
        ibuq.f(gvlr0, "messageType");
        cbiu cbiu0 = this.y();
        ibuq.f(gvlr0, "messageType");
        cbiu0.c.put(gvlr0, cbiw0);
    }

    @Override  // cbja
    public final void as(String s) {
        ibuq.f(s, "callerId");
        ((ggtj)cbhk.ah.i()).x("No implementation for requestParentApproval.");
        throw new ibnr(null);
    }

    @Override  // cbja
    public final void at(String s) {
        ibuq.f(s, "accountName");
        ((ggtj)cbhk.ah.i()).x("No implementation for selectAccount.");
        throw new ibnr(null);
    }

    public final void au(boolean z) {
        Object object0 = kfb.b(this.requireView(), 0x7F0B183D);  // id:loading_container
        ibuq.e(object0, "requireViewById(...)");
        int v = 8;
        ((GlifLoadingLayout)object0).setVisibility((z ? 0 : 8));
        GlifLayout glifLayout0 = this.G();
        if(!z) {
            v = 0;
        }
        glifLayout0.setVisibility(v);
    }

    @Override  // cbja
    public void av(String s) {
        ibuq.f(s, "continueUrl");
        ((ggtj)cbhk.ah.i()).x("No implementation for showAccountPicker().");
        throw new ibnr(null);
    }

    @Override  // cbja
    public final void aw() {
        cbij cbij0 = this.ae();
        icbb.b(lsc.a(cbij0), null, null, new cbig(cbij0, null), 3);
    }

    @Override  // cbja
    public final void ax() {
        ((ggtj)cbhk.ah.i()).x("No implementation for startAddAccount.");
        throw new ibnr(null);
    }

    public final void ay(String s) {
        ibuq.f(s, "accountName");
        icbb.b(lpt.a(this), null, null, new cbhj(this, s, null), 3);
    }

    public final boolean az() {
        if(this.ad().canGoBack()) {
            this.ad().goBack();
            return true;
        }
        return false;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        if(this.M()) {
            View view0 = layoutInflater0.inflate(0x7F0E018B, viewGroup0, false);  // layout:base_webview_expressive_fragment
            ibuq.c(view0);
            return view0;
        }
        View view1 = layoutInflater0.inflate(0x7F0E018C, viewGroup0, false);  // layout:base_webview_fragment
        ibuq.c(view1);
        return view1;
    }

    @Override  // du
    public final void onDestroyView() {
        this.ad().loadUrl("about:blank");
        this.ad().destroy();
        super.onDestroyView();
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        ibuq.f(bundle0, "outState");
        if(this.ad().getUrl() == null) {
            return;
        }
        Bundle bundle1 = new Bundle();
        this.ad().saveState(bundle1);
        bundle0.putBundle("webviewState", bundle1);
    }

    @Override  // du
    public void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        this.au(true);
        this.G().N(false);
        if(gaec.B(this.requireContext())) {
            View view1 = view0.findViewById(0x7F0B2163);  // id:sud_landscape_content_area
            if(view1 != null) {
                view1.setPadding(view1.getPaddingLeft(), 0, view1.getPaddingRight(), view1.getPaddingBottom());
            }
            View view2 = view0.findViewById(0x7F0B2167);  // id:sud_layout_content
            if(view2 != null) {
                view2.setPadding(view2.getPaddingLeft(), 0, view2.getPaddingRight(), view2.getPaddingBottom());
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
                if(viewGroup$MarginLayoutParams0 != null) {
                    viewGroup$MarginLayoutParams0.setMarginStart(0);
                    viewGroup$MarginLayoutParams0.setMarginEnd(0);
                }
            }
        }
        this.aj = this.ad().getSettings().getUserAgentString();
        WebView webView0 = this.ad();
        WebSettings webSettings0 = webView0.getSettings();
        webSettings0.setAllowFileAccess(false);
        webSettings0.setUseWideViewPort(false);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setNeedInitialFocus(false);
        webSettings0.setSupportZoom(false);
        List list0 = this.A();
        ibuq.f(list0, "allowlistGlobPatterns");
        fpyt fpyt0 = fpyt.b(list0);
        ibqm ibqm0 = new ibqm(null);
        ibqm0.add(this);
        synchronized(cbjp.a) {
            ibqm0.addAll(cbjp.a);
        }
        cbjp cbjp0 = new cbjp(fpyt0, ibpo.a(ibqm0));
        this.ak = cbjp0;
        webView0.setWebViewClient(cbjp0);
        webView0.addJavascriptInterface(((cbix)this.a.a()), "ksb");
        webView0.addJavascriptInterface(this.y(), "mpb");
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("webviewState");
            if(bundle1 != null) {
                this.ad().restoreState(bundle1);
            }
        }
        icbb.b(lpt.a(this), null, null, new cbhh(this, null), 3);
        Context context0 = this.requireContext();
        abc abc0 = (context0 instanceof xnj) ? ((xnj)context0).d : xoc.b(this).getOnBackPressedDispatcher();
        ibuq.c(abc0);
        abc0.c(this, new cbhi(this));
    }

    private final cbiu y() {
        return (cbiu)this.c.a();
    }

    public abstract String z();
}

