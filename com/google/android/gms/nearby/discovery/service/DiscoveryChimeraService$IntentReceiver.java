package com.google.android.gms.nearby.discovery.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cwgw;
import cxsl;
import j..util.Objects;

public class DiscoveryChimeraService.IntentReceiver extends TracingBroadcastReceiver {
    public final DiscoveryChimeraService a;

    public DiscoveryChimeraService.IntentReceiver(DiscoveryChimeraService discoveryChimeraService0) {
        Objects.requireNonNull(discoveryChimeraService0);
        this.a = discoveryChimeraService0;
        super("nearby");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        if(!TextUtils.isEmpty(s) && cwgw.c(context0, s)) {
            this.a.d.f(new cxsl(this, intent0));
            this.a.g();
        }
    }
}

