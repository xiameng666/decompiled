package com.google.android.gms.backup.settings.backupnow;

import android.content.Context;
import android.content.Intent;
import asfr;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class BackUpNowConstraintsChecker.2 extends TracingBroadcastReceiver {
    final asfr a;

    public BackUpNowConstraintsChecker.2(asfr asfr0) {
        Objects.requireNonNull(asfr0);
        this.a = asfr0;
        super("backup");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "android.intent.action.BATTERY_CHANGED") && intent0.getIntExtra("plugged", 0) == 0) {
            asfr.a.h("Device no longer plugged in.", new Object[0]);
            this.a.e.set(false);
        }
    }
}

