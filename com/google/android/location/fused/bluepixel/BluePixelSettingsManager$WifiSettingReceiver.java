package com.google.android.location.fused.bluepixel;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fwae;
import j..util.Objects;

public class BluePixelSettingsManager.WifiSettingReceiver extends TracingBroadcastReceiver {
    final fwae a;

    public BluePixelSettingsManager.WifiSettingReceiver(fwae fwae0) {
        Objects.requireNonNull(fwae0);
        this.a = fwae0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        this.a.d();
    }
}

