package com.google.android.gms.auth.proximity.phonehub;

import android.content.Intent;
import baun;
import com.google.android.chimera.IntentOperation;

public class PhoneHubChimeraService.BluetoothAdapterStateChangeIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        baun baun0 = PhoneHubChimeraService.a;
        baun0.d("Received Bluetooth event: %s.", new Object[]{intent0});
        if("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent0.getAction())) {
            baun0.h("Bluetooth state has changed. Calling startService.", new Object[0]);
            this.startService(PhoneHubChimeraService.a(this));
        }
    }
}

