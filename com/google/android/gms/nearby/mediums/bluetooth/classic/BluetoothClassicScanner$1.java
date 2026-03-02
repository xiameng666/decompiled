package com.google.android.gms.nearby.mediums.bluetooth.classic;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import czkq;
import czrq;
import czrr;
import j..util.Objects;

public class BluetoothClassicScanner.1 extends TracingBroadcastReceiver {
    public final czrr a;

    public BluetoothClassicScanner.1(czrr czrr0) {
        Objects.requireNonNull(czrr0);
        this.a = czrr0;
        super("nearby", "ScanReceiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0 == null) {
            czkq.a.e().h("%s Ignoring Bluetooth Classic scan result because the broadcasted intent is null.", "[BluetoothClassicScanner]");
            return;
        }
        czrq czrq0 = new czrq(this, intent0);
        this.a.c.execute(czrq0);
    }
}

