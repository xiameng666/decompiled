package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;

public class TetherListenerChimeraService.BluetoothStateChangeReceiver extends TracingBroadcastReceiver {
    public TetherListenerChimeraService.BluetoothStateChangeReceiver() {
        super("auth_magictether");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        Intent intent1 = TetherListenerChimeraService.a(context0);
        if(intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
            context0.startService(intent1);
            return;
        }
        context0.stopService(intent1);
    }
}

