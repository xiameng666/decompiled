package com.google.android.gms.pay.pass.closedloop.view.detail.access;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import dqzj;
import ggtj;
import ibuq;

public final class AccessCardViewModel.bluetoothStateChangedBroadcastReceiver.1 extends TracingBroadcastReceiver {
    final dqzj a;

    public AccessCardViewModel.bluetoothStateChangedBroadcastReceiver.1(dqzj dqzj0) {
        this.a = dqzj0;
        super("pay");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        int v = intent0.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
        switch(v) {
            case 10: {
                this.a.k();
                this.a.I(0L);
                return;
            }
            case 12: {
                this.a.k();
                this.a.H();
                return;
            }
            default: {
                ((ggtj)dqzj.a.j()).z("Unknown bluetooth state: %s", v);
            }
        }
    }
}

