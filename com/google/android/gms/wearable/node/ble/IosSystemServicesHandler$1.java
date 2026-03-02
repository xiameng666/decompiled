package com.google.android.gms.wearable.node.ble;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fefg;
import j..util.Objects;

public class IosSystemServicesHandler.1 extends TracingBroadcastReceiver {
    final fefg a;

    public IosSystemServicesHandler.1(fefg fefg0) {
        Objects.requireNonNull(fefg0);
        this.a = fefg0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "com.google.android.clockwork.settings.ACTION_SET_HOME_READY")) {
            this.a.n = false;
            this.a.c.unregisterReceiver(this.a.l);
            this.a.f.set(true);
            this.a.a.a();
        }
    }
}

