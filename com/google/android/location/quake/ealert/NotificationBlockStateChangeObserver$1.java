package com.google.android.location.quake.ealert;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fxky;
import j..util.Objects;

public class NotificationBlockStateChangeObserver.1 extends TracingBroadcastReceiver {
    final fxky a;

    public NotificationBlockStateChangeObserver.1(fxky fxky0) {
        Objects.requireNonNull(fxky0);
        this.a = fxky0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        intent0.getAction();
        if(intent0.getAction() != null) {
            if(intent0.getAction().equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                this.a.d();
            }
            else if(intent0.getAction().equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
                String s = intent0.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID");
                if(s == null || s.equals("Personal_Safety_Id")) {
                    this.a.d();
                }
            }
            else if(intent0.getAction().equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                String s1 = intent0.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID");
                if(s1 == null || s1.equals("eew_alert_v2") || s1.equals("eew_notification_v2") || s1.equals("eew_update")) {
                    this.a.d();
                }
            }
        }
    }
}

