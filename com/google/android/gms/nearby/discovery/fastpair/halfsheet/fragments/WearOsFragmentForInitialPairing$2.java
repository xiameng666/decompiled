package com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cxdj;
import cxfn;
import gyyc;
import j..util.Objects;
import xob;

public class WearOsFragmentForInitialPairing.2 extends TracingBroadcastReceiver {
    final cxfn a;

    public WearOsFragmentForInitialPairing.2(cxfn cxfn0) {
        Objects.requireNonNull(cxfn0);
        this.a = cxfn0;
        super("HalfSheetStateChange");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE".equals(intent0.getAction())) {
            cxfn cxfn0 = this.a;
            cxfn0.ap.d().B("WearOsFragment: halfsheet get state %s", intent0.getStringExtra("FINISHED_STATE"));
            if("SUCCESS".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                cxfn0.D(true);
                return;
            }
            if("FAIL".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                cxfn0.al = intent0.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", cxfn0.al);
                cxfn0.D(false);
                return;
            }
            if("NEED CONFIRM PASSKEY".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                cxfn0.H(((BluetoothDevice)intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE")), intent0.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", 0));
                return;
            }
            if("DISMISS".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                cxfn0.ap.d().B("WearOsFragment: halfsheet timeout dismiss, state:%s", cxfn0.ak);
                Context context1 = cxfn0.getContext();
                if(cxfn0.ak == cxdj.a && context1 != null) {
                    ((xob)context1).finish();
                    cxfn0.F(context1, gyyc.bN, System.currentTimeMillis(), cxfn0.an);
                }
            }
        }
    }
}

