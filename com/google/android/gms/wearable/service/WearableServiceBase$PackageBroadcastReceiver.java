package com.google.android.gms.wearable.service;

import android.content.Context;
import android.content.Intent;
import bblp;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fffs;
import ffgm;
import gmcg;
import j..util.Objects;

public final class WearableServiceBase.PackageBroadcastReceiver extends TracingBroadcastReceiver {
    public final ffgm a;
    private final gmcg b;

    public WearableServiceBase.PackageBroadcastReceiver(ffgm ffgm0) {
        Objects.requireNonNull(ffgm0);
        this.a = ffgm0;
        super("wearable");
        this.b = new bblp(1, 9);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        if(!Objects.equals(s, "android.intent.action.PACKAGE_ADDED") && !Objects.equals(s, "android.intent.action.PACKAGE_CHANGED") && !Objects.equals(s, "android.intent.action.PACKAGE_REMOVED")) {
            return;
        }
        fffs fffs0 = new fffs(this, intent0, this.goAsync());
        this.b.execute(fffs0);
    }
}

