package com.google.android.gms.scheduler.standalone;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ekqd;
import ekus;
import j..util.Objects;

public class ContentTaskController.UserStartingReceiver extends TracingBroadcastReceiver {
    final ekus a;

    public ContentTaskController.UserStartingReceiver(ekus ekus0) {
        Objects.requireNonNull(ekus0);
        this.a = ekus0;
        super("scheduler");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        int v = ekqd.c(intent0.getIntExtra("android.intent.extra.user_handle", -1));
        this.a.f(v);
    }
}

