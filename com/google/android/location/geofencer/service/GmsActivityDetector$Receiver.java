package com.google.android.location.geofencer.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fwjr;
import fwjs;
import j..util.Objects;

public class GmsActivityDetector.Receiver extends TracingBroadcastReceiver {
    public final fwjs a;

    public GmsActivityDetector.Receiver(fwjs fwjs0) {
        Objects.requireNonNull(fwjs0);
        this.a = fwjs0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        fwjr fwjr0 = new fwjr(this, intent0);
        this.a.g.execute(fwjr0);
    }
}

