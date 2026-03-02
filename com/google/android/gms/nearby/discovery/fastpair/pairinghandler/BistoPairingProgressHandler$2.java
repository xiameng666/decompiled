package com.google.android.gms.nearby.discovery.fastpair.pairinghandler;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cwfa;
import cxis;
import j..util.Objects;

public class BistoPairingProgressHandler.2 extends TracingBroadcastReceiver {
    final cxis a;

    public BistoPairingProgressHandler.2(cxis cxis0) {
        Objects.requireNonNull(cxis0);
        this.a = cxis0;
        super("bisto-setup");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if("com.google.android.gms.nearby.discovery.ACTION_CANCEL_BISTO_SETUP".equals(intent0.getAction()) || "com.google.android.gms.nearby.discovery.ACTION_SUCCESS_BISTO_SETUP".equals(intent0.getAction())) {
            cwfa.a.f().x("FastPairSetup: get assistant set up information from Bisto");
            intent0.setClassName(context0, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
            intent0.putExtra("com.google.android.gms.nearby.discovery.fastpair.BLUETOOTH_MAC_ADDRESS", null);
            context0.startService(intent0);
            try {
                cxis cxis0 = this.a;
                if(cxis0.a) {
                    context0.unregisterReceiver(this);
                    cxis.p(cxis0);
                }
                return;
            }
            catch(IllegalArgumentException unused_ex) {
                goto label_10;
            }
        }
        return;
    label_10:
        cwfa.a.f().x("bisto setup receiver is unregistered already");
    }
}

