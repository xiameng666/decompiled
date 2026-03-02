package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;
import bblp;
import com.google.android.gms.chimera.modules.scheduler.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ekqg;
import ekqh;
import ekqx;
import gmcg;

public final class DeviceStateReceiver extends TracingBroadcastReceiver {
    public ekqg a;
    private final gmcg b;

    public DeviceStateReceiver() {
        bblp bblp0 = new bblp(1, 10);
        super("scheduler");
        this.a = new ekqg(new ekqx(AppContextProvider.a()));
        this.b = bblp0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ekqh ekqh0 = new ekqh(this, intent0, context0);
        this.b.execute(ekqh0);
    }
}

