package com.google.android.gms.family.v2.tos;

import ByteString;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import acqi;
import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import azql;
import batl;
import bbdg;
import bbmq;
import bbqr;
import bkdi;
import bkeu;
import bkpy;
import bkpz;
import ca;
import cchj;
import ccmq;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fm;
import grkh;
import xni;

@GmsCoreVeId(0x3F3B1)
public final class TosChimeraActivity extends xni implements bkpy {
    private String j;
    private byte[] k;
    private boolean l;
    private bkeu m;

    private final Intent a() {
        return new Intent().putExtra("accountName", this.getIntent().getStringExtra("accountName")).putExtra("tosAccepted", this.l);
    }

    private final void g(int v) {
        this.setResult(4, new Intent().putExtra("accountName", this.j).putExtra("errorCode", v));
        this.finish();
    }

    @Override  // xnb
    public final void onBackPressed() {
        if(this.getSupportFragmentManager().b() == 0) {
            this.setResult(3, this.a());
            this.finish();
            return;
        }
        super.onBackPressed();
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.dp);
        super.onCreate(bundle0);
        this.m = new bkeu(this);
        String s = bbmq.p(this);
        if(!azql.c(this).g(bbqr.c(s))) {
            this.m.f(3, 8, "tos");
            this.g(-3);
            return;
        }
        bkdi.e(this, this.getIntent(), s);
        String s1 = this.getIntent().getStringExtra("accountName");
        if(s1 == null) {
            this.m.f(3, 13, "tos");
            this.g(-2);
            return;
        }
        this.j = s1;
        Account account0 = null;
        byte[] arr_b = bundle0 == null ? null : bundle0.getByteArray("auditToken");
        byte[] arr_b1 = this.getIntent().getByteArrayExtra("auditToken");
        boolean z = true;
        if(arr_b != null) {
            this.k = arr_b;
        }
        else if(arr_b1 == null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(acqi.a());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grkh grkh0 = (grkh)hftp0.b_message;
            grkh0.b |= 1;
            grkh0.c = hfsf0;
            this.k = ((grkh)hftp0.N_build()).toBytesArray();
        }
        else {
            this.k = arr_b1;
        }
        String s2 = this.getIntent().getStringExtra("appId");
        batl.s(s2);
        this.m.d(this.j, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion), s2);
        Account[] arr_account = cchj.b(this).p("com.google");
        for(int v = 0; v < arr_account.length; ++v) {
            Account account1 = arr_account[v];
            if(account1.name.equals(this.j)) {
                account0 = account1;
            }
        }
        if(account0 == null) {
            this.m.f(3, 14, "tos");
            this.g(-2);
            return;
        }
        String s3 = this.getIntent().getStringExtra("tosContent");
        String s4 = this.getIntent().getStringExtra("tosContinueButton");
        String s5 = this.getIntent().getStringExtra("tosMoreButton");
        if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s4)) {
            if(bundle0 == null || !bundle0.getBoolean("tosAccepted", false)) {
                z = false;
            }
            this.l = z;
            this.setContentView(0x7F0E03C1);  // layout:fm_activity_play_tos
            fm fm0 = this.getSupportFragmentManager();
            if(fm0.g(0x7F0B1440) == null) {  // id:fm_family_play_tos_fragment_container
                ca ca0 = new ca(fm0);
                ca0.t(0x7F0B1440, bkpz.y(this.k, this.j, s3, s4, s5));  // id:fm_family_play_tos_fragment_container
                ca0.a();
            }
            return;
        }
        this.m.f(3, 15, "tos");
        this.g(-2);
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("tosAccepted", this.l);
        bundle0.putByteArray("auditToken", this.k);
    }

    @Override  // bkpy
    public final void y() {
        this.l = true;
        this.setResult(1, this.a());
        this.finish();
    }
}

