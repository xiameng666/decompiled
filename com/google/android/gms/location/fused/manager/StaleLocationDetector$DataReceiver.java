package com.google.android.gms.location.fused.manager;

import android.content.Context;
import android.content.Intent;
import bblp;
import cnak;
import cnam;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class StaleLocationDetector.DataReceiver extends TracingBroadcastReceiver {
    public final cnam a;

    public StaleLocationDetector.DataReceiver(cnam cnam0) {
        Objects.requireNonNull(cnam0);
        this.a = cnam0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        if(s == null) {
            return;
        }
        new bblp(1, 9).execute(new cnak(this, s, intent0));
    }
}

