package com.google.android.gms.nearby.fastpair.tempbond;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cywt;
import cyww;
import ibuq;

public final class TempBondManager.bondStateChangeReceiver.1 extends TracingBroadcastReceiver {
    final cyww a;

    public TempBondManager.bondStateChangeReceiver.1(cyww cyww0) {
        this.a = cyww0;
        super("nearby", "TempBondManager");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(ibuq.m((intent0 == null ? null : intent0.getAction()), "android.bluetooth.device.action.BOND_STATE_CHANGED")) {
            cywt cywt0 = new cywt(intent0, this.a);
            this.a.g.execute(cywt0);
        }
    }
}

