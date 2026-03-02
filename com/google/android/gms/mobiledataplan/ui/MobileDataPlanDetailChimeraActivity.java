package com.google.android.gms.mobiledataplan.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.Button;
import batl;
import bauc;
import bbcu;
import bbdg;
import bboh;
import ca;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import crxn;
import crxu;
import crzx;
import crzy;
import crzz;
import csaa;
import csab;
import csac;
import csae;
import csar;
import cscb;
import cscg;
import csci;
import cscn;
import cscs;
import cscu;
import csdp;
import csdq;
import csdr;
import csds;
import csdt;
import csdx;
import csdy;
import csea;
import cseb;
import csec;
import csfl;
import csgn;
import csld;
import csle;
import cslk;
import cslm;
import du;
import ggtj;
import hgks;
import hgku;
import hgkw;
import hhct;
import hvjk;
import hvkk;
import hvko;
import hvlq;
import hvly;
import im;
import j..util.Objects;
import j..util.Optional;
import jwe;
import jys;
import kex;
import lso;
import qhr;
import qhx;
import qhz;
import xni;
import xob;

@GmsCoreVeId(260990)
public class MobileDataPlanDetailChimeraActivity extends xni {
    public static final bboh j;
    @Deprecated
    public Button k;
    @Deprecated
    public Button l;
    @Deprecated
    public ConsentWebView m;
    public boolean n;
    public csld o;
    public int p;
    public cscg q;
    public cscs r;
    @Deprecated
    private ConsentAgreementText s;
    @Deprecated
    private boolean t;
    private final csle u;

