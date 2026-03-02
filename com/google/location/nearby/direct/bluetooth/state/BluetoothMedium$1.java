package com.google.location.nearby.direct.bluetooth.state;

import android.content.Context;
import android.content.Intent;
import batl;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import gyey;
import gyll;
import j..util.Objects;

public class BluetoothMedium.1 extends TracingBroadcastReceiver {
    final gyey a;

    public BluetoothMedium.1(gyey gyey0) {
        Objects.requireNonNull(gyey0);
        this.a = gyey0;
        super("nearby", "BluetoothEventReceiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        batl.s(this.a.m);
        this.a.m.a(new gyll[0]);
    }
}

