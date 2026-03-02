package com.google.android.location.fused;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fvxq;
import fwcy;
import j..util.Objects;

public class GmsFusionScheduler.NlpRestartTracingBroadcastReceiver extends TracingBroadcastReceiver {
    final fvxq a;

    public GmsFusionScheduler.NlpRestartTracingBroadcastReceiver(fvxq fvxq0) {
        Objects.requireNonNull(fvxq0);
        this.a = fvxq0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if("com.google.android.location.internal.server.ACTION_RESTARTED".equals(intent0.getAction())) {
            ((fwcy)this.a.p).d();
            ((fwcy)this.a.q).d();
        }
    }
}

