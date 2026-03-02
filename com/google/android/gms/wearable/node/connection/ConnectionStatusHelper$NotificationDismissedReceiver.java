package com.google.android.gms.wearable.node.connection;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import feln;
import j..util.Objects;

public class ConnectionStatusHelper.NotificationDismissedReceiver extends TracingBroadcastReceiver {
    final feln a;

    public ConnectionStatusHelper.NotificationDismissedReceiver(feln feln0) {
        Objects.requireNonNull(feln0);
        this.a = feln0;
        super("wearable");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.wearable.node.connection.NOTIFICATION_DISMISSED")) {
            feln feln0 = this.a;
            if(SystemClock.elapsedRealtime() - feln0.a > 5000L) {
                feln0.b = SystemClock.elapsedRealtime();
            }
        }
    }
}

