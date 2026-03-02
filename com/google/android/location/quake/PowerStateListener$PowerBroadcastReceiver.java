package com.google.android.location.quake;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fxen;
import j..util.Objects;

public class PowerStateListener.PowerBroadcastReceiver extends TracingBroadcastReceiver {
    final fxen a;

    public PowerStateListener.PowerBroadcastReceiver(fxen fxen0) {
        Objects.requireNonNull(fxen0);
        this.a = fxen0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        intent0.getAction();
        this.a.i.a();
    }
}

