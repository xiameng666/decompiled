package com.google.android.gms.wearable.node.ble.peripheral;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fczq;
import feil;
import j..util.Objects;

public class BleL2capConnectionManager.1 extends TracingBroadcastReceiver {
    final feil a;

    public BleL2capConnectionManager.1(feil feil0) {
        Objects.requireNonNull(feil0);
        this.a = feil0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        feil feil0 = this.a;
        if(feil0.c != null && ((fczq)feil0.c.get()).f && Objects.equals(intent0.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            int v = intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            int v1 = intent0.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10);
            if(v == 12) {
                feil0.x(3);
                return;
            }
            if(v1 == 12) {
                feil0.x(4);
            }
        }
    }
}

