package com.google.android.gms.auth.api.credentials.ulp.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import aeop;
import aeqg;
import aggi;
import ahgs;
import ahgu;
import ahhc;
import ahhd;
import android.accounts.Account;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import bboh;
import bxoc;
import bxod;
import bxol;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fhsy;
import gixp;
import gixr;
import ibuq;
import lso;
import xni;

@GmsCoreVeId(0x3EC63)
public class UlpUpgradeChimeraActivity extends xni {
    public WebView j;
    public View k;
    public String l;
    public static final int m;
    private static final bboh n;
    private bxod o;
    private Account p;
    private ahhd q;
    private fhsy r;

    static {
        UlpUpgradeChimeraActivity.n = aggi.a("UlpUpgradeChimeraActivity");
    }

    // Detected as a lambda impl.
    public final void a(aeop aeop0) {
        aeop0.h(UlpUpgradeChimeraActivity.n);
        bxod bxod0 = this.o;
        Account account0 = this.p;
        if(account0 != null) {
            bxod0 = bxoc.a(this, account0.name);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        ahhd ahhd0 = this.q;
        String s = ahhd0 == null ? bxol.a() : ahhd0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gixr)hftv0).b |= 2;
        ((gixr)hftv0).e = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gixr)hftp0.b_message).d = 17;
        ((gixr)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = aeop0.n();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gixp)hftp1.b_message).f = 209;
        ((gixp)hftp1.b_message).b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp0.b_message;
        gixp gixp0 = (gixp)hftp1.N_build();
        gixp0.getClass();
        gixr0.s = gixp0;
        gixr0.b |= 0x10000;
        bxod0.a(((gixr)hftp0.N_build()));
        this.setResult(aeop0.b(), aeop0.d());
        this.finish();
    }

    @Override  // xnb
    public final void onBackPressed() {
        if(this.j != null && this.j.canGoBack()) {
            this.j.goBack();
            return;
        }
        this.q.b();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        this.o = bxoc.a(this, null);
        this.setTheme(0x7F16101D);  // style:UlpUpgrade
        super.onCreate(bundle0);
        this.setContentView(0x7F0E02A4);  // layout:credentials_ulp_upgrade
        this.j = (WebView)this.findViewById(0x7F0B24DB);  // id:web_view
        this.k = this.findViewById(0x7F0B2093);  // id:spinner
        String s = this.getIntent().getStringExtra("calling_package");
        if(s == null) {
            this.a(((aeop)aeop.a().c(0x6F25, aeqg.a("packageName"))));
            return;
        }
        this.l = s;
        Account account0 = (Account)this.getIntent().getParcelableExtra("ulp_account");
        if(account0 == null) {
            this.a(((aeop)aeop.a().c(0x6F25, aeqg.a("ulpAccount"))));
            return;
        }
        this.p = account0;
        this.q = (ahhd)new lso(this, new ahhc(this.getApplication(), this.p)).a(ahhd.class);
        this.r = new fhsy(this.q);
        WebView webView0 = this.j;
        WebSettings webSettings0 = webView0.getSettings();
        webView0.setWebViewClient(new ahgu(this));
        webSettings0.setUseWideViewPort(false);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setAllowFileAccess(false);
        webSettings0.setNeedInitialFocus(false);
        webSettings0.setSupportZoom(false);
        fhsy fhsy0 = this.r;
        ibuq.f(webView0, "webView");
        webView0.addJavascriptInterface(fhsy0, "KidOnboarding");
        this.q.b.g(this, new ahgs(this));
        this.q.c.g(this, (aeop aeop0) -> {
            aeop0.h(UlpUpgradeChimeraActivity.n);
            bxod bxod0 = this.o;
            Account account0 = this.p;
            if(account0 != null) {
                bxod0 = bxoc.a(this, account0.name);
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
            ahhd ahhd0 = this.q;
            String s = ahhd0 == null ? bxol.a() : ahhd0.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((gixr)hftv0).b |= 2;
            ((gixr)hftv0).e = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gixr)hftp0.b_message).d = 17;
            ((gixr)hftp0.b_message).b |= 1;
            ProtoLiteBuilder hftp1 = aeop0.n();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gixp)hftp1.b_message).f = 209;
            ((gixp)hftp1.b_message).b |= 8;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gixr gixr0 = (gixr)hftp0.b_message;
            gixp gixp0 = (gixp)hftp1.N_build();
            gixp0.getClass();
            gixr0.s = gixp0;
            gixr0.b |= 0x10000;
            bxod0.a(((gixr)hftp0.N_build()));
            this.setResult(aeop0.b(), aeop0.d());
            this.finish();
        });
        this.q.h.i();
    }

    @Override  // xni
    public final void onDestroy() {
        WebView webView0 = this.j;
        if(webView0 != null) {
            webView0.destroy();
        }
        super.onDestroy();
    }
}

