package com.google.android.gms.smartdevice.setup.ui.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import bagp;
import bagt;
import bagv;
import batl;
import baun;
import bbll;
import bbqa;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import com.google.android.setupdesign.GlifLayout;
import eqpc;
import ernx;
import erny;
import erob;
import erod;
import eroe;
import erog;
import erqc;
import gaec;
import gahu;
import gahy;
import hygl;
import hygx;
import hyhp;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import jys;
import xnz;

public class MagicArchChallengeView extends LinearLayout {
    public static final baun a;
    public xnz b;
    public WebView c;
    public GlifLayout d;
    public View e;
    public View f;
    public boolean g;
    public eroe h;
    public volatile List i;
    public CountDownLatch j;
    public int k;
    erog l;
    public final ArrayList m;
    private WebViewClient n;
    private CookieManager o;
    private boolean p;
    private int q;

    static {
        MagicArchChallengeView.a = new erqc(new String[]{"Setup", "UI", "View", "MagicArchChallengeView"});
    }

    public MagicArchChallengeView(Context context0) {
        super(context0);
        this.m = new ArrayList();
        this.h();
    }

    public MagicArchChallengeView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.m = new ArrayList();
        this.h();
    }

    public MagicArchChallengeView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.m = new ArrayList();
        this.h();
    }

    public MagicArchChallengeView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.m = new ArrayList();
        this.h();
    }

    public final void a() {
        this.c.setVisibility(8);
        this.e.setVisibility(0);
        this.d.D().setVisibility(0);
        this.d.C().setVisibility(0);
        this.d.N(true);
        if(!hyhp.j()) {
            eqpc.e(this.d, this.q);
        }
        if(this.k >= this.i.size() && this.h != null) {
            if(!hyhp.j()) {
                bbll bbll0 = new bbll(1, 9);
                bbll0.d(new ernx(this)).hB(new erny(this), bbll0);
                return;
            }
            this.h.b(this.m);
            return;
        }
        String s = ((FallbackAccount)this.i.get(this.k)).c;
        if(!TextUtils.isEmpty(s)) {
            Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
            hygl hygl0 = hygl.a;
            Uri.Builder uri$Builder1 = uri$Builder0.appendQueryParameter("hl", (hygl0.d().i() ? Locale.getDefault().toLanguageTag() : Locale.getDefault().getLanguage())).build().buildUpon();
            uri$Builder1.appendQueryParameter("hide_status_bar", "1");
            int v = this.q;
            if(v != 0) {
                switch(v) {
                    case 1: {
                        if(hyhp.h() && gaec.B(this.b)) {
                            uri$Builder1.appendQueryParameter("theme", "mn");
                        }
                        break;
                    }
                    case 2: {
                        uri$Builder1.appendQueryParameter("theme", "gm3x");
                    }
                }
            }
            else if(jys.d() && gaec.t(this.d.getContext())) {
                uri$Builder1.appendQueryParameter("theme", "gm3x");
            }
            else if(hyhp.h() && gaec.B(this.b)) {
                uri$Builder1.appendQueryParameter("theme", "mn");
            }
            if(this.g) {
                uri$Builder1.appendQueryParameter("color_scheme", "dark");
            }
            if(hygl0.d().f() && bbqa.d() && gaec.z(this.d.getContext())) {
                uri$Builder1.appendQueryParameter("palette_colors", bagt.b(this.d.getContext()));
            }
            String s1 = bagt.a(this.d.getContext());
            if(hygl0.d().g() && !TextUtils.isEmpty(s1)) {
                uri$Builder1.appendQueryParameter("ff", s1);
            }
            this.o.removeAllCookies(new erod(this, uri$Builder1.toString()));
            return;
        }
        MagicArchChallengeView.a.m("Url is empty.", new Object[0]);
        ++this.k;
        this.a();
    }

    public final void b() {
        ++this.k;
        this.a();
    }

    public final void c(xnz xnz0, eroe eroe0, String s, String s1, int v, UiCustomization uiCustomization0, int v1) {
        baun baun0 = MagicArchChallengeView.a;
        baun0.d("initializeView()", new Object[0]);
        this.q = v1;
        this.d.b(s);
        this.d.K(s1);
        eqpc.d(this.getContext(), this.d, v);
        this.c.setVisibility(8);
        this.d.setImportantForAccessibility(0);
        boolean z = bagv.k(this.getContext());
        baun0.d("isNightModeActive: %b, currentNightMode: %b", new Object[]{Boolean.valueOf(this.p), Boolean.valueOf(z)});
        boolean z1 = this.p;
        if(z1 != z) {
            baun0.d("fixHeaderTextColor(isNightModeActive = %b)", new Object[]{Boolean.valueOf(z1)});
            Resources resources0 = this.d.getResources();
            Configuration configuration0 = resources0.getConfiguration();
            configuration0.uiMode = z1 ? 0x20 : 16;
            resources0.updateConfiguration(configuration0, resources0.getDisplayMetrics());
            ColorStateList colorStateList0 = ColorStateList.valueOf(resources0.getColor(0x7F061202));  // color:sud_system_primary_text
            ((gahy)this.d.t(gahy.class)).e(colorStateList0);
            ((gahu)this.d.t(gahu.class)).c(colorStateList0);
        }
        this.d.D().setVisibility(0);
        this.d.C().setVisibility(0);
        this.e.setVisibility(0);
        if(!hyhp.j()) {
            eqpc.e(this.d, v1);
        }
        if(hygx.g() && uiCustomization0 != null) {
            eqpc.a(uiCustomization0, this.d);
        }
        this.h = eroe0;
        this.b = xnz0;
    }

    public final void d() {
        if(this.c.getVisibility() == 0) {
            this.c.reload();
        }
    }

    public final void e(xnz xnz0, eroe eroe0, String s, String s1, int v, List list0, UiCustomization uiCustomization0, int v1) {
        if(s == null) {
            this.d.b(this.getResources().getQuantityString(0x7F130096, (list0 == null ? 0 : list0.size())));  // plurals:smartdevice_d2d_copying_accounts
        }
        else {
            this.d.b(s);
        }
        this.d.K(s1);
        eqpc.d(this.getContext(), this.d, v);
        if(hygx.g() && uiCustomization0 != null) {
            eqpc.a(uiCustomization0, this.d);
        }
        this.h = eroe0;
        this.i = list0;
        this.j = new CountDownLatch(list0.size());
        this.b = xnz0;
        this.q = v1;
        this.a();
    }

    public final void f() {
        this.j.countDown();
        ++this.k;
        this.a();
    }

    public final boolean g() {
        return this.d.gU();
    }

    private final void h() {
        boolean z = bagv.k(this.getContext());
        this.p = z;
        MagicArchChallengeView.a.d("isNightModeActive = %b", new Object[]{Boolean.valueOf(z)});
        Context context0 = this.getContext();
        batl.s(context0);
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0).cloneInContext(context0);
        layoutInflater0.setFactory2(new bagp());
        View view0 = layoutInflater0.inflate(0x7F0E09EA, this);  // layout:smartdevice_magic_arch_webview
        this.c = (WebView)view0.findViewById(0x7F0B24EE);  // id:webview
        erog erog0 = new erog(this);
        this.l = erog0;
        this.c.addJavascriptInterface(erog0, "mm");
        this.o = CookieManager.getInstance();
        this.d = (GlifLayout)view0.findViewById(0x7F0B160D);  // id:glif_layout
        this.e = view0.findViewById(0x7F0B216B);  // id:sud_layout_header
        this.f = view0.findViewById(0x7F0B2167);  // id:sud_layout_content
        boolean z1 = bagv.k(this.getContext());
        this.g = z1;
        MagicArchChallengeView.a.d("useDarkTheme = %b", new Object[]{Boolean.valueOf(z1)});
        erob erob0 = new erob(this);
        this.n = erob0;
        this.c.setWebViewClient(erob0);
        this.c.getSettings().setJavaScriptEnabled(true);
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        MagicArchChallengeView.a.d("onRestoreInstanceState", new Object[0]);
        Parcelable parcelable1 = ((Bundle)parcelable0).getParcelable("internalState");
        if(parcelable1 != null) {
            super.onRestoreInstanceState(parcelable1);
        }
        this.k = ((Bundle)parcelable0).getInt("index");
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        MagicArchChallengeView.a.j("onSaveInstanceState()", new Object[0]);
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putInt("index", this.k);
        ((Bundle)parcelable0).putParcelable("internalState", super.onSaveInstanceState());
        return parcelable0;
    }
}

