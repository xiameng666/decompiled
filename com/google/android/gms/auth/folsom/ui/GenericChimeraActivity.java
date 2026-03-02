package com.google.android.gms.auth.folsom.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import akcp;
import akcq;
import akct;
import akcu;
import akcv;
import akcw;
import akcx;
import akcy;
import akcz;
import akda;
import akdb;
import akdd;
import akde;
import akdf;
import akdg;
import akdh;
import akdi;
import akdj;
import akdk;
import akdl;
import akdm;
import akdz;
import akea;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import baun;
import bbdg;
import bbqa;
import bxmt;
import ccmg;
import ccmp;
import ccmq;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fyhn;
import gfta;
import gftb;
import gged_interceptors;
import ggek;
import ggeo;
import ggtj;
import ghtm;
import ghto;
import ghtp;
import hpvp;
import hpvv;
import j..util.Objects;
import java.util.Locale;
import java.util.UUID;
import jys;
import kex;
import lqi;
import lso;
import xnj;

@GmsCoreVeId(0x3EDA1)
public class GenericChimeraActivity extends xnj {
    public static final ggeo h;
    public static final gged_interceptors i;
    public int j;
    public String k;
    private static final baun l;

    static {
        ggek ggek0 = new ggek();
        Integer integer0 = (int)1;
        ggek0.i(integer0, new akdi());
        Integer integer1 = (int)2;
        ggek0.i(integer1, new akdj());
        Integer integer2 = (int)4;
        ggek0.i(integer2, new akdk());
        ggek0.i(Integer.valueOf(3), new akdl());
        Integer integer3 = (int)5;
        ggek0.i(integer3, new akdm());
        GenericChimeraActivity.h = ggek0.b();
        GenericChimeraActivity.i = gged_interceptors.o(integer0, integer1, integer2, integer3);
        GenericChimeraActivity.l = akea.a("GenericChimeraActivity");
    }

