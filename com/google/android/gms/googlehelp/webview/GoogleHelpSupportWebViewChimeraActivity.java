package com.google.android.gms.googlehelp.webview;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import actc;
import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.Toast;
import bbcu;
import bbdg;
import bblp;
import bbnk;
import bboh;
import bbpr;
import btia;
import btig;
import btip;
import btiq;
import btis;
import btit;
import btiv;
import btjz;
import btkb;
import btnq;
import btnt;
import btob;
import btrg;
import bttg;
import bttu;
import btvk;
import btvl;
import btvm;
import btwq;
import btyb;
import btzc;
import btzd;
import btze;
import btzh;
import btzi;
import btzw;
import btzx;
import buak;
import buap;
import buas;
import ccmq;
import com.google.android.chimera.WebView;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.material.appbar.AppBarLayout;
import evql;
import evqp;
import ggtj;
import gmap;
import gmcg;
import gnxf;
import hgff;
import htkd;
import htlj;
import htlv;
import htnc;
import htsn;
import htsz;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import jwe;
import kfv;

@GmsCoreVeId(0x3F429)
public class GoogleHelpSupportWebViewChimeraActivity extends btrg implements btkb, buap {
    public static final String j = "com.google.android.gms.googlehelp.webview.GoogleHelpSupportWebViewActivity";
    public static final bboh k;
    public static String l;
    ValueCallback m;
    public final List n;
    public String o;
    public String p;
    public WebView q;
    public View r;
    public boolean s;
    public boolean t;
    public long u;
    private gmcg v;
    private btiv w;
    private BroadcastReceiver x;
    private int y;
    private actc z;

    static {
        GoogleHelpSupportWebViewChimeraActivity.k = bboh.b("gH_SupportWebView", bbcu.aw);
    }

    public GoogleHelpSupportWebViewChimeraActivity() {
        this.m = null;
        this.n = new ArrayList();
        this.s = false;
        this.u = 0L;
    }

    @Override  // buap
    public final void ad(Intent intent0, ValueCallback valueCallback0) {
        if(!btwq.c(this.W)) {
            return;
        }
        this.m = valueCallback0;
        this.startActivityForResult(intent0, 0x2034);
    }

    @Override  // btkb
    public final void c(btig btig0) {
        synchronized(this.n) {
            this.n.remove(btig0);
        }
    }

    @Override  // btiw
    public final btjz d() {
        throw null;
    }

    @Override  // btiw
    public final btnq e() {
        throw null;
    }

    @Override  // btkb
    public final void f(btig btig0) {
        synchronized(this.n) {
            this.n.add(btig0);
        }
    }

    public final btiv g() {
        if(this.w == null) {
            this.w = new btiv();
        }
        return this.w;
    }

    public final void l() {
        this.findViewById(0x7F0B15BA).setVisibility(8);  // id:gh_progress_bar
    }

