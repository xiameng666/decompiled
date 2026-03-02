package com.google.android.gms.googleone.smui;

import acp;
import adt;
import android.os.Bundle;
import bbcu;
import bbdg;
import bboh;
import buih;
import buij;
import buim;
import buin;
import buio;
import buip;
import buis;
import buix;
import buiy;
import bujh;
import bujj;
import ca;
import ccmq;
import cmec;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fhwp;
import httw;
import ibnn;
import ibns;
import ibuk;
import ibuq;
import icbb;
import jyu;
import kfv;
import lpt;
import lsc;
import lsd;

@GmsCoreVeId(0x3F42C)
public final class SmuiChimeraActivity extends buih {
    public static final bboh k;
    public acp l;
    public cmec m;
    public bujj n;
    private final ibnn o;

    static {
        SmuiChimeraActivity.k = bboh.b("SmuiChimeraActivity", bbcu.hd);
    }

    public SmuiChimeraActivity() {
        buin buin0 = new buin(this);
        this.o = new lsd(new ibuk(buiy.class), new buio(this), buin0, new buip(this));
    }

    public final buiy b() {
        return (buiy)this.o.a();
    }

    public final bujj c() {
        bujj bujj0 = this.n;
        if(bujj0 != null) {
            return bujj0;
        }
        ibuq.j("accountInfo");
        return null;
    }

    public final void f() {
        if(this.getSupportFragmentManager().h("SmuiRootFragment") != null) {
            return;
        }
        ca ca0 = new ca(this.getSupportFragmentManager());
        String s = this.c().a;
        bujh bujh0 = new bujh();
        bujh0.setArguments(jyu.a(new ibns[]{new ibns("account_name_key", s)}));
        ca0.z(0x1020002, bujh0, "SmuiRootFragment");
        ca0.f();
    }

    @Override  // buih
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.xy);
        super.onCreate(bundle0);
        if(httw.a.b().a()) {
            return;
        }
        this.l = this.registerForActivityResult(new adt(), new buij(this));
        cmec cmec0 = this.m;
        if(cmec0 == null) {
            ibuq.j("gmsCoreMetrics");
            cmec0 = null;
        }
        cmec0.k(0x3F42C, fhwp.b(this.c().a));
        kfv.a(this.getWindow(), false);
        icbb.b(lpt.a(this), null, null, new buim(this, null), 3);
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        buiy buiy0 = this.b();
        buiy0.e.g(buis.a);
        icbb.b(lsc.a(buiy0), null, null, new buix(buiy0, null), 3);
    }
}

