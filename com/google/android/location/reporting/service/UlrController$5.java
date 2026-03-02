package com.google.android.location.reporting.service;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fxtk;
import j..util.Objects;

public class UlrController.5 extends TracingBroadcastReceiver {
    final fxtk a;

    public UlrController.5(fxtk fxtk0) {
        Objects.requireNonNull(fxtk0);
        this.a = fxtk0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        Message message0 = this.a.h.obtainMessage(1, intent0);
        this.a.h.sendMessage(message0);
    }
}