    public final void m(boolean z) {
        if(btnt.b(htnc.d())) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((btvk)hftv0).c = 0x92;
            ((btvk)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((btvk)hftp0.b_message).d = (z ? 2 : 3) - 1;
            ((btvk)hftp0.b_message).b |= 2;
            btvk btvk0 = (btvk)hftp0.N_build();
            HelpConfig helpConfig0 = this.ia();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            btvl btvl0 = (btvl)hftp1.b_message;
            btvk0.getClass();
            btvl0.d = btvk0;
            btvl0.c = 3;
            bttg.J(this, helpConfig0, hftp1);
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((btvm)hftv1).i = 0x101;
        ((btvm)hftv1).b |= 0x100;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((btvm)hftp2.b_message).j = (z ? 21 : 22) - 1;
        ((btvm)hftp2.b_message).b |= 0x400;
        bttu.E(this, hftp2, bbnk.a);
        btvm btvm0 = (btvm)hftp2.N_build();
    }

    public final void n() {
        new btyb(this, 2, this.p()).executeOnExecutor(this.p(), new Void[0]);
    }

    public final void o() {
        if(btnt.b(htlv.c())) {
            this.l();
        }
        WebView webView0 = (WebView)this.findViewById(0x7F0B159A);  // id:gh_home_screen_webview
        this.q = webView0;
        webView0.setWebViewClient(new btzx(this));
        WebView webView1 = this.q;
        WebSettings webSettings0 = buas.f(this, webView1);
        webSettings0.setSupportZoom(false);
        webSettings0.setBuiltInZoomControls(false);
        webView1.setBackgroundColor(btob.a(this, 0x7F0405C2));  // attr:ghf_surfaceColor
        this.q.addJavascriptInterface(new btzw(this), "activity");
        View view0 = this.r;
        if(view0 != null) {
            view0.setVisibility(8);
            this.q.setVisibility(0);
        }
        if(this.z == null) {
            this.z = new actc(this);
        }
        actc actc0 = this.z;
        Account account0 = this.W.d;
        String s = htkd.r();
        gmcg gmcg0 = this.p();
        evqp evqp0 = new evqp();
        gmcg0.execute(new btzc(actc0, account0, s, evqp0));
        btzh btzh0 = new btzh(this);
        evqp0.a.b(btzh0);
        btzi btzi0 = new btzi(this);
        evqp0.a.A(btzi0);
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(btwq.c(this.W) && v == 0x2034) {
            ValueCallback valueCallback0 = this.m;
            if(valueCallback0 != null) {
                if(v1 == -1) {
                    Uri[] arr_uri = WebChromeClient.FileChooserParams.parseResult(-1, intent0);
                    if(btnt.a(htsz.c())) {
                        for(int v2 = 0; v2 < arr_uri.length; ++v2) {
                            Uri uri0 = arr_uri[v2];
                            if(!TextUtils.isEmpty(uri0.getAuthority()) && uri0.getAuthority().contains("@")) {
                                arr_uri = null;
                                break;
                            }
                        }
                    }
                    valueCallback0.onReceiveValue(arr_uri);
                }
                else {
                    valueCallback0.onReceiveValue(null);
                }
            }
            this.m = null;
        }
    }

    @Override  // xnb
    public final void onBackPressed() {
        WebView webView0 = this.q;
        if(webView0 != null && this.s) {
            webView0.evaluateJavascript(htkd.a.o().T(), null);
            return;
        }
        super.onBackPressed();
        this.finish();
    }

    @Override  // btrg
    public final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.fA);
        super.onCreate(bundle0);
        if(!bbpr.c(this)) {
            Toast.makeText(this, "Network unavailable. Please try again later.", 0).show();
            ((ggtj)GoogleHelpSupportWebViewChimeraActivity.k.j()).x("No internet connection.");
            this.r();
            return;
        }
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            ((ggtj)GoogleHelpSupportWebViewChimeraActivity.k.j()).x("The intent that started the Activity is null.");
            this.r();
            return;
        }
        if(GoogleHelpSupportWebViewChimeraActivity.s(this.W) && intent0.hasExtra("EXTRA_HELP_CONFIG")) {
            this.W = (HelpConfig)intent0.getParcelableExtra("EXTRA_HELP_CONFIG");
        }
        Uri uri0 = intent0.getData();
        if(!btnt.b(htlv.c())) {
            if(uri0 == null) {
                ((ggtj)GoogleHelpSupportWebViewChimeraActivity.k.j()).x("The intent data is null.");
                this.r();
                return;
            }
            if(!buak.d(uri0, true)) {
                ((ggtj)GoogleHelpSupportWebViewChimeraActivity.k.j()).B("The URL is not allowed to be shown: %s", uri0.toSafeString());
                this.r();
                return;
            }
        }
        else if(!TextUtils.equals(intent0.getAction(), "android.intent.action.VIEW")) {
            ((ggtj)GoogleHelpSupportWebViewChimeraActivity.k.j()).x("The intent action is not view.");
            this.r();
            return;
        }
        HelpConfig helpConfig0 = this.W;
        if(helpConfig0 != null) {
            btob.d(this, helpConfig0, 0x7F16162D, 0x7F16162B, 0x7F16162C);  // style:gh_NoActionBarLightActivityStyleMaterial3
            HelpConfig helpConfig1 = this.W;
            if(helpConfig1.P) {
                btob.b(this, helpConfig1);
            }
            this.setContentView(0x7F0E0479);  // layout:gh_help_guide_activity
            this.findViewById(0x7F0B1597).setVisibility(0);  // id:gh_help_section
            Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B1598);  // id:gh_help_toolbar
            this.hG(toolbar0);
            btia.b(this, this.hL(), false);
            toolbar0.y(null);
            if(btnt.a(htsn.a.b().c())) {
                kfv.a(this.getWindow(), false);
                ((AppBarLayout)this.findViewById(0x7F0B158A)).setOnApplyWindowInsetsListener(new btzd());  // id:gh_help_app_bar
                ((FrameLayout)this.findViewById(0x7F0B1593)).setOnApplyWindowInsetsListener(new btze());  // id:gh_help_guide_content
            }
            int v = intent0.getIntExtra("extra_help_guide_entrypoint", 0);
            this.y = v;
            if(v == 1) {
                if(btnt.a(htlj.m())) {
                    this.u = intent0.getLongExtra("extra_help_guide_start_timestamp", this.u);
                }
                if(btnt.b(htlv.c())) {
                    this.n();
                }
                else {
                    GoogleHelpSupportWebViewChimeraActivity.l = uri0.toString();
                    this.o();
                }
                if(GoogleHelpSupportWebViewChimeraActivity.s(this.W)) {
                    btiv btiv0 = this.g();
                    HelpConfig helpConfig2 = this.W;
                    evqp evqp0 = new evqp();
                    evql evql0 = btiv0.a();
                    btip btip0 = new btip(btiv0, evqp0);
                    evql0.y(gmap.a, btip0);
                    Objects.requireNonNull(evqp0);
                    evql0.A(new btiq(evqp0));
                    btis btis0 = new btis(btiv0, helpConfig2);
                    evqp0.a.b(btis0);
                    btit btit0 = new btit(btiv0, helpConfig2);
                    evqp0.a.A(btit0);
                    this.setResult(-1);
                    return;
                }
                if(!btwq.c(this.W)) {
                    this.setResult(-1);
                    return;
                }
                this.g().c(this.W);
                this.setResult(-1);
                return;
            }
            if(GoogleHelpSupportWebViewChimeraActivity.s(this.W) && this.y == 2) {
                this.u = intent0.getLongExtra("extra_help_guide_start_timestamp", this.u);
                this.q();
                this.g().c(this.W);
                this.setResult(-1);
                return;
            }
            ((ggtj)GoogleHelpSupportWebViewChimeraActivity.k.j()).x("The Help Guide entry point was not set properly.");
            this.r();
            return;
        }
        ((ggtj)GoogleHelpSupportWebViewChimeraActivity.k.j()).x("The HelpConfig passed to the Activity is null ");
        this.r();
    }

    @Override  // xnb
    public final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        if(btnt.b(htsn.a.b().e()) && intent0.hasExtra("EXTRA_HELP_CONFIG")) {
            HelpConfig helpConfig0 = (HelpConfig)intent0.getParcelableExtra("EXTRA_HELP_CONFIG");
            int v = intent0.getIntExtra("extra_help_guide_entrypoint", 0);
            hgff hgff0 = helpConfig0.X;
            hgff hgff1 = this.W.X;
            if(hgff0 != null) {
                if(((ProtoLiteMessage)hgff0).equals(hgff1)) {
                    goto label_10;
                }
                goto label_17;
            }
            else if(hgff1 != null) {
                goto label_17;
            }
        label_10:
            gnxf gnxf0 = helpConfig0.W;
            gnxf gnxf1 = this.W.W;
            if(gnxf0 != null) {
                if(((ProtoLiteMessage)gnxf0).equals(gnxf1)) {
                    goto label_16;
                }
                goto label_17;
            }
            else if(gnxf1 != null) {
                goto label_17;
            }
        label_16:
            if(!TextUtils.equals(helpConfig0.g(), this.W.g()) || v != this.y) {
            label_17:
                this.W = helpConfig0;
                this.u = intent0.getLongExtra("extra_help_guide_start_timestamp", this.u);
                this.setIntent(intent0);
                if(v == 2) {
                    this.q();
                    return;
                }
                this.n();
            }
        }
        else if(GoogleHelpSupportWebViewChimeraActivity.s(this.W)) {
            int v1 = intent0.getIntExtra("extra_help_guide_entrypoint", 0);
            if(v1 != this.y && v1 == 2 && intent0.hasExtra("EXTRA_HELP_CONFIG")) {
                this.W = (HelpConfig)intent0.getParcelableExtra("EXTRA_HELP_CONFIG");
                this.u = intent0.getLongExtra("extra_help_guide_start_timestamp", this.u);
                this.setIntent(intent0);
                this.q();
            }
        }
    }

    @Override  // btrg
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // xoi
    public final void onPause() {
        super.onPause();
        if(btwq.c(this.W)) {
            BroadcastReceiver broadcastReceiver0 = this.x;
            if(broadcastReceiver0 != null) {
                this.unregisterReceiver(broadcastReceiver0);
                this.x = null;
            }
            if(this.t) {
                ChatRequestAndConversationChimeraService.N(false, this, this.W);
            }
        }
    }

    @Override  // xoi
    public final void onResume() {
        super.onResume();
        if(!btwq.c(this.W)) {
            return;
        }
        if(!this.t) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT");
            intentFilter0.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE");
            intentFilter0.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY");
            if(this.x == null) {
                this.x = new GoogleHelpSupportWebViewChimeraActivity.1(this);
            }
            jwe.c(this, this.x, intentFilter0, "com.google.android.gms.permission.BROADCAST_TO_GOOGLEHELP", null, 4);
            return;
        }
        ChatRequestAndConversationChimeraService.N(true, this, this.W);
    }

    private final gmcg p() {
        if(this.v == null) {
            this.v = new bblp(0x7FFFFFFF, 9);
        }
        return this.v;
    }

    private final void q() {
        new btyb(this, 3, this.p()).executeOnExecutor(this.p(), new Void[0]);
    }

    private final void r() {
        this.setResult(0);
        this.finish();
    }

    private static final boolean s(HelpConfig helpConfig0) {
        return btnt.c(helpConfig0.g(), htlj.g(), htlj.c(), htlj.d());
    }
}

