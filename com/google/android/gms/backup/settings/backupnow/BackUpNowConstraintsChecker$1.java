package com.google.android.gms.backup.settings.backupnow;

import android.content.Context;
import android.content.Intent;
import asfr;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class BackUpNowConstraintsChecker.1 extends TracingBroadcastReceiver {
    final asfr a;

    public BackUpNowConstraintsChecker.1(asfr asfr0) {
        Objects.requireNonNull(asfr0);
        this.a = asfr0;
        super("backup");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "android.intent.action.DREAMING_STOPPED")) {
            asfr.a.h("No longer in dreaming mode.", new Object[0]);
            this.a.d.set(false);
        }
    }
}

