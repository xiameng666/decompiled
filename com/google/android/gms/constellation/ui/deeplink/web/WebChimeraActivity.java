package com.google.android.gms.constellation.ui.deeplink.web;

import acoa;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.view.KeyEvent;
import android.webkit.WebView;
import baun;
import bbvk;
import bcnm;
import bcoc;
import bcos;
import bcou;
import bcov;
import bcow;
import bcox;
import bcoy;
import bcoz;
import bcpe;
import bcqx;
import bcrh;
import cclw;
import clht;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fpyt;
import fpyx;
import hfuo;
import hrdo;
import ibnn;
import ibpo;
import ibuk;
import ibuq;
import ibyo;
import iccl;
import java.util.ArrayList;
import java.util.Iterator;
import lsd;
import xni;

@GmsCoreVeId(0x3F2F1)
public final class WebChimeraActivity extends xni {
    public static final baun j;
    public WebView k;
    public final clht l;

    static {
        WebChimeraActivity.j = bcrh.a("c11n_web_chimera_activity");
    }

    public WebChimeraActivity() {
        this.l = new clht(Looper.getMainLooper());
    }

    private static final bcpe a(ibnn ibnn0) {
        return (bcpe)ibnn0.a();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        baun baun0 = WebChimeraActivity.j;
        baun0.d("onCreate WebChimeraActivity", new Object[0]);
        this.setTheme(0x7F160C54);  // style:Theme.GoogleMaterial.DayNight.NoActionBar
        bcow bcow0 = new bcow(this);
        lsd lsd0 = new lsd(new ibuk(bcpe.class), new bcox(this), bcow0, new bcoy(this));
        bcpe bcpe0 = WebChimeraActivity.a(lsd0);
        ibuq.f(bcpe0, "viewModel");
        WebView webView0 = new WebView(this);
        this.k = webView0;
        this.setContentView(webView0);
        WebView webView1 = this.k;
        Uri uri0 = null;
        if(webView1 == null) {
            ibuq.j("webView");
            webView1 = null;
        }
        webView1.getSettings().setJavaScriptEnabled(true);
        hfuo hfuo0 = hrdo.b().b;
        ibuq.e(hfuo0, "getElementList(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
        Iterator iterator0 = hfuo0.iterator();
        while(iterator0.hasNext()) {
            arrayList0.add(bcnm.b(iterator0, "https://", "/*"));
        }
        fpyt fpyt0 = fpyt.b(ibpo.at(arrayList0));
        WebView webView2 = this.k;
        if(webView2 == null) {
            ibuq.j("webView");
            webView2 = null;
        }
        webView2.setWebViewClient(new bcoc(fpyt0, bcpe0));
        Intent intent0 = this.getIntent();
        Uri uri1 = intent0 == null ? null : intent0.getData();
        fpyx.a(uri1);
        if(uri1 != null && fpyt0.c(uri1)) {
            hrdo hrdo0 = hrdo.a;
            if(hrdo0.c().f()) {
                baun0.d("user is part of the web mo test group", new Object[0]);
                WebView webView3 = this.k;
                if(webView3 == null) {
                    ibuq.j("webView");
                    webView3 = null;
                }
                byte[] arr_b = hrdo0.c().c().getBytes(ibyo.a);
                ibuq.e(arr_b, "getBytes(...)");
                String s = Base64.encodeToString(arr_b, 1);
                ibuq.e(s, "encodeToString(...)");
                webView3.loadData(s, "text/html", "base64");
            }
            else {
                WebView webView4 = this.k;
                if(webView4 == null) {
                    ibuq.j("webView");
                    webView4 = null;
                }
                webView4.loadUrl(String.valueOf(this.getIntent().getData()));
            }
            WebView webView5 = this.k;
            if(webView5 == null) {
                ibuq.j("webView");
                webView5 = null;
            }
            bcqx bcqx0 = bcqx.a(this);
            Intent intent1 = this.getIntent();
            ibuq.f(webView5, "webView");
            bcpe.a.d("addJavascriptInterface", new Object[0]);
            webView5.addJavascriptInterface(new bcos(bcpe0, new bbvk(webView5.getContext()), new acoa(webView5.getContext()), iccl.b(cclw.d)), "PhoneIdentityJsBridge");
            bcpe0.e = bcqx0;
            if(intent1 != null) {
                uri0 = intent1.getData();
            }
            bcpe0.f = uri0;
        }
        else {
            baun0.d("Unable to handle landing url generated from the deep link handler", new Object[0]);
            this.finish();
        }
        WebChimeraActivity.a(lsd0).c.g(this, new bcoz(new bcou(this)));
        WebChimeraActivity.a(lsd0).d.g(this, new bcoz(new bcov(this)));
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        ibuq.f(keyEvent0, "event");
        if(v == 4) {
            WebView webView0 = this.k;
            WebView webView1 = null;
            if(webView0 == null) {
                ibuq.j("webView");
                webView0 = null;
            }
            if(webView0.canGoBack()) {
                WebView webView2 = this.k;
                if(webView2 == null) {
                    ibuq.j("webView");
                }
                else {
                    webView1 = webView2;
                }
                webView1.goBack();
                return true;
            }
            v = 4;
        }
        return super.onKeyDown(v, keyEvent0);
    }
}

