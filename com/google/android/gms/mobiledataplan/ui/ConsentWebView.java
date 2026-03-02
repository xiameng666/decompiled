package com.google.android.gms.mobiledataplan.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bbcu;
import bboh;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.SafeHtml;
import csau;
import csav;
import csaw;
import cslm;
import fpyt;
import hvjt;
import hvko;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.logging.Level;

public final class ConsentWebView extends WebView {
    public static final bboh a;
    public csaw b;
    private WebViewClient c;

    static {
        ConsentWebView.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public ConsentWebView(Context context0) {
        super(context0);
        this.c(this);
    }

    public ConsentWebView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c(this);
    }

    public ConsentWebView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c(this);
    }

    public static void a(WebView webView0, csaw csaw0) {
        if(!webView0.canScrollVertically(1) && csaw0 != null) {
            csaw0.a();
        }
    }

    public final void b(ConsentAgreementText consentAgreementText0) {
        String s;
        if(TextUtils.isEmpty(hvko.x())) {
            SafeHtml[] arr_safeHtml = consentAgreementText0.b;
            if(arr_safeHtml != null && arr_safeHtml.length != 0) {
                SafeHtml safeHtml0 = arr_safeHtml[0];
                if(safeHtml0 != null) {
                    s = safeHtml0.a;
                    goto label_12;
                }
                goto label_9;
            }
            else {
            label_9:
                Level level0 = cslm.h();
                ConsentWebView.a.g(level0).x("consent paragraph is empty");
                s = "";
            }
        }
        else {
            s = hvko.x();
        }
    label_12:
        this.loadData(Base64.encodeToString((hvjt.a.c().c() ? s.getBytes(Charset.forName("ISO-8859-1")) : s.getBytes()), 1), "text/html", "base64");
    }

    private final void c(WebView webView0) {
        csav csav0 = new csav(this, new fpyt(new ArrayList()));
        this.c = csav0;
        webView0.setWebViewClient(csav0);
        webView0.setOnLongClickListener(new csau());
        webView0.setLongClickable(false);
    }

    @Override  // android.webkit.WebView
    protected final void onScrollChanged(int v, int v1, int v2, int v3) {
        ConsentWebView.a(this, this.b);
    }
}

