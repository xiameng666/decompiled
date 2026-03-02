package com.google.android.gms.ads.internal.webview;

import a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import azqk;
import bbna;
import bbqo;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.clearcut.b;
import com.google.android.gms.ads.internal.client.u;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.csi.h;
import com.google.android.gms.ads.internal.csi.k;
import com.google.android.gms.ads.internal.state.e;
import com.google.android.gms.ads.internal.util.ag;
import com.google.android.gms.ads.internal.util.aj;
import com.google.android.gms.ads.internal.util.an;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.f;
import com.google.android.gms.ads.internal.util.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import pyd;
import pza;

public final class x extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, i {
    public final VersionInfoParcel a;
    public n b;
    public h c;
    public h d;
    public com.google.android.gms.ads.internal.csi.i e;
    public an f;
    public final b g;
    public static final int h;
    private final ah i;
    private final DisplayMetrics j;
    private ai k;
    private final String l;
    private boolean m;
    private Boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final WindowManager u;

    protected x(ah ah0, ai ai0, VersionInfoParcel versionInfoParcel0, b b0) {
        super(ah0);
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.i = ah0;
        this.k = ai0;
        this.l = "";
        this.a = versionInfoParcel0;
        WindowManager windowManager0 = (WindowManager)this.getContext().getSystemService("window");
        this.u = windowManager0;
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
        this.j = displayMetrics0;
        this.g = b0;
        this.f = new an(ah0.a, this, this);
        this.setBackgroundColor(0);
        if(((Boolean)s.bN.g()).booleanValue()) {
            this.setSoundEffectsEnabled(false);
        }
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setAllowFileAccess(false);
        try {
            webSettings0.setJavaScriptEnabled(true);
        }
        catch(NullPointerException nullPointerException0) {
            com.google.android.gms.ads.internal.util.client.h.h("Unable to enable Javascript.", nullPointerException0);
        }
        webSettings0.setSavePassword(false);
        webSettings0.setSupportMultipleWindows(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(true);
        if(((Boolean)s.bM.g()).booleanValue()) {
            webSettings0.setMixedContentMode(1);
        }
        else {
            webSettings0.setMixedContentMode(2);
        }
        if(((Boolean)s.cg.g()).booleanValue()) {
            webSettings0.setGeolocationEnabled(false);
        }
        webSettings0.setUserAgentString(c.e().a(ah0, versionInfoParcel0.a));
        Context context0 = this.getContext();
        ag.a(context0, new com.google.android.gms.ads.internal.util.h(webSettings0, context0));
        webSettings0.setAllowFileAccessFromFileURLs(false);
        webSettings0.setAllowUniversalAccessFromFileURLs(false);
        webSettings0.setMediaPlaybackRequiresUserGesture(false);
        this.setDownloadListener(this);
        this.B();
        this.addJavascriptInterface(new aa(this, new z(this)), "googleAdsJsInterface");
        this.removeJavascriptInterface("accessibility");
        this.removeJavascriptInterface("accessibilityTraversal");
        this.D();
        this.e = new com.google.android.gms.ads.internal.csi.i(new k(this.l));
        Boolean boolean0 = (Boolean)s.M.g();
        h h0 = k.a();
        this.c = h0;
        this.e.a("native:view_create", h0);
        Context context1 = null;
        this.d = null;
        aj aj0 = aj.a();
        String s = WebSettings.getDefaultUserAgent(ah0);
        if(!s.equals(aj0.a)) {
            Context context2 = azqk.b(ah0);
            if(bbna.d()) {
                context1 = context2;
            label_62:
                String s1 = WebSettings.getDefaultUserAgent(ah0);
                SharedPreferences.Editor sharedPreferences$Editor0 = ah0.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", s1);
                if(context1 == null) {
                    sharedPreferences$Editor0.apply();
                }
                else {
                    bbqo.a(ah0, sharedPreferences$Editor0, "admob_user_agent");
                }
            }
            else if(context2 == null) {
                goto label_62;
            }
            aj0.a = s;
        }
        c.d().h.incrementAndGet();
    }

    private final void B() {
        synchronized(this) {
            com.google.android.gms.ads.internal.util.client.h.d("Enabling hardware acceleration on an AdView.");
        }
    }

    private final void C() {
        synchronized(this) {
            if(!this.o) {
                this.o = true;
                c.d().h.decrementAndGet();
            }
        }
    }

    private final void D() {
        com.google.android.gms.ads.internal.csi.i i0 = this.e;
        if(i0 != null) {
            com.google.android.gms.ads.internal.csi.b b0 = c.d().a();
            if(b0 != null) {
                b0.a.offer(i0.b);
            }
        }
    }

    private final void E() {
        synchronized(this) {
            e e0 = c.d();
            this.n = e0.g;
            if(e0.g == null) {
                try {
                    this.evaluateJavascript("(function(){})()", null);
                    this.y(Boolean.valueOf(true));
                }
                catch(IllegalStateException unused_ex) {
                    this.y(Boolean.valueOf(false));
                }
            }
        }
    }

    private final void F() {
        __monitor_enter(this);
        try {
            t t0 = () -> super.loadUrl("about:blank");
            m.a.post(t0);
        }
        catch(Throwable throwable0) {
            try {
                c.d().c(throwable0, "AdWebViewImpl.loadUrlUnsafe");
                com.google.android.gms.ads.internal.util.client.h.m("Could not call loadUrl in destroy(). ", throwable0);
            }
            catch(Throwable throwable1) {
                __monitor_exit(this);
                throw throwable1;
            }
            __monitor_exit(this);
            return;
        }
        __monitor_exit(this);
    }

    private final void G() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("isVisible", "0");
        this.t("onAdVisibilityChanged", hashMap0);
    }

