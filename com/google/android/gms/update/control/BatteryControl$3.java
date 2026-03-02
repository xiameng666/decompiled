package com.google.android.gms.update.control;

import android.content.Context;
import android.content.Intent;
import ezxc;
import ezxn;
import j..util.Objects;

public class BatteryControl.3 extends ActiveStateTrackingBroadcastReceiver {
    public BatteryControl.3(ezxc ezxc0) {
        Objects.requireNonNull(ezxc0);
        super();
    }

    @Override  // com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver
    public final void b(Context context0, Intent intent0) {
        ezxc.a.h("Received intent: %s.", new Object[]{intent0});
        if("android.intent.action.ACTION_POWER_CONNECTED".equals(intent0.getAction())) {
            ((ezxn)ezxn.b.b()).a(9);
        }
    }
}

