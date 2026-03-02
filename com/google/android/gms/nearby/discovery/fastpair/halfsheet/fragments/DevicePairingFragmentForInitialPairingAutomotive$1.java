package com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity;
import cwxu;
import cxaj;
import gfsx;
import gftb;
import gxye;
import gxyf;
import j..util.Objects;

public class DevicePairingFragmentForInitialPairingAutomotive.1 extends TracingBroadcastReceiver {
    final cxaj a;

    public DevicePairingFragmentForInitialPairingAutomotive.1(cxaj cxaj0) {
        Objects.requireNonNull(cxaj0);
        this.a = cxaj0;
        super("HalfSheetStateChange");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        cxaj cxaj0 = this.a;
        if(cxaj0.getContext() != null && Objects.equals(intent0.getAction(), "com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE") && cxaj0.ah != null) {
            if(Objects.equals(intent0.getStringExtra("FINISHED_STATE"), "SUCCESS")) {
                cxaj0.ai = intent0.getStringExtra("EXTRA_CLASSIC_MAC_ADDRESS");
                cxaj0.am.d().B("DevicePairingFragment: receive success state, %s", gxyf.b(gxye.a, cxaj0.ai));
                if(cxaj0.ak != null && cxaj0.ak.h()) {
                    cxaj0.am.f().B("DevicePairingFragment: not show success info because automotive additional state [%s] is still on-going.", cxaj0.aj);
                    cxaj0.al = gfsx.m(Boolean.valueOf(true));
                    return;
                }
                cxaj0.s();
                return;
            }
            if(Objects.equals(intent0.getStringExtra("FINISHED_STATE"), "FAIL")) {
                cxaj0.r();
                return;
            }
            if(Objects.equals(intent0.getStringExtra("FINISHED_STATE"), "DISMISS")) {
                HalfSheetChimeraActivity halfSheetChimeraActivity0 = (HalfSheetChimeraActivity)cxaj0.requireContext();
                cxaj0.am.d().B("DevicePairingFragment: halfsheet timeout dismiss, %s", gxyf.b(gxye.q, "END"));
                halfSheetChimeraActivity0.finish();
                return;
            }
            if(cxaj0.ak != null && Objects.equals(intent0.getStringExtra("FINISHED_STATE"), "NEED CONFIRM PASSKEY")) {
                cwxu cwxu0 = cxaj0.ak;
                gftb.check(cwxu0);
                cwxu0.a(intent0);
            }
        }
    }
}

