package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import clkm;
import clkz;
import clla;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService;
import cwfa;
import cyjh;
import cyst;
import ggtj;
import hrwa;
import hvpg;
import java.util.concurrent.TimeUnit;

public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        cwfa.a.d().B("onReceive Gcm for push notifications action=%s", intent0.getAction());
        Intent intent1 = new Intent("com.google.android.gms.nearby.fastpair.service.ACTION_FOOTPRINTS_FORCE_SYNC");
        intent1.setClassName(context0, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
        context0.startService(intent1);
        ((ggtj)cyjh.a.d().ar(0x1FBB)).x("TSS schedules the footprints recon sync task.");
        clla clla0 = hrwa.f() ? TaskSchedulerChimeraService.e("TAG_FOOTPRINTS_RECON_SYNC_SCHEDULE", clkz.e(((int)hvpg.a.aY().aV()))) : TaskSchedulerChimeraService.d("TAG_FOOTPRINTS_RECON_SYNC_SCHEDULE", clkm.a(TimeUnit.HOURS.toSeconds(hvpg.a.aY().aW())));
        cyst.d(context0, clla0);
    }
}

