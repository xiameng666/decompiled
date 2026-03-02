package com.google.android.gms.auth.proximity.exo;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.proximity.common.BaseBluetoothStateChangeReceiver;

public class ExoChimeraService.BluetoothStateChangeReceiver extends BaseBluetoothStateChangeReceiver {
    @Override  // com.google.android.gms.auth.proximity.common.BaseBluetoothStateChangeReceiver
    public final Intent b(Context context0) {
        return ExoChimeraService.a(context0, "Bluetooth state change");
    }
}

