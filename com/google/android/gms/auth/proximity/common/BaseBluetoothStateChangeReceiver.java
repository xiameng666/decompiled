package com.google.android.gms.auth.proximity.common;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import bahu;
import baun;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;

public abstract class BaseBluetoothStateChangeReceiver extends TracingBroadcastReceiver {
    private final baun a;

    public BaseBluetoothStateChangeReceiver() {
        super("auth_proximity");
        this.a = new baun("ProximityAuth", new String[]{"ExoService"});
    }

    public abstract Intent b(Context arg1);

    public static boolean c(Context context0) {
        BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
        return bluetoothAdapter0 != null && bluetoothAdapter0.getBluetoothLeScanner() != null && bluetoothAdapter0.isEnabled();
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
            this.a.h("Bluetooth was enabled, starting service", new Object[0]);
            context0.startService(this.b(context0));
            return;
        }
        this.a.h("Bluetooth was disabled, stopping service", new Object[0]);
        context0.stopService(this.b(context0));
    }
}

