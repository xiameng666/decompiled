package com.google.android.gms.family.v2.create;

import ByteString;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import acqi;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseIntArray;
import avyq;
import azql;
import bbdg;
import bbmq;
import bbqr;
import bkcy;
import bkda;
import bkde;
import bkdf;
import bkdi;
import bkdl;
import bkdr;
import bkdt;
import bkeu;
import bkhv;
import bkhw;
import bkic;
import bkid;
import bkig;
import bkih;
import bkii;
import bkil;
import bkio;
import bkir;
import bkiu;
import bkiy;
import bkjb;
import bkje;
import bkjh;
import bkjm;
import bkju;
import bkjv;
import bkjx;
import bkjy;
import bkkf;
import bkkg;
import bkld;
import bkle;
import bkll;
import bklm;
import bklo;
import bklp;
import bkpy;
import bkpz;
import bkqb;
import bkqc;
import ca;
import cchj;
import cchl;
import ccmq;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.family.v2.model.BillingSignupData;
import com.google.android.gms.family.v2.model.BirthdayData;
import com.google.android.gms.family.v2.model.CanCreateFamilyData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import com.google.android.gms.family.v2.model.ProfileData;
import com.google.android.gms.family.v2.model.SetupParams;
import com.google.android.gms.family.v2.model.UpgradeParams;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import de;
import dknn;
import dkwv;
import du;
import fbjf;
import fm;
import fz;
import gftb;
import ggfp;
import ggoh;
import goer;
import goet;
import gogp;
import gqwv;
import gqww;
import gqwz;
import gqxa;
import grkh;
import gvfk;
import gvfm;
import gvfn;
import hftc;
import hfur;
import hgfj;
import hsig;
import hsir;
import hsiv;
import java.util.ArrayList;
import java.util.Calendar;
import lup;
import xni;

@GmsCoreVeId(0x3F3AC)
public final class FamilyCreationChimeraActivity extends xni implements bkdl, bkhv, bkic, bkju, bkjx, bkkf, bkld, bkll, bklo, bkpy, bkqb {
    public bkeu A;
    public bkcy B;
    public int C;
    private static final ggfp D;
    private SparseIntArray E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private bkdt J;
    private bkdf K;
    public String j;
    public bkda k;
    public byte[] l;
    public String m;
    public goet n;
    public goet o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public PageDataMap u;
    public UpgradeParams v;
    public SetupParams w;
    public ProfileData x;
    public CanCreateFamilyData y;
    public Calendar z;

    static {
        FamilyCreationChimeraActivity.D = new ggoh("yt-tandem");
    }

    public FamilyCreationChimeraActivity() {
        this.n = goet.a;
        this.o = goet.a;
        this.C = 1;
    }

    public final void A(int v) {
        this.E.delete(v);
    }

    public final void B(int v) {
        this.E.put(v, 1);
    }

    @Override  // bkld, bkll
    public final void C(boolean z) {
        this.I = z;
    }

    public final void D() {
        bkid bkid0;
        if(this.x != null && this.x.f != null) {
            String s = this.j;
            gftb.check(s);
            PageDataMap pageDataMap0 = this.u;
            gftb.check(pageDataMap0);
            PageData pageData0 = pageDataMap0.a(3);
            PageDataMap pageDataMap1 = this.u;
            gftb.check(pageDataMap1);
            PageData pageData1 = pageDataMap1.a(14);
            ProfileData profileData0 = this.x;
            gftb.check(profileData0);
            BirthdayData birthdayData0 = profileData0.f;
            bkid0 = new bkid();
            Bundle bundle0 = new Bundle(4);
            bundle0.putString("accountName", s);
            bundle0.putParcelable("birthdayPageData", pageData0);
            bundle0.putParcelable("confirmPageData", pageData1);
            bundle0.putParcelable("birthday", birthdayData0);
            bkid0.setArguments(bundle0);
        }
        else {
            String s1 = this.j;
            gftb.check(s1);
            PageDataMap pageDataMap2 = this.u;
            gftb.check(pageDataMap2);
            PageData pageData2 = pageDataMap2.a(3);
            PageDataMap pageDataMap3 = this.u;
            gftb.check(pageDataMap3);
            PageData pageData3 = pageDataMap3.a(14);
            bkid0 = new bkid();
            Bundle bundle1 = new Bundle(3);
            bundle1.putString("accountName", s1);
            bundle1.putParcelable("birthdayPageData", pageData2);
            bundle1.putParcelable("confirmPageData", pageData3);
            bkid0.setArguments(bundle1);
        }
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.v(bkid0, "birthdayDialog");
        ca0.b();
    }

    @Override  // bkqb
    public final void E(PageData pageData0) {
        String s = this.j;
        gftb.check(s);
        bkde.a(this, pageData0, s, new bkih(this), null, false).show();
        this.Q();
    }

