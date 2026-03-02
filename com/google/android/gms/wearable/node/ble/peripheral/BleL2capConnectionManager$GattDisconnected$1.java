package com.google.android.gms.wearable.node.ble.peripheral;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import feih;
import j..util.Objects;

public class BleL2capConnectionManager.GattDisconnected.1 extends TracingBroadcastReceiver {
    final long a;
    final feih b;

    public BleL2capConnectionManager.GattDisconnected.1(feih feih0, long v) {
        this.a = v;
        Objects.requireNonNull(feih0);
        this.b = feih0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "android.intent.action.SCREEN_ON")) {
            long v = SystemClock.elapsedRealtime() - this.a;
            if(Long.compare(v, 10000L) > 0) {
                this.b.a.x(10);
            }
            else {
                this.b.a.z(10, 10000L - v);
            }
            this.b.e(false);
        }
    }
}

