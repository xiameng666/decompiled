package com.google.android.gms.googlehelp.helpactivities;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.accounts.Account;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebSettings;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import azts;
import azzc;
import bbcu;
import bbdg;
import bblp;
import bbmq;
import bbnk;
import bboh;
import bbpr;
import bbqa;
import bkxu;
import blei;
import blej;
import bths;
import bthu;
import bthw;
import bthx;
import bthz;
import btia;
import btig;
import btij;
import btik;
import btil;
import btim;
import btiv;
import btiw;
import btix;
import btiz;
import btjb;
import btjc;
import btjd;
import btjk;
import btjz;
import btka;
import btkb;
import btke;
import btkk;
import btnq;
import btns;
import btnt;
import btoa;
import btob;
import btok;
import btoo;
import btoq;
import btot;
import btoz;
import btpg;
import btpk;
import btpy;
import btpz;
import btqa;
import btqb;
import btqc;
import btqd;
import btqf;
import btqg;
import btqh;
import btqi;
import btqj;
import btqk;
import btql;
import btqm;
import btqn;
import btqr;
import btqs;
import btqt;
import btqx;
import btqy;
import btqz;
import btra;
import btrb;
import btrc;
import btrd;
import btrg;
import btrh;
import btsv;
import bttg;
import btti;
import bttu;
import btvk;
import btvl;
import btvm;
import btwb;
import btwe;
import btwf;
import btwi;
import btwq;
import btwt;
import btwx;
import btxe;
import btxg;
import btxj;
import btxl;
import btya;
import btyb;
import btyc;
import btyd;
import btyh;
import btyi;
import btyp;
import btys;
import btyx;
import buad;
import buag;
import buah;
import buaj;
import buan;
import buap;
import buas;
import bxf;
import ca;
import cjoy;
import clht;
import com.google.android.chimera.WebView;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import com.google.android.gms.googlehelp.fragments.AccountPickerContainer;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import fm;
import fydg;
import fyhn;
import ggtj;
import gmcg;
import hfuo;
import hges;
import hgev;
import hgew;
import hgex;
import hgez;
import hjex;
import hjfa;
import hjfq;
import hjft;
import htkd;
import htlj;
import htlp;
import htmq;
import htnc;
import htno;
import htnu;
import htoa;
import htoy;
import htpe;
import htph;
import htqc;
import htqf;
import htqi;
import htqo;
import htqu;
import htqx;
import htra;
import htrp;
import htrs;
import htry;
import htse;
import htsh;
import htsn;
import htsq;
import htst;
import htsz;
import htti;
import j..util.Objects;
import j..util.Optional;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import jwa;
import kay;
import kfv;

@GmsCoreVeId(0x3F423)
public class HelpChimeraActivity extends btrg implements bthx, btiw, btkb, buap {
    public final btiz A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public Boolean K;
    public OpenSearchView L;
    public btxe M;
    public final List N;
    public String O;
    public String P;
    public Integer Q;
    public WebView R;
    public WebView S;
    public buag T;
    public View U;
    int V;
    private static final Set aa;
    private static int ab;
    private final Handler ac;
    private btoo ad;
    private btka ae;
    private btiz af;
    private final btiz ag;
    private final btiz ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private SparseArray am;
    private Deque an;
    public static final bboh j;
    public static final String k;
    public static final String l;
    ValueCallback m;
    public final gmcg n;
    public final gmcg o;
    public final blej p;
    public AppBarLayout q;
    public View r;
    public View s;
    public btot t;
    public btxg u;
    btoz v;
    public bths w;
    public btnq x;
    public btjz y;
    public bthz z;

    static {
        HelpChimeraActivity.j = bboh.b("gH_HelpActivity", bbcu.aw);
        HelpChimeraActivity.k = "gH_HelpActivity-" + btoz.class.getSimpleName();
        HelpChimeraActivity.l = "gH_HelpActivity-" + btoo.class.getSimpleName();
        HelpChimeraActivity.aa = new bxf();
    }

    public HelpChimeraActivity() {
        this.m = null;
        this.n = new bblp(0x7FFFFFFF, 10);
        this.o = new bblp(0x7FFFFFFF, 9);
        this.p = new blej();
        this.ac = new clht(Looper.getMainLooper());
        this.af = new btiz();
        this.ag = new btiz();
        this.A = new btiz();
        this.ah = new btiz();
        this.B = false;
        this.C = false;
        this.D = false;
        this.ai = false;
        this.aj = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.ak = false;
        this.I = false;
        this.J = false;
        this.K = null;
        this.N = new ArrayList();
        new bxf();
        this.V = 1;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
    }

    // Detected as a lambda impl.
    public final void A() {
        new btyc(this).executeOnExecutor(this.o, new Void[0]);
    }

    public final void B() {
        btys btys0 = new btys(this, this.o);
        this.o.execute(btys0);
    }

    final void C() {
        this.S.setVisibility(8);
        if(this.U == null) {
            this.U = ((ViewStub)this.findViewById(0x7F0B15D6)).inflate();  // id:gh_request_error_stub
        }
        this.U.setVisibility(0);
        btke.b(this.U, 0x7F1508E3, (/* MISSING LAMBDA PARAMETER */) -> new btyc(this).executeOnExecutor(this.o, new Void[0]));
        this.w();
        this.Q(false);
    }

