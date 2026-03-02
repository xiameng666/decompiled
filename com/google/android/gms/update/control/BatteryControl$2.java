package com.google.android.gms.update.control;

import android.content.Context;
import android.content.Intent;
import ezxc;
import ezxn;
import j..util.Objects;

public class BatteryControl.2 extends ActiveStateTrackingBroadcastReceiver {
    public BatteryControl.2(ezxc ezxc0) {
        Objects.requireNonNull(ezxc0);
        super();
    }

    @Override  // com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver
    public final void b(Context context0, Intent intent0) {
        ezxc.a.h("Received intent: %s.", new Object[]{intent0});
        if("android.intent.action.BATTERY_CHANGED".equals(intent0.getAction())) {
            ((ezxn)ezxn.b.b()).a(4);
            return;
        }
        if(Objects.equals(intent0.getAction(), "android.os.action.POWER_SAVE_MODE_CHANGED")) {
            ((ezxn)ezxn.b.b()).a(8);
        }
    }
}

