package com.google.android.gms.wearable.node.bluetooth;

import android.content.Context;
import android.content.Intent;
import batl;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fczq;
import fejn;
import fekb;
import ffgp;
import ffmn;
import j..util.Objects;
import java.util.Map;

public class BluetoothClient.2 extends TracingBroadcastReceiver {
    final fejn a;

    public BluetoothClient.2(fejn fejn0) {
        Objects.requireNonNull(fejn0);
        this.a = fejn0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ffmn.a("WearableBluetooth", "BluetoothStateChangeReceiver onReceive intent: %s", new Object[]{intent0});
        if(Objects.equals(intent0.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            int v = intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            fejn fejn0 = this.a;
            batl.h("onBluetoothAdapterStateChanged");
            if(v == 12) {
                for(Object object0: fejn0.a.values()) {
                    fczq fczq0 = (fczq)object0;
                    if(((fekb)fejn0.b.get(fczq0.c)) == null) {
                        fejn0.b(fczq0);
                        ffgp.g().b();
                    }
                }
                return;
            }
            if(v == 10) {
                Map map0 = fejn0.b;
                for(Object object1: map0.values()) {
                    ((fekb)object1).close();
                }
                map0.clear();
                ffgp.g().c();
            }
        }
    }
}