    public final void F() {
        BillingSignupData billingSignupData0;
        WalletCustomTheme walletCustomTheme0;
        int v;
        String s = this.getIntent().getStringExtra("predefinedTheme");
        if(TextUtils.isEmpty(s)) {
            v = 0;
        }
        else if(s.equals("play")) {
            v = 0x7F160D2A;  // style:Theme.Play
        }
        else if(s.equals("music")) {
            v = 0x7F160D2E;  // style:Theme.PlayMusic
        }
        else if(s.equals("youtube")) {
            v = -1;
        }
        else {
            v = 0;
        }
        if(v == 0) {
            v = 0x7F160C2C;  // style:Theme.FamilyManagement.Wallet
        }
        if(v == -1) {
            walletCustomTheme0 = null;
        }
        else {
            walletCustomTheme0 = new WalletCustomTheme();
            walletCustomTheme0.g(avyq.a(this, v));
        }
        gftb.check(walletCustomTheme0);
        int v1 = hsig.k() ^ 1;
        fbjf fbjf0 = new fbjf(this);
        if(this.F) {
            UpgradeParams upgradeParams0 = this.v;
            gftb.check(upgradeParams0);
            billingSignupData0 = upgradeParams0.a;
        }
        else {
            SetupParams setupParams0 = this.w;
            gftb.check(setupParams0);
            billingSignupData0 = setupParams0.a;
        }
        gftb.check(billingSignupData0.a);
        fbjf0.h(Base64.decode(billingSignupData0.a, 0));
        String s1 = this.j;
        gftb.check(s1);
        fbjf0.c(new Account(s1, "com.google"));
        fbjf0.e(v1);
        fbjf0.d(walletCustomTheme0);
        this.A.i(6);
        this.startActivityForResult(fbjf0.a(), 1);
    }

    public final void G() {
        this.V();
        this.getSupportLoaderManager().c(8, null, new bkio(this));
    }

    @Override  // bkqb
    public final void H(boolean z) {
        this.Q();
        this.V();
        this.getSupportLoaderManager().c(1, null, new bkje(this, z));
    }

    public final boolean I() {
        return this.getSupportFragmentManager().g(0x7F0B143B) != null;  // id:fm_family_creation_fragment_container
    }

    @Override  // bkkf, bkju
    public final boolean J() {
        return this.G;
    }

    public final boolean K() {
        this.q();
        fm fm0 = this.getSupportFragmentManager();
        if(this.u != null && this.u.c(1)) {
            ca ca0 = new ca(fm0);
            String s = this.j;
            gftb.check(s);
            PageDataMap pageDataMap0 = this.u;
            gftb.check(pageDataMap0);
            PageData pageData0 = pageDataMap0.a(1);
            bkhw bkhw0 = new bkhw();
            Bundle bundle0 = new Bundle(2);
            bundle0.putString("accountName", s);
            bundle0.putParcelable("pageData", pageData0);
            bkhw0.setArguments(bundle0);
            ca0.t(0x7F0B143B, bkhw0);  // id:fm_family_creation_fragment_container
            ca0.b();
            return true;
        }
        if(this.u != null && this.u.c(37)) {
            ca ca1 = new ca(fm0);
            byte[] arr_b = this.l;
            String s1 = this.j;
            gftb.check(s1);
            PageDataMap pageDataMap1 = this.u;
            gftb.check(pageDataMap1);
            PageData pageData1 = pageDataMap1.a(37);
            bkle bkle0 = new bkle();
            Bundle bundle1 = new Bundle(4);
            bundle1.putByteArray("auditToken", arr_b);
            bundle1.putString("accountName", s1);
            bundle1.putParcelable("pageData", pageData1);
            bkle0.setArguments(bundle1);
            ca1.t(0x7F0B143B, bkle0);  // id:fm_family_creation_fragment_container
            ca1.b();
            return true;
        }
        if(this.u != null && this.u.c(2)) {
            ca ca2 = new ca(fm0);
            byte[] arr_b1 = this.l;
            String s2 = this.j;
            gftb.check(s2);
            PageDataMap pageDataMap2 = this.u;
            gftb.check(pageDataMap2);
            PageData pageData2 = pageDataMap2.a(2);
            ProfileData profileData0 = this.x;
            gftb.check(profileData0);
            ca2.t(0x7F0B143B, bklm.y(arr_b1, s2, pageData2, profileData0));  // id:fm_family_creation_fragment_container
            ca2.b();
            return true;
        }
        if(this.u != null && this.u.c(22)) {
            ca ca3 = new ca(fm0);
            String s3 = this.j;
            gftb.check(s3);
            PageDataMap pageDataMap3 = this.u;
            gftb.check(pageDataMap3);
            PageData pageData3 = pageDataMap3.a(22);
            PageDataMap pageDataMap4 = this.u;
            gftb.check(pageDataMap4);
            PageData pageData4 = pageDataMap4.a(18);
            PageDataMap pageDataMap5 = this.u;
            gftb.check(pageDataMap5);
            ca3.t(0x7F0B143B, bkjv.y(s3, pageData3, pageData4, pageDataMap5.a(19)));  // id:fm_family_creation_fragment_container
            ca3.b();
            return true;
        }
        if(this.u != null && this.u.c(16)) {
            ca ca4 = new ca(fm0);
            String s4 = this.j;
            gftb.check(s4);
            PageDataMap pageDataMap6 = this.u;
            gftb.check(pageDataMap6);
            PageData pageData5 = pageDataMap6.a(16);
            PageDataMap pageDataMap7 = this.u;
            gftb.check(pageDataMap7);
            PageData pageData6 = pageDataMap7.a(18);
            PageDataMap pageDataMap8 = this.u;
            gftb.check(pageDataMap8);
            ca4.t(0x7F0B143B, bkkg.y(s4, pageData5, pageData6, pageDataMap8.a(19)));  // id:fm_family_creation_fragment_container
            ca4.b();
            return true;
        }
        return false;
    }