    public static Intent k(String s, String s1, boolean z, String s2) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("account_name", s);
        bundle0.putString("security_domain", s1);
        bundle0.putInt("operation", 2);
        bundle0.putBoolean("local_key_available", z);
        bundle0.putString("session_id", s2);
        Uri uri0 = Uri.parse(String.format(Locale.US, "intent://com.google.android.gms.auth.folsom.ui.GenericChimeraActivity/%s/%s/%d", s, s1, ((int)2)));
        return new Intent().setClassName(AppContextProvider.a(), GenericChimeraActivity.n()).setAction("com.google.android.gms.auth.folsom.DegradedRecoverabilityFix").putExtras(bundle0).setData(uri0);
    }

    public static Intent l(String s, String s1, int v, boolean z, String s2, boolean z1) {
        AppContextProvider.a();
        int v1 = s1.equals("hw_protected") ^ 1;
        if(hpvv.a.g().B()) {
            AppContextProvider.a();
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("account_name", s);
        bundle0.putString("security_domain", s1);
        bundle0.putInt("operation", 1);
        bundle0.putInt("domain_recoverability", v);
        bundle0.putBoolean("local_key_available", z);
        bundle0.putString("session_id", s2);
        bundle0.putBoolean("offer_reset", ((boolean)(((int)z1) | v1)));
        Uri uri0 = Uri.parse(String.format(Locale.US, "intent://com.google.android.gms.auth.folsom.ui.GenericChimeraActivity/%s/%s/%d", s, s1, ((int)1)));
        return new Intent().setClassName(AppContextProvider.a(), GenericChimeraActivity.n()).setAction("com.google.android.gms.auth.folsom.StartKeyRetrieval").putExtras(bundle0).setData(uri0);
    }

    public static Intent m(String s, String s1, String s2) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("account_name", s);
        bundle0.putString("security_domain", s1);
        bundle0.putInt("operation", 5);
        bundle0.putString("session_id", s2);
        Uri uri0 = Uri.parse(String.format(Locale.US, "intent://com.google.android.gms.auth.folsom.ui.GenericChimeraActivity/%s/%s/%d", s, s1, ((int)5)));
        return new Intent().setClassName(AppContextProvider.a(), GenericChimeraActivity.n()).setAction("com.google.android.gms.auth.folsom.LskfConsent").putExtras(bundle0).setData(uri0);
    }

    public static String n() {
        AppContextProvider.a();
        return "com.google.android.gms.auth.folsom.ui.GenericActivity";
    }

    public final String o() {
        Intent intent0 = this.getIntent();
        return intent0 == null ? null : intent0.getStringExtra("security_domain");
    }

    @Override  // xnz
    public final void onBackPressed() {
        GenericChimeraActivity.l.d("onBackPressed", new Object[0]);
        akdz.k(this.o(), this.j, 7, this.k);
        super.onBackPressed();
    }

    @Override  // xnj
    protected final void onCreate(Bundle bundle0) {
        ccmg ccmg0 = ccmq.a();
        bbdg bbdg0 = bbdg.mN;
        ccmg0.a(bbdg0);
        super.onCreate(bundle0);
        this.j = this.getIntent().getIntExtra("operation", 0);
        String s = this.getIntent().getStringExtra("session_id");
        this.k = s == null ? UUID.randomUUID().toString() : s;
        baun baun0 = GenericChimeraActivity.l;
        baun0.h("Starting activity: %s", new Object[]{this.k});
        if(bundle0 == null) {
            AppContextProvider.a();
            new ccmp().a(bbdg0);
            Intent intent0 = this.getIntent();
            Intent intent1 = this.getIntent();
            String s1 = intent1 == null ? null : intent1.getStringExtra("account_name");
            String s2 = this.o();
            if(this.j == 1 && intent0 != null && !gfta.c(s1) && !gfta.c(s2)) {
                boolean z = intent0.getBooleanExtra("local_key_available", false);
                int v = intent0.getIntExtra("domain_recoverability", 0);
                boolean z1 = intent0.getBooleanExtra("is_inline_lskf_consent_possible", false);
                String s3 = this.o();
                int v1 = this.j;
                String s4 = this.k;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghtp.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((ghtp)hftv0).c = 4;
                ((ghtp)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((ghtp)hftv1).i = 16;
                ((ghtp)hftv1).b |= 0x100;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((ghtp)hftv2).j = 7;
                ((ghtp)hftv2).b |= 0x200;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp0.b_message;
                s4.getClass();
                ((ghtp)hftv3).b |= 0x400000;
                ((ghtp)hftv3).w = s4;
                int v2 = ghto.a(v1);
                if(v2 != 0) {
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((ghtp)hftp0.b_message).p = v2 - 1;
                    ((ghtp)hftp0.b_message).b |= 0x8000;
                }
                akdz.o(hftp0, s3);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghtm.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp1.b_message;
                ((ghtm)hftv4).b |= 1;
                ((ghtm)hftv4).c = z;
                if(!hftv4.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp1.b_message;
                ((ghtm)hftv5).b |= 2;
                ((ghtm)hftv5).d = v;
                if(!hftv5.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ghtm ghtm0 = (ghtm)hftp1.b_message;
                ghtm0.b |= 4;
                ghtm0.e = z1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghtp ghtp0 = (ghtp)hftp0.b_message;
                ghtm ghtm1 = (ghtm)hftp1.N_build();
                ghtm1.getClass();
                ghtp0.v = ghtm1;
                ghtp0.b |= 0x200000;
                akdz.n(hftp0);
            }
            else {
                akdz.k(this.o(), this.j, 8, this.k);
            }
        }
        if(bbqa.a()) {
            AppContextProvider.a();
            this.setTheme(0x7F1615ED);  // style:folsomActivityExpressiveTheme
            fyhn.b(this.getContainerActivity());
        }
        else if(hpvp.c()) {
            this.setTheme(0x7F1615EC);  // style:folsomActivityDayNightTheme
        }
        else {
            this.setTheme(0x7F1615EE);  // style:folsomActivityTheme
        }
        String s5 = this.getIntent().getAction();
        if(s5 != null && !s5.isEmpty()) {
            if(jys.d()) {
                kex.b(this.getWindow().getDecorView(), new akde());
            }
            akdd akdd0 = (akdd)new lso(this).a(akdd.class);
            lqi lqi0 = akdd0.c;
            lqi0.g(this, new akdf(this));
            akdg akdg0 = new akdg(this);
            akdd0.d.g(this, akdg0);
            akdh akdh0 = new akdh(this);
            akdd0.e.g(this, akdh0);
            Intent intent2 = this.getIntent();
            String s6 = this.k;
            String s7 = intent2.getStringExtra("account_name");
            gftb.check(s7);
            akdd0.h = s7;
            String s8 = intent2.getStringExtra("security_domain");
            gftb.check(s8);
            akdd0.g = s8;
            akdd0.j = intent2.getBooleanExtra("is_inline_lskf_consent_possible", false);
            akdd0.k = intent2.getStringExtra("utm_source");
            akdd0.l = intent2.getStringExtra("utm_medium");
            akdd0.m = intent2.getStringExtra("utm_campaign");
            akdd0.i = intent2.getBooleanExtra("local_key_available", false);
            intent2.getIntExtra("operation", 0);
            akdd0.o = intent2.getBooleanExtra("offer_reset", false);
            akdd0.n = s6;
            bxmt bxmt0 = new bxmt();
            switch(s5) {
                case "com.google.android.gms.auth.folsom.DegradedRecoverabilityFix": {
                    if(Objects.equals(akdd0.g, "chromesync")) {
                        Integer integer1 = (int)8;
                        bxmt0.a = integer1;
                        bxmt0.c(integer1, new akcz(akdd0));
                    }
                    else {
                        Integer integer2 = (int)3;
                        bxmt0.a = integer2;
                        bxmt0.c(integer2, new akdb(akdd0));
                        bxmt0.c(Integer.valueOf(8), new akcq(akdd0));
                    }
                    bxmt0.c(Integer.valueOf(5), new akda(akdd0));
                    bxmt0.e(new akct(akdd0));
                    bxmt0.f(new akcu(akdd0));
                    akdd0.f = bxmt0.a();
                    break;
                }
                case "com.google.android.gms.auth.folsom.InitialPasswordEnrollment": {
                    Integer integer3 = (int)7;
                    bxmt0.a = integer3;
                    bxmt0.c(integer3, new akcv(akdd0));
                    bxmt0.e(new akct(akdd0));
                    bxmt0.f(new akcu(akdd0));
                    akdd0.f = bxmt0.a();
                    break;
                }
                case "com.google.android.gms.auth.folsom.LskfConsent": {
                    Integer integer0 = (int)1;
                    bxmt0.a = integer0;
                    bxmt0.c(integer0, new akcw(akdd0));
                    bxmt0.c(Integer.valueOf(2), new akcx(akdd0));
                    bxmt0.c(Integer.valueOf(4), new akcy(akdd0));
                    bxmt0.e(new akct(akdd0));
                    bxmt0.f(new akcu(akdd0));
                    akdd0.f = bxmt0.a();
                    break;
                }
                case "com.google.android.gms.auth.folsom.StartKeyRetrieval": {
                    Integer integer4 = (int)6;
                    bxmt0.a = integer4;
                    bxmt0.c(integer4, new akcp(akdd0));
                    bxmt0.e(new akct(akdd0));
                    bxmt0.f(new akcu(akdd0));
                    akdd0.f = bxmt0.a();
                    break;
                }
                default: {
                    ((ggtj)akdd.a.j()).B("Unexpected action: %s", s5);
                    lqi0.l(Integer.valueOf(0));
                }
            }
            this.setContentView(0x7F0E0EC3);  // layout:webview_activity
            akdd0.f.i();
            return;
        }
        baun0.f("Missing action", new Object[0]);
        this.setResult(0);
        this.finish();
    }

    @Override  // xjb
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x102002C) {
            GenericChimeraActivity.l.d("Home button pressed", new Object[0]);
            akdz.k(this.o(), this.j, 7, this.k);
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

