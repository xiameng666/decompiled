package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ezfq;
import ezfr;
import j..util.Objects;
import java.util.Map;

public class BluetoothConnectionTracker.IntervalBasedDeviceTimer.1 extends TracingBroadcastReceiver {
    final ezfr a;

    public BluetoothConnectionTracker.IntervalBasedDeviceTimer.1(ezfr ezfr0) {
        Objects.requireNonNull(ezfr0);
        this.a = ezfr0;
        super("trustagent");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ezfr ezfr0 = this.a;
        String s = intent0.getAction();
        if(ezfr0.c.equals(s)) {
            for(Object object0: ezfr0.d) {
                String s1 = intent0.getStringExtra("key-timer-extra-device-address");
                Object object1 = ezfr.a;
                synchronized(object1) {
                    Map map0 = ezfr0.b;
                    if(map0.containsKey(s1)) {
                        ezfr0.c(s1, ((int)(((Integer)map0.get(s1)))) + 1);
                    }
                    else {
                        ezfr0.b(s1);
                    }
                }
                ((ezfq)object0).a(s1);
            }
        }
    }
}

