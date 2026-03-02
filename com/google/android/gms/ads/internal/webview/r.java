package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.video.b;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class r extends FrameLayout implements i {
    public final i a;
    public final b b;
    public final AtomicBoolean c;

    public r(i i0) {
        super(i0.getContext());
        this.c = new AtomicBoolean();
        this.a = i0;
        this.b = new b(i0.g());
        this.addView(((View)i0));
    }

    @Override  // com.google.android.gms.ads.internal.client.a
    public final void a() {
    }

    @Override  // com.google.android.gms.ads.internal.js.a
    public final void b(String s, JSONObject jSONObject0) {
        this.a.b(s, jSONObject0);
    }

    @Override  // com.google.android.gms.ads.internal.video.c
    public final void c() {
        this.a.c();
    }

    @Override  // com.google.android.gms.ads.internal.video.c
    public final void d() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void destroy() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.js.l
    public final void e(String s, JSONObject jSONObject0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final Activity f() {
        return this.a.f();
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final Context g() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.js.l
    public final void gc(String s) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final WebViewClient h() {
        return ((x)this.a).b;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final VersionInfoParcel i() {
        return ((x)this.a).a;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final ai j() {
        return this.a.j();
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void k() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final boolean l() {
        return this.a.l();
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void loadData(String s, String s1, String s2) {
        this.a.loadData(s, "text/html", "UTF-8");
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void loadUrl(String s) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final n m() {
        return ((x)this.a).b;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void n() {
        this.a.n();
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void o() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void p() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void q() {
        this.a.q();
    }

    @Override  // com.google.android.gms.ads.internal.webview.i, android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.a.setOnClickListener(view$OnClickListener0);
    }

    @Override  // com.google.android.gms.ads.internal.webview.i, android.view.View
    public final void setOnTouchListener(View.OnTouchListener view$OnTouchListener0) {
        this.a.setOnTouchListener(view$OnTouchListener0);
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void setWebChromeClient(WebChromeClient webChromeClient0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.webview.i
    public final void setWebViewClient(WebViewClient webViewClient0) {
        throw null;
    }
}

