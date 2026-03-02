package com.google.android.gms.trustagent.trustlet;

import android.content.Intent;
import bbcu;
import bboh;
import cllr;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import ezfb;

public class InactivityTaskService extends GmsTaskBoundService {
    public static final int a;

    static {
        bboh.b("TrustAgent", bbcu.aR);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        Intent intent0 = new Intent().setPackage("com.google.android.gms").setAction(ezfb.b);
        AppContextProvider.a().sendBroadcast(intent0);
        return 0;
    }
}

