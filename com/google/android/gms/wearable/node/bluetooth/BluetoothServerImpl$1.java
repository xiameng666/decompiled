package com.google.android.gms.wearable.node.bluetooth;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import feju;
import fejy;
import ffmm;
import j..util.Objects;

public class BluetoothServerImpl.1 extends TracingBroadcastReceiver {
    final feju a;

    public BluetoothServerImpl.1(feju feju0) {
        Objects.requireNonNull(feju0);
        this.a = feju0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        fejy fejy0;
        if(Objects.equals(intent0.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            int v = intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            if(v == 12) {
                if(Log.isLoggable("BluetoothServer", 4)) {
                    Log.i("BluetoothServer", "Adapter ON, starting connection.");
                }
                this.a.g();
                return;
            }
            if(v == 10) {
                if(Log.isLoggable("BluetoothServer", 4)) {
                    Log.i("BluetoothServer", "Adapter OFF, stopping connection.");
                }
                this.a.h();
                synchronized(this.a.c) {
                    fejy0 = this.a.e;
                    this.a.e = null;
                }
                ffmm.a(fejy0);
            }
        }
    }
}

