package com.google.android.gms.signin.activity;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import ajnv;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import azzc;
import bauc;
import baun;
import bblp;
import bxjv;
import bxkl;
import bxkm;
import bxko;
import bxns;
import bxoc;
import bxod;
import bxoh;
import bxol;
import bxom;
import bxpe;
import bxtq;
import ca;
import clht;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import eppq;
import epps;
import eppt;
import epqa;
import epqe;
import epqg;
import epqh;
import epqi;
import epqj;
import epqk;
import epql;
import epqm;
import epqn;
import epqv;
import epqw;
import epqx;
import epqy;
import epqz;
import epra;
import eprb;
import eprc;
import eprd;
import eprf;
import epri;
import eprj;
import eprk;
import eprl;
import eprm;
import epro;
import eprp;
import eprq;
import eprr;
import eprv;
import eprw;
import epsw;
import eptq;
import eptv;
import epul;
import fhra;
import gfqx;
import gfsk;
import gfsx;
import gftb;
import gful_cronetEngineProvider;
import ggch;
import ggek;
import ggeo;
import giva;
import gixr;
import glzd;
import gmap;
import gmbt;
import gmbu;
import gmcd;
import gmcg;
import gmcn;
import gmcu;
import hyer;
import hyeu;
import hyex;
import java.io.IOException;
import java.util.Set;
import java.util.regex.Pattern;
import xni;

public class ConsentChimeraActivity extends xni {
    private AccountAuthenticatorResponse A;
    private Set B;
    private String C;
    public static final baun j;
    public final gmcg k;
    public bxko l;
    public CookieManager m;
    public bxkm n;
    public bxkl o;
    public ajnv p;
    public TokenRequest q;
    public int r;
    public TokenResponse s;
    public ConsentResult t;
    public bxod u;
    public eppt v;
    eptv w;
    private static final ggeo x;
    private static final Pattern y;
    private boolean z;

    static {
        ConsentChimeraActivity.j = epul.a("ConsentChimeraActivity");
        ggek ggek0 = new ggek();
        ggek0.i(Integer.valueOf(0), bxns.b);
        ggek0.i(Integer.valueOf(100), bxns.i);
        ggek0.i(Integer.valueOf(200), bxns.c);
        ggek0.i(Integer.valueOf(201), bxns.d);
        ggek0.i(Integer.valueOf(300), bxns.e);
        ggek0.i(Integer.valueOf(400), bxns.f);
        ggek0.i(Integer.valueOf(500), bxns.g);
        ggek0.i(Integer.valueOf(501), bxns.h);
        ConsentChimeraActivity.x = ggek0.b();
        ConsentChimeraActivity.y = Pattern.compile("^.+@(.*\\.|)gserviceaccount\\.com$");
    }

    public ConsentChimeraActivity() {
        this.k = gmcn.a(new bblp(2, 9));
    }

    public final void a(int v, String s) {
        ConsentChimeraActivity.p(new epqj(s));
        Intent intent0 = new Intent().putExtra("errorCode", v).putExtra("errorMessage", s);
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = this.A;
        if(accountAuthenticatorResponse0 != null) {
            accountAuthenticatorResponse0.onError(v, s);
        }
        this.setResult(0, intent0);
        this.finish();
    }

    public final void g(String s) {
        ConsentChimeraActivity.p(new epri());
        Intent intent0 = new Intent().putExtra("authAccount", this.q.a().name).putExtra("accountType", this.q.a().type).putExtra("authtoken", s);
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = this.A;
        if(accountAuthenticatorResponse0 != null) {
            Bundle bundle0 = intent0.getExtras();
            gftb.check(bundle0);
            accountAuthenticatorResponse0.onResult(bundle0);
        }
        this.setResult(-1, intent0);
        this.finish();
    }

