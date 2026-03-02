package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import bbcu;
import bboh;
import bopl;
import bpai;
import bpcx;
import bpnh;
import bpsp;
import bpsr;
import bpya;
import com.google.android.chimera.IntentOperation;

public final class LocationManagerModeChangeListenerIntentOperation extends IntentOperation {
    private final bpcx a;
    private final bpnh b;

    static {
        bboh.b("LocationModeChangeIntOp", bbcu.eD);
    }

    public LocationManagerModeChangeListenerIntentOperation() {
        this(bopl.X());
    }

    public LocationManagerModeChangeListenerIntentOperation(bpai bpai0) {
        this.a = bpai0.r();
        this.b = bpai0.w();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(bpsr.b() && bpsp.b(intent0, new String[]{"android.location.MODE_CHANGED"})) {
            this.b.a();
            if(!bpya.a(this)) {
                synchronized(this.a.b) {
                    this.a.c.clear();
                    this.a.d = 0;
                }
            }
        }
    }
}

