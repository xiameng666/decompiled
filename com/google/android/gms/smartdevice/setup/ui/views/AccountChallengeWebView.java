package com.google.android.gms.smartdevice.setup.ui.views;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import bagp;
import batl;
import baun;
import com.google.android.setupdesign.GlifLayout;
import eqpc;
import erir;
import eriw;
import ernp;
import ernq;
import ernr;
import erns;
import ernv;
import ernw;
import erqc;
import hoxb;
import hyim;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Semaphore;

public class AccountChallengeWebView extends LinearLayout {
    public static final baun a;
    public static final String b;
    public static final String c;
    public boolean d;
    public String e;
    public String f;
    public int g;
    public ArrayList h;
    public int i;
    public Semaphore j;
    public int k;
    public String l;
    public Bundle m;
    public WebView n;
    public GlifLayout o;
    public boolean p;
    public erir q;
    private static final int r;
    private static final String s;
    private volatile ArrayList t;
    private CookieManager u;
    private View v;
    private WebViewClient w;
    private final Runnable x;

    static {
        AccountChallengeWebView.a = new erqc(new String[]{"Setup", "UI", "View", "AccountChallengeWebView"});
        AccountChallengeWebView.r = 0x7F0B160F;  // id:glif_notice
        AccountChallengeWebView.b = hyim.a.e().v();
        AccountChallengeWebView.c = hyim.a.e().w();
        AccountChallengeWebView.s = hyim.a.e().x();
    }

    public AccountChallengeWebView(Context context0) {
        super(context0);
        this.h = new ArrayList();
        this.x = new ernv(this);
        this.j();
    }