    public final void l(gmcu gmcu0, AccountManagerFuture accountManagerFuture0) {
        try {
            accountManagerFuture0.getResult();
            gmcu0.q(gfsx.m(Integer.valueOf(0)));
        }
        catch(AuthenticatorException authenticatorException0) {
            ConsentChimeraActivity.p(new eprf(authenticatorException0));
            this.a(6, "Authenticator error");
            gmcu0.q(gfqx.a);
        }
        catch(OperationCanceledException unused_ex) {
            this.a(4, "Reauth canceled");
            gmcu0.q(gfqx.a);
        }
        catch(IOException unused_ex) {
            this.a(3, "Network error");
            gmcu0.q(gfqx.a);
        }
    }

    public final void m(long v, int v1, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giva.a).v_newBuilder();
        bxns bxns0 = (bxns)ConsentChimeraActivity.x.get(Integer.valueOf(v1));
        gftb.check(bxns0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giva)hftv0).d = bxns0.j;
        ((giva)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        giva giva0 = (giva)hftp0.b_message;
        giva0.b |= 0x8000;
        giva0.r = z;
        long v2 = System.currentTimeMillis() - v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giva giva1 = (giva)hftp0.b_message;
        giva1.b |= 0x4000;
        giva1.q = v2;
        giva giva2 = (giva)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s = this.v.g;
        if(s != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gixr gixr0 = (gixr)hftp1.b_message;
            gixr0.b |= 2;
            gixr0.e = s;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gixr)hftv1).d = 5;
        ((gixr)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixr gixr1 = (gixr)hftp1.b_message;
        giva2.getClass();
        gixr1.i = giva2;
        gixr1.b |= 0x20;
        this.u.a(((gixr)hftp1.N_build()));
    }

    public final void n() {
        this.m.removeAllCookies(null);
        this.m.flush();
    }

    public final void o() {
        gmcd gmcd0;
        ConsentChimeraActivity.p(new epqk(this));
        int v = this.r;
        switch(v) {
            case 0: {
                this.q();
                bxkm bxkm0 = this.n;
                epqy epqy0 = new epqy(this);
                bxko bxko0 = this.l;
                gmcd0 = glzd.f(bxkm0.b(Integer.valueOf(0), ((gful_cronetEngineProvider)new epqx(this))), epqy0, bxko0);
                break;
            }
            case 100: {
                Account account0 = this.q.a();
                if("com.google.work".equals(account0.type) && ConsentChimeraActivity.y.matcher(account0.name).matches()) {
                    ConsentChimeraActivity.p(new epqz());
                    this.a(6, "Work service account");
                    gmcd0 = gmbu.i(gfqx.a);
                }
                else {
                    gmcd0 = this.n.b(Integer.valueOf(100), ((gful_cronetEngineProvider)new eprk(this)));
                }
                break;
            }
            case 200: {
                this.q();
                bxko bxko1 = this.l;
                gmcd0 = glzd.f(this.n.b(Integer.valueOf(200), ((gful_cronetEngineProvider)new epqi(this))), new gfsk(gfsx.m(Integer.valueOf(201))), bxko1);
                break;
            }
            case 201: {
                epqa epqa0 = (epqa)this.getSupportFragmentManager().h("browser_consent");
                TokenResponse tokenResponse0 = this.s;
                gftb.check(tokenResponse0);
                if(epqa0 == null) {
                    String s = tokenResponse0.z.d;
                    s = hyex.f() ? bxpe.b(s, this.getResources()) : tokenResponse0.z.d;
                    ConsentChimeraActivity.p(new eprj(s));
                    Account account1 = this.q.a();
                    epqa epqa1 = new epqa();
                    Bundle bundle0 = new Bundle();
                    bundle0.putParcelable("selected_account", account1);
                    bundle0.putString("url", s);
                    epqa1.setArguments(bundle0);
                    ca ca0 = new ca(this.getSupportFragmentManager());
                    ca0.z(0x1020002, epqa1, "browser_consent");
                    ca0.a();
                    epqa0 = epqa1;
                }
                else {
                    ConsentChimeraActivity.p(new eprl());
                }
                bxkm bxkm1 = this.n;
                epqw epqw0 = new epqw(this);
                bxko bxko2 = this.l;
                gmcd0 = glzd.f(bxkm1.b(Integer.valueOf(201), ((gful_cronetEngineProvider)new epqv(epqa0))), epqw0, bxko2);
                break;
            }
            case 300: {
                TokenResponse tokenResponse1 = this.s;
                gftb.check(tokenResponse1);
                bxkl bxkl0 = this.o;
                TokenRequest tokenRequest0 = this.q;
                hyeu.a.b().b();
                gmcd0 = glzd.f(bxkl0.b(300, bxjv.b(this, tokenRequest0, tokenResponse1)), new epqh(this), this.l);
                break;
            }
            case 400: {
                this.q();
                if(hyex.h()) {
                    TokenRequest tokenRequest1 = this.q;
                    ConsentResult consentResult0 = this.t;
                    gftb.check(consentResult0);
                    Bundle bundle1 = new Bundle();
                    bxom.b(bundle1, "token_request", tokenRequest1);
                    bxom.b(bundle1, "consent_result", consentResult0);
                    eptv eptv0 = this.w;
                    gftb.check(eptv0);
                    RecordConsentByConsentResultRequest recordConsentByConsentResultRequest0 = new RecordConsentByConsentResultRequest(bundle1);
                    azzc azzc0 = new azzc();
                    azzc0.a = new eptq(eptv0, recordConsentByConsentResultRequest0);
                    azzc0.d = 6306;
                    gmcd gmcd1 = fhra.b(eptv0.jn(azzc0.a()));
                    bxkm bxkm2 = this.n;
                    eprb eprb0 = new eprb(this);
                    bxko bxko3 = this.l;
                    gmcd0 = glzd.f(bxkm2.b(Integer.valueOf(400), ((gful_cronetEngineProvider)new epra(gmcd1))), eprb0, bxko3);
                }
                else {
                    bxkm bxkm3 = this.n;
                    eprd eprd0 = new eprd(this);
                    bxko bxko4 = this.l;
                    gmcd0 = glzd.f(bxkm3.b(Integer.valueOf(400), ((gful_cronetEngineProvider)new eprc(this))), eprd0, bxko4);
                }
                break;
            }
            case 500: {
                Account account2 = this.q.a();
                String s1 = this.s == null ? "dmStatus" : this.s.v;
                epqm epqm0 = new epqm(this, account2);
                gmcd0 = glzd.g(glzd.f(gmbt.h(this.k.e(epqm0)), new epqn(this, account2, s1), gmap.a), new eprm(this), this.l);
                break;
            }
            case 501: {
                gmcd0 = glzd.f(this.o.b(501, bxjv.a(this, this.q.a())), new epqg(this), this.l);
                break;
            }
            default: {
                throw new IllegalStateException(String.format("Unknown consent step: %d", v));
            }
        }
        bxko bxko5 = this.l;
        gmbu.t(gmcd0, new eprv(this, System.currentTimeMillis()), bxko5);
    }

    @Override  // xnb
    public final void onBackPressed() {
        epqa epqa0 = (epqa)this.getSupportFragmentManager().h("browser_consent");
        if(epqa0 != null) {
            if(epqa0.c != null && epqa0.c.canGoBack()) {
                epqa0.c.goBack();
                return;
            }
            this.a(4, "");
            super.onBackPressed();
        }
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.requestWindowFeature(1);
        this.setTheme(0x7F16044D);  // style:Identity.Theme.DayNight.NoActionBar.Dialog.MinWidth
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics0);
        Scope[] arr_scope = null;
        this.u = bxoc.b(this, null);
        CookieManager cookieManager0 = this.getPackageManager().hasSystemFeature("android.software.webview") ? CookieManager.getInstance() : new epsw();
        this.m = cookieManager0;
        this.l = new bxko(new clht(Looper.getMainLooper()));
        this.n = bxkm.a(this);
        this.o = bxkl.a(this);
        this.p = new ajnv(this);
        if(bundle0 == null) {
            this.r = 0;
            this.s = null;
            this.t = null;
            this.C = this.getIntent().getStringExtra("SIGN_IN_PACKAGE_NAME");
            Parcelable[] arr_parcelable1 = this.getIntent().getParcelableArrayExtra("SIGN_IN_SCOPE_ARRAY");
            if(arr_parcelable1 != null) {
                this.B = ggch.k(arr_parcelable1).l(new eprp()).p();
            }
            Bundle bundle2 = this.getIntent().getBundleExtra("sign_in_options");
            epps epps0 = bundle2 == null ? new epps() : epps.a(bundle2);
            eppt eppt0 = epps0.b();
            this.v = eppt0;
            if(eppt0.g == null) {
                epps0.f = bxol.a();
                eppt eppt1 = epps0.b();
                this.v = eppt1;
                bxod bxod0 = this.u;
                String s = this.C;
                Set set0 = this.B;
                if(set0 != null) {
                    arr_scope = (Scope[])set0.toArray(new Scope[0]);
                }
                bxod0.a(bxtq.a(s, arr_scope, eppt1));
            }
        }
        else {
            this.r = bundle0.getInt("consent_step", 0);
            if(bundle0.containsKey("token_response")) {
                byte[] arr_b = bundle0.getByteArray("token_response");
                gftb.check(arr_b);
                this.s = (TokenResponse)bauc.a(arr_b, TokenResponse.CREATOR);
            }
            if(bundle0.containsKey("consent_result")) {
                this.t = (ConsentResult)bundle0.getParcelable("consent_result");
            }
            this.C = bundle0.getString("SIGN_IN_PACKAGE_NAME");
            if(bundle0.containsKey("SIGN_IN_SCOPE_ARRAY")) {
                Parcelable[] arr_parcelable = bundle0.getParcelableArray("SIGN_IN_SCOPE_ARRAY");
                gftb.check(arr_parcelable);
                this.B = ggch.k(arr_parcelable).l(new epro()).p();
            }
            Bundle bundle1 = bundle0.getBundle("sign_in_options");
            gftb.check(bundle1);
            this.v = epps.a(bundle1).b();
        }
        bxoh.a(this, new epql(this));
        ConsentChimeraActivity.j.d("Log Session ID: " + this.v.g, new Object[0]);
        TokenRequest tokenRequest0 = (TokenRequest)bauc.b(this.getIntent(), "token_request", TokenRequest.CREATOR);
        gftb.check(tokenRequest0);
        this.q = tokenRequest0;
        this.z = this.getIntent().getBooleanExtra("suppress_loading_ui", false);
        this.A = (AccountAuthenticatorResponse)this.getIntent().getParcelableExtra("account_authenticator_response");
        if(hyex.h()) {
            String s1 = this.C;
            Bundle bundle3 = this.v.a();
            bundle3.putString("com.google.android.gms.signin.internal.realClientPackageName", s1);
            this.w = new eptv(this, new eppq(bundle3));
        }
        this.o();
    }

    @Override  // xni
    protected final void onDestroy() {
        super.onDestroy();
        if(this.isFinishing()) {
            this.n();
        }
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        TokenResponse tokenResponse0 = this.s;
        if(tokenResponse0 != null) {
            bundle0.putByteArray("token_response", bauc.n(tokenResponse0));
        }
        bundle0.putInt("consent_step", this.r);
        ConsentResult consentResult0 = this.t;
        if(consentResult0 != null) {
            bundle0.putParcelable("consent_result", consentResult0);
        }
        Set set0 = this.B;
        if(set0 != null) {
            bundle0.putParcelableArray("SIGN_IN_SCOPE_ARRAY", ((Parcelable[])set0.toArray(new Scope[0])));
        }
        bundle0.putBundle("sign_in_options", this.v.a());
    }

    public static void p(Runnable runnable0) {
        if(hyer.a.b().a()) {
            runnable0.run();
        }
    }

    private final void q() {
        if(this.z) {
            ConsentChimeraActivity.p(new eprq());
            return;
        }
        if(this.getSupportFragmentManager().h("loading_interstitial") == null) {
            ConsentChimeraActivity.p(new eprr());
            eprw eprw0 = new eprw();
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.z(0x1020002, eprw0, "loading_interstitial");
            ca0.a();
            return;
        }
        ConsentChimeraActivity.p(new epqe());
    }
}

