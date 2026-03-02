package com.google.android.gms.libs.platform;

import android.content.Context;
import android.content.Intent;
import cjnt;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class GmsAlarmManagerCompatV19.PendingIntentAlarmTransport.1 extends TracingBroadcastReceiver {
    final cjnt a;

    public GmsAlarmManagerCompatV19.PendingIntentAlarmTransport.1(cjnt cjnt0, Context context0) {
        Objects.requireNonNull(cjnt0);
        this.a = cjnt0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        synchronized(this.a) {
            this.a.f = null;
            this.a.c();
        }
        this.a.d();
    }
}

