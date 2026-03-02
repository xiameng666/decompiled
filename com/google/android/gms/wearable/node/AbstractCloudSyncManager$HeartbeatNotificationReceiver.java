package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fdno;
import fdpj;
import j..util.Objects;

public class AbstractCloudSyncManager.HeartbeatNotificationReceiver extends TracingBroadcastReceiver {
    final fdpj a;

    public AbstractCloudSyncManager.HeartbeatNotificationReceiver(fdpj fdpj0) {
        Objects.requireNonNull(fdpj0);
        this.a = fdpj0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.wearable.node.CLOUD_SYNC_HEARTBEAT_NOTIFICATION")) {
            long v = intent0.getLongExtra("heartbeat_scheduled_time", 0L);
            fdpj.H(fdno.a, v);
            int v1 = intent0.getIntExtra("initial_heartbeat_num", 0);
            this.a.x(v1);
        }
    }
}

