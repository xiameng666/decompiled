package com.google.android.gms.nearby.mediums.bluetooth;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import czkq;
import czrl;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;

public class BluetoothRadio.3 extends TracingBroadcastReceiver {
    final boolean a;
    final CountDownLatch b;
    final czrl c;

    public BluetoothRadio.3(czrl czrl0, boolean z, CountDownLatch countDownLatch0) {
        this.a = z;
        this.b = countDownLatch0;
        Objects.requireNonNull(czrl0);
        this.c = czrl0;
        super("nearby", "BluetoothStateReceiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        int v = intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", 0x80000000);
        boolean z = this.a;
        if(!(z ? v != 12 : v != 10)) {
            this.b.countDown();
            return;
        }
        if(z && v == 10) {
            czkq.a.d().h("%s Bluetooth has been turned off, starting to enable it.", "[BLUETOOTH_RADIO]");
            this.c.a.f();
            this.c.b.set(true);
            return;
        }
        if(!z && v == 12) {
            czkq.a.d().h("%s Bluetooth has been turned on, starting to disable it.", "[BLUETOOTH_RADIO]");
            this.c.a.e();
            this.c.b.set(true);
        }
    }
}

