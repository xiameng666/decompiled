package com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity;
import cust;
import cwfa;
import cwxu;
import cwza;
import cxef;
import gfsx;
import gftb;
import gxye;
import gxyf;
import hvpp;
import j..util.Objects;

public class DevicePairingFragment.1 extends TracingBroadcastReceiver {
    final cwza a;

    public DevicePairingFragment.1(cwza cwza0) {
        Objects.requireNonNull(cwza0);
        this.a = cwza0;
        super("HalfSheetStateChange");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        cwza cwza0 = this.a;
        if(cwza0.getContext() != null && Objects.equals(intent0.getAction(), "com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE") && cwza0.ai != null) {
            if(hvpp.X() && intent0.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_PAIRING_RESURFACE", false)) {
                cwza0.H(context0, false);
                return;
            }
            if(Objects.equals(intent0.getStringExtra("FINISHED_STATE"), "SUCCESS")) {
                cwza0.am = intent0.getStringExtra("EXTRA_CLASSIC_MAC_ADDRESS");
                cust cust0 = cwfa.a;
                cust0.d().B("DevicePairingFragment: receive success state, %s", gxyf.b(gxye.a, cwza0.am));
                if(cwza0.ao != null && cwza0.ao.h()) {
                    cust0.f().B("DevicePairingFragment: not show success info because automotive additional state [%s] is still on-going.", cwza0.an);
                    cwza0.aq = gfsx.m(Boolean.valueOf(true));
                    cwza0.G();
                    return;
                }
                cwza0.s();
                return;
            }
            if(Objects.equals(intent0.getStringExtra("FINISHED_STATE"), "FAIL")) {
                cwza0.al = intent0.getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ALLOW_RETRY", false);
                cwza0.aq = gfsx.m(Boolean.valueOf(false));
                cwza0.F();
                return;
            }
            if(Objects.equals(intent0.getStringExtra("FINISHED_STATE"), "DISMISS")) {
                Bundle bundle0 = cwza0.getArguments();
                gftb.check(bundle0);
                if(bundle0.getBoolean("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE")) {
                    cwfa.a.d().x("DevicePairingFragment: skip suppress halfsheet for retroactive pairing.");
                    return;
                }
                cwfa.a.d().x("DevicePairingFragment: halfsheet timeout dismiss");
                Context context1 = cwza0.getContext();
                gftb.check(context1);
                ((HalfSheetChimeraActivity)context1).finish();
                return;
            }
            if(cwza0.ao != null && Objects.equals(intent0.getStringExtra("FINISHED_STATE"), "NEED CONFIRM PASSKEY")) {
                cwxu cwxu0 = cwza0.ao;
                gftb.check(cwxu0);
                cwxu0.a(intent0);
                return;
            }
            if(cwza0.ap != null && Objects.equals(intent0.getStringExtra("FINISHED_STATE"), "NEED ENTER PASSKEY")) {
                cxef cxef0 = cwza0.ap;
                gftb.check(cxef0);
                cxef0.a(intent0);
            }
        }
    }
}

