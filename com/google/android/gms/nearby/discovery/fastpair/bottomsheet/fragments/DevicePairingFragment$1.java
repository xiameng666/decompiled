package com.google.android.gms.nearby.discovery.fastpair.bottomsheet.fragments;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.discovery.fastpair.AtvConnectChimeraActivity;
import cutr;
import cwfa;
import cwnf;
import j..util.Objects;

public class DevicePairingFragment.1 extends TracingBroadcastReceiver {
    final cwnf a;

    public DevicePairingFragment.1(cwnf cwnf0) {
        Objects.requireNonNull(cwnf0);
        this.a = cwnf0;
        super("BottomSheetStateChange");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE".equals(intent0.getAction())) {
            if("SUCCESS".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                this.a.B();
                cutr.d(context0, new Intent("com.google.android.gms.nearby.ACTION_HALF_SHEET_FOREGROUND_STATE").putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FOREGROUND", false));
                return;
            }
            if("FAIL".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                this.a.A();
                return;
            }
            if("DISMISS".equals(intent0.getStringExtra("FINISHED_STATE"))) {
                cwfa.a.f().x("AtvConnectActivity: bottomsheet time out dismiss");
                cwnf cwnf0 = this.a;
                if(cwnf0.getContext() != null) {
                    AtvConnectChimeraActivity atvConnectChimeraActivity0 = (AtvConnectChimeraActivity)cwnf0.getContext();
                    if(atvConnectChimeraActivity0 != null) {
                        atvConnectChimeraActivity0.finish();
                    }
                }
            }
        }
    }
}

