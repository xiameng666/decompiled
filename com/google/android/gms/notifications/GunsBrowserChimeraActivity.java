package com.google.android.gms.notifications;

import android.app.ActivityManager.TaskDescription;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import bbcu;
import bbdg;
import bbmn;
import bboh;
import ccmq;
import clht;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import djqy;
import djrb;
import djrf;
import djrm;
import djrn;
import djro;
import djrw;
import gdkh;
import gdkl;
import gdkt;
import gdku;
import gdkv;
import ggtj;
import hvsk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import jwe;
import luo;
import lvb;
import xob;

@GmsCoreVeId(0x3FBA9)
public final class GunsBrowserChimeraActivity extends xob implements djrm, luo {
    public static final bboh j;
    public final Set k;
    public WebView l;
    public boolean m;
    public ProgressBar n;
    private static final IntentFilter o;
    private final Set p;
    private gdkl q;
    private gdku r;
    private djrn s;
    private boolean t;
    private String u;
    private GunsSmsReceiver v;
    private Handler w;

    static {
        GunsBrowserChimeraActivity.j = bboh.b("GunsBrowserChimeraActivity", bbcu.bo);
        GunsBrowserChimeraActivity.o = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
    }

    public GunsBrowserChimeraActivity() {
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(new String[]{"adssettings.google.com", "myaccount.google.com", "security.google.com", "www.google.com", "accounts.google.com", "accounts.google.net", "accounts.google.org", "accounts.google.biz", "accounts.google.info", "accounts.google.mobi", "accounts.google.name", "accounts.google.pro", "accounts.google.us", "accounts.google.ag", "accounts.google.ba", "accounts.google.ca", "accounts.google.co.cr", "accounts.google.co.uk", "accounts.g.cn", "accounts.google.cn", "accounts.google.com.cn", "accounts.guge.com", "accounts.guge.com.cn", "accounts.guge.cn", "accounts.googel.cn", "accounts.xn--flW351E.cn", "accounts.google.al", "accounts.google.org.uk", "accounts.google.cl", "accounts.google.de", "accounts.google.ec", "accounts.google.ee", "accounts.google.fi", "accounts.google.fr", "accounts.google.gd", "accounts.google.ge", "accounts.google.gy", "accounts.google.com.gy", "accounts.google.ie", "accounts.google.in", "accounts.google.net.in", "accounts.google.org.in", "accounts.google.it", "accounts.google.co.nz", "accounts.google.org.nz", "accounts.google.net.nz", "accounts.google.co.at", "accounts.google.com.af", "accounts.google.org.af", "accounts.google.at", "accounts.google.com.au", "accounts.google.com.br", "accounts.google.com.gt", "accounts.google.com.mx", "accounts.google.mx", "accounts.google.co.ma", "accounts.google.jobs", "accounts.google.cz", "accounts.google.hu", "accounts.google.co.hu", "accounts.google.nl", "accounts.google.is", "accounts.google.dk", "accounts.google.pf", "accounts.google.com.pg", "accounts.google.pl", "accounts.google.com.pl", "accounts.google.com.ph", "accounts.google.com.pr", "accounts.google.ro", "accounts.google.se", "accounts.google.ch", "accounts.google.gm", "accounts.xn--2e0b0k.kr", "accounts.google.co.kr", "accounts.google.kr", "accounts.google.jp", "accounts.google.co.jp", "accounts.google.ne.jp", "accounts.google.co.je", "accounts.google.com.ar", "accounts.google.am", "accounts.google.be", "accounts.google.fm", "accounts.google.tv", "accounts.google.vg", "accounts.google.bi", "accounts.google.cc", "accounts.google.cd", "accounts.google.co.il", "accounts.google.kz", "accounts.google.la", "accounts.google.lv", "accounts.google.lt", "accounts.google.md", "accounts.google.mw", "accounts.google.mr", "accounts.google.ms", "accounts.google.nr", "accounts.google.nu", "accounts.google.ps", "accounts.google.com.ps", "accounts.google.com.nf", "accounts.google.com.pa", "accounts.google.com.py", "accounts.google.ru", "accounts.google.com.ru", "accounts.xn--c1aay4a.xn--p1ai", "accounts.google.rw", "accounts.google.sh", "accounts.google.com.ec", "accounts.google.co.gg", "accounts.google.li", "accounts.google.com.ua", "accounts.google.ua", "accounts.google.co.ua", "accounts.google.as", "accounts.google.ws", "accounts.google.sg", "accounts.google.co.th", "accounts.google.ae", "accounts.google.gr", "accounts.google.com.gr", "accounts.google.no", "accounts.google.com.pt", "accounts.google.pt", "accounts.google.com.sg", "accounts.google.io", "accounts.google.td", "accounts.google.tw", "accounts.google.com.hk", "accounts.google.hk", "accounts.google.com.pe", "accounts.google.com.tw", "accounts.google.je", "accounts.google.com.tr", "accounts.google.ac", "accounts.google.ad", "accounts.google.it.ao", "accounts.google.aw", "accounts.google.az", "accounts.google.bf", "accounts.google.bg", "accounts.google.bj", "accounts.google.bm", "accounts.google.bn", "accounts.google.bo", "accounts.google.bs", "accounts.google.bt", "accounts.google.by", "accounts.google.bz", "accounts.google.cat", "accounts.google.cf", "accounts.google.cg", "accounts.google.ci", "accounts.google.cm", "accounts.google.co.ao", "accounts.google.co.ba", "accounts.google.co.bi", "accounts.google.co.bw", "accounts.google.co.ci", "accounts.google.co.ck", "accounts.google.co.gl", "accounts.google.co.gy", "accounts.google.co.id", "accounts.google.co.im", "accounts.google.co.in", "accounts.google.co.it", "accounts.google.co.ke", "accounts.google.co.ls", "accounts.google.co.mu", "accounts.google.co.mw", "accounts.google.co.mz", "accounts.google.co.pn", "accounts.google.co.rs", "accounts.google.co.tt", "accounts.google.co.tz", "accounts.google.co.ug", "accounts.google.co.uz", "accounts.google.co.ve", "accounts.google.co.vi", "accounts.google.co.za", "accounts.google.co.zm", "accounts.google.co.zw", "accounts.google.com.ag", "accounts.google.com.ai", "accounts.google.com.az", "accounts.google.com.bd", "accounts.google.com.bh", "accounts.google.com.bi", "accounts.google.com.bn", "accounts.google.com.bo", "accounts.google.com.bs", "accounts.google.com.by", "accounts.google.com.bz", "accounts.google.com.cy", "accounts.google.com.dz", "accounts.google.com.eg", "accounts.google.com.er", "accounts.google.com.et", "accounts.google.com.ge", "accounts.google.com.gh", "accounts.google.com.gi", "accounts.google.com.gl", "accounts.google.com.gp", "accounts.google.com.hn", "accounts.google.com.hr", "accounts.google.com.ht", "accounts.google.com.iq", "accounts.google.com.jm", "accounts.google.com.jo", "accounts.google.com.kg", "accounts.google.com.kh", "accounts.google.com.ki", "accounts.google.com.kw", "accounts.google.com.kz", "accounts.google.com.lb", "accounts.google.com.lc", "accounts.google.com.lk", "accounts.google.com.lv", "accounts.google.com.ly", "accounts.google.com.mk", "accounts.google.com.mm", "accounts.google.com.mt", "accounts.google.com.mu", "accounts.google.com.mw", "accounts.google.com.my", "accounts.google.com.na", "accounts.google.com.nc", "accounts.google.com.ng", "accounts.google.com.ni", "accounts.google.com.np", "accounts.google.com.nr", "accounts.google.com.om", "accounts.google.com.pk", "accounts.google.com.qa", "accounts.google.com.sa", "accounts.google.com.sb", "accounts.google.com.sc", "accounts.google.com.sl", "accounts.google.com.sv", "accounts.google.com.tj", "accounts.google.com.tm", "accounts.google.com.tn", "accounts.google.com.tt", "accounts.google.com.uy", "accounts.google.com.uz", "accounts.google.com.vc", "accounts.google.com.vi", "accounts.google.com.vn", "accounts.google.com.ws", "accounts.google.com.cu", "accounts.google.cv", "accounts.google.cx", "accounts.google.dj", "accounts.google.dm", "accounts.google.do", "accounts.google.dz", "accounts.google.es", "accounts.google.eu", "accounts.google.nom.es", "accounts.google.org.es", "accounts.google.ga", "accounts.google.gf", "accounts.google.gg", "accounts.google.gl", "accounts.google.gp", "accounts.google.gw", "accounts.google.hn", "accounts.google.hr", "accounts.google.ht", "accounts.google.im", "accounts.google.in.rs", "accounts.google.iq", "accounts.google.jo", "accounts.google.kg", "accounts.google.ki", "accounts.google.km", "accounts.google.kn", "accounts.google.lk", "accounts.google.lu", "accounts.google.ma", "accounts.google.me", "accounts.google.mg", "accounts.google.mh", "accounts.google.mk", "accounts.google.ml", "accounts.google.mn", "accounts.google.mu", "accounts.google.mv", "accounts.google.ne", "accounts.google.nf", "accounts.google.ng", "accounts.google.off.ai", "accounts.google.ph", "accounts.google.pk", "accounts.google.pn", "accounts.google.pr", "accounts.google.qa", "accounts.google.re", "accounts.google.rs", "accounts.google.sc", "accounts.google.si", "accounts.google.sk", "accounts.google.sl", "accounts.google.sm", "accounts.google.sn", "accounts.google.so", "accounts.google.sr", "accounts.google.st", "accounts.google.sz", "accounts.google.tk", "accounts.google.tg", "accounts.google.tm", "accounts.google.tn", "accounts.google.to", "accounts.google.tt", "accounts.google.ug", "accounts.google.uz", "accounts.google.vc", "accounts.google.vn", "accounts.google.vu", "accounts.google.yt", "accounts.google.af", "accounts.google.com.ve", "accounts.google.tel", "accounts.google.tp", "accounts.google.tl", "accounts.google.com.do", "accounts.google.com.co", "accounts.google.com.fj", "accounts.youtube.com", "access.workspace.google.com"}));
        hvsk hvsk0 = hvsk.a;
        for(Object object0: djqy.a(hvsk0.b().d())) {
            String s = (String)object0;
            if(GunsBrowserChimeraActivity.p(s)) {
                hashSet0.add(s);
            }
        }
        for(Object object1: djqy.a(hvsk0.b().f())) {
            hashSet0.remove(((String)object1));
        }
        this.p = hashSet0;
        HashSet hashSet1 = new HashSet();
        for(Object object2: djqy.a(hvsk0.b().h())) {
            String s1 = (String)object2;
            if(GunsBrowserChimeraActivity.p(s1)) {
                hashSet1.add(s1);
            }
        }
        for(Object object3: djqy.a(hvsk0.b().g())) {
            String s2 = (String)object3;
            if(GunsBrowserChimeraActivity.p(s2)) {
                hashSet1.add(s2);
            }
        }
        this.k = hashSet1;
    }

    @Override  // luo
    public final lvb a(int v, Bundle bundle0) {
        if(v == 0) {
            String s = this.m();
            if(!TextUtils.isEmpty(s)) {
                return new djrw(this, this.u, s);
            }
        }
        return null;
    }

    @Override  // luo
    public final void b(lvb lvb0, Object object0) {
        if(lvb0.getId() != 0) {
            return;
        }
        if(((Bundle)object0).getBoolean("WebLoginUrlLoader.hadError", false)) {
            this.o(null);
        }
        else {
            this.o(((Bundle)object0).getString("WebloginUrlLoader.authenticatedUrl"));
        }
        this.getSupportLoaderManager().e(0);
    }

    @Override  // luo
    public final void c(lvb lvb0) {
    }

    public final void f(String s) {
        if(!TextUtils.isEmpty(s)) {
            this.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(s)));
            if(s.equals(this.m())) {
                this.h(false);
                this.finish();
            }
        }
    }

    public final void g(String s) {
        if(this.l != null) {
            this.w.post(new djrb(this, s));
        }
    }

    public final void h(boolean z) {
        if(z) {
            if(!this.t) {
                if(this.s == null) {
                    this.s = new djrn(this, this, this.l);
                }
                this.l.addJavascriptInterface(this.s, "mm");
                jwe.b(this, this.v, GunsBrowserChimeraActivity.o, 2);
                this.t = true;
            }
        }
        else if(this.t) {
            this.l.removeJavascriptInterface("mm");
            this.t = false;
        }
    }

    public final boolean i(String s) {
        if(!TextUtils.isEmpty(s)) {
            Uri uri0 = Uri.parse(s);
            return this.p != null && this.p.contains(uri0.getHost()) && "https".equals(uri0.getScheme());
        }
        return false;
    }

    private final String l() {
        return this.q == null || (this.q.d == null ? gdkh.a : this.q.d).d.isEmpty() ? null : (this.q.d == null ? gdkh.a : this.q.d).d;
    }

    private final String m() {
        return this.r == null || (this.r.c == null ? gdkv.a : this.r.c).b.isEmpty() || (!(this.r.c == null ? gdkv.a : this.r.c).c || TextUtils.isEmpty(this.u)) ? null : (this.r.c == null ? gdkv.a : this.r.c).b;
    }

    private final void n(Intent intent0) {
        String s = this.u;
        String s1 = this.m();
        String s2 = this.l();
        this.q = djro.a(intent0);
        this.r = djro.b(intent0);
        this.u = intent0.getStringExtra("com.google.android.gms.notifications.intents.accountName");
        String s3 = this.m();
        String s4 = this.l();
        if(!bbmn.n(this.getApplicationContext(), this.u)) {
            this.finish();
            return;
        }
        if(s1 == null || s == null || s2 == null || !s.equals(this.u) || !s1.equals(s3) || !s2.equals(s4)) {
            if(TextUtils.isEmpty(s3)) {
                ((ggtj)GunsBrowserChimeraActivity.j.i()).x("Trying to navigate to null/empty url/accountname");
                this.finish();
                return;
            }
            if(!this.i(s3)) {
                this.f(s3);
                return;
            }
            this.m = false;
            this.getSupportLoaderManager().e(0);
            this.getSupportLoaderManager().c(0, null, this);
        }
        this.setTaskDescription(new ActivityManager.TaskDescription((this.q == null || (this.q.f == null ? gdkt.a : this.q.f).s.isEmpty() ? "Account action required" : (this.q.f == null ? gdkt.a : this.q.f).s)));
    }

    private final void o(String s) {
        CookieManager.getInstance().removeAllCookie();
        if(TextUtils.isEmpty(s)) {
            s = this.m();
        }
        this.l.loadUrl(s);
    }

    @Override  // xnb
    public final void onBackPressed() {
        if(this.l.canGoBack()) {
            this.l.goBack();
            return;
        }
        super.onBackPressed();
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.eB);
        super.onCreate(bundle0);
        this.w = new clht();
        this.setContentView(0x7F0E04B0);  // layout:guns_web_view
        WebView webView0 = (WebView)this.findViewById(0x7F0B1640);  // id:gunsWebView
        this.l = webView0;
        WebSettings webSettings0 = webView0.getSettings();
        webSettings0.setBlockNetworkImage(false);
        webSettings0.setBlockNetworkLoads(false);
        webSettings0.setBuiltInZoomControls(true);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setLoadsImagesAutomatically(true);
        webSettings0.setSupportZoom(true);
        webSettings0.setUserAgentString(webSettings0.getUserAgentString() + " GnotsGcoreWebView/1.1");
        webSettings0.setDisabledActionModeMenuItems(7);
        this.l.setWebViewClient(new djrf(this));
        this.n = (ProgressBar)this.findViewById(0x7F0B163F);  // id:gunsProgressBar
        this.s = null;
        this.t = false;
        this.v = new GunsSmsReceiver(this.l);
        this.n(this.getIntent());
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        this.setIntent(intent0);
        this.n(intent0);
    }

    @Override  // xoi
    protected final void onPause() {
        super.onPause();
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        if(this.t) {
            jwe.b(this, this.v, GunsBrowserChimeraActivity.o, 2);
        }
    }

    @Override  // xoi
    public final void onStop() {
        super.onStop();
        if(this.m) {
            this.finish();
        }
    }

    private static boolean p(String s) {
        return !TextUtils.isEmpty(s) && Patterns.DOMAIN_NAME.matcher(s).matches();
    }

    @Override  // android.content.ContextWrapper
    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver0) {
        try {
            super.unregisterReceiver(broadcastReceiver0);
        }
        catch(Exception unused_ex) {
        }
    }
}

