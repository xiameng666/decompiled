package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import bbcu;
import bboh;
import bopl;
import bpai;
import bpnh;
import bpsp;
import bpsr;
import com.google.android.chimera.IntentOperation;

public final class BluetoothStateChangeListenerIntentOperation extends IntentOperation {
    private final bpnh a;

    static {
        bboh.b("BtStateChangeIntOp", bbcu.eD);
    }

    public BluetoothStateChangeListenerIntentOperation() {
        this(bopl.X());
    }

    public BluetoothStateChangeListenerIntentOperation(bpai bpai0) {
        this.a = bpai0.w();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(bpsr.b() && bpsp.b(intent0, new String[]{"android.bluetooth.adapter.action.STATE_CHANGED"})) {
            switch(intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", -1)) {
                case 12: 
                case 13: {
                    this.a.a();
                    break;
                }
            }
        }
    }
}