    public AccountChallengeWebView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.h = new ArrayList();
        this.x = new ernv(this);
        this.j();
    }

    public AccountChallengeWebView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.h = new ArrayList();
        this.x = new ernv(this);
        this.j();
    }

    public AccountChallengeWebView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.h = new ArrayList();
        this.x = new ernv(this);
        this.j();
    }

    public final void a() {
        this.d();
        if(!this.h()) {
            new erns(this).execute(new Void[0]);
            return;
        }
        Bundle bundle0 = (Bundle)this.t.get(this.k);
        this.m = bundle0;
        String s = bundle0.getString("name");
        String s1 = this.m.getString("credential");
        String s2 = this.m.getString("url");
        this.l = s;
        if(!TextUtils.isEmpty(s2)) {
            Uri uri0 = Uri.parse(s2);
            String s3 = uri0.getQueryParameter("hl");
            String s4 = Locale.getDefault().toString();
            if(!TextUtils.isEmpty(s3) && !s3.equals(s4)) {
                Uri.Builder uri$Builder0 = uri0.buildUpon().clearQuery();
                for(Object object0: uri0.getQueryParameterNames()) {
                    String s5 = (String)object0;
                    if(!s5.equals("hl")) {
                        uri$Builder0.appendQueryParameter(s5, uri0.getQueryParameter(s5));
                    }
                }
                uri0 = uri$Builder0.appendQueryParameter("hl", s4).build();
            }
            Uri.Builder uri$Builder1 = uri0.buildUpon();
            if(this.d) {
                uri$Builder1.appendQueryParameter(AccountChallengeWebView.c, "1");
            }
            if(this.p) {
                uri$Builder1.appendQueryParameter(AccountChallengeWebView.s, "1");
            }
            this.u.removeAllCookies(new ernr(this, uri$Builder1.toString()));
            return;
        }
        this.h.add(this.m);
        new ernw(this, s, s1, this.m.getString("firstName"), this.m.getString("lastName")).execute(new Void[0]);
    }

    public final void b() {
        this.j.release();
        this.i();
    }

    public final void c() {
        String s = this.e;
        if(s == null) {
            this.o.b(this.getResources().getQuantityString(0x7F130096, (this.t == null ? 0 : this.t.size())));  // plurals:smartdevice_d2d_copying_accounts
        }
        else {
            this.o.b(s);
        }
        String s1 = this.f;
        if(s1 != null) {
            this.o.K(s1);
        }
        eqpc.d(this.getContext(), this.o, this.g);
    }

    public final void d() {
        erir erir0 = this.q;
        if(erir0 != null) {
            eriw eriw0 = erir0.b;
            if(eriw0.isAdded()) {
                eriw0.y(eriw0.b);
            }
        }
        this.n.setVisibility(8);
        this.o.setImportantForAccessibility(0);
        this.o.O(true);
        this.o.D().setVisibility(0);
        this.o.C().setVisibility(0);
    }

    @Override  // android.view.ViewGroup
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray0) {
        this.dispatchThawSelfOnly(sparseArray0);
    }

    @Override  // android.view.ViewGroup
    protected final void dispatchSaveInstanceState(SparseArray sparseArray0) {
        this.dispatchFreezeSelfOnly(sparseArray0);
    }

    public final void e() {
        if(this.h()) {
            this.i();
        }
    }

    public final void f(ArrayList arrayList0) {
        batl.m(this.t == null, "Cannot call AccountChallengeWebView#startChallenges more than once.");
        this.t = arrayList0;
        this.k = 0;
        this.m = null;
        batl.m(((boolean)(arrayList0.isEmpty() ^ 1)), "Must have at least one account.");
        this.i = this.t.size();
        this.post(new ernq(this));
    }

    public final void g() {
        baun baun0 = AccountChallengeWebView.a;
        baun0.j("Acquiring semaphore.", new Object[0]);
        if(!this.j.tryAcquire()) {
            baun0.o("This should not happen.", new Object[0]);
            return;
        }
        baun0.j("Semaphore acquired successfully.", new Object[0]);
        this.post(this.x);
    }

    public final boolean h() {
        return this.k < this.t.size();
    }

    private final void i() {
        ++this.k;
        this.a();
    }

    private final void j() {
        if(hoxb.d()) {
            Context context0 = this.getContext();
            batl.s(context0);
            LayoutInflater layoutInflater0 = LayoutInflater.from(context0).cloneInContext(context0);
            layoutInflater0.setFactory2(new bagp());
            this.v = layoutInflater0.inflate(0x7F0E09D1, this);  // layout:smartdevice_account_challenge_webview
        }
        else {
            this.v = AccountChallengeWebView.inflate(this.getContext(), 0x7F0E09D1, this);  // layout:smartdevice_account_challenge_webview
        }
        this.u = CookieManager.getInstance();
        this.n = (WebView)this.v.findViewById(0x7F0B24EE);  // id:webview
        ernp ernp0 = new ernp(this);
        this.w = ernp0;
        this.n.setWebViewClient(ernp0);
        this.o = (GlifLayout)this.v.findViewById(AccountChallengeWebView.r);
        this.d();
    }

    @Override  // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets0) {
        int v = windowInsets0.getSystemWindowInsetTop();
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.n.getLayoutParams());
        frameLayout$LayoutParams0.topMargin = v;
        this.n.setLayoutParams(frameLayout$LayoutParams0);
        return super.onApplyWindowInsets(windowInsets0);
    }

    @Override  // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable0) {
        if(parcelable0 == null) {
            return;
        }
        super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("internalState"));
        this.k = ((Bundle)parcelable0).getInt("index");
        this.h = ((Bundle)parcelable0).getParcelableArrayList("processedAccounts");
    }

    @Override  // android.view.View
    protected final Parcelable onSaveInstanceState() {
        AccountChallengeWebView.a.j("onSaveInstanceState()", new Object[0]);
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putInt("index", this.k);
        ((Bundle)parcelable0).putParcelableArrayList("processedAccounts", this.h);
        ((Bundle)parcelable0).putParcelable("internalState", super.onSaveInstanceState());
        return parcelable0;
    }
}