    public static void L(FamilyCreationChimeraActivity familyCreationChimeraActivity0) {
        familyCreationChimeraActivity0.H = true;
    }

    public final void M(int v) {
        this.setResult(4, new Intent().putExtra("accountName", this.j).putExtra("errorCode", v));
        this.finish();
    }

    private final Intent N() {
        Intent intent0 = new Intent().putExtra("accountName", this.j);
        intent0.putExtra("familyChanged", this.H);
        this.k.b();
        if(!this.k.b().isEmpty()) {
            intent0.putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a());
        }
        return intent0;
    }

    private final fz O() {
        if(this.u != null && this.u.c(4)) {
            fz fz0 = new ca(this.getSupportFragmentManager());
            String s = this.j;
            gftb.check(s);
            PageDataMap pageDataMap0 = this.u;
            gftb.check(pageDataMap0);
            PageData pageData0 = pageDataMap0.a(4);
            bkjy bkjy0 = new bkjy();
            Bundle bundle0 = new Bundle(2);
            bundle0.putString("accountName", s);
            bundle0.putParcelable("pageData", pageData0);
            bkjy0.setArguments(bundle0);
            fz0.G(0x7F0B143B, bkjy0);  // id:fm_family_creation_fragment_container
            fz0.w(null);
            return fz0;
        }
        if(this.u != null && this.u.c(22)) {
            fz fz1 = new ca(this.getSupportFragmentManager());
            String s1 = this.j;
            gftb.check(s1);
            PageDataMap pageDataMap1 = this.u;
            gftb.check(pageDataMap1);
            PageData pageData1 = pageDataMap1.a(22);
            PageDataMap pageDataMap2 = this.u;
            gftb.check(pageDataMap2);
            PageData pageData2 = pageDataMap2.a(18);
            PageDataMap pageDataMap3 = this.u;
            gftb.check(pageDataMap3);
            fz1.G(0x7F0B143B, bkjv.y(s1, pageData1, pageData2, pageDataMap3.a(19)));  // id:fm_family_creation_fragment_container
            fz1.w(null);
            return fz1;
        }
        if(this.u != null && this.u.c(16)) {
            fz fz2 = new ca(this.getSupportFragmentManager());
            String s2 = this.j;
            gftb.check(s2);
            PageDataMap pageDataMap4 = this.u;
            gftb.check(pageDataMap4);
            PageData pageData3 = pageDataMap4.a(16);
            PageDataMap pageDataMap5 = this.u;
            gftb.check(pageDataMap5);
            PageData pageData4 = pageDataMap5.a(18);
            PageDataMap pageDataMap6 = this.u;
            gftb.check(pageDataMap6);
            fz2.G(0x7F0B143B, bkkg.y(s2, pageData3, pageData4, pageDataMap6.a(19)));  // id:fm_family_creation_fragment_container
            fz2.w(null);
            return fz2;
        }
        return null;
    }

    private final void P() {
        this.V();
        lup.a(this).d(0, null, new bkir(this));
    }

    private final void Q() {
        de de0 = (de)this.getSupportFragmentManager().h("upgrade-preconditions");
        if(de0 != null) {
            de0.dismissAllowingStateLoss();
        }
        this.getWindow().clearFlags(0x2000);
    }

    private final void R() {
        if(this.I()) {
            this.q();
        }
        CanCreateFamilyData canCreateFamilyData0 = this.y;
        if(canCreateFamilyData0 != null && (canCreateFamilyData0.b != null && canCreateFamilyData0.b.length > 0 && canCreateFamilyData0.b[0] == gogp.c)) {
            this.D();
            return;
        }
        gftb.check(canCreateFamilyData0);
        PageData pageData0 = canCreateFamilyData0.c;
        String s = this.j;
        gftb.check(s);
        bkde.a(this, pageData0, s, new bkig(this), null, false).show();
    }

    private final void S() {
        lup lup0 = lup.a(this);
        PageDataMap pageDataMap0 = this.u;
        gftb.check(pageDataMap0);
        if(pageDataMap0.c(35)) {
            this.A.i(30);
            this.t = false;
            this.I = true;
            lup0.e(0);
            lup0.e(1);
            lup0.e(2);
            lup0.e(3);
            lup0.e(4);
            lup0.e(5);
            lup0.e(6);
            lup0.e(7);
            this.u();
            return;
        }
        this.q();
        if(this.s) {
            this.V();
            lup0.d(6, null, new bkiy(this));
        }
    }

    private final void T() {
        bkde.c(this, new bkii(this), (/* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */) -> {
            this.A.i(0x20);
            this.setResult(3, this.N());
            this.finish();
        }).show();
    }

    private final void U() {
        this.V();
        lup.a(this).d(3, null, new bkjm(this));
    }

    private final void V() {
        this.findViewById(0x7F0B143C).setVisibility(0);  // id:fm_family_creation_loading_screen
    }

    private final boolean W() {
        return this.getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    private static final int X(boolean z, int v) {
        return z ? v : 3;
    }

    @Override  // bkhv
    public final void b() {
        byte[] arr_b = this.l;
        String s = this.j;
        gftb.check(s);
        PageDataMap pageDataMap0 = this.u;
        gftb.check(pageDataMap0);
        PageData pageData0 = pageDataMap0.a(2);
        ProfileData profileData0 = this.x;
        gftb.check(profileData0);
        bklm bklm0 = bklm.y(arr_b, s, pageData0, profileData0);
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.G(0x7F0B143B, bklm0);  // id:fm_family_creation_fragment_container
        ca0.w(null);
        ca0.a();
    }

    @Override  // bkic
    public final void c(Calendar calendar0) {
        this.z = calendar0;
        this.U();
    }

    @Override  // bkqb
    public final bkcy g() {
        return this.B;
    }

    @Override  // bkdl
    public final Context getContext() {
        return this;
    }

    @Override  // bkhv, bkld, bkll, bkjx, bkic, bkkf, bkju, bkqb, bklo
    public final bkeu hO() {
        return this.A;
    }

    @Override  // bkqb
    public final bkda l() {
        return this.k;
    }

    public final void m(boolean z) {
        fz fz0 = null;
        if(this.getIntent().hasExtra("tosContent")) {
            byte[] arr_b = this.l;
            String s = this.j;
            gftb.check(s);
            String s1 = this.getIntent().getStringExtra("tosContent");
            gftb.check(s1);
            bkpz bkpz0 = bkpz.y(arr_b, s, s1, this.getIntent().getStringExtra("tosContinueButton"), this.getIntent().getStringExtra("tosMoreButton"));
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.G(0x7F0B143B, bkpz0);  // id:fm_family_creation_fragment_container
            ca0.w(null);
            fz0 = ca0;
        }
        else if(this.r) {
            fz0 = this.O();
        }
        if(fz0 != null) {
            if(z) {
                this.q();
                fz0.b();
                return;
            }
            fz0.a();
            return;
        }
        this.P();
    }

    public final void n() {
        if(this.E.size() == 0) {
            this.F = this.o == goet.b && this.p && this.r;
            lup lup0 = lup.a(this);
            if(!this.F) {
                CanCreateFamilyData canCreateFamilyData0 = this.y;
                if(canCreateFamilyData0 != null && !canCreateFamilyData0.a && (canCreateFamilyData0.b != null && canCreateFamilyData0.b.length > 0 && canCreateFamilyData0.b[0] != gogp.c && canCreateFamilyData0.c == null)) {
                    this.T();
                    return;
                }
                if(this.z != null) {
                    if(canCreateFamilyData0 != null && canCreateFamilyData0.a) {
                        if(this.r) {
                            lup0.c(2, null, new bkjb(this));
                            return;
                        }
                        this.m(true);
                        this.getSupportFragmentManager().aq();
                        this.z = null;
                        return;
                    }
                    this.R();
                    this.z = null;
                    return;
                }
                if(canCreateFamilyData0 != null && canCreateFamilyData0.a) {
                    lup0.c(2, null, new bkjb(this));
                    return;
                }
                PageDataMap pageDataMap0 = this.u;
                gftb.check(pageDataMap0);
                if(!pageDataMap0.c(2)) {
                    this.R();
                    return;
                }
            }
            if(this.u != null && (this.u.c(1) || this.u.c(2) || this.u.c(22) || this.u.c(16))) {
                this.K();
                return;
            }
            this.T();
        }
    }

    @Override  // bkqb
    public final void o() {
        bkde.b(this).show();
        this.Q();
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        int v4;
        int v2 = v1;
        super.onActivityResult(v, v1, intent0);
        switch(v) {
            case 1: {
                if(v2 == -1) {
                    this.A.i(15);
                    this.s = true;
                    this.H = true;
                    this.z();
                    return;
                }
                this.q();
                return;
            }
            case 2: {
                if(v2 == 1) {
                    gftb.check(intent0);
                    if(intent0.getStringExtra("consistencyToken") != null) {
                        this.k.c(this.getIntent().getStringExtra("consistencyToken"), this.getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
                    }
                    gftb.check(intent0);
                    boolean z = intent0.getBooleanExtra("familyChanged", this.H);
                    this.H = z;
                    if(z) {
                        this.setResult(1, this.N());
                        this.A.i(0x1F);
                        this.finish();
                        return;
                    }
                    this.t = false;
                    this.u();
                    return;
                }
                this.S();
                return;
            }
            case 3: {
                this.K.b(this.J.c, v2);
                if(v2 == -1) {
                    bkdt bkdt0 = this.J;
                    gftb.check(intent0);
                    bkdt0.e(intent0);
                    this.setResult(1, this.N());
                    this.finish();
                    return;
                }
                this.S();
                return;
            }
            case 4: {
                if(this.J.f() == 6) {
                    bkdt bkdt1 = this.J;
                    gftb.check(intent0);
                    String s = intent0.getStringExtra("extra.consistencyToken");
                    if(s != null) {
                        bkdt1.d.c(s, 300L);
                    }
                }
                else {
                    bkdt bkdt2 = this.J;
                    gftb.check(intent0);
                    bkdt2.e(intent0);
                }
                bkdf bkdf0 = this.K;
                long v3 = this.J.c;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxa.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gqxa)hftp0.b_message).c = 6;
                ((gqxa)hftp0.b_message).b |= 1;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqww.a).v_newBuilder();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwv.a).v_newBuilder();
                switch(v2) {
                    case -1: {
                        v4 = 2;
                        break;
                    }
                    case 0: {
                        v4 = 3;
                        break;
                    }
                    default: {
                        v4 = 1;
                    }
                }
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((gqwv)hftp2.b_message).c = v4 - 1;
                ((gqwv)hftp2.b_message).b |= 1;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gqww gqww0 = (gqww)hftp1.b_message;
                gqwv gqwv0 = (gqwv)hftp2.N_build();
                gqwv0.getClass();
                gqww0.c = gqwv0;
                gqww0.b |= 2;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gqxa gqxa0 = (gqxa)hftp0.b_message;
                gqww gqww1 = (gqww)hftp1.N_build();
                gqww1.getClass();
                gqxa0.d = gqww1;
                gqxa0.b |= 2;
                bkdf0.a(((gqxa)hftp0.N_build()), v3);
                String s1 = intent0.getStringExtra("result.familywebviewoutcome");
                gvfn gvfn0 = null;
                if(!TextUtils.isEmpty(s1)) {
                    try {
                        byte[] arr_b = Base64.decode(s1, 0);
                        if(arr_b != null) {
                            hftc hftc0 = hftc.a();
                            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gvfn.a), arr_b, 0, arr_b.length, hftc0);
                            ProtoLiteMessage.P_makeImmutable(hftv0);
                            gvfn0 = (gvfn)hftv0;
                        }
                    }
                    catch(hfur | IllegalArgumentException exception0) {
                        bkdt.a.f(a.q(s1, exception0, "exception caught in getDeserializedWebviewState: InvalidProtocolBufferException -- Received unexpected protocol buffer \'", "\'. Details: "), new Object[0]);
                    }
                }
                int v5 = v2 == -1 ? 1 : 3;
                if(gvfn0 == null) {
                    if(this.J.f() == 6) {
                        v5 = FamilyCreationChimeraActivity.X(false, v5);
                    }
                    this.setResult(v5, this.N());
                    this.finish();
                    return;
                }
                this.H = gvfn0.c;
                if(v2 == -1) {
                    int v6 = gvfn0.b;
                    if((v6 & 4) != 0) {
                        switch((gvfm.a(gvfn0.e) == 0 ? 1 : gvfm.a(gvfn0.e)) - 1) {
                            case 1: {
                                this.startActivityForResult(new Intent().setClassName(this, "com.google.android.gms.family.v2.manage.FamilyManagementActivity").putExtra("accountName", this.j).putExtra("appId", this.B.a).putExtra("familyChanged", true).putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a()).putExtra("customTheme", this.getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", bbqr.c(this.getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", bbmq.p(this)), 5);
                                return;
                            }
                            case 2: {
                                int v7 = hsig.k() ? 3 : 1;
                                fbjf fbjf0 = new fbjf(this);
                                fbjf0.h(Base64.decode(gvfn0.f, 0));
                                String s2 = this.j;
                                gftb.check(s2);
                                fbjf0.c(new Account(s2, "com.google"));
                                fbjf0.e(v7);
                                WalletCustomTheme walletCustomTheme0 = new WalletCustomTheme();
                                walletCustomTheme0.g(avyq.a(this, 0x7F160D1C));  // style:Theme.MyAccount.Wallet
                                fbjf0.d(walletCustomTheme0);
                                this.startActivityForResult(fbjf0.a(), 6);
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    if((v6 & 2) == 0) {
                        if(this.J.f() == 6) {
                            v5 = FamilyCreationChimeraActivity.X(this.H, v5);
                        }
                        this.setResult(v5, this.N());
                    }
                    else {
                        int v8 = gvfk.a(gvfn0.d);
                        this.setResult(4, new Intent().putExtra("accountName", this.j).putExtra("errorCode", ((v8 == 0 ? 1 : v8) - 1 == 2 ? -6 : -7)));
                    }
                }
                else {
                    this.setResult(v5, this.N());
                }
                this.finish();
                return;
            }
            case 5: {
                this.setResult(1, this.N());
                this.finish();
                return;
            }
            case 6: {
                if(v2 == -1) {
                    this.H = true;
                    this.setResult(1, this.N());
                    v2 = -1;
                }
                else {
                    this.H = false;
                    this.setResult(4, this.N().putExtra("errorCode", -6));
                }
                bkdf bkdf1 = this.K;
                long v9 = this.J.c;
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqxa.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((gqxa)hftp3.b_message).c = (v2 == -1 ? 8 : 9) - 1;
                ((gqxa)hftp3.b_message).b |= 1;
                bkdf1.a(((gqxa)hftp3.N_build()), v9);
                this.finish();
            }
        }
    }

    @Override  // xnb
    public final void onBackPressed() {
        du du0 = this.getSupportFragmentManager().g(0x7F0B143B);  // id:fm_family_creation_fragment_container
        if(du0 == null) {
            this.t();
            return;
        }
        if((du0 instanceof bklp)) {
            this.setResult(1, this.N());
            this.A.i(0x1F);
            this.finish();
            return;
        }
        super.onBackPressed();
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        goet goet0;
        ccmq.a().a(bbdg.dm);
        super.onCreate(bundle0);
        this.A = new bkeu(this);
        String s = bbmq.p(this);
        if(!azql.c(this).g(s)) {
            this.A.e(3, 8);
            this.M(-3);
            return;
        }
        String s1 = this.getIntent().getStringExtra("accountName");
        this.j = s1;
        if(s1 == null) {
            this.A.e(3, 13);
            this.M(-2);
            return;
        }
        Account[] arr_account = cchj.b(this).p("com.google");
        boolean z = false;
        Account account0 = null;
        for(int v = 0; v < arr_account.length; ++v) {
            Account account1 = arr_account[v];
            if(account1.name.equals(this.j)) {
                account0 = account1;
            }
        }
        if(account0 != null) {
            String s2 = this.getIntent().getStringExtra("appId");
            gftb.check(s2);
            this.B = new bkcy(s2, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
            this.m = this.getIntent().getStringExtra("referencePcid");
            this.k = new bkda();
            if(bundle0 != null && bundle0.getString("consistencyToken") != null) {
                this.k.c(bundle0.getString("consistencyToken"), bundle0.getLong("tokenExpirationTimeSecs", 0L));
            }
            else if(this.getIntent().getStringExtra("consistencyToken") != null) {
                this.k.c(this.getIntent().getStringExtra("consistencyToken"), this.getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
            }
            if(bundle0 != null && bundle0.getByteArray("auditToken") != null) {
                byte[] arr_b = bundle0.getByteArray("auditToken");
                gftb.check(arr_b);
                this.l = arr_b;
            }
            else if(this.getIntent().getByteArrayExtra("auditToken") == null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
                ByteString hfsf0 = ByteString.copyFrom(acqi.a());
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                grkh grkh0 = (grkh)hftp0.b_message;
                grkh0.b |= 1;
                grkh0.c = hfsf0;
                this.l = ((grkh)hftp0.N_build()).toBytesArray();
            }
            else {
                byte[] arr_b1 = this.getIntent().getByteArrayExtra("auditToken");
                gftb.check(arr_b1);
                this.l = arr_b1;
            }
            this.x = bundle0 == null ? null : ((ProfileData)bundle0.getParcelable("profileData"));
            this.y = bundle0 == null ? null : ((CanCreateFamilyData)bundle0.getParcelable("canCreateData"));
            this.w = bundle0 == null ? null : ((SetupParams)bundle0.getParcelable("setupParams"));
            this.v = bundle0 == null ? null : ((UpgradeParams)bundle0.getParcelable("upgradeParams"));
            int v1 = bundle0 == null ? 0 : goer.a(bundle0.getInt("pcidType"));
            if(v1 == 0) {
                v1 = 1;
            }
            this.C = v1;
            this.p = bundle0 != null && bundle0.getBoolean("hasFamily", false);
            this.q = bundle0 != null && bundle0.getBoolean("familyCreated", false);
            this.F = bundle0 != null && bundle0.getBoolean("isUpgradeFlow", false);
            this.t = bundle0 != null && bundle0.getBoolean("inviteOnFinish", false);
            this.G = bundle0 != null && bundle0.getBoolean("walletComplete", false);
            this.s = bundle0 != null && bundle0.getBoolean("fopChanged", false);
            this.r = bundle0 != null && bundle0.getBoolean("fopRequested", false);
            this.I = bundle0 != null && bundle0.getBoolean("skipClicked", false);
            this.u = bundle0 == null ? null : ((PageDataMap)bundle0.getParcelable("pageDataMap"));
            this.z = bundle0 == null ? null : ((Calendar)bundle0.getSerializable("pendingBirthday"));
            if(bundle0 == null) {
                goet0 = goet.a;
            }
            else {
                goet0 = goet.b(bundle0.getInt("inviteeRole"));
                gftb.check(goet0);
            }
            this.n = goet0;
            if(goet0 == null) {
                goet0 = goet.a;
            }
            this.n = goet0;
            if(bundle0 != null && bundle0.getBoolean("familyChanged")) {
                z = true;
            }
            this.H = z;
            bkeu bkeu0 = this.A;
            String s3 = this.j;
            gftb.check(s3);
            bkeu0.d(s3, this.B.b, this.B.a);
            String s4 = this.j;
            gftb.check(s4);
            this.K = new bkdf(this, s4);
            hgfj hgfj0 = hsir.a.b().a();
            String s5 = this.getIntent().getStringExtra("appId");
            gftb.check(s5);
            String s6 = bkdt.d(s5);
            if(!this.W() && hsig.l() && (hgfj0.b.contains(s6) || FamilyCreationChimeraActivity.D.contains(s6))) {
                String s7 = this.j;
                gftb.check(s7);
                bkdt bkdt0 = new bkdt(s7, s6, this.k, s);
                this.J = bkdt0;
                bkdf bkdf0 = this.K;
                int v2 = bkdt0.f();
                int v3 = ModuleManager.get(this).getCurrentModule().moduleVersion;
                long v4 = this.J.c;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqxa.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gqxa)hftp1.b_message).c = 5;
                ((gqxa)hftp1.b_message).b |= 1;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwz.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp2.b_message;
                ((gqwz)hftv0).c = v2 - 2;
                ((gqwz)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp2.b_message;
                ((gqwz)hftv1).b |= 2;
                ((gqwz)hftv1).d = v3;
                if(!hftv1.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((gqwz)hftp2.b_message).e = 1;
                ((gqwz)hftp2.b_message).b |= 4;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gqxa gqxa0 = (gqxa)hftp1.b_message;
                gqwz gqwz0 = (gqwz)hftp2.N_build();
                gqwz0.getClass();
                gqxa0.e = gqwz0;
                gqxa0.b |= 4;
                bkdf0.a(((gqxa)hftp1.N_build()), v4);
                bkdt bkdt1 = this.J;
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)dkwv.a).v_newBuilder();
                bkdr bkdr0 = new bkdr();
                bkdr0.a = hsig.a.d().o();
                bkdr0.b = bkdt1.b();
                bkdr0.c(bkdt1.c);
                bkdr0.b(String.valueOf(bkdt1.f() - 2));
                String s8 = bkdr0.a().a();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp3.b_message;
                s8.getClass();
                ((dkwv)hftv2).b = s8;
                String s9 = bkdt1.b;
                if(!hftv2.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp3.b_message;
                s9.getClass();
                ((dkwv)hftv3).c = s9;
                if(!hftv3.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp3.b_message;
                ((dkwv)hftv4).d = 1;
                if(!hftv4.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((dkwv)hftp3.b_message).e = 1;
                int v5 = cchl.a().d;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((dkwv)hftp3.b_message).f = v5;
                String s10 = bkdt1.c();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((dkwv)hftp3.b_message).g = s10;
                this.startActivityForResult(dknn.a(((dkwv)hftp3.N_build())), 4);
                return;
            }
            bkdi.e(this, this.getIntent(), s);
            this.A.i(2);
            this.setContentView(0x7F0E03BE);  // layout:fm_activity_family_creation_v2
            this.q();
            if(this.z != null) {
                this.U();
                return;
            }
            if(!this.I()) {
                this.V();
                this.E = new SparseIntArray();
                lup lup0 = lup.a(this);
                lup0.c(5, null, new bkjh(this));
                this.B(5);
                lup0.c(7, null, new bkiu(this));
                this.B(7);
                lup0.c(6, null, new bkiy(this));
                this.B(6);
                lup0.c(4, null, new bkil(this));
                this.B(4);
            }
            return;
        }
        this.A.e(3, 14);
        this.M(-2);
    }

    @Override  // xoi
    public final void onPause() {
        super.onPause();
        lup lup0 = lup.a(this);
        lup0.e(0);
        lup0.e(2);
        lup0.e(5);
        lup0.e(7);
        lup0.e(6);
        lup0.e(4);
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putParcelable("profileData", this.x);
        bundle0.putParcelable("canCreateData", this.y);
        bundle0.putParcelable("upgradeParams", this.v);
        bundle0.putParcelable("setupParams", this.w);
        bundle0.putBoolean("hasFamily", this.p);
        bundle0.putBoolean("familyCreated", this.q);
        bundle0.putBoolean("isUpgradeFlow", this.F);
        bundle0.putBoolean("inviteOnFinish", this.t);
        bundle0.putBoolean("walletComplete", this.G);
        bundle0.putBoolean("fopChanged", this.s);
        bundle0.putBoolean("fopRequested", this.r);
        bundle0.putBoolean("skipClicked", this.I);
        bundle0.putParcelable("pageDataMap", this.u);
        bundle0.putInt("inviteeRole", this.n.g);
        int v = this.C - 1;
        if(this.C == 0) {
            throw null;
        }
        bundle0.putInt("pcidType", v);
        Calendar calendar0 = this.z;
        if(calendar0 != null) {
            bundle0.putSerializable("pendingBirthday", calendar0);
        }
        this.k.b();
        if(!this.k.b().isEmpty()) {
            bundle0.putString("consistencyToken", this.k.b());
            bundle0.putLong("tokenExpirationTimeSecs", this.k.a());
        }
        bundle0.putBoolean("familyChanged", this.H);
        bundle0.putByteArray("auditToken", this.l);
    }

    @Override  // bkqb
    public final void p() {
        this.Q();
    }

    public final void q() {
        this.findViewById(0x7F0B143C).setVisibility(8);  // id:fm_family_creation_loading_screen
    }

    @Override  // bkkf, bkju
    public final void r() {
        this.t();
    }

    @Override  // bkjx, bkkf, bkju
    public final void s(boolean z) {
        if(this.G) {
            this.z();
            return;
        }
        if(z) {
            this.G();
            return;
        }
        if(this.F) {
            this.getWindow().addFlags(0x2000);
            String s = this.j;
            gftb.check(s);
            String s1 = this.m;
            int v = this.C - 1;
            if(this.C == 0) {
                throw null;
            }
            bkqc bkqc0 = new bkqc();
            Bundle bundle0 = new Bundle(4);
            bundle0.putString("accountName", s);
            bundle0.putString("referencePcid", s1);
            bundle0.putInt("pcidType", v);
            bundle0.putBoolean("headless", false);
            bkqc0.setArguments(bundle0);
            bkqc0.show(this.getSupportFragmentManager(), "upgrade-preconditions");
            return;
        }
        this.F();
    }

    // Detected as a lambda impl.
    public final void t() {
        this.A.i(0x20);
        this.setResult(3, this.N());
        this.finish();
    }

    public final void u() {
        bklp bklp0;
        if(this.I && (this.u != null && this.u.c(35))) {
            this.q();
            this.I = false;
            if(this.W() && this.B.a.equals("agsa")) {
                String s = this.j;
                gftb.check(s);
                PageDataMap pageDataMap0 = this.u;
                gftb.check(pageDataMap0);
                bklp0 = bklp.y(s, pageDataMap0.a(35), new ArrayList());
            }
            else {
                String s1 = this.j;
                gftb.check(s1);
                PageDataMap pageDataMap1 = this.u;
                gftb.check(pageDataMap1);
                bklp0 = bklp.y(s1, pageDataMap1.a(35), null);
            }
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.G(0x7F0B143B, bklp0);  // id:fm_family_creation_fragment_container
            ca0.w(null);
            ca0.b();
            return;
        }
        if(this.t) {
            boolean z = hsig.l();
            if(!z) {
                this.A.a();
            }
            hgfj hgfj0 = hsiv.b();
            String s2 = this.getIntent().getStringExtra("appId");
            gftb.check(s2);
            String s3 = bkdt.d(s2);
            if(!this.W() && z && (hgfj0.b.contains(s3) || FamilyCreationChimeraActivity.D.contains(s3))) {
                String s4 = this.j;
                gftb.check(s4);
                bkdt bkdt0 = new bkdt(s4, s3, this.k, bbmq.p(this));
                this.J = bkdt0;
                int v = bkdt0.f();
                this.K.c(v, ModuleManager.get(this).getCurrentModule().moduleVersion, this.J.c);
                this.startActivityForResult(this.J.a("family_module_create_family"), 3);
                return;
            }
            Intent intent0 = new Intent().setClassName(this, "com.google.android.gms.family.v2.invites.SendInvitationsActivity").putExtra("accountName", this.j).putExtra("consistencyToken", this.k.b()).putExtra("tokenExpirationTimeSecs", this.k.a()).putExtra("appId", this.B.a).putExtra("customTheme", this.getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", bbqr.c(this.getIntent().getStringExtra("predefinedTheme"))).putExtra("clientCallingPackage", bbmq.p(this)).putExtra("fromCreate", true).putExtra("familyChanged", this.H).putExtra("profileData", this.x).putExtra("inviteeRole", this.n.g).addFlags(0x10000);
            if(this.B.a.equals("agsa")) {
                intent0.putExtra("isDirectAddInvitations", this.W());
            }
            this.startActivityForResult(intent0, 2);
            return;
        }
        this.setResult(1, this.N());
        this.A.i(7);
        this.finish();
    }

    @Override  // bkld
    public final void v() {
        if(this.I) {
            this.A.i(0x20);
            this.setResult(1);
            this.finish();
            return;
        }
        if(!this.F) {
            CanCreateFamilyData canCreateFamilyData0 = this.y;
            gftb.check(canCreateFamilyData0);
            if(!canCreateFamilyData0.a) {
                this.R();
                return;
            }
        }
        this.m(false);
    }

    @Override  // bkll
    public final void w() {
        if(!this.F) {
            CanCreateFamilyData canCreateFamilyData0 = this.y;
            gftb.check(canCreateFamilyData0);
            if(!canCreateFamilyData0.a) {
                this.R();
                return;
            }
        }
        this.m(false);
    }

    @Override  // bklo
    public final void x() {
        this.t = false;
        this.u();
    }

    @Override  // bkpy
    public final void y() {
        fz fz0 = this.O();
        if(this.r && fz0 != null) {
            fz0.a();
            return;
        }
        this.P();
    }

    public final void z() {
        this.G = true;
        if(!this.q && !this.p) {
            this.P();
            return;
        }
        this.q();
        this.u();
    }
}

