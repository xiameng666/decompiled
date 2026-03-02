package com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cxdj;
import cxfb;
import j..util.Objects;
import xob;

public class WearOsFragment.2 extends TracingBroadcastReceiver {
    final cxfb a;

    public WearOsFragment.2(cxfb cxfb0) {
        Objects.requireNonNull(cxfb0);
        this.a = cxfb0;
        super("HalfSheetStateChange");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE".equals(intent0.getAction())) {
            cxfb cxfb0 = this.a;
            cxfb0.ap.d().B("WearOsFragment: halfsheet get state %s", intent0.getStringExtra("FINISHED_STATE"));
            if("SUCCESS".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                cxfb0.E(true);
                return;
            }
            if("FAIL".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                cxfb0.al = intent0.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", cxfb0.al);
                cxfb0.E(false);
                return;
            }
            if("NEED CONFIRM PASSKEY".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                cxfb0.I(((BluetoothDevice)intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE")), intent0.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", 0));
                return;
            }
            if("DISMISS".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                cxfb0.ap.d().B("WearOsFragment: halfsheet timeout dismiss, state:%s", cxfb0.ak);
                Context context1 = cxfb0.getContext();
                if(cxfb0.ak == cxdj.a && context1 != null) {
                    ((xob)context1).finish();
                    cxfb0.G(context1, cxfb0.C(), System.currentTimeMillis(), cxfb0.an);
                }
            }
        }
    }
}

