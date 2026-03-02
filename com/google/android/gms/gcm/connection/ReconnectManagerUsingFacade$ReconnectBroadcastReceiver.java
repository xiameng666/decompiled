package com.google.android.gms.gcm.connection;

import android.content.Context;
import android.content.Intent;
import bstq;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class ReconnectManagerUsingFacade.ReconnectBroadcastReceiver extends TracingBroadcastReceiver {
    final bstq a;

    public ReconnectManagerUsingFacade.ReconnectBroadcastReceiver(bstq bstq0) {
        Objects.requireNonNull(bstq0);
        this.a = bstq0;
        super("gcm");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0 != null && Objects.equals(intent0.getAction(), "com.google.android.intent.action.GCM_RECONNECT")) {
            this.a.e();
        }
    }
}

