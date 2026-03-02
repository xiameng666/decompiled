package com.google.android.gms.nearby.fastpair.sass.wear;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cuul;
import cwfa;
import cwfb;
import cwqd;
import cxlb;
import cyru;
import cysc;
import ggtj;
import gxye;
import gxyf;
import hvpg;
import j..util.Objects;

public class WearScannerHelper.2 extends TracingBroadcastReceiver {
    public final cysc a;

    public WearScannerHelper.2(cysc cysc0) {
        Objects.requireNonNull(cysc0);
        this.a = cysc0;
        super("nearby");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0 != null && !TextUtils.isEmpty(intent0.getAction()) && intent0.getAction().equals("com.google.android.gms.nearby.fastpair.sass.device.ACTION_CONNECTING_UI_LAUNCHING")) {
            if(hvpg.bq()) {
                int v = cuul.a.nextInt();
                String s = cwfb.w.b(v);
                this.a.n = cwfa.a(cwfa.c(s, cxlb.k), s);
            }
            ((ggtj)this.a.n.d().ar(8058)).R("WearScannerHelper: [%s] Receiving UI launching broadcast, trigger switch with %s", gxyf.b(gxye.q, "START"), this.a.m);
            cyru cyru0 = new cyru(this);
            this.a.j.i(cwqd.class, cyru0);
        }
    }
}

