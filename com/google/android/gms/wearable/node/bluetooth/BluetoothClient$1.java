package com.google.android.gms.wearable.node.bluetooth;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fejn;
import fekb;
import ffmn;
import j..util.Objects;

public class BluetoothClient.1 extends TracingBroadcastReceiver {
    final fejn a;

    public BluetoothClient.1(fejn fejn0) {
        Objects.requireNonNull(fejn0);
        this.a = fejn0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ffmn.a("WearableBluetooth", "ConnectionRetryReceiver onReceive intent: %s", new Object[]{intent0});
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.wearable.node.bluetooth.RETRY_CONNECTION")) {
            String s = intent0.getData().getAuthority();
            fekb fekb0 = (fekb)this.a.b.get(s);
            if(fekb0 != null) {
                fekb0.c();
            }
        }
    }
}