    @Override  // com.google.android.gms.ads.internal.client.a
    public final void a() {
    }

    @Override  // com.google.android.gms.ads.internal.js.a
    public final void b(String s, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        StringBuilder stringBuilder0 = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})(\'");
        stringBuilder0.append(s);
        stringBuilder0.append("\',");
        stringBuilder0.append(jSONObject0.toString());
        stringBuilder0.append(");");
        com.google.android.gms.ads.internal.util.client.h.d(("Dispatching AFMA event: " + stringBuilder0.toString()));
        this.u(stringBuilder0.toString());
    }

    @Override  // com.google.android.gms.ads.internal.video.c
    public final void c() {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.video.c
    public final void d() {
        synchronized(this) {
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.ads.internal.webview.i
    public final void destroy() {
        synchronized(this) {
            this.D();
            this.f.b = false;
            this.f.b();
            this.b.c();
            this.setOnClickListener(null);
            this.setOnTouchListener(null);
            if(this.m) {
                return;
            }
            c.g().a();
            this.m = true;
            if(((Boolean)s.bx.g()).booleanValue()) {
                Activity activity0 = this.f();
                if(activity0 != null && activity0.isDestroyed()) {
                    this.k();
                    return;
                }
                this.F();
                return;
            }
            this.k();
        }
    }

    @Override  // com.google.android.gms.ads.internal.js.l
    public final void e(String s, JSONObject jSONObject0) {
        throw null;
    }

    @Override  // android.webkit.WebView
    public final void evaluateJavascript(String s, ValueCallback valueCallback0) {
        synchronized(this) {
            if(this.l()) {
                com.google.android.gms.ads.internal.util.client.h.n("#004 The webview is destroyed. Ignoring action.");
                if(valueCallback0 != null) {
                    valueCallback0.onReceiveValue(null);
                    return;
                }
                return;
            }
            if(((Boolean)s.by.g()).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                com.google.android.gms.ads.internal.webview.s s1 = () -> super.evaluateJavascript(s, valueCallback0);
                com.google.android.gms.ads.internal.util.future.e.c.d(s1);
                return;
            }
            super.evaluateJavascript(s, valueCallback0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final Activity f() {
        return this.i.a;
    }

    @Override
    protected final void finalize() {
        try {
            synchronized(this) {
                if(!this.m) {
                    this.b.c();
                    c.g().a();
                    this.C();
                }
            }
        }
        finally {
            super.finalize();
        }
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final Context g() {
        return this.i.c;
    }

    @Override  // com.google.android.gms.ads.internal.js.l
    public final void gc(String s) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final WebViewClient h() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final VersionInfoParcel i() {
        return this.a;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final ai j() {
        synchronized(this) {
        }
        return this.k;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void k() {
        synchronized(this) {
            this.C();
            w w0 = new w(this);
            m.a.post(w0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final boolean l() {
        synchronized(this) {
        }
        return this.m;
    }

    @Override  // android.webkit.WebView, com.google.android.gms.ads.internal.webview.i
    public final void loadData(String s, String s1, String s2) {
        synchronized(this) {
            if(!this.l()) {
                super.loadData(s, s1, s2);
                return;
            }
            com.google.android.gms.ads.internal.util.client.h.k("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // android.webkit.WebView
    public final void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4) {
        synchronized(this) {
            if(!this.l()) {
                super.loadDataWithBaseURL(s, s1, s2, s3, s4);
                return;
            }
            com.google.android.gms.ads.internal.util.client.h.k("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.ads.internal.webview.i
    public final void loadUrl(String s) {
        synchronized(this) {
            if(!this.l()) {
                try {
                    v v1 = () -> super.loadUrl(s);
                    m.a.post(v1);
                }
                catch(Throwable throwable0) {
                    c.d().c(throwable0, "AdWebViewImpl.loadUrl");
                    com.google.android.gms.ads.internal.util.client.h.m("Could not call loadUrl. ", throwable0);
                }
                return;
            }
            com.google.android.gms.ads.internal.util.client.h.k("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final n m() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void n() {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void o() {
        synchronized(this) {
        }
    }

    @Override  // android.webkit.WebView
    protected final void onAttachedToWindow() {
        synchronized(this) {
            super.onAttachedToWindow();
            if(!this.l()) {
                an an0 = this.f;
                an0.a = true;
                if(an0.b) {
                    an0.a();
                }
            }
            this.G();
        }
    }

    @Override  // android.view.ViewGroup
    protected final void onDetachedFromWindow() {
        synchronized(this) {
            if(!this.l()) {
                this.f.a = false;
                this.f.b();
            }
            super.onDetachedFromWindow();
        }
        this.G();
    }

    @Override  // android.webkit.DownloadListener
    public final void onDownloadStart(String s, String s1, String s2, String s3, long v) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setDataAndType(Uri.parse(s), s3);
            if(((Boolean)s.bB.g()).booleanValue() && this.getContext() != null) {
                intent0.setPackage("com.google.android.gms");
            }
            m.s(this.getContext(), intent0);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            com.google.android.gms.ads.internal.util.client.h.d(a.l(s3, s, "Couldn\'t find an Activity to view url/mimetype: ", " / "));
            c.d().c(activityNotFoundException0, "AdWebViewImpl.onDownloadStart: " + s);
        }
    }

    @Override  // android.webkit.WebView
    protected final void onDraw(Canvas canvas0) {
        if(this.l()) {
            return;
        }
        super.onDraw(canvas0);
    }

    @Override  // android.webkit.WebView
    public final boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        float f = motionEvent0.getAxisValue(9);
        float f1 = motionEvent0.getAxisValue(10);
        return motionEvent0.getActionMasked() != 8 || (Float.compare(f, 0.0f) <= 0 || this.canScrollVertically(-1)) && (Float.compare(f, 0.0f) >= 0 || this.canScrollVertically(1)) && (!(f1 > 0.0f) || this.canScrollHorizontally(-1)) && (!(f1 < 0.0f) || this.canScrollHorizontally(1)) ? super.onGenericMotionEvent(motionEvent0) : false;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int v4;
        int v3;
        synchronized(this.b.c) {
        }
        if(!this.b.d) {
            return;
        }
        DisplayMetrics displayMetrics0 = this.j;
        int v = f.j(displayMetrics0, displayMetrics0.widthPixels);
        int v1 = f.j(displayMetrics0, displayMetrics0.heightPixels);
        Activity activity0 = this.f();
        if(activity0 != null && activity0.getWindow() != null) {
            int[] arr_v = m.p(activity0);
            int v2 = f.j(displayMetrics0, arr_v[0]);
            v3 = f.j(displayMetrics0, arr_v[1]);
            v4 = v2;
        }
        else {
            v4 = v;
            v3 = v1;
        }
        int v5 = this.u.getDefaultDisplay().getRotation();
        if(this.q == v && this.p == v1 && this.r == v4 && this.s == v3 && (!((Boolean)s.n.g()).booleanValue() || this.t == v5)) {
            return;
        }
        if(this.q == v && this.p == v1) {
            Boolean boolean0 = (Boolean)s.n.g();
        }
        this.q = v;
        this.p = v1;
        this.r = v4;
        this.s = v3;
        this.t = v5;
        new com.google.android.gms.ads.internal.mraid.b(this).b(v, v1, v4, v3, displayMetrics0.density, v5);
    }

    @Override  // android.webkit.WebView
    protected final void onMeasure(int v, int v1) {
        synchronized(this) {
            if(this.l()) {
                this.setMeasuredDimension(0, 0);
                return;
            }
            this.isInEditMode();
            super.onMeasure(v, v1);
        }
    }

    @Override  // android.webkit.WebView
    public final void onPause() {
        if(!this.l()) {
            try {
                super.onPause();
                if(((Boolean)s.bX.g()).booleanValue() && pza.a("MUTE_AUDIO")) {
                    com.google.android.gms.ads.internal.util.client.h.d("Muting webview");
                    pyd.d(this, true);
                }
            }
            catch(Exception exception0) {
                com.google.android.gms.ads.internal.util.client.h.h("Could not pause webview.", exception0);
                if(((Boolean)s.bY.g()).booleanValue()) {
                    c.d().c(exception0, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    @Override  // android.webkit.WebView
    public final void onResume() {
        if(!this.l()) {
            try {
                super.onResume();
                if(((Boolean)s.bX.g()).booleanValue() && pza.a("MUTE_AUDIO")) {
                    com.google.android.gms.ads.internal.util.client.h.d("Unmuting webview");
                    pyd.d(this, false);
                }
            }
            catch(Exception exception0) {
                com.google.android.gms.ads.internal.util.client.h.h("Could not resume webview.", exception0);
                if(((Boolean)s.bY.g()).booleanValue()) {
                    c.d().c(exception0, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    @Override  // android.webkit.WebView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = !((Boolean)s.af.g()).booleanValue();
        return this.l() ? false : super.onTouchEvent(motionEvent0);
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void p() {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void q() {
        synchronized(this) {
        }
    }

    final Boolean r() {
        synchronized(this) {
        }
        return this.n;
    }

    @Override  // android.webkit.WebView, com.google.android.gms.ads.internal.webview.i
    public final void setWebViewClient(WebViewClient webViewClient0) {
        super.setWebViewClient(webViewClient0);
        if((webViewClient0 instanceof n)) {
            this.b = (n)webViewClient0;
        }
    }

    @Override  // android.webkit.WebView
    public final void stopLoading() {
        if(this.l()) {
            return;
        }
        try {
            super.stopLoading();
        }
        catch(Exception exception0) {
            com.google.android.gms.ads.internal.util.client.h.h("Could not stop loading webview.", exception0);
        }
    }

    public final void t(String s, Map map0) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = u.b().f(map0);
        }
        catch(JSONException unused_ex) {
            com.google.android.gms.ads.internal.util.client.h.k("Could not convert parameters to JSON.");
            return;
        }
        this.b(s, jSONObject0);
    }

    public final void u(String s) {
        if(this.r() == null) {
            this.E();
        }
        if(this.r().booleanValue()) {
            this.z(s);
            return;
        }
        this.x("javascript:" + s);
    }

    protected final void x(String s) {
        synchronized(this) {
            if(!this.l()) {
                this.loadUrl(s);
                return;
            }
            com.google.android.gms.ads.internal.util.client.h.k("#004 The webview is destroyed. Ignoring action.");
        }
    }

    final void y(Boolean boolean0) {
        synchronized(this) {
            this.n = boolean0;
        }
        e e0 = c.d();
        synchronized(e0.a) {
            e0.g = boolean0;
        }
    }

    protected final void z(String s) {
        synchronized(this) {
            if(!this.l()) {
                this.evaluateJavascript(s, null);
                return;
            }
            com.google.android.gms.ads.internal.util.client.h.k("#004 The webview is destroyed. Ignoring action.");
        }
    }
}