    static {
        MobileDataPlanDetailChimeraActivity.j = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public MobileDataPlanDetailChimeraActivity() {
        this.t = true;
        this.n = false;
        this.u = new csle();
        this.p = 0;
    }

    public static void a(du du0, xob xob0) {
        xob0.getOnBackPressedDispatcher().c(du0, new csea(xob0));
    }

    public static void g(du du0, xob xob0) {
        xob0.getOnBackPressedDispatcher().c(du0, new csec(xob0));
    }

    public static void l(xob xob0, Bundle bundle0, String s) {
        qhr qhr0 = (qhr)Optional.of(Integer.valueOf(bundle0.getInt("success_action"))).map(new csdx()).orElse(qhr.a);
        Optional optional0 = Optional.ofNullable(bundle0.getString("success_action_url"));
        Optional optional1 = Optional.ofNullable(bundle0.getString("success_action_playstore_id"));
        crxn crxn0 = crxn.c();
        Optional optional2 = csld.c(bundle0, "plan_segment_id");
        Optional optional3 = csld.c(bundle0, "plan_subsegment_id");
        long v = bundle0.getLong("esim_carrier_id");
        crxn0.r(hhct.er, s, optional2, optional3, v);
        try {
            switch(qhr0.ordinal()) {
                case 1: {
                    MobileDataPlanDetailChimeraActivity.q(xob0);
                    return;
                }
                case 2: {
                    break;
                }
                case 3: {
                    if(optional1.isPresent()) {
                        xob0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", ((String)optional1.get())).build()));
                        xob0.finishAffinity();
                        return;
                    }
                    break;
                }
                default: {
                    ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("No success action available for eSIM flow!");
                    xob0.finishAffinity();
                    return;
                }
            }
            if(optional0.isEmpty()) {
                ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("No success URL available for eSIM flow!");
                return;
            }
            xob0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String)optional0.get()))));
            xob0.finishAffinity();
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            a.ae(MobileDataPlanDetailChimeraActivity.j.j(), "Failed to perform eSIM success action!", activityNotFoundException0);
        }
    }

    public static void m(du du0, xob xob0, Bundle bundle0) {
        xob0.getOnBackPressedDispatcher().c(du0, new cseb(xob0, bundle0));
    }

    public final void n(boolean z) {
        if(TextUtils.isEmpty(this.s.d)) {
            this.k.setText(0x7F150962);  // string:consent_agree_button_text "I agree"
        }
        else {
            this.k.setText(this.s.d);
        }
        this.k.setOnClickListener(new csdt(this));
        boolean z1 = z || this.m.canScrollVertically(-1) && this.t;
        crxn.c().Q((z1 ? 49 : 0x30), this.k.getText().toString(), csgn.f(this.m), (z1 ? hhct.cj : hhct.ci), System.currentTimeMillis(), Integer.valueOf(this.p));
    }

    public final void o(boolean z) {
        this.setResult((z ? -1 : 0));
        this.finish();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.pV);
        super.onCreate(bundle0);
        if(hvlq.a.d().z() && jys.d()) {
            kex.b(this.getWindow().getDecorView(), new cslk());
        }
        if(hvly.f()) {
            this.setContentView(0x7F0E02D3);  // layout:detail_activity
            if(bundle0 != null) {
                return;
            }
            if(Objects.equals(this.getIntent().getAction(), "com.google.android.gms.mobiledataplan.ui.SETTINGS") || Objects.equals(this.getIntent().getAction(), "com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY")) {
                this.o = (csld)new lso(this, this.u).a(csld.class);
                csfl csfl0 = new csfl();
                csfl0.b = this;
                csfl0.c = this.getIntent();
                csfl0.ag = csfl0.c.getIntExtra("EventFlowId", crxn.a());
                ca ca1 = new ca(this.getSupportFragmentManager());
                ca1.t(0x7F0B0FCE, csfl0);  // id:container
                ca1.a();
            }
            else if(hvlq.m() && Objects.equals(this.getIntent().getAction(), "com.google.android.gms.mobiledataplan.ui.ESIM")) {
                this.o = (csld)new lso(this, this.u).a(csld.class);
                this.p();
            }
            else {
                csdp csdp0 = new csdp(this, this.getIntent());
                ca ca0 = new ca(this.getSupportFragmentManager());
                ca0.t(0x7F0B0FCE, csdp0);  // id:container
                ca0.a();
            }
            new crxu().l();
            return;
        }
        if(hvkk.e()) {
            this.p = this.getIntent().getIntExtra("EventFlowId", crxn.a());
        }
        if(hvjk.a.e().j()) {
            Intent intent0 = this.getIntent();
            String s = intent0 == null ? null : intent0.getStringExtra("ComeFrom");
            if(s == null) {
                ComponentName componentName0 = this.getCallingActivity();
                if(componentName0 == null) {
                    Uri uri0 = this.getReferrer();
                    if(uri0 != null) {
                        s = uri0.toString();
                    }
                }
                else {
                    s = componentName0.flattenToString();
                }
                crxn.c().Q(39, s, "R.layout.consent_activity", hhct.bn, System.currentTimeMillis(), Integer.valueOf(this.p));
            }
            else if(s.equals("com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity")) {
                crxn.c().Q(38, s, "R.layout.consent_activity", hhct.bm, System.currentTimeMillis(), Integer.valueOf(this.p));
            }
            else {
                crxn.c().Q(39, s, "R.layout.consent_activity", hhct.bn, System.currentTimeMillis(), Integer.valueOf(this.p));
            }
        }
        this.setContentView(0x7F0E0238);  // layout:consent_fragment
        this.hL().h();
        this.k = (Button)this.findViewById(0x7F0B0B6E);  // id:agree_button
        this.l = (Button)this.findViewById(0x7F0B10BD);  // id:decline_button
        this.m = (ConsentWebView)this.findViewById(0x7F0B0FA3);  // id:consent_html_view
        ConsentAgreementText consentAgreementText0 = (ConsentAgreementText)bauc.b(this.getIntent(), "AgreementText", ConsentAgreementText.CREATOR);
        this.s = consentAgreementText0;
        if(consentAgreementText0 == null) {
            ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("MobileDataPlanDetailChimeraActivity receives null consent agreement text");
            this.setResult(0);
            this.finish();
        }
        this.m.b(this.s);
        ConsentWebView consentWebView0 = this.m;
        consentWebView0.b = new csdy(this);
        if(TextUtils.isEmpty(this.s.f)) {
            this.t = false;
            this.n(false);
        }
        else {
            this.k.setText(this.s.f);
            this.k.setOnClickListener(new csdq(this));
        }
        if(!TextUtils.isEmpty(this.s.e)) {
            this.l.setText(this.s.e);
        }
        this.l.setOnClickListener(new csdr(this));
    }

    @Override  // xni
    public final void onDestroy() {
        ((ggtj)MobileDataPlanDetailChimeraActivity.j.h()).x("MobileDataPlanDetailChimeraActivity Destroy eSIM ");
        super.onDestroy();
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        hhct hhct0;
        super.onNewIntent(intent0);
        bboh bboh0 = MobileDataPlanDetailChimeraActivity.j;
        ((ggtj)bboh0.h()).B("MobileDataPlanDetailChimeraActivity received new intent %s", intent0.getAction());
        if(hvlq.m()) {
            try {
                String s = intent0.getAction();
                batl.s(s);
                switch(s.hashCode()) {
                    case 0xBA12D0EA: {
                        if(s.equals("android.intent.action.VIEW")) {
                            ((ggtj)bboh0.h()).x("MobileDataPlanDetailChimeraActivity resumed eSIM from deep link");
                            ((ggtj)bboh0.h()).x("Resuming eSIM");
                            Bundle bundle0 = this.o.a();
                            try {
                                Uri uri0 = intent0.getData();
                                batl.s(uri0);
                                if(uri0.getQueryParameter("cancel") != null) {
                                    ((ggtj)bboh0.h()).x("Account creation canceled in eSIM flow");
                                    MobileDataPlanDetailChimeraActivity.r(this, bundle0);
                                    return;
                                }
                                this.o.l(hhct.el);
                                String s1 = uri0.getQueryParameter("name");
                                batl.s(s1);
                                String s2 = uri0.getQueryParameter("email");
                                batl.s(s2);
                                String s3 = uri0.getQueryParameter("addressLine1");
                                batl.s(s3);
                                String s4 = uri0.getQueryParameter("addressLine3");
                                batl.s(s4);
                                String s5 = uri0.getQueryParameter("addressLine4");
                                batl.s(s5);
                                String s6 = uri0.getQueryParameter("phoneNumber");
                                batl.s(s6);
                                String s7 = uri0.getQueryParameter("credential");
                                batl.s(s7);
                                bundle0.putString("esim_name", s1);
                                bundle0.putString("esim_email", s2);
                                bundle0.putString("esim_address_line_1", s3);
                                bundle0.putString("esim_address_line_3", s4);
                                bundle0.putString("esim_address_line_4", s5);
                                bundle0.putString("esim_phone_number", s6);
                                bundle0.putString("ESIM_CREDENTIAL_TOKEN", s7);
                                String s8 = uri0.getQueryParameter("addressLine2");
                                if(s8 != null) {
                                    bundle0.putString("esim_address_line_2", s8);
                                }
                            }
                            catch(NullPointerException nullPointerException1) {
                                a.ae(MobileDataPlanDetailChimeraActivity.j.j(), "Missing fields when resuming eSIM flow", nullPointerException1);
                                cscb.B(this, bundle0, hhct.dx, this.o.b);
                                return;
                            }
                            this.o.o(bundle0);
                            cscn cscn0 = new cscn();
                            ca ca0 = new ca(this.getSupportFragmentManager());
                            ca0.C();
                            ca0.z(0x7F0B0FCE, cscn0, "EsimLoadingFragment");  // id:container
                            ca0.w(null);
                            ca0.a();
                            this.getSupportFragmentManager().aq();
                            return;
                        }
                        break;
                    }
                    case 0xDAEC5550: {
                        if(s.equals("ESIM_CODE_NOTIFICATION")) {
                            ((ggtj)bboh0.h()).x("MobileDataPlanDetailChimeraActivity continued eSIM with activation code status");
                            cscn cscn1 = (cscn)this.getSupportFragmentManager().h("EsimLoadingFragment");
                            Bundle bundle1 = intent0.getExtras();
                            batl.s(bundle1);
                            cscn1.ag.putInt("ESIM_CODE_NOTIFICATION", bundle1.getInt("NOTIFICATION_LOGGING_NOTIFICATION_ID"));
                            hgkw hgkw0 = (hgkw)bundle1.getSerializable("ESIM_CODE_NOTIFICATION");
                            if(hgkw0 == null) {
                                hgkw0 = hgkw.a;
                            }
                            switch(hgkw0.ordinal()) {
                                case 1: {
                                    ((ggtj)cscn.a.h()).x("Successfully created activation code for eSIM");
                                    cscn1.c.j(hhct.dS, 0L);
                                    csar csar0 = cscn1.c.r(true);
                                    String s9 = cscn1.c.b;
                                    Optional optional0 = Optional.ofNullable(cscn1.ag.getBundle("esim_entry_tags"));
                                    csci csci0 = new csci(cscn1);
                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)qhz.a).v_newBuilder();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    qhz qhz0 = (qhz)hftp0.b_message;
                                    s9.getClass();
                                    qhz0.b = s9;
                                    Optional optional1 = optional0.map(new crzz());
                                    Objects.requireNonNull(hftp0);
                                    optional1.ifPresent(new csaa(hftp0));
                                    Optional optional2 = optional0.map(new csab());
                                    Objects.requireNonNull(hftp0);
                                    optional2.ifPresent(new csac(hftp0));
                                    csae csae0 = new csae(csar0, hftp0, csci0);
                                    csar0.b.execute(csae0);
                                    return;
                                }
                                case 2: {
                                    bboh bboh1 = cscn.a;
                                    ((ggtj)bboh1.j()).x("Failed to create activation code for eSIM");
                                    hgks hgks0 = (hgks)bundle1.getSerializable("ESIM_CODE_REASON");
                                    if(hgks0 == null) {
                                        hgks0 = hgks.a;
                                    }
                                    switch(hgks0.ordinal()) {
                                        case 1: {
                                            hhct0 = hhct.dF;
                                            break;
                                        }
                                        case 2: 
                                        case 3: 
                                        case 4: 
                                        case 5: {
                                            hhct0 = hhct.dA;
                                            break;
                                        }
                                        case 6: {
                                            hhct0 = hhct.dB;
                                            break;
                                        }
                                        case 7: {
                                            hhct0 = hhct.dH;
                                            break;
                                        }
                                        default: {
                                            ((ggtj)bboh1.j()).x("Error getting eSIM download error reason.");
                                            hhct0 = hvlq.n() ? hhct.dB : hhct.dx;
                                        }
                                    }
                                    cscn1.z(hhct0);
                                    return;
                                }
                                case 3: {
                                    ((ggtj)cscn.a.j()).x("eSIM account exists. Failed to create code.");
                                    cscn1.z(hhct.dz);
                                    return;
                                }
                                default: {
                                    ((ggtj)cscn.a.j()).B("Error receiving eSIM activation code status %s.", hgkw0.name());
                                    cscn1.z(hhct.dx);
                                    return;
                                }
                            }
                        }
                        break;
                    }
                    case 775407018: {
                        if(s.equals("ESIM_ACCOUNT_NOTIFICATION")) {
                            ((ggtj)bboh0.h()).x("MobileDataPlanDetailChimeraActivity continued eSIM with account status");
                            cscn cscn2 = (cscn)this.getSupportFragmentManager().h("EsimLoadingFragment");
                            Bundle bundle2 = intent0.getExtras();
                            batl.s(bundle2);
                            cscn2.ag.putInt("ESIM_ACCOUNT_NOTIFICATION", bundle2.getInt("NOTIFICATION_LOGGING_NOTIFICATION_ID"));
                            hgku hgku0 = (hgku)bundle2.getSerializable("ESIM_ACCOUNT_NOTIFICATION");
                            if(hgku0 == null) {
                                hgku0 = hgku.a;
                            }
                            switch(hgku0.ordinal()) {
                                case 1: {
                                    break;
                                }
                                case 2: {
                                    ((ggtj)cscn.a.j()).x("Failed to create account for eSIM");
                                    cscn2.z(hhct.dA);
                                    return;
                                }
                                case 3: {
                                    ((ggtj)cscn.a.h()).x("eSIM account exists. Continuing.");
                                    break;
                                }
                                default: {
                                    ((ggtj)cscn.a.j()).x("Error receiving eSIM account status.");
                                    cscn2.z(hhct.dx);
                                    return;
                                }
                            }
                            cscn2.A();
                            return;
                        }
                        break;
                    }
                }
            }
            catch(NullPointerException nullPointerException0) {
                a.ae(MobileDataPlanDetailChimeraActivity.j.j(), "No intent action or invalid fragment", nullPointerException0);
                csld csld0 = this.o;
                cscb.B(this, (csld0 == null ? new Bundle() : csld0.a()), hhct.dx, this.o.b);
            }
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if(z) {
            crxn.c().Q(43, "consentActivity", null, hhct.br, System.currentTimeMillis(), Integer.valueOf(this.p));
        }
    }

    public final void p() {
        if(!hvlq.m()) {
            return;
        }
        im im0 = this.hL();
        if(im0 != null) {
            im0.s(false);
        }
        this.setTheme(0x7F160D1A);  // style:Theme.MobileDataPlan.DefaultGoogleMaterial
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.G(0x7F0B0FCE, new cscu());  // id:container
        ca0.a();
        this.getSupportFragmentManager().aq();
        try {
            Bundle bundle0 = this.getIntent().getExtras();
            batl.s(bundle0);
            this.q = new cscg();
            String s = bundle0.getString("ESIM_SESSION_ID");
            batl.s(s);
            String s1 = bundle0.getString("ESIM_SERVICE_HOST");
            batl.s(s1);
            long v = bundle0.getLong("esim_carrier_id");
            batl.w(v);
            Optional optional0 = Optional.ofNullable(bundle0.getBundle("esim_entry_tags"));
            this.o.h(s, s1, bundle0);
            this.o.j(hhct.dP, 0L);
            csar csar0 = this.o.r(false);
            String s2 = cslm.g(this).toLanguageTag();
            csds csds0 = new csds(this, bundle0);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)qhx.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((qhx)hftv0).b = v;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((qhx)hftv1).d = s;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            qhx qhx0 = (qhx)hftp0.b_message;
            s2.getClass();
            qhx0.c = s2;
            if(optional0.isPresent()) {
                for(Object object0: ((Bundle)optional0.get()).keySet()) {
                    Optional.ofNullable(((Bundle)optional0.get()).getString(((String)object0))).ifPresent(new crzx(hftp0, ((String)object0)));
                }
            }
            crzy crzy0 = new crzy(csar0, hftp0, csds0);
            csar0.b.execute(crzy0);
        }
        catch(NullPointerException | IllegalArgumentException exception0) {
            a.ae(MobileDataPlanDetailChimeraActivity.j.j(), "No session id or carrier id passed into eSIM flow", exception0);
            cscb.B(this, new Bundle(), hhct.dD, this.o.b);
        }
    }

    public static void q(xob xob0) {
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            ((ggtj)MobileDataPlanDetailChimeraActivity.j.j()).x("eSIM tried to return to main UI on a different thread.");
            return;
        }
        Intent intent0 = new Intent("com.google.android.gms.mobiledataplan.ui.SETTING");
        intent0.addFlags(0x14008000);
        intent0.setClassName(xob0, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
        if(hvko.Q()) {
            ((ggtj)MobileDataPlanDetailChimeraActivity.j.h()).x("eSIM returning to main UI.");
            xob0.startActivity(intent0);
            xob0.finishAffinity();
            return;
        }
        jwe.b(xob0, new MobileDataPlanDetailChimeraActivity.2(xob0, xob0), new IntentFilter("com.google.android.gms.phenotype.COMMITTED"), 4);
        cscu cscu0 = new cscu();
        Bundle bundle0 = new Bundle();
        bundle0.putString("ui_option_key", "start_mpd");
        cscu0.setArguments(bundle0);
        ca ca0 = new ca(xob0.getSupportFragmentManager());
        ca0.G(0x7F0B0FCE, cscu0);  // id:container
        ca0.a();
        xob0.getSupportFragmentManager().aq();
    }

    public static void r(xob xob0, Bundle bundle0) {
        xob0.getSupportFragmentManager().ax(null, 1);
        if(bundle0.getBoolean("COMBINED_PLAN_OFFERS_PAGE")) {
            cscs cscs0 = new cscs();
            ca ca0 = new ca(xob0.getSupportFragmentManager());
            ca0.G(0x7F0B0FCE, cscs0);  // id:container
            ca0.a();
            return;
        }
        cscg cscg0 = new cscg();
        ca ca1 = new ca(xob0.getSupportFragmentManager());
        ca1.C();
        ca1.G(0x7F0B0FCE, cscg0);  // id:container
        ca1.f();
    }
}

