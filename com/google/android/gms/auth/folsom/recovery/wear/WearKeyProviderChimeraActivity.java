package com.google.android.gms.auth.folsom.recovery.wear;

import acp;
import adu;
import ajxx;
import ajxy;
import ajxz;
import ajyc;
import akea;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import batl;
import bbdg;
import bboh;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import ggtj;
import j..util.Objects;
import lso;
import xnj;

@GmsCoreVeId(0x3EDA3)
public class WearKeyProviderChimeraActivity extends xnj {
    public static final bboh h;
    public ajyc i;
    public acp j;
    private String k;
    private String l;
    private String m;

    static {
        WearKeyProviderChimeraActivity.h = akea.b("WearKeyProvider");
    }

    @Override  // xnj
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.mN);
        bboh bboh0 = WearKeyProviderChimeraActivity.h;
        ((ggtj)bboh0.h()).x("onCreate");
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        this.k = intent0.getStringExtra("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME");
        this.l = intent0.getStringExtra("SECURITY_DOMAIN");
        this.m = intent0.getStringExtra("com.google.android.gms.auth.folsom.EXTRA_RECEIVER_NODE_ID");
        this.setTheme(0x7F160C5F);  // style:Theme.GoogleMaterial.Light.NoActionBar
        if(!TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(this.l) && !TextUtils.isEmpty(this.m)) {
            ajyc ajyc0 = (ajyc)new lso(this).a(ajyc.class);
            this.i = ajyc0;
            String s = this.k;
            batl.s(s);
            String s1 = this.l;
            batl.s(s1);
            String s2 = this.m;
            batl.s(s2);
            if(ajyc0.g) {
                ((ggtj)ajyc.a.h()).x("view model already initialized");
            }
            else {
                ajyc0.g = true;
                ajyc0.c = s;
                ajyc0.b = s1;
                ajyc0.d = s2;
            }
            this.i.a(false);
            this.setContentView(0x7F0E0EC3);  // layout:webview_activity
            this.i.e.ih(new ajxx(this));
            this.i.f.ih(new ajxy(this));
            adu adu0 = new adu();
            ajyc ajyc1 = this.i;
            Objects.requireNonNull(ajyc1);
            this.j = this.registerForActivityResult(adu0, new ajxz(ajyc1));
            return;
        }
        ((ggtj)bboh0.j()).X("Invalid param - domain: %s, account %s, node %s", this.l, this.k, this.m);
        this.finish();
    }

    @Override  // xnj
    public final void onDestroy() {
        this.i.e.k(this);
        super.onDestroy();
    }

    @Override  // xnz
    protected final void onNewIntent(Intent intent0) {
        ((ggtj)WearKeyProviderChimeraActivity.h.h()).B("New intent: %s", intent0);
        super.onNewIntent(intent0);
    }

    @Override  // xnj
    protected final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME", this.k);
        bundle0.putString("SECURITY_DOMAIN", this.l);
        bundle0.putString("com.google.android.gms.auth.folsom.EXTRA_RECEIVER_NODE_ID", this.m);
        super.onSaveInstanceState(bundle0);
    }
}

