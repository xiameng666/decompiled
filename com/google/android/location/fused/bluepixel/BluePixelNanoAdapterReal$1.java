package com.google.android.location.fused.bluepixel;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fwaa;
import j..util.Objects;

public class BluePixelNanoAdapterReal.1 extends TracingBroadcastReceiver {
    final fwaa a;

    public BluePixelNanoAdapterReal.1(fwaa fwaa0) {
        Objects.requireNonNull(fwaa0);
        this.a = fwaa0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "android.os.action.POWER_SAVE_MODE_CHANGED")) {
            fwaa fwaa0 = this.a;
            PowerManager powerManager0 = fwaa0.e;
            if(powerManager0 != null) {
                powerManager0.isPowerSaveMode();
            }
            if(fwaa0.f) {
                if(powerManager0 != null && !powerManager0.isPowerSaveMode()) {
                    fwaa0.p();
                    return;
                }
                fwaa0.o();
            }
        }
    }
}

