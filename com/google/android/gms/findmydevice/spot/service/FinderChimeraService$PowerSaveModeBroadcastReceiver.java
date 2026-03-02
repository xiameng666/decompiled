package com.google.android.gms.findmydevice.spot.service;

import android.content.Context;
import android.content.Intent;
import bpcz;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fray;
import j..util.Objects;

public class FinderChimeraService.PowerSaveModeBroadcastReceiver extends TracingBroadcastReceiver {
    final FinderChimeraService a;

    public FinderChimeraService.PowerSaveModeBroadcastReceiver(FinderChimeraService finderChimeraService0, Context context0) {
        Objects.requireNonNull(finderChimeraService0);
        this.a = finderChimeraService0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        fray.a(((bpcz)this.a.c.a()).a(), "Self location fetcher refresh failed.", new Object[0]);
    }
}