    public final void D() {
        int v6;
        this.x = new btnq(this);
        if(btnt.a(htrs.c())) {
            azts azts0 = new azts(this, null);
            if(!this.W.v()) {
                new btyh(this, azts0).executeOnExecutor(this.n, new Void[0]);
            }
        }
        btjb btjb0 = GoogleHelpChimeraService.c(this.W);
        if(btjb0 == null || btjb0.c) {
            if(!this.ai() && !this.an()) {
                if(btnt.a(htph.a.b().a())) {
                    btwi.a(this.W.aj, this.o, this, this.W, this.x, this.X);
                }
                else {
                    btwi.a(null, this.o, this, this.W, this.x, this.X);
                }
            }
            if(!HelpChimeraActivity.ar() || !this.F) {
                btqx btqx0 = new btqx(this);
                btkk.a(this.o, btqx0, this.W, this.X);
            }
            GoogleHelpChimeraService.i(this.W, true);
        }
        if(btnt.a(htqu.c()) && !this.ai() && !this.an()) {
            new bthu(this, this.o).executeOnExecutor(this.o, new Void[0]);
        }
        btob.d(this, this.W, 0x7F16162D, 0x7F16162B, 0x7F16162C);  // style:gh_NoActionBarLightActivityStyleMaterial3
        HelpConfig helpConfig0 = this.W;
        if(helpConfig0.P) {
            btob.b(this, helpConfig0);
        }
        HelpConfig helpConfig1 = this.W;
        btti btti0 = this.X;
        ThemeSettings themeSettings0 = helpConfig1.z;
        int v = 0xC2;
        if(themeSettings0 != null) {
            int v1 = themeSettings0.a;
            if(v1 == 0 || v1 == 1) {
                v = 0xC1;
            }
            else if(v1 == 2) {
                v = 0xC0;
            }
        }
        btvm btvm0 = btvm.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvm0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((btvm)hftv0).i = 0xB6;
        ((btvm)hftv0).b |= 0x100;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((btvm)hftp0.b_message).j = v - 1;
        ((btvm)hftp0.b_message).b |= 0x400;
        bbnk bbnk0 = bbnk.a;
        bttu.J(this, helpConfig1, btti0, hftp0);
        btvm btvm1 = (btvm)hftp0.N_build();
        HelpConfig helpConfig2 = this.W;
        int v2 = 28;
        if(btnt.b(htnc.d())) {
            ThemeSettings themeSettings1 = helpConfig2.z;
            int v3 = 30;
            if(themeSettings1 != null) {
                int v4 = themeSettings1.a;
                if(v4 == 0 || v4 == 1) {
                    v3 = 29;
                }
                else if(v4 == 2) {
                    v3 = 28;
                }
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((btvk)hftv1).c = 53;
            ((btvk)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((btvk)hftp1.b_message).d = v3 - 1;
            ((btvk)hftp1.b_message).b |= 2;
            btvk btvk0 = (btvk)hftp1.N_build();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            btvl btvl0 = (btvl)hftp2.b_message;
            btvk0.getClass();
            btvl0.d = btvk0;
            btvl0.c = 3;
            bttg.J(this, helpConfig2, hftp2);
        }
        HelpConfig helpConfig3 = this.W;
        btti btti1 = this.X;
        int v5 = btke.e(this) ? 0xC0 : 0xC1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)btvm0).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp3.b_message;
        ((btvm)hftv2).i = 0xBC;
        ((btvm)hftv2).b |= 0x100;
        if(!hftv2.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((btvm)hftp3.b_message).j = v5 - 1;
        ((btvm)hftp3.b_message).b |= 0x400;
        bttu.J(this, helpConfig3, btti1, hftp3);
        btvm btvm2 = (btvm)hftp3.N_build();
        HelpConfig helpConfig4 = this.W;
        boolean z = btke.e(this);
        if(btnt.b(htnc.d())) {
            if(!z) {
                v2 = 29;
            }
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp4.b_message;
            ((btvk)hftv3).c = 57;
            ((btvk)hftv3).b |= 1;
            if(!hftv3.isImmutable()) {
                hftp4.ensureMutable();
            }
            ((btvk)hftp4.b_message).d = v2 - 1;
            ((btvk)hftp4.b_message).b |= 2;
            btvk btvk1 = (btvk)hftp4.N_build();
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            btvl btvl1 = (btvl)hftp5.b_message;
            btvk1.getClass();
            btvl1.d = btvk1;
            btvl1.c = 3;
            bttg.J(this, helpConfig4, hftp5);
        }
        if(btke.d(this)) {
            HelpConfig helpConfig5 = this.W;
            btti btti2 = this.X;
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)btvm0).v_newBuilder();
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp6.b_message;
            ((btvm)hftv4).i = 0xBC;
            ((btvm)hftv4).b |= 0x100;
            if(!hftv4.isImmutable()) {
                hftp6.ensureMutable();
            }
            ((btvm)hftp6.b_message).j = 0xD7;
            ((btvm)hftp6.b_message).b |= 0x400;
            bttu.J(this, helpConfig5, btti2, hftp6);
            btvm btvm3 = (btvm)hftp6.N_build();
            HelpConfig helpConfig6 = this.W;
            if(btnt.b(htnc.d())) {
                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp7.b_message;
                ((btvk)hftv5).c = 57;
                ((btvk)hftv5).b |= 1;
                if(!hftv5.isImmutable()) {
                    hftp7.ensureMutable();
                }
                ((btvk)hftp7.b_message).d = 91;
                ((btvk)hftp7.b_message).b |= 2;
                btvk btvk2 = (btvk)hftp7.N_build();
                ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                if(!hftp8.b_message.isImmutable()) {
                    hftp8.ensureMutable();
                }
                btvl btvl2 = (btvl)hftp8.b_message;
                btvk2.getClass();
                btvl2.d = btvk2;
                btvl2.c = 3;
                bttg.J(this, helpConfig6, hftp8);
            }
        }
        if(this.an()) {
            v6 = 0x7F0E047A;  // layout:gh_help_main_activity_boq_wiz
        }
        else {
            v6 = this.ai() ? 0x7F0E047C : 0x7F0E047B;  // layout:gh_help_main_activity_rapi_based
        }
        this.setContentView(v6);
        Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B1598);  // id:gh_help_toolbar
        Drawable drawable0 = btoa.b(toolbar0.f(), this, btob.a(this, 0x7F0405C1));  // attr:ghf_greyIconColor
        ((ggtj)HelpChimeraActivity.j.h()).x("Overflow icon size adjustments are not required for non-automotive device types.");
        toolbar0.y(drawable0);
        this.hG(toolbar0);
        btia.b(this, this.hL(), false);
        fm fm0 = this.getSupportFragmentManager();
        String s = HelpChimeraActivity.l;
        btoo btoo0 = (btoo)fm0.h(s);
        this.ad = btoo0;
        if(btoo0 == null) {
            ca ca0 = new ca(fm0);
            btoo btoo1 = new btoo();
            this.ad = btoo1;
            ca0.u(0x7F0B1597, btoo1, s);  // id:gh_help_section
            ca0.b();
        }
        if(!this.ai() && !this.an()) {
            this.t = new btot(this);
        }
        if(!HelpChimeraActivity.ar() || !this.F) {
            this.A();
        }
        if(this.an()) {
            this.z();
        }
        this.u = new btxg(this);
        this.y = new btxj(this, this.W.g());
        this.q = (AppBarLayout)this.findViewById(0x7F0B158A);  // id:gh_help_app_bar
        this.r = this.findViewById(0x7F0B1597);  // id:gh_help_section
        this.s = this.findViewById(0x7F0B158C);  // id:gh_help_content
        this.L = (OpenSearchView)this.findViewById(0x7F0B15AB);  // id:gh_open_search_view
        this.ad.c = this.s;
        htry htry0 = htry.a;
        if(btnt.a(htry0.b().c())) {
            MaterialToolbar materialToolbar0 = (MaterialToolbar)this.findViewById(0x7F0B1B55);  // id:open_search_view_toolbar
            if(materialToolbar0 != null) {
                materialToolbar0.t(0x7F150890);  // string:common_navigate_up "Navigate up"
            }
        }
        if(btnt.a(htry0.b().d())) {
            this.q.setTouchscreenBlocksFocus(false);
            ((Toolbar)this.findViewById(0x7F0B1598)).setTouchscreenBlocksFocus(false);  // id:gh_help_toolbar
            this.L.q();
        }
        if(this.ai() || this.an()) {
            this.S = (WebView)this.findViewById(0x7F0B159A);  // id:gh_home_screen_webview
            if(this.an()) {
                WebView webView0 = this.S;
                WebSettings webSettings0 = buas.f(this, webView0);
                webSettings0.setSupportZoom(false);
                webSettings0.setBuiltInZoomControls(false);
                webView0.setOnLongClickListener(new buan());
                if(btnt.a(htsn.a.b().a())) {
                    webView0.setVerticalScrollBarEnabled(false);
                }
                this.S.setBackgroundColor(btob.a(this, 0x7F040597));  // attr:gh_boqWizHomepageSurfaceColor
            }
            else {
                buas.h(this, this.S);
                this.S.setBackgroundColor(btob.a(this, 0x7F0405C2));  // attr:ghf_surfaceColor
            }
        }
        if(this.aj()) {
            WebView webView1 = (WebView)this.L.findViewById(0x7F0B15DC);  // id:gh_search_webview
            this.R = webView1;
            buas.h(this, webView1);
            this.R.setBackgroundColor(btob.a(this, 0x7F0405C2));  // attr:ghf_surfaceColor
        }
        kfv.a(this.getWindow(), false);
        this.q.setOnApplyWindowInsetsListener(new btqf());
        this.s.setOnApplyWindowInsetsListener(new btqg());
        this.L.setOnApplyWindowInsetsListener(new btqh());
        String s1 = htkd.a.o().F();
        if(s1.hashCode() != HelpChimeraActivity.ab) {
            HelpChimeraActivity.aa.clear();
            String[] arr_s = btoa.y(s1);
            Collections.addAll(HelpChimeraActivity.aa, arr_s);
            HelpChimeraActivity.ab = s1.hashCode();
        }
        this.al = HelpChimeraActivity.aa.contains(this.W.b) ^ 1;
        ArrayDeque arrayDeque0 = new ArrayDeque();
        this.an = arrayDeque0;
        arrayDeque0.push(hjfa.a);
        bthz.c(this.o, this, this, this.W);
        HelpConfig helpConfig7 = this.W;
        helpConfig7.aa = btik.b(this, helpConfig7);
        HelpConfig helpConfig8 = this.W;
        if(!this.ai() && !this.an()) {
            if(!btnt.b(htqo.c()) && !helpConfig8.E()) {
                ((ViewStub)this.findViewById(0x7F0B15F7)).inflate();  // id:gh_top_search_box_view_stub
            }
            else {
                ((ViewStub)this.findViewById(0x7F0B153D)).inflate();  // id:gh_below_recs_search_box_view_stub
                this.findViewById(0x7F0B153E).setVisibility(0);  // id:gh_below_search_box_divider
            }
        }
        this.L.r = true;
        this.L.h(true);
        this.L.g.x(new btqs(this));
        EditText editText0 = this.L.k;
        editText0.setOnEditorActionListener(new btqt(this, editText0));
        editText0.addTextChangedListener(new btqy(this, editText0));
        if(btnt.a(htse.c()) && Build.VERSION.SDK_INT >= 34) {
            editText0.setIsHandwritingDelegate(true);
        }
        if(!this.ai() && !this.an()) {
            MaterialCardView materialCardView0 = (MaterialCardView)this.findViewById(0x7F0B15D9);  // id:gh_search_box
            if(btke.d(this) || btnt.a(htqo.d())) {
                materialCardView0.f(0.0f);
            }
            materialCardView0.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                this.J();
                if(btnt.b(htnc.d())) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((btvk)hftp1.b_message).c = 4;
                    ((btvk)hftp1.b_message).b |= 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    btvl btvl0 = (btvl)hftp0.b_message;
                    btvk btvk0 = (btvk)hftp1.N_build();
                    btvk0.getClass();
                    btvl0.d = btvk0;
                    btvl0.c = 3;
                    bttg.J(this, this.ia(), hftp0);
                }
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((btvm)hftp2.b_message).i = 0x81;
                ((btvm)hftp2.b_message).b |= 0x100;
                bttu.E(this, hftp2, bbnk.a);
                btvm btvm0 = (btvm)hftp2.N_build();
            });
            if(btnt.a(htse.c()) && Build.VERSION.SDK_INT >= 34) {
                materialCardView0.setHandwritingDelegatorCallback(() -> {
                    this.J();
                    if(btnt.b(htnc.d())) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((btvk)hftp1.b_message).c = 4;
                        ((btvk)hftp1.b_message).b |= 1;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        btvl btvl0 = (btvl)hftp0.b_message;
                        btvk btvk0 = (btvk)hftp1.N_build();
                        btvk0.getClass();
                        btvl0.d = btvk0;
                        btvl0.c = 3;
                        bttg.J(this, this.ia(), hftp0);
                    }
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((btvm)hftp2.b_message).i = 0x81;
                    ((btvm)hftp2.b_message).b |= 0x100;
                    bttu.E(this, hftp2, bbnk.a);
                    btvm btvm0 = (btvm)hftp2.N_build();
                });
            }
            if(btnt.b(htnc.d())) {
                ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                ((btvk)hftp10.b_message).c = 3;
                ((btvk)hftp10.b_message).b |= 1;
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                btvl btvl3 = (btvl)hftp9.b_message;
                btvk btvk3 = (btvk)hftp10.N_build();
                btvk3.getClass();
                btvl3.d = btvk3;
                btvl3.c = 3;
                bttg.J(this, this.ia(), hftp9);
            }
            ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)btvm0).v_newBuilder();
            if(!hftp11.b_message.isImmutable()) {
                hftp11.ensureMutable();
            }
            ((btvm)hftp11.b_message).i = 0xA1;
            ((btvm)hftp11.b_message).b |= 0x100;
            bttu.E(this, hftp11, bbnk0);
            btvm btvm4 = (btvm)hftp11.N_build();
        }
    }

    public final void E() {
        String s1;
        this.ai = true;
        this.ag.b();
        if(!this.ai() && !this.an()) {
            this.t.a().b();
        }
        if(this.C && this.W.u()) {
            this.S();
        }
        else if(this.an() && this.C) {
            this.aw(new btqn(this));
        }
        if(this.aj() || this.ai()) {
            this.B();
        }
        if(this.ai()) {
            String s = this.W.k();
            if(!TextUtils.isEmpty(s)) {
                this.p.c();
                try {
                    s1 = (String)btyx.b(this).get();
                }
                catch(ExecutionException | InterruptedException exception0) {
                    a.ae(btyd.e.i(), "unable to get js fingerprint", exception0);
                    s1 = "";
                }
                String s2 = String.format(htlp.a.b().i(), htkd.z(), s);
                btjc btjc0 = new btjc();
                btjc0.g = s2;
                btjc0.u = s1;
                btjc0.z = 2;
                btjc0.q = false;
                btjc0.y = 0x1F;
                btjd btjd0 = btjc0.a();
                blej blej0 = new blej();
                blej0.c();
                new btyd(this, btjd0, btix.j(blej0), this.ah(), false, true, Calendar.getInstance(), false, true).executeOnExecutor(this.o, new Void[0]);
                return;
            }
            this.C();
        }
    }

    public final void F() {
        Integer integer0 = this.Q;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((btvm)hftp0.b_message).i = 54;
        ((btvm)hftp0.b_message).b |= 0x100;
        if(btnt.a(htti.c()) && integer0 != null) {
            int v = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((btvm)hftp0.b_message).c |= 0x2000;
            ((btvm)hftp0.b_message).K = v;
        }
        bttu.E(this, hftp0, bbnk.a);
        btvm btvm0 = (btvm)hftp0.N_build();
        if(btnt.a(htsh.c())) {
            bttg.l(this, this.Q);
        }
        else {
            bttg.l(this, null);
        }
        this.V();
    }

    public final void G(btjd btjd0, btix btix0, boolean z) {
        String s5;
        HelpChimeraActivity helpChimeraActivity0 = this;
        btjd btjd1 = btix0.a;
        if(btjd1 == null) {
            if(z) {
                if(!btix0.b()) {
                    if(btix0.f && btjd0 != null) {
                        String s = btjd0.g;
                        if(URLUtil.isValidUrl(s) && bbpr.c(helpChimeraActivity0)) {
                            helpChimeraActivity0.I(s);
                            goto label_25;
                        }
                        goto label_15;
                    }
                    else {
                    label_15:
                        if(helpChimeraActivity0.aj() && btix0.d()) {
                            helpChimeraActivity0.Y();
                            bttu.v(helpChimeraActivity0, 0xDA, 22);
                            bttg.z(helpChimeraActivity0, helpChimeraActivity0.W, 106, 3);
                            helpChimeraActivity0.at(helpChimeraActivity0.L.k.getText().toString().trim(), false);
                            return;
                        }
                        if(helpChimeraActivity0.ai() && btix0.c()) {
                            helpChimeraActivity0.C();
                        }
                        else {
                            Toast.makeText(helpChimeraActivity0, "Could not fetch help article from the server.", 0).show();
                        }
                    }
                }
                else if(!helpChimeraActivity0.ai() && !helpChimeraActivity0.an()) {
                    helpChimeraActivity0.t.c(btwf.m(btix0.h, helpChimeraActivity0));
                    helpChimeraActivity0.t.k();
                    helpChimeraActivity0.t.g();
                }
            }
        label_25:
            if(helpChimeraActivity0.W.F()) {
                helpChimeraActivity0.finish();
                return;
            }
            helpChimeraActivity0.s.setVisibility(0);
            helpChimeraActivity0.w();
            if(btix0.f && btjd0 != null) {
                if(btnt.b(htnc.d())) {
                    bttg.s(helpChimeraActivity0, 17, btjd0.g, btix0.c, btix0.b);
                }
                bttu.s(helpChimeraActivity0, 0x1F, btjd0.g, btix0.b, btix0.c, null);
            }
        }
        else {
            if(btjd1.N()) {
                String s1 = btjd1.g;
                String s2 = null;
                if(!TextUtils.isEmpty(s1)) {
                    String[] arr_s = s1.split("(\\?|&)id=");
                    if(arr_s.length >= 2) {
                        String[] arr_s1 = arr_s[1].split("&");
                        if(arr_s1.length > 0) {
                            s2 = arr_s1[0];
                        }
                    }
                }
                if(s2 == null) {
                    ((ggtj)HelpChimeraActivity.j.j()).B("Could not extract package name from url: %s", s1);
                    helpChimeraActivity0.I(s1);
                }
                else {
                    helpChimeraActivity0.ax(s2);
                }
            }
            else if(btjd1.H()) {
                helpChimeraActivity0.I(btjd1.g);
                if(btix0.b()) {
                    helpChimeraActivity0.finish();
                    return;
                }
            }
            else if(helpChimeraActivity0.aj() && btix0.d()) {
                htlp htlp0 = htlp.a;
                if(btnt.a(htlp0.b().t())) {
                    String s3 = this.q(btjd0, btix0);
                    String s4 = htlp0.b().j();
                    helpChimeraActivity0.R.addJavascriptInterface(new buaj(helpChimeraActivity0), htlp0.b().k());
                    s5 = s3 + s4;
                }
                else {
                    s5 = this.q(btjd0, btix0);
                }
                buas.m(helpChimeraActivity0, helpChimeraActivity0.R, btix0);
                buas.k(helpChimeraActivity0.R, btix0, btwt.a(helpChimeraActivity0.W), s5);
                helpChimeraActivity0.V = 2;
                helpChimeraActivity0.R.setVisibility(0);
                helpChimeraActivity0.L.findViewById(0x7F0B15DB).setVisibility(8);  // id:gh_search_results_list
                helpChimeraActivity0.L.findViewById(0x7F0B15AC).setVisibility(8);  // id:gh_open_search_view_progress_bar
                if(helpChimeraActivity0.W.H()) {
                    helpChimeraActivity0.L.k(true);
                }
                btvm btvm0 = HelpChimeraActivity.n(helpChimeraActivity0);
                long v = helpChimeraActivity0.p.a();
                bttu.u(helpChimeraActivity0, 10, v, hjfa.b(btvm0.q), btvm0.l, btvm0.m, btvm0.n);
                helpChimeraActivity0 = this;
                bttg.x(helpChimeraActivity0, 42, v, hjfa.b(btvm0.q), btvm0.l, btvm0.m, btvm0.n, (TextUtils.isEmpty(s5) ? 6 : 7), btix0.a.v().getBytes().length);
                bttu.v(helpChimeraActivity0, 0xDA, 21);
                bttg.z(helpChimeraActivity0, helpChimeraActivity0.W, 106, 2);
                btsv.a(bbdg.fp);
            }
            else if(helpChimeraActivity0.ai() && btix0.c()) {
                if(helpChimeraActivity0.W.y()) {
                    btyd.i(helpChimeraActivity0);
                }
                View view0 = helpChimeraActivity0.U;
                if(view0 != null) {
                    view0.setVisibility(8);
                }
                helpChimeraActivity0.q.s();
                helpChimeraActivity0.S.setOnScrollChangeListener(new btpy(helpChimeraActivity0));
                helpChimeraActivity0.S.setVisibility(0);
                helpChimeraActivity0.s.setVisibility(0);
                String s6 = this.q(btjd0, btix0);
                String s7 = htlp.a.b().g();
                helpChimeraActivity0.S.addJavascriptInterface(new buad(helpChimeraActivity0), htlp.g());
                buah buah0 = new buah(helpChimeraActivity0, btix0);
                helpChimeraActivity0.T = buah0;
                String s8 = s6 + s7;
                buah0.a = new btpz(helpChimeraActivity0, btix0, s8);
                helpChimeraActivity0.S.setWebViewClient(buah0);
                buas.k(helpChimeraActivity0.S, btix0, btwt.a(helpChimeraActivity0.W), s8);
                helpChimeraActivity0.Q(true);
            }
            else {
                helpChimeraActivity0.m().A();
                if(helpChimeraActivity0.L.o()) {
                    helpChimeraActivity0.L.k(false);
                }
                helpChimeraActivity0.x(hjfa.c);
                helpChimeraActivity0.m().B(btix0, false);
            }
            helpChimeraActivity0.s.setVisibility(0);
            if(helpChimeraActivity0.W != null) {
                helpChimeraActivity0.T();
                if(!helpChimeraActivity0.ai() && !helpChimeraActivity0.an()) {
                    View view1 = helpChimeraActivity0.findViewById(0x7F0B15D9);  // id:gh_search_box
                    if(!btnt.a(htoa.d()) || view1 != null) {
                        view1.setVisibility(8);
                    }
                }
            }
            if(!helpChimeraActivity0.ah()) {
                helpChimeraActivity0.w();
            }
        }
        helpChimeraActivity0.supportInvalidateOptionsMenu();
    }

    public final void H(String s, String s1) {
        this.O = s;
        this.P = s1;
        if(!HelpChimeraActivity.ar() && this.E) {
            this.runOnUiThread(new btqr(this));
            return;
        }
        this.aj = true;
        this.ah.b();
    }

    final void I(String s) {
        buas.l(this, Uri.parse(s), this.W, this.X);
    }

    public final void J() {
        this.L.k.setText("");
        this.L.m();
    }

    // Detected as a lambda impl.
    public final void K() {
        this.J();
        if(btnt.b(htnc.d())) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((btvk)hftp1.b_message).c = 4;
            ((btvk)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            btvl btvl0 = (btvl)hftp0.b_message;
            btvk btvk0 = (btvk)hftp1.N_build();
            btvk0.getClass();
            btvl0.d = btvk0;
            btvl0.c = 3;
            bttg.J(this, this.ia(), hftp0);
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((btvm)hftp2.b_message).i = 0x81;
        ((btvm)hftp2.b_message).b |= 0x100;
        bttu.E(this, hftp2, bbnk.a);
        btvm btvm0 = (btvm)hftp2.N_build();
    }

    public final void L(String s) {
        this.at(s, true);
    }

    public final void M(boolean z, boolean z1) {
        this.av(new btqa(this, z, z1));
    }

    // Detected as a lambda impl.
    public final void N(String s, btjb btjb0, boolean z, boolean z1) {
        boolean z3;
        boolean z2;
        if(z && (btjb0 == null || btjb0.d)) {
            this.g().executeOnExecutor(this.n, new Void[0]);
            z2 = false;
        }
        else {
            z2 = z;
        }
        if(z1 && (btjb0 == null || btjb0.e)) {
            this.W(true);
            this.r(new btqz(this, true));
            z3 = false;
        }
        else {
            z3 = z1;
        }
        if(!z2 && !z3) {
            if(!this.W.w) {
                GoogleHelpChimeraService.h(s);
                this.B = false;
            }
            return;
        }
        this.B = true;
        btqd btqd0 = new btqd(this, s, btjb0, z2, z3);
        btjb0.a();
        btjb0.f.addObserver(btqd0);
    }

    public final void O() {
        btvm btvm0 = HelpChimeraActivity.n(this);
        blej blej0 = new blej(this.W.ag);
        blej0.c();
        long v = blej0.a();
        bttu.u(this, (this.W.ah ? 4 : 5), v, hjfa.b(btvm0.q), btvm0.l, btvm0.m, btvm0.n);
        bttg.w(this, (this.W.ah ? 45 : 46), v, hjfa.b(btvm0.q), btvm0.l, btvm0.m, btvm0.n);
    }

    public final void P() {
        int v = this.W.l;
        if(v == 1) {
            this.aq(37, hjex.b);
            return;
        }
        if(v == 2) {
            this.aq(42, hjex.b);
        }
    }

    public final void Q(boolean z) {
        bttu.v(this, 0xD9, (z ? 21 : 22));
        bttg.z(this, this.W, 102, (z ? 2 : 3));
    }

    public final void R() {
        btvm btvm0 = HelpChimeraActivity.n(this);
        blej blej0 = new blej(this.W.ag);
        blej0.c();
        long v = blej0.a();
        bttu.u(this, (this.W.ah ? 2 : 3), v, hjfa.b(btvm0.q), btvm0.l, btvm0.m, btvm0.n);
        bttg.w(this, (this.W.ah ? 43 : 44), v, hjfa.b(btvm0.q), btvm0.l, btvm0.m, btvm0.n);
    }

    final void S() {
        HelpChimeraActivity helpChimeraActivity0;
        String s;
        boolean z = this.ah();
        HelpConfig helpConfig0 = this.W;
        if(!helpConfig0.u()) {
            s = null;
        }
        else if((helpConfig0.j.j == null ? hjft.a : helpConfig0.j.j).b.isEmpty()) {
            s = (helpConfig0.j.j == null ? hjft.a : helpConfig0.j.j).c;
        }
        else {
            hjft hjft0 = helpConfig0.j.j;
            String s1 = (hjft0 == null ? hjft.a : hjft0).c;
            if(hjft0 == null) {
                hjft0 = hjft.a;
            }
            s = s1 + "#" + hjft0.b;
        }
        if(s != null) {
            Optional optional0 = btjd.t(s, btjk.a(), helpConfig0);
            if(!optional0.isEmpty()) {
                Object object0 = optional0.get();
                if(helpConfig0.y() && TextUtils.equals(helpConfig0.ac, ((btjd)object0).g)) {
                    helpChimeraActivity0 = this;
                }
                else {
                    if(btnt.b(htnc.d())) {
                        bttg.s(this, 13, ((btjd)object0).g, "", -1);
                    }
                    helpChimeraActivity0 = this;
                    bttu.s(helpChimeraActivity0, 24, ((btjd)object0).g, -1, "", null);
                }
                new btyd(helpChimeraActivity0, ((btjd)object0), btix.g(24, 0, "", -1.0f, true, (helpConfig0.ah ? 6 : 7), (helpConfig0.ah ? 84 : 85), btyd.g(helpConfig0)), z, false, true, Calendar.getInstance()).executeOnExecutor(helpChimeraActivity0.o, new Void[0]);
            }
        }
    }

    public final void T() {
        View view0 = this.findViewById(0x7F0B1598);  // id:gh_help_toolbar
        if(!btnt.a(htoa.d()) || view0 != null) {
            fydg fydg0 = (fydg)view0.getLayoutParams();
            if(fydg0 != null) {
                fydg0.a = 0;
            }
        }
    }

    public final void U(String s) {
        new btyi(this.y, new btwx(s)).start();
    }

    public final void V() {
        Screenshot screenshot0;
        if(this.W.A != null && btoa.x(this.W.b, htkd.a.o().H())) {
            try {
                if(bbqa.d() && btnt.a(htsq.a.b().a())) {
                    Bundle bundle0 = cjoy.a().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                    this.W.A.send(bundle0);
                }
                else {
                    this.W.A.send();
                }
                bttu.d(this, true, this.Q);
                if(btnt.a(htsh.c())) {
                    bttg.d(this, true, this.Q);
                    return;
                }
                bttg.c(this, true);
                return;
            }
            catch(Exception exception0) {
                a.ae(HelpChimeraActivity.j.j(), "Could not launch custom Feedback, falling back to default case.", exception0);
                bttu.d(this, false, this.Q);
                if(btnt.a(htsh.c())) {
                    bttg.d(this, false, this.Q);
                }
                else {
                    bttg.c(this, false);
                }
            }
        }
        ErrorReport errorReport0 = this.W.y == null ? new ErrorReport() : this.W.y;
        if(TextUtils.isEmpty(errorReport0.a.packageName)) {
            String s = this.W.b;
            String s1 = this.getPackageManager().getInstallerPackageName(this.W.b);
            errorReport0.a.packageName = s;
            errorReport0.a.type = 11;
            errorReport0.a.installerPackageName = s1;
        }
        if(this.W.v()) {
            errorReport0.B = this.W.d.name;
        }
        Bundle bundle1 = this.W.m;
        if(bundle1 != null && bundle1.size() > 0) {
            errorReport0.D = this.W.m;
        }
        errorReport0.Y = this.W.z;
        if(TextUtils.isEmpty(errorReport0.T)) {
            HelpConfig helpConfig0 = this.W;
            byte[] arr_b = helpConfig0.o;
            if(arr_b == null) {
                screenshot0 = helpConfig0.n == null ? null : Screenshot.b(helpConfig0.n);
            }
            else {
                screenshot0 = Screenshot.d(arr_b, helpConfig0.p, helpConfig0.q);
            }
            if(screenshot0 != null) {
                Screenshot.e(errorReport0, screenshot0);
            }
        }
        if(btke.d(this)) {
            errorReport0.an = true;
        }
        errorReport0.ag = this.W.e;
        errorReport0.X = "GoogleHelp";
        errorReport0.ao = true;
        long v = this.W.E ? this.W.ag : -1L;
        azts azts0 = new azts(this, null);
        azzc azzc0 = new azzc();
        azzc0.a = new bkxu(errorReport0, v);
        azzc0.d = 6006;
        azts0.jn(azzc0.a());
    }

    public final void W(boolean z) {
        if(btnt.a(htqu.c())) {
            this.K = Boolean.valueOf(z);
        }
    }

    final void X(hjfa hjfa0, int v) {
        int v1 = v == 0 ? 1 : 0;
        int v2 = hjfa0.ordinal();
        switch(v2) {
            case 0: {
                if(!this.ai() && !this.an() && (!btnt.a(htlp.j()) || this.t != null)) {
                    this.t.c.setVisibility(v);
                    return;
                }
                break;
            }
            case 1: {
                if((this.L.o() ^ v1) != 0) {
                    this.L.k(((boolean)v1));
                    return;
                }
                break;
            }
            default: {
                if(v2 == 2) {
                    this.m().C(((boolean)v1));
                }
            }
        }
    }

    final void Y() {
        this.V = 1;
        this.R.setVisibility(8);
        this.v();
        this.L.findViewById(0x7F0B15DB).setVisibility(0);  // id:gh_search_results_list
        this.L.findViewById(0x7F0B15AC).setVisibility(8);  // id:gh_open_search_view_progress_bar
    }

    public final void Z() {
        hjex hjex0;
        Integer integer0 = null;
        if(this.W.F()) {
            if(this.r.getVisibility() != 0) {
                if(!btnt.a(htry.c())) {
                    if(btnt.b(htnc.d())) {
                        bttg.f(this, this.W);
                    }
                    bttu.f(this, this.W, this.X, null);
                }
                String s = this.W.ak;
                if(s != null) {
                    Uri uri0 = Uri.parse(s);
                    if(Objects.equals(uri0.getScheme(), "https") || Objects.equals(uri0.getScheme(), "http")) {
                        Optional optional0 = btjd.t(this.W.ak, btjk.a(), this.W);
                        if(btnt.a(htry.c())) {
                            if(btnt.b(htnc.d())) {
                                HelpConfig helpConfig0 = this.W;
                                Integer integer1 = optional0.isPresent() ? ((btjd)optional0.get()).z : null;
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp0.b_message;
                                ((btvk)hftv0).c = 9;
                                ((btvk)hftv0).b |= 1;
                                String s1 = helpConfig0.ak;
                                if(s1 != null) {
                                    if(!hftv0.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    btvk btvk0 = (btvk)hftp0.b_message;
                                    btvk0.b |= 0x20;
                                    btvk0.h = s1;
                                }
                                if(integer1 != null) {
                                    int v = (int)integer1;
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    btvk btvk1 = (btvk)hftp0.b_message;
                                    btvk1.b |= 0x1000;
                                    btvk1.n = v;
                                }
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                btvl btvl0 = (btvl)hftp1.b_message;
                                btvk btvk2 = (btvk)hftp0.N_build();
                                btvk2.getClass();
                                btvl0.d = btvk2;
                                btvl0.c = 3;
                                bttg.J(this, helpConfig0, hftp1);
                            }
                            HelpConfig helpConfig1 = this.W;
                            btti btti0 = this.X;
                            if(!btnt.a(htti.a.b().a()) || !optional0.isEmpty()) {
                                integer0 = ((btjd)optional0.get()).z;
                            }
                            bttu.f(this, helpConfig1, btti0, integer0);
                        }
                        if(optional0.isEmpty()) {
                            this.I(this.W.ak);
                            this.finish();
                            return;
                        }
                        if(TextUtils.isEmpty(this.W.k()) && TextUtils.isEmpty(((btjd)optional0.get()).w)) {
                            this.I(this.W.ak);
                            this.finish();
                            return;
                        }
                        if(TextUtils.isEmpty(this.W.k())) {
                            HelpConfig helpConfig2 = this.W;
                            helpConfig2.J = ((btjd)optional0.get()).w;
                        }
                        btyd.k(this, ((btjd)optional0.get()), 29, 0);
                        this.r.setVisibility(0);
                        return;
                    }
                }
                this.finish();
                if(btnt.a(htry.c())) {
                    if(btnt.b(htnc.d())) {
                        bttg.f(this, this.W);
                    }
                    bttu.f(this, this.W, this.X, null);
                }
            }
        }
        else if(this.W.H()) {
            if(!btnt.a(htnu.a.b().b())) {
                this.L.i(this.W.aj);
            }
            else if(this.r.getVisibility() != 0) {
                this.L.i(this.W.aj);
                this.U(this.W.aj);
            }
            if(!this.aj()) {
                if(!this.ai() && !this.an()) {
                    this.findViewById(0x7F0B15D9).setVisibility(8);  // id:gh_search_box
                }
                this.T();
                this.ab();
                return;
            }
            if(this.r.getVisibility() != 0) {
                this.av(new btqi(this));
            }
        }
        else if(this.W.I()) {
            this.av(new btql(this));
            HelpConfig helpConfig3 = this.W;
            btti btti1 = this.X;
            btvm btvm0 = btvm.a;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btvm0).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((btvm)hftp2.b_message).i = 0xB5;
            ((btvm)hftp2.b_message).b |= 0x100;
            String s2 = helpConfig3.m();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            btvm btvm1 = (btvm)hftp2.b_message;
            btvm1.b |= 0x2000;
            btvm1.m = s2;
            bttu.J(this, helpConfig3, btti1, hftp2);
            btvm btvm2 = (btvm)hftp2.N_build();
            HelpConfig helpConfig4 = this.W;
            if(btnt.b(htnc.d())) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((btvk)hftp3.b_message).c = 37;
                ((btvk)hftp3.b_message).b |= 1;
                String s3 = helpConfig4.m();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                btvk btvk3 = (btvk)hftp3.b_message;
                btvk3.b |= 0x20;
                btvk3.h = s3;
                btvk btvk4 = (btvk)hftp3.N_build();
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                btvl btvl1 = (btvl)hftp4.b_message;
                btvk4.getClass();
                btvl1.d = btvk4;
                btvl1.c = 3;
                bttg.J(this, helpConfig4, hftp4);
            }
            btsv.a(bbdg.fz);
            if(TextUtils.isEmpty(this.W.al)) {
                bttu.x(this, this.W, this.X, 206);
                bttg.D(this, this.W, 23);
                return;
            }
            if(!this.W.C()) {
                bttu.x(this, this.W, this.X, 0xCF);
                bttg.D(this, this.W, 24);
                return;
            }
            HelpConfig helpConfig5 = this.W;
            btti btti2 = this.X;
            int v1 = 4;
            switch(helpConfig5.am) {
                case 1: {
                    hjex0 = hjex.b;
                    break;
                }
                case 2: {
                    hjex0 = hjex.g;
                    break;
                }
                case 3: {
                    hjex0 = hjex.d;
                    break;
                }
                case 4: {
                    hjex0 = hjex.c;
                    break;
                }
                default: {
                    hjex0 = hjex.a;
                }
            }
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)btvm0).v_newBuilder();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ((btvm)hftp5.b_message).i = 0xBB;
            ((btvm)hftp5.b_message).b |= 0x100;
            String s4 = helpConfig5.m();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp5.b_message;
            ((btvm)hftv1).b |= 0x2000;
            ((btvm)hftv1).m = s4;
            if(!hftv1.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp5.b_message;
            ((btvm)hftv2).j = 0xCF;
            ((btvm)hftv2).b |= 0x400;
            if(hjex0 != hjex.a) {
                if(!hftv2.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ((btvm)hftp5.b_message).o = hjex0.l;
                ((btvm)hftp5.b_message).b |= 0x20000;
            }
            bttu.J(this, helpConfig5, btti2, hftp5);
            btvm btvm3 = (btvm)hftp5.N_build();
            HelpConfig helpConfig6 = this.W;
            switch(helpConfig6.am) {
                case 1: {
                    v1 = 2;
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    v1 = 5;
                    break;
                }
                case 4: {
                    v1 = 3;
                    break;
                }
                default: {
                    v1 = 1;
                }
            }
            if(btnt.b(htnc.d())) {
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp6.b_message;
                ((btvk)hftv3).c = 45;
                ((btvk)hftv3).b |= 1;
                if(!hftv3.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ((btvk)hftp6.b_message).d = 24;
                ((btvk)hftp6.b_message).b |= 2;
                String s5 = helpConfig6.m();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp6.b_message;
                ((btvk)hftv4).b |= 0x20;
                ((btvk)hftv4).h = s5;
                if(v1 != 1) {
                    if(!hftv4.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    ((btvk)hftp6.b_message).j = v1 - 1;
                    ((btvk)hftp6.b_message).b |= 0x100;
                }
                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                btvl btvl2 = (btvl)hftp7.b_message;
                btvk btvk5 = (btvk)hftp6.N_build();
                btvk5.getClass();
                btvl2.d = btvk5;
                btvl2.c = 3;
                bttg.J(this, helpConfig6, hftp7);
            }
        }
        else {
            HelpConfig helpConfig7 = this.W;
            if(btnt.b(htlj.k()) && helpConfig7.v() && this.W.G()) {
                this.av(new btqm(this));
                return;
            }
            if(this.ak()) {
                this.ab();
            }
            else {
                this.aa();
            }
            if(btnt.a(htrp.c()) && (this.W != null && this.W.d != null)) {
                ProtoLiteBuilder hftp8 = btyp.i(1);
                ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hgev.a).v_newBuilder();
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                hgev hgev0 = (hgev)hftp9.b_message;
                "Help".getClass();
                hgev0.b |= 1;
                hgev0.c = "Help";
                if(!hftp8.b_message.isImmutable()) {
                    hftp8.ensureMutable();
                }
                hges hges0 = (hges)hftp8.b_message;
                hgev hgev1 = (hgev)hftp9.N_build();
                hgev1.getClass();
                hges0.d = hgev1;
                hges0.c = 2;
                new btyp(((hges)hftp8.N_build()), this).executeOnExecutor(this.n, new Void[0]);
            }
        }
    }

    @Override  // btrg, btiw
    public final Context a() {
        return this;
    }

    public final void aa() {
        if(this.r.getVisibility() == 0) {
            return;
        }
        if(this.am()) {
            this.g().executeOnExecutor(this.n, new Void[0]);
        }
        this.W(false);
        if(this.al() && bbpr.c(this)) {
            this.r(new btqz(this, false));
        }
        else {
            this.ae(false);
        }
        this.r.setVisibility(0);
    }

    public final void ab() {
        boolean z = this.am();
        boolean z1 = this.al();
        if(z || z1) {
            this.M(z, z1);
        }
        if(this.r.getVisibility() == 0) {
            return;
        }
        if(!z1) {
            this.W(true);
            this.ae(true);
        }
        this.r.setVisibility(0);
    }

    public final void ac(btig btig0) {
        btoo btoo0 = this.ad;
        btoo0.d = -1L;
        btoo0.ag = false;
        btoo0.ai = false;
        Handler handler0 = btoo0.ak;
        handler0.removeCallbacks(btoo0.am);
        btoo0.aj = btig0;
        if(!btoo0.ah) {
            long v = htkd.a.o().z();
            handler0.postDelayed(btoo0.al, v);
            btoo0.ah = true;
        }
    }

    @Override  // buap
    public final void ad(Intent intent0, ValueCallback valueCallback0) {
        if(!btnt.a(htpe.c())) {
            return;
        }
        this.m = valueCallback0;
        this.startActivityForResult(intent0, 0x2032);
    }

    public final void ae(boolean z) {
        if(this.getMainLooper().getThread() != Thread.currentThread()) {
            btra btra0 = new btra(this, z);
            this.ac.post(btra0);
            return;
        }
        if(this.W.u() && this.ai) {
            this.S();
            if(btnt.a(htqi.c())) {
                this.ap();
            }
            return;
        }
        if(this.an() && this.ai) {
            this.aw(new btqc(this));
        }
        this.supportInvalidateOptionsMenu();
        if(this.D && !this.ai() && !this.an()) {
            this.t.k();
        }
        if(this.D && this.af() && !this.ai() && !this.an()) {
            this.w();
            if(this.W.z()) {
                if(z) {
                    this.R();
                }
                else {
                    this.O();
                }
            }
        }
        this.ap();
    }

    public final boolean af() {
        return btnt.a(htqu.c()) ? this.H : true;
    }

    public final boolean ag() {
        return this.W != null && this.W.G && !this.ai() && !this.an();
    }

    public final boolean ah() {
        return this.ad.ai;
    }

    public final boolean ai() {
        return btnt.b(htlp.n() && btnt.c(this.W.g(), htlp.m(), htlp.h(), htlp.i()));
    }

    public final boolean aj() {
        return htlp.n() && btnt.c(this.W.g(), true, htlp.e(), htlp.f());
    }

    public final boolean ak() {
        if(bbpr.c(this)) {
            HelpConfig helpConfig0 = this.W;
            if(helpConfig0.ab) {
                return this.ae == null || !this.ae.d ? helpConfig0.E() : true;
            }
            return true;
        }
        return false;
    }

    final boolean al() {
        return !this.W.H() && !this.C;
    }

    final boolean am() {
        return !this.D && !this.ai() && !this.an();
    }

    public final boolean an() {
        if(!btnt.b(htlp.n() && btnt.c(this.W.g(), htlp.l(), htlp.c(), htlp.d()))) {
            return false;
        }
        if(HelpChimeraActivity.ar()) {
            boolean z = this.F ^ 1;
            return btnt.a(htlp.j()) ? z && bbpr.c(this) : z;
        }
        return btnt.a(htlp.j()) ? bbpr.c(this) : true;
    }

    final boolean ao(String s) {
        return btim.f(this, this.W, s);
    }

    public final void ap() {
        this.C = true;
        if(btnt.a(htqi.c())) {
            this.A.b();
        }
    }

    public final void aq(int v, hjex hjex0) {
        bttu.q(this, v, hjex0, -1);
    }

    public static final boolean ar() {
        return btnt.a(htlp.a.b().r());
    }

    private final void as(String s) {
        ((ggtj)HelpChimeraActivity.j.i()).B("%s", s);
        this.setResult(0);
        this.finish();
    }

    private final void at(String s, boolean z) {
        String s1;
        this.t(true);
        btxe btxe0 = this.M;
        if(btxe0 != null) {
            btxe0.f();
        }
        if(this.aj() && z && !TextUtils.isEmpty(this.W.k())) {
            this.p.c();
            if(this.W != null && !TextUtils.isEmpty(this.W.k())) {
                try {
                    s1 = (String)btyx.b(this).get();
                }
                catch(ExecutionException | InterruptedException exception0) {
                    a.ae(btyd.e.i(), "unable to get js fingerprint", exception0);
                    s1 = "";
                }
                String s2 = String.format(htkd.y(), htkd.z(), this.W.k(), Uri.encode(s));
                btjc btjc0 = new btjc();
                btjc0.g = s2;
                btjc0.u = s1;
                btjc0.z = 2;
                btjc0.q = false;
                btjd btjd0 = btjc0.a();
                blej blej0 = new blej();
                blej0.c();
                new btyd(this, btjd0, btix.h(1, -1, "", -1.0f, 1, 1, blej0, 3), this.ah(), false, true, Calendar.getInstance(), true, false).executeOnExecutor(this.o, new Void[0]);
            }
        }
        else {
            new btwb(this, new btrc(this), s).executeOnExecutor(this.o, new Void[0]);
        }
        if(btnt.a(htrp.a.b().b())) {
            bttu.v(this, 0x83, 1);
            bttg.z(this, this.W, 84, 1);
        }
        btsv.a(bbdg.fo);
        if(btnt.a(htrp.c()) && (this.W != null && this.W.d != null)) {
            ProtoLiteBuilder hftp0 = btyp.i(11);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgew.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgew hgew0 = (hgew)hftp1.b_message;
            s.getClass();
            hgew0.b |= 1;
            hgew0.c = s;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hges hges0 = (hges)hftp0.b_message;
            hgew hgew1 = (hgew)hftp1.N_build();
            hgew1.getClass();
            hges0.d = hgew1;
            hges0.c = 3;
            new btyp(((hges)hftp0.N_build()), this).executeOnExecutor(this.n, new Void[0]);
        }
    }

    private final void au() {
        this.ak = true;
        Intent intent0 = this.getIntent();
        if(intent0.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent0.removeExtra("EXTRA_GOOGLE_HELP");
        }
        this.W.O(null);
        intent0.putExtra("EXTRA_HELP_CONFIG", this.W);
        intent0.putExtra("EXTRA_START_TICK", System.nanoTime());
        intent0.addFlags(0x4000000);
        this.startActivity(intent0);
    }

    private final void av(Runnable runnable0) {
        if(this.ai) {
            runnable0.run();
            return;
        }
        btqb btqb0 = new btqb(runnable0);
        this.ag.addObserver(btqb0);
    }

    private final void aw(Runnable runnable0) {
        if(this.aj) {
            runnable0.run();
            return;
        }
        btqk btqk0 = new btqk(runnable0);
        this.ah.addObserver(btqk0);
    }

    private final void ax(String s) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(Uri.parse((htkd.w() + s)));
            intent0.addFlags(0x10000000);
            intent0.addFlags(0x8000);
            this.startActivity(intent0);
        }
        catch(ActivityNotFoundException unused_ex) {
            Intent intent1 = new Intent("android.intent.action.VIEW");
            intent1.setData(Uri.parse((htkd.a.o().W() + s)));
            try {
                this.startActivity(intent1);
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                a.ae(HelpChimeraActivity.j.j(), "Can\'t view GmsCore in Play Store", activityNotFoundException0);
            }
        }
    }

    private final boolean ay() {
        return btnt.c(this.W.b, htmq.a.b().c(), htmq.a.b().b(), htmq.a.b().a());
    }

    @Override  // bthx
    public final void b(bthz bthz0) {
        if(this.af == null) {
            return;
        }
        this.z = bthz0;
        btka btka0 = new btka(this, this.z);
        this.ae = btka0;
        bthz bthz1 = btka0.c;
        String s = bthz1.j("ongoing_session_context", null);
        HelpConfig helpConfig0 = btka0.b;
        btka0.d = TextUtils.equals(helpConfig0.c, s) ^ 1;
        if(btka.c(helpConfig0, bthz1)) {
            btka.a(helpConfig0, bthz1);
            HelpChimeraActivity helpChimeraActivity0 = btka0.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((btvm)hftp0.b_message).i = 0x30;
            ((btvm)hftp0.b_message).b |= 0x100;
            bttu.E(helpChimeraActivity0, hftp0, bbnk.a);
            btvm btvm0 = (btvm)hftp0.N_build();
            if(btnt.a(htnc.d())) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((btvk)hftp1.b_message).c = 35;
                ((btvk)hftp1.b_message).b |= 1;
                btvk btvk0 = (btvk)hftp1.N_build();
                HelpConfig helpConfig1 = helpChimeraActivity0.ia();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                btvl btvl0 = (btvl)hftp2.b_message;
                btvk0.getClass();
                btvl0.d = btvk0;
                btvl0.c = 3;
                bttg.J(helpChimeraActivity0, helpConfig1, hftp2);
            }
        }
        btka0.b();
        this.af.b();
        this.af = null;
    }

    @Override  // btkb
    public final void c(btig btig0) {
        synchronized(this.N) {
            this.N.remove(btig0);
        }
    }

    @Override  // btiw
    public final btjz d() {
        return this.y;
    }

    @Override  // btiw
    public final btnq e() {
        return this.x;
    }

    @Override  // btkb
    public final void f(btig btig0) {
        synchronized(this.N) {
            this.N.add(btig0);
        }
    }

    public final AsyncTask g() {
        return new btwe(this, this.W.c, this.t);
    }

    public final btix l() {
        return this.m().z();
    }

    public final btoz m() {
        if(HelpChimeraActivity.ar() && this.G) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            btoz btoz0 = new btoz();
            this.v = btoz0;
            ca0.z(0x7F0B158C, btoz0, HelpChimeraActivity.k);  // id:gh_help_content
            ca0.b();
            this.getSupportFragmentManager().aq();
            this.G = false;
            return this.v;
        }
        if(this.v == null) {
            String s = HelpChimeraActivity.k;
            btoz btoz1 = (btoz)this.getSupportFragmentManager().h(s);
            if(btoz1 != null) {
                this.v = btoz1;
                return this.v;
            }
            ca ca1 = new ca(this.getSupportFragmentManager());
            btoz btoz2 = new btoz();
            this.v = btoz2;
            ca1.z(0x7F0B158C, btoz2, s);  // id:gh_help_content
            ca1.b();
            this.getSupportFragmentManager().aq();
        }
        return this.v;
    }

    public static btvm n(HelpChimeraActivity helpChimeraActivity0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
        int v = helpChimeraActivity0.o().e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((btvm)hftv0).b |= 0x200000;
        ((btvm)hftv0).q = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        btvm btvm0 = (btvm)hftp0.b_message;
        btvm0.b |= 0x4000;
        btvm0.n = -1;
        if(btvm0.q == 2 && helpChimeraActivity0.l() != null) {
            btix btix0 = helpChimeraActivity0.l();
            int v1 = btix0.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((btvm)hftv1).b |= 0x4000;
            ((btvm)hftv1).n = v1;
            String s = btix0.c;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            s.getClass();
            ((btvm)hftv2).b |= 0x1000;
            ((btvm)hftv2).l = s;
            btjd btjd0 = btix0.a;
            if(btjd0 != null) {
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                btvm btvm1 = (btvm)hftp0.b_message;
                btjd0.g.getClass();
                btvm1.b |= 0x2000;
                btvm1.m = btjd0.g;
            }
            return (btvm)hftp0.N_build();
        }
        return (btvm)hftp0.N_build();
    }

    public final hjfa o() {
        return (hjfa)this.an.peek();
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        if(btnt.a(htpe.c()) && v == 0x2032) {
            ValueCallback valueCallback0 = this.m;
            if(valueCallback0 != null) {
                if(v1 == -1) {
                    Uri[] arr_uri = WebChromeClient.FileChooserParams.parseResult(-1, intent0);
                    if(btnt.a(htsz.c())) {
                        if(arr_uri != null) {
                            int v2 = 0;
                            while(v2 < arr_uri.length) {
                                Uri uri0 = arr_uri[v2];
                                if(!TextUtils.isEmpty(uri0.getAuthority()) && uri0.getAuthority().contains("@")) {
                                    goto label_14;
                                }
                                ++v2;
                            }
                            goto label_15;
                        }
                    label_14:
                        arr_uri = null;
                    }
                label_15:
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
        btoz btoz0;
        HelpChimeraActivity helpChimeraActivity0;
        btoo btoo0 = this.ad;
        if(btoo0.aj != null && !(btoo0.aj instanceof btyc) && !btoo0.aj.b) {
            btoo0.ah = false;
            btoo0.ai = true;
            btoo0.ak.removeCallbacks(btoo0.al);
            btoo0.aj.f();
            btoo0.aj = null;
            btoo0.c.setVisibility(0);
            btoo0.b.setVisibility(8);
            helpChimeraActivity0 = this;
            goto label_72;
        }
        hjfa hjfa0 = this.o();
        switch(hjfa0.ordinal()) {
            case 0: {
                helpChimeraActivity0 = this;
                if(!helpChimeraActivity0.L.o() || helpChimeraActivity0.aj() && helpChimeraActivity0.W.H()) {
                    helpChimeraActivity0.Z = 18;
                    helpChimeraActivity0.Y = 25;
                    helpChimeraActivity0.super.onBackPressed();
                    return;
                }
                if(helpChimeraActivity0.aj() && helpChimeraActivity0.V == 2) {
                    helpChimeraActivity0.Y();
                }
                helpChimeraActivity0.L.e();
                goto label_72;
            }
            case 1: {
                if(!this.W.H()) {
                    goto label_65;
                }
                goto label_82;
            }
            case 2: {
                if(btnt.a(htry.a.b().b())) {
                    btke.a(this.s, 0x7F1513CD);  // string:gh_back_pressed "Back pressed"
                }
                btoz0 = this.m();
                if(btoz0.b.size() > 1) {
                    btiw btiw0 = btoz0.d;
                    if((btiw0 instanceof HelpChimeraActivity)) {
                        btvm btvm0 = HelpChimeraActivity.n(((HelpChimeraActivity)btiw0));
                        Integer integer0 = ((HelpChimeraActivity)btoz0.d).p();
                        bttu.c(btoz0.d, hjfa.c, btvm0.n, btvm0.l, btvm0.m, integer0);
                        bttg.b(btoz0.d, hjfa.c, btvm0.n, btvm0.l, btvm0.m, integer0);
                    }
                    if(btoz0.D()) {
                        btoz0.c = (btix)btoz0.b.pop();
                    }
                    else {
                        btoz0.b.pop();
                    }
                    btoz0.B(((btix)btoz0.b.peek()), true);
                    goto label_47;
                }
                AppBarLayout appBarLayout0 = btoz0.ah;
                if(appBarLayout0 != null) {
                    appBarLayout0.e = false;
                }
                break;
            }
            default: {
                goto label_65;
            }
        }
        btjd btjd0 = ((btix)btoz0.b.peek()).a;
        if(btjd0 == null) {
            throw new IllegalStateException("Cannot call goBack when there is no leafContent.");
        }
        if((btjd0.H() || btjd0.N()) && (btoz0.a != null && btoz0.a.canGoBack())) {
            WebBackForwardList webBackForwardList0 = btoz0.a.copyBackForwardList();
            int v = webBackForwardList0.getCurrentIndex() - 1;
            if(v >= 0 && !"about:blank".equals(webBackForwardList0.getItemAtIndex(v).getUrl())) {
                btoz0.a.goBack();
            label_47:
                if(this.m().E()) {
                    this.supportInvalidateOptionsMenu();
                }
                helpChimeraActivity0 = this;
                goto label_72;
            }
        }
        if(!((btix)btoz0.b.peek()).b()) {
            btoz0.A();
        }
        if(btoz0.D()) {
            btoz0.c = (btix)btoz0.b.pop();
            btoz0.a.clearHistory();
        }
        btoz btoz1 = this.m();
        if(btoz1.D()) {
            btix btix0 = btoz1.z();
            if(btix0 == null || !btix0.b()) {
                goto label_62;
            }
        }
        else if(btoz1.b.isEmpty() || !((btix)btoz1.b.peek()).b()) {
        label_62:
            if(!this.W.F() && (this.aj() || (htno.c() || !this.W.H()) && (!htno.c() || !this.W.H() || !this.aj())) && (!this.m().F() || !this.W.I())) {
                if(this.aj() && this.V == 2) {
                    this.L.k(true);
                }
            label_65:
                btvm btvm1 = HelpChimeraActivity.n(this);
                helpChimeraActivity0 = this;
                bttu.c(helpChimeraActivity0, hjfa0, btvm1.n, btvm1.l, btvm1.m, this.p());
                bttg.b(helpChimeraActivity0, hjfa0, btvm1.n, btvm1.l, btvm1.m, helpChimeraActivity0.p());
                helpChimeraActivity0.X(((hjfa)helpChimeraActivity0.an.pop()), 8);
                helpChimeraActivity0.X(((hjfa)helpChimeraActivity0.an.peek()), 0);
                helpChimeraActivity0.supportInvalidateOptionsMenu();
            label_72:
                if(helpChimeraActivity0.o() == hjfa.a) {
                    if(!helpChimeraActivity0.ai() && !helpChimeraActivity0.an()) {
                        if(btnt.a(htlp.j())) {
                            View view0 = helpChimeraActivity0.findViewById(0x7F0B15D9);  // id:gh_search_box
                            if(view0 != null) {
                                view0.setVisibility(0);
                            }
                        }
                        else {
                            helpChimeraActivity0.findViewById(0x7F0B15D9).setVisibility(0);  // id:gh_search_box
                        }
                    }
                    helpChimeraActivity0.supportInvalidateOptionsMenu();
                }
                return;
            }
        }
    label_82:
        helpChimeraActivity0 = this;
        helpChimeraActivity0.Z = 18;
        helpChimeraActivity0.Y = 25;
        helpChimeraActivity0.super.onBackPressed();
    }

    @Override  // xni
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        if(this.W.P && fyhn.c() && !btke.d(this)) {
            btob.b(this, this.W);
        }
    }

    @Override  // btrg
    protected final void onCreate(Bundle bundle0) {
        this.Q = btnt.a(htsh.c()) ? btoa.g() : null;
        super.onCreate(bundle0);
        if("android.intent.action.SEARCH".equals(this.getIntent().getAction())) {
            this.as("GoogleHelp: unsupported: activity started with search intent.");
            return;
        }
        String s = bbmq.p(this);
        if(!TextUtils.isEmpty(s)) {
            try {
                bbmq.A(this);
            }
            catch(SecurityException securityException0) {
                this.as("SecurityException " + securityException0.getMessage() + " in calling package: " + s);
                return;
            }
        }
        if(this.W == null) {
            ((ggtj)HelpChimeraActivity.j.i()).x("No HelpConfig provided!");
            this.setResult(0);
            this.finish();
            return;
        }
        if(btnt.a(htra.c())) {
            btjk.d(this.W.Q);
        }
        if(this.ag()) {
            btim.d(this, this.W);
        }
        this.D();
        btpk.b(this);
        btns.a(this.n, this);
        new btrd(this, this).start();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        MenuInflater menuInflater0 = this.getMenuInflater();
        ThemeSettings themeSettings0 = this.W.z;
        int v = 1;
        menuInflater0.inflate((themeSettings0.b == 0 || themeSettings0.a == 1 ? 0x7F100017 : 0x7F100018), menu0);  // menu:gh_main_menu_dark
        if(btnt.a(htqc.c())) {
            btoa.r(menu0.findItem(0x7F0B15A1), this, btob.a(this, 0x7F0405C1));  // id:gh_menu_close_article
            menu0.findItem(0x7F0B15A1).setTitle(this.getString(0x7F151405, new Object[]{this.W.ai}));  // id:gh_menu_close_article
        }
        if(btnt.a(htqf.a.b().a())) {
            menu0.findItem(0x7F0B15A4).setShowAsAction(0);  // id:gh_menu_share_article
        }
        else if(this.ay()) {
            btoa.r(menu0.findItem(0x7F0B15A4), this, btob.a(this, 0x7F0405C1));  // id:gh_menu_share_article
        }
        this.am = new SparseArray(this.W.t.size());
        for(Object object0: this.W.t) {
            menu0.add(0, v, 0, ((OverflowMenuItem)object0).b);
            this.am.put(v, ((OverflowMenuItem)object0));
            ++v;
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // btrg
    protected final void onDestroy() {
        boolean z = false;
        this.t(false);
        if(btnt.a(htqx.d())) {
            bths bths0 = this.w;
            if(bths0 != null) {
                bthw bthw0 = bths0.d;
                if(bthw0 != null) {
                    bthw0.a();
                }
            }
        }
        HelpConfig helpConfig0 = this.W;
        if(helpConfig0 != null) {
            ErrorReport errorReport0 = helpConfig0.y;
            if(errorReport0 != null) {
                if(errorReport0.V != null && errorReport0.V.length > 0) {
                    z = true;
                }
                if(z || !TextUtils.isEmpty(errorReport0.T)) {
                    new btrb(errorReport0, this, z).start();
                }
            }
            int v = this.Y;
            if(v != 1) {
                btvm btvm0 = HelpChimeraActivity.n(this);
                hjfa hjfa0 = hjfa.b(btvm0.q);
                int v1 = btvm0.n;
                String s = btvm0.l;
                String s1 = btvm0.m;
                Integer integer0 = this.p();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((btvm)hftv0).i = 1;
                ((btvm)hftv0).b |= 0x100;
                if(v != 0) {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((btvm)hftp0.b_message).j = v - 1;
                    ((btvm)hftp0.b_message).b |= 0x400;
                }
                bttu.F(this, hftp0, bbnk.a, hjfa0, v1, s, s1, integer0);
                btvm btvm1 = (btvm)hftp0.N_build();
                int v2 = this.Z;
                btvm btvm2 = HelpChimeraActivity.n(this);
                int v3 = btvm2.n;
                hjfa hjfa1 = hjfa.b(btvm2.q);
                String s2 = btvm2.l;
                String s3 = btvm2.m;
                Integer integer1 = this.p();
                if(btnt.a(htnc.d())) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    ((btvk)hftv1).c = 33;
                    ((btvk)hftv1).b |= 1;
                    if(v2 != 0) {
                        if(!hftv1.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((btvk)hftp1.b_message).d = v2 - 1;
                        ((btvk)hftp1.b_message).b |= 2;
                    }
                    if(btnt.a(htsh.c()) && integer1 != null) {
                        int v4 = (int)integer1;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        btvk btvk0 = (btvk)hftp1.b_message;
                        btvk0.b |= 0x1000;
                        btvk0.n = v4;
                    }
                    bttg.K(this, hftp1, hjfa1, v3, s2, s3, null);
                }
            }
            if(!this.ak) {
                GoogleHelpChimeraService.h(GoogleHelpChimeraService.f(this.W));
            }
        }
        btnq btnq0 = this.x;
        if(btnq0 != null) {
            btnq0.close();
        }
        btjz btjz0 = this.y;
        if(btjz0 != null) {
            btjz0.close();
        }
        super.onDestroy();
    }

    @Override  // btrg
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        int v = menuItem0.getItemId();
        Activity activity0 = null;
        if(v == 0x7F0B15A4) {  // id:gh_menu_share_article
            btix btix0 = this.l();
            if(btix0 == null) {
                ((ggtj)HelpChimeraActivity.j.i()).x("Can\'t share Help article. Help element is null.");
                return super.onOptionsItemSelected(menuItem0);
            }
            btjd btjd0 = btix0.a;
            if(btjd0 == null) {
                ((ggtj)HelpChimeraActivity.j.i()).x("Can\'t share Help article. Leaf content is null.");
                return super.onOptionsItemSelected(menuItem0);
            }
            Context context0 = this.getContainerActivity();
            kay.i(context0);
            Intent intent0 = new Intent().setAction("android.intent.action.SEND");
            intent0.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", "com.google.android.gms");
            intent0.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", "com.google.android.gms");
            intent0.addFlags(0x80000);
            while((context0 instanceof ContextWrapper)) {
                if((context0 instanceof Activity)) {
                    activity0 = (Activity)context0;
                    break;
                }
                context0 = ((ContextWrapper)context0).getBaseContext();
            }
            if(activity0 != null) {
                ComponentName componentName0 = activity0.getComponentName();
                intent0.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName0);
                intent0.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName0);
            }
            jwa.c(intent0);
            String s = btjd0.g;
            jwa.b(s, intent0);
            jwa.a(btjd0.f, intent0);
            jwa.d(intent0);
            if(!bbmq.ae(this, intent0)) {
                return super.onOptionsItemSelected(menuItem0);
            }
            this.startActivity(Intent.createChooser(intent0, "Share article"));
            Integer integer0 = btjd0.z;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((btvm)hftv0).i = 0xA8;
            ((btvm)hftv0).b |= 0x100;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            btvm btvm0 = (btvm)hftp0.b_message;
            s.getClass();
            btvm0.b |= 0x2000;
            btvm0.m = s;
            if(btnt.a(htti.c()) && integer0 != null) {
                int v1 = (int)integer0;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((btvm)hftp0.b_message).c |= 0x2000;
                ((btvm)hftp0.b_message).K = v1;
            }
            bttu.E(this, hftp0, bbnk.a);
            btvm btvm1 = (btvm)hftp0.N_build();
            Integer integer1 = btjd0.z;
            if(!btnt.b(htnc.d())) {
                return super.onOptionsItemSelected(menuItem0);
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((btvk)hftv1).c = 50;
            ((btvk)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            btvk btvk0 = (btvk)hftp1.b_message;
            s.getClass();
            btvk0.b |= 0x20;
            btvk0.h = s;
            if(integer1 != null) {
                int v2 = (int)integer1;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                btvk btvk1 = (btvk)hftp1.b_message;
                btvk1.b |= 0x1000;
                btvk1.n = v2;
            }
            HelpConfig helpConfig0 = this.ia();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            btvl btvl0 = (btvl)hftp2.b_message;
            btvk btvk2 = (btvk)hftp1.N_build();
            btvk2.getClass();
            btvl0.d = btvk2;
            btvl0.c = 3;
            bttg.J(this, helpConfig0, hftp2);
            return super.onOptionsItemSelected(menuItem0);
        }
        switch(v) {
            case 0x7F0B15A0: {  // id:gh_menu_clear_history
                btka btka0 = this.ae;
                if(btka0 != null) {
                    btka0.b();
                    this.ae = null;
                }
                new btya(this).start();
                bthz bthz0 = this.z;
                btij btij0 = new btil(this, this.W).g();
                btij0.f("name");
                btij0.f("display_country");
                btij0.f("phone_number");
                btij0.f("locale");
                btij0.a();
                if(bthz0 != null) {
                    bthz0.k("escalation_options");
                }
                if(!this.ai() && !this.an()) {
                    btot btot0 = this.t;
                    PopularArticlesContainer popularArticlesContainer0 = btot0.a();
                    List list0 = popularArticlesContainer0.b;
                    if(list0 != null) {
                        for(Object object0: list0) {
                            ((btjd)object0).A();
                        }
                    }
                    btjd btjd1 = popularArticlesContainer0.c;
                    if(btjd1 != null) {
                        btjd1.s = false;
                        btjd1.t = false;
                        btjd1.n = "";
                    }
                    btpg.b(btot0.a, btot0.b);
                }
                btxl btxl0 = this.u.d;
                if(btxl0.a != null) {
                    for(int v3 = 0; v3 < btxl0.a.size(); ++v3) {
                        ((btjd)btxl0.a.get(v3)).A();
                    }
                }
                if(btwq.c(this.W)) {
                    new btiv().b();
                }
                Toast.makeText(this, "Help history cleared", 1).show();
                return true;
            }
            case 0x7F0B15A1: {  // id:gh_menu_close_article
                this.Z = 10;
                this.Y = 24;
                this.finish();
                return true;
            }
            case 0x7F0B15A2: {  // id:gh_menu_feedback
                this.V();
                return true;
            }
            case 0x7F0B15A3: {  // id:gh_menu_play_store
                this.ax(this.W.b);
                return true;
            }
            case 0x7F0B15A5: {  // id:gh_menu_version_info
                btrh btrh0 = new btrh();
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.v(btrh0, "version_dialog");
                ca0.b();
                return true;
            }
            default: {
                if(btnt.a(htqc.c()) && v == 0x102002C) {
                    if(this.o() != hjfa.c) {
                        v = 0x102002C;
                        goto label_94;
                    }
                    this.onBackPressed();
                    return true;
                }
            label_94:
                OverflowMenuItem overflowMenuItem0 = (OverflowMenuItem)this.am.get(v);
                if(overflowMenuItem0 != null) {
                    HelpConfig helpConfig1 = this.W;
                    Intent intent1 = overflowMenuItem0.c;
                    if(bbmq.ae(this, intent1)) {
                        this.startActivity(intent1);
                        return super.onOptionsItemSelected(menuItem0);
                    }
                    if(intent1.getAction().equals("android.intent.action.VIEW")) {
                        Uri uri0 = intent1.getData();
                        if(uri0 != null && "https".equals(uri0.getScheme())) {
                            buas.q(this, new Intent(intent1), helpConfig1);
                        }
                    }
                }
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // xoi
    public final void onPause() {
        super.onPause();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onPrepareOptionsMenu(Menu menu0) {
        boolean z3;
        Activity activity0;
        super.onPrepareOptionsMenu(menu0);
        int v = this.r.getVisibility();
        hjfa hjfa0 = (hjfa)this.an.peek();
        boolean z = false;
        boolean z1 = v == 0 && (hjfa0 == hjfa.b || hjfa0 == hjfa.c);
        boolean z2 = v == 0 && (this.W.l == 3 || this.W.A(hjex.g) || this.W.J(this) || this.W.B(hjex.d) && ((this.W.j.c == null ? hjfq.a : this.W.j.c).b & 4) != 0);
        if(btnt.a(htqc.c())) {
            menu0.findItem(0x7F0B15A1).setVisible(btnt.a(htqc.c()) && this.o() == hjfa.c);  // id:gh_menu_close_article
        }
        if(this.ay()) {
            MenuItem menuItem0 = menu0.findItem(0x7F0B15A4);  // id:gh_menu_share_article
            Context context0 = this.getContainerActivity();
            kay.i(context0);
            Intent intent0 = new Intent().setAction("android.intent.action.SEND");
            intent0.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", "com.google.android.gms");
            intent0.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", "com.google.android.gms");
            intent0.addFlags(0x80000);
            while(true) {
                activity0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if((context0 instanceof Activity)) {
                    activity0 = (Activity)context0;
                    break;
                }
                context0 = ((ContextWrapper)context0).getBaseContext();
            }
            if(activity0 != null) {
                ComponentName componentName0 = activity0.getComponentName();
                intent0.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName0);
                intent0.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName0);
            }
            jwa.c(intent0);
            jwa.b("", intent0);
            jwa.a("", intent0);
            jwa.d(intent0);
            btoz btoz0 = this.m();
            if(this.o() != hjfa.c || btoz0.E() || btoz0.F()) {
                z3 = false;
            }
            else if(btoz0.D()) {
                btix btix0 = btoz0.z();
                if(btix0 != null && btix0.a()) {
                    z3 = false;
                }
                else {
                    goto label_40;
                }
            }
            else if(btoz0.b.isEmpty() || !((btix)btoz0.b.peek()).a()) {
            label_40:
                z3 = bbmq.ae(this, intent0);
            }
            else {
                z3 = false;
            }
            menuItem0.setVisible(z3);
        }
        boolean z4 = this.W.K();
        menu0.findItem(0x7F0B15A2).setVisible(!z4 && z1 && !z2);  // id:gh_menu_feedback
        MenuItem menuItem1 = menu0.findItem(0x7F0B15A3);  // id:gh_menu_play_store
        if(this.al && buas.r(this)) {
            z = true;
        }
        menuItem1.setVisible(z);
        return true;
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onRestart() {
        super.onRestart();
        if(btnt.a(htra.c())) {
            btjk.d(this.W.Q);
        }
    }

    @Override  // xoi
    public final void onResume() {
        super.onResume();
        ArrayList arrayList0 = new ArrayList(this.N);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            btig btig0 = (btig)arrayList0.get(v1);
            btig0.c = false;
            Object object0 = btig0.d;
            if(object0 != null) {
                btig0.d(object0);
                btig0.d = null;
            }
        }
    }

    @Override  // btrg
    protected final void onSaveInstanceState(Bundle bundle0) {
        List list0 = this.N;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((btig)list0.get(v1)).c = true;
        }
        super.onSaveInstanceState(bundle0);
    }

    @Override  // xni
    public final void onStart() {
        super.onStart();
        if(this.ag()) {
            Account account0 = this.W.d;
            int v = btim.c(this).size();
            if(v == 0) {
                if(account0 != null) {
                    this.ao("");
                    this.au();
                    return;
                }
                btot btot0 = this.t;
                if(btot0.e == null) {
                    HelpChimeraActivity helpChimeraActivity0 = btot0.a;
                    btot0.e = ((ViewStub)helpChimeraActivity0.findViewById(0x7F0B15E8)).inflate();  // id:gh_sign_in_banner_view_stub
                    btot0.e.findViewById(0x7F0B15E9).setOnClickListener(new btoq(btot0));  // id:gh_sign_in_button
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((btvm)hftp0.b_message).i = 0x90;
                    ((btvm)hftp0.b_message).b |= 0x100;
                    bttu.E(helpChimeraActivity0, hftp0, bbnk.a);
                    btvm btvm0 = (btvm)hftp0.N_build();
                    if(btnt.b(htnc.d())) {
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((btvk)hftp1.b_message).c = 51;
                        ((btvk)hftp1.b_message).b |= 1;
                        btvk btvk0 = (btvk)hftp1.N_build();
                        HelpConfig helpConfig0 = helpChimeraActivity0.ia();
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        btvl btvl0 = (btvl)hftp2.b_message;
                        btvk0.getClass();
                        btvl0.d = btvk0;
                        btvl0.c = 3;
                        bttg.J(helpChimeraActivity0, helpConfig0, hftp2);
                    }
                }
            }
            else {
                if(account0 == null) {
                    btim.d(this, this.W);
                    this.au();
                    return;
                }
                if(v > 1) {
                    btot btot1 = this.t;
                    if(btot1.d == null) {
                        btot1.d = (AccountPickerContainer)((ViewStub)btot1.a.findViewById(0x7F0B1535)).inflate();  // id:gh_account_picker_view_stub
                    }
                    AccountPickerContainer accountPickerContainer0 = btot1.d;
                    HelpChimeraActivity helpChimeraActivity1 = btot1.a;
                    ((TextView)accountPickerContainer0.findViewById(0x7F0B1533)).setCompoundDrawablesRelativeWithIntrinsicBounds(btoa.b(accountPickerContainer0.getContext().getDrawable(0x7F080AE1), accountPickerContainer0.getContext(), btob.a(accountPickerContainer0.getContext(), 0x7F0405AE)), null, null, null);  // id:gh_account_picker_icon_and_label
                    Spinner spinner0 = (Spinner)accountPickerContainer0.findViewById(0x7F0B1534);  // id:gh_account_picker_spinner
                    List list0 = btim.b(accountPickerContainer0.getContext());
                    ArrayAdapter arrayAdapter0 = new ArrayAdapter(helpChimeraActivity1, (btnt.a(htoy.c()) ? 0x7F0E0474 : 0x7F0E0475), ((String[])list0.toArray(new String[list0.size()])));  // layout:gh_help_account_picker_selected_line_item
                    arrayAdapter0.setDropDownViewResource((btnt.a(htoy.c()) ? 0x7F0E0472 : 0x7F0E0473));  // layout:gh_help_account_picker_dropdown_line_item
                    spinner0.setAdapter(arrayAdapter0);
                    if(list0.size() < 2) {
                        spinner0.setEnabled(false);
                        spinner0.setBackgroundColor(accountPickerContainer0.getDrawingCacheBackgroundColor());
                    }
                    else {
                        spinner0.setOnItemSelectedListener(new btok(accountPickerContainer0, helpChimeraActivity1, spinner0));
                    }
                    int v1 = btim.a(accountPickerContainer0.getContext(), helpChimeraActivity1.W);
                    if(v1 >= 0) {
                        spinner0.setSelection(v1);
                    }
                }
                else {
                    AccountPickerContainer accountPickerContainer1 = this.t.d;
                    if(accountPickerContainer1 != null) {
                        accountPickerContainer1.setVisibility(8);
                    }
                }
            }
        }
        this.Z();
    }

    @Override  // xni
    public final void onStop() {
        super.onStop();
        btka btka0 = this.ae;
        if(btka0 != null) {
            btij btij0 = btka0.c.g();
            btij0.d("ongoing_session_last_stopped_ms", System.currentTimeMillis());
            HelpConfig helpConfig0 = btka0.b;
            btij0.e("ongoing_session_id", helpConfig0.e);
            String s = helpConfig0.c;
            if(s != null) {
                btij0.e("ongoing_session_context", s);
            }
            HelpChimeraActivity helpChimeraActivity0 = btka0.a;
            if(helpChimeraActivity0.o() == hjfa.c) {
                btix btix0 = helpChimeraActivity0.l();
                if(btix0 != null && !btix0.b() && !btix0.d() && btix0.a != null && !helpConfig0.F()) {
                    btij0.e("ongoing_session_browse_url", btix0.a.g);
                    int v = btix0.h - 1;
                    if(btix0.h == 0) {
                        throw null;
                    }
                    btij0.c("ongoing_session_user_action_type", v);
                    btij0.c("ongoing_session_click_rank", btix0.b);
                    float f = helpChimeraActivity0.m().y();
                    String s1 = btij0.b.b("ongoing_session_scroll_pos_y");
                    btij0.a.putFloat(s1, f);
                    if(!TextUtils.isEmpty(btix0.c)) {
                        btij0.e("ongoing_session_query", btix0.c);
                    }
                }
            }
            else {
                helpConfig0.ac = "";
                helpConfig0.ao = 1;
                helpConfig0.ad = -1;
                helpConfig0.af = -1.0f;
                helpConfig0.ae = "";
            }
            btij0.a();
        }
    }

    public final Integer p() {
        if(btnt.a(htsh.c()) && this.o() != hjfa.c) {
            return this.Q;
        }
        if(this.o() == hjfa.c && this.l() != null) {
            btjd btjd0 = this.l().a;
            return btjd0 == null ? null : btjd0.z;
        }
        return null;
    }

    final String q(btjd btjd0, btix btix0) {
        String s = btjd0.y;
        if(TextUtils.equals(s, btix0.a.y)) {
            try {
                return (String)btyx.a(this).get();
            }
            catch(ExecutionException | InterruptedException exception0) {
                a.ae(HelpChimeraActivity.j.i(), "unable to get global js to inject.", exception0);
                return "";
            }
        }
        btys btys0 = new btys(this, this.o, s);
        this.o.execute(btys0);
        return "";
    }

    public final void r(bthx bthx0) {
        bthz bthz0 = this.z;
        if(bthz0 != null) {
            bthx0.b(bthz0);
            return;
        }
        btiz btiz0 = this.af;
        if(btiz0 != null) {
            btiz0.addObserver(new btqj(this, bthx0));
        }
    }

    public final void s(String s) {
        Intent intent0 = new Intent("android.intent.action.DIAL");
        intent0.setData(Uri.parse(("tel:" + s)));
        this.startActivity(intent0);
    }

    public final void t(boolean z) {
        btig.b(z, this.N);
    }

    public final void u(String s) {
        if(!this.ao(s)) {
            return;
        }
        if(btnt.a(htst.a.b().a())) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((btvm)hftv0).i = 0x71;
            ((btvm)hftv0).b |= 0x100;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((btvm)hftp0.b_message).j = 0xA2;
            ((btvm)hftp0.b_message).b |= 0x400;
            bttu.E(this, hftp0, bbnk.a);
            btvm btvm0 = (btvm)hftp0.N_build();
            if(btnt.b(htnc.d())) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((btvk)hftv1).c = 46;
                ((btvk)hftv1).b |= 1;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((btvk)hftp1.b_message).d = 25;
                ((btvk)hftp1.b_message).b |= 2;
                btvk btvk0 = (btvk)hftp1.N_build();
                HelpConfig helpConfig0 = this.ia();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                btvl btvl0 = (btvl)hftp2.b_message;
                btvk0.getClass();
                btvl0.d = btvk0;
                btvl0.c = 3;
                bttg.J(this, helpConfig0, hftp2);
            }
        }
        else {
            for(Object object0: btim.c(this)) {
                Account account0 = (Account)object0;
                if(s.equals(account0.name)) {
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp3.b_message;
                    ((btvm)hftv2).i = 0x71;
                    ((btvm)hftv2).b |= 0x100;
                    if(account0 == null) {
                        if(!hftv2.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((btvm)hftp3.b_message).j = 0xA3;
                        ((btvm)hftp3.b_message).b |= 0x400;
                    }
                    else {
                        if(!hftv2.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((btvm)hftp3.b_message).j = 0xA2;
                        ((btvm)hftp3.b_message).b |= 0x400;
                        String s1 = blei.d(account0);
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        btvm btvm1 = (btvm)hftp3.b_message;
                        s1.getClass();
                        btvm1.b |= 4;
                        btvm1.e = s1;
                    }
                    bttu.E(this, hftp3, bbnk.a);
                    btvm btvm2 = (btvm)hftp3.N_build();
                    if(btnt.b(htnc.d())) {
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp4.b_message;
                        ((btvk)hftv3).c = 46;
                        ((btvk)hftv3).b |= 1;
                        if(account0 == null) {
                            if(!hftv3.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            ((btvk)hftp4.b_message).d = 26;
                            ((btvk)hftp4.b_message).b |= 2;
                        }
                        else {
                            if(!hftv3.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            ((btvk)hftp4.b_message).d = 25;
                            ((btvk)hftp4.b_message).b |= 2;
                            String s2 = blei.d(account0);
                            if(!hftp4.b_message.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            btvk btvk1 = (btvk)hftp4.b_message;
                            s2.getClass();
                            btvk1.b |= 0x800;
                            btvk1.m = s2;
                        }
                        HelpConfig helpConfig1 = this.ia();
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        btvl btvl1 = (btvl)hftp5.b_message;
                        btvk btvk2 = (btvk)hftp4.N_build();
                        btvk2.getClass();
                        btvl1.d = btvk2;
                        btvl1.c = 3;
                        bttg.J(this, helpConfig1, hftp5);
                    }
                }
            }
        }
        this.au();
    }

    public final void v() {
        this.R.loadUrl("about:blank");
    }

    public final void w() {
        btoo btoo0 = this.ad;
        btoo0.ah = false;
        btoo0.ai = true;
        Handler handler0 = btoo0.ak;
        handler0.removeCallbacks(btoo0.al);
        btoo0.aj = null;
        long v = System.currentTimeMillis() - btoo0.d;
        long v1 = (long)(((int)htkd.a.o().A()));
        if(v < v1 && btoo0.d != -1L) {
            if(!btoo0.ag) {
                handler0.postDelayed(btoo0.am, v1 - v);
                btoo0.ag = true;
            }
            return;
        }
        btoo0.y();
    }

    public final void x(hjfa hjfa0) {
        switch(((hjfa)this.an.peek()).ordinal()) {
            case 0: {
                goto label_2;
            }
            case 1: {
                goto label_4;
            }
        }
        return;
    label_2:
        if(hjfa0 == hjfa.b || hjfa0 == hjfa.c) {
            goto label_5;
        }
        return;
    label_4:
        if(hjfa0 == hjfa.c) {
        label_5:
            this.X(((hjfa)this.an.peek()), 8);
            this.an.push(hjfa0);
            this.X(hjfa0, 0);
        }
    }

    public final void y(btwf btwf0, CharSequence charSequence0, blej blej0) {
        btxg btxg0 = this.u;
        HelpChimeraActivity helpChimeraActivity0 = btxg0.a;
        List list0 = btwf0.g(helpChimeraActivity0, btxg0.b);
        btxg0.c.an(btxg0.d);
        btxg0.d.n(charSequence0.toString(), list0);
        String s = btwf0.d();
        String s1 = charSequence0.toString();
        if(btnt.b(htnc.d())) {
            bttg.m(helpChimeraActivity0, s);
        }
        bttu.z(helpChimeraActivity0, 15, list0, s, s1);
        btsv.a(bbdg.fp);
        if(btnt.a(htrp.c()) && (helpChimeraActivity0.W != null && helpChimeraActivity0.W.d != null)) {
            ProtoLiteBuilder hftp0 = btyp.i(11);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgev.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgev hgev0 = (hgev)hftp1.b_message;
            s1.getClass();
            hgev0.b |= 1;
            hgev0.c = s1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hges hges0 = (hges)hftp0.b_message;
            hgev hgev1 = (hgev)hftp1.N_build();
            hgev1.getClass();
            hges0.d = hgev1;
            hges0.c = 2;
            new btyp(((hges)hftp0.N_build()), helpChimeraActivity0).executeOnExecutor(helpChimeraActivity0.n, new Void[0]);
        }
        if(btnt.a(htrp.c()) && (helpChimeraActivity0.W != null && helpChimeraActivity0.W.d != null)) {
            ProtoLiteBuilder hftp2 = btyp.i(11);
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hgez.a).v_newBuilder();
            for(Object object0: list0) {
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hgex.a).v_newBuilder();
                String s2 = ((btjd)object0).f;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp4.b_message;
                s2.getClass();
                ((hgex)hftv0).b |= 2;
                ((hgex)hftv0).d = s2;
                String s3 = ((btjd)object0).g;
                if(!hftv0.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hgex hgex0 = (hgex)hftp4.b_message;
                s3.getClass();
                hgex0.b |= 1;
                hgex0.c = s3;
                String s4 = ((btjd)object0).v();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hgex hgex1 = (hgex)hftp4.b_message;
                s4.getClass();
                hgex1.b |= 4;
                hgex1.e = s4;
                hgex hgex2 = (hgex)hftp4.N_build();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hgez hgez0 = (hgez)hftp3.b_message;
                hgex2.getClass();
                hfuo hfuo0 = hgez0.b;
                if(!hfuo0.c()) {
                    hgez0.b = ProtoLiteMessage.E(hfuo0);
                }
                hgez0.b.add(hgex2);
            }
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hges hges1 = (hges)hftp2.b_message;
            hgez hgez1 = (hgez)hftp3.N_build();
            hgez1.getClass();
            hges1.d = hgez1;
            hges1.c = 7;
            new btyp(((hges)hftp2.N_build()), helpChimeraActivity0).executeOnExecutor(helpChimeraActivity0.n, new Void[0]);
        }
        this.x(hjfa.b);
        this.s.setVisibility(0);
        this.w();
        btvm btvm0 = HelpChimeraActivity.n(this);
        long v = blej0.a();
        bttu.u(this, 10, v, hjfa.b(btvm0.q), btvm0.l, btvm0.m, btvm0.n);
        bttg.w(this, 42, v, hjfa.b(btvm0.q), btvm0.l, btvm0.m, btvm0.n);
    }

    public final void z() {
        this.p.c();
        new btyb(this, this.o).executeOnExecutor(this.o, new Void[0]);
    }
}

