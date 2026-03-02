package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import bbcu;
import bboh;
import bbqa;
import bvpc;
import bwax;
import bway;
import bwbb;
import bwbe;
import bwcd;
import bwdm;
import com.google.android.chimera.WebView;
import ibnn;
import ibnz;
import ibts;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class WebViewWrapper extends FrameLayout implements bwcd {
    public static final bboh a;
    public bvpc b;
    private final ibnn c;

    static {
        WebViewWrapper.a = bboh.b("UiFlow", bbcu.ff);
    }

    public WebViewWrapper(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public WebViewWrapper(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public WebViewWrapper(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        this.c = new ibnz(new bwax(this));
    }

    public WebViewWrapper(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void a(ibts ibts0) {
        WebView webView0 = this.b();
        WebSettings webSettings0 = webView0.getSettings();
        webSettings0.setAllowContentAccess(true);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setDatabaseEnabled(true);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setSupportMultipleWindows(true);
        webView0.setBackgroundColor(0);
        ibts0.a(webView0);
        String s = this.b().getUrl();
        bvpc bvpc0 = null;
        String s1 = s == null ? null : Uri.parse(s).getHost();
        webView0.setWebChromeClient(new bwbb());
        bvpc bvpc1 = this.b;
        if(bvpc1 == null) {
            ibuq.j("clientStreamz");
        }
        else {
            bvpc0 = bvpc1;
        }
        webView0.setWebViewClient(new bwbe(this, bvpc0, s1));
    }

    private final WebView b() {
        Object object0 = this.c.a();
        ibuq.e(object0, "getValue(...)");
        return (WebView)object0;
    }

    @Override  // bwcd
    public final void g(bwdm bwdm0) {
        ibuq.f(bwdm0, "uiFlowFlags");
        this.setSaveEnabled(true);
        FrameLayout.inflate(this.getContext(), 0x7F0E0EC9, this);  // layout:webview_wrapper_bc25
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState((bbqa.c() ? ((Parcelable)((Bundle)parcelable0).getParcelable("_parent_state", Parcelable.class)) : ((Bundle)parcelable0).getParcelable("_parent_state")));
        this.a(new bway(parcelable0));
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("_parent_state", super.onSaveInstanceState());
        this.b().saveState(((Bundle)parcelable0));
        return parcelable0;
    }
}

