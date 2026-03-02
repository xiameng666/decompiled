package com.google.android.gms.adid.service;

import android.content.Intent;
import android.util.Log;
import avzf;
import bbdg;
import bbmq;
import ccmq;

public final class ModifyAdIdProviderServiceStateIntentOperation extends avzf {
    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        ModifyAdIdProviderServiceStateIntentOperation.e();
    }

    private static final void e() {
        try {
            bbmq.L("com.google.android.gms.adid.service.AdIdProviderService", 1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.e("AdIdProviderService", "Exception caught when modifying AdIdProviderService state: " + illegalArgumentException0.getMessage());
        }
    }

    @Override  // avzf
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.uh);
        if(intent0 != null) {
            String s = intent0.getAction();
            if(s != null && s.equals("com.google.android.gms.phenotype.com.google.android.gms.adsidentity.COMMITTED")) {
                ModifyAdIdProviderServiceStateIntentOperation.e();
                return;
            }
            super.onHandleIntent(intent0);
        }
    }
}

