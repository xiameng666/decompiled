package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import bbcu;
import bboh;
import com.google.android.chimera.IntentOperation;
import fakg;

public class OptinBroadcastOperation extends IntentOperation {
    static {
        bboh.b("UsageReportingOptInRec", bbcu.ab);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        long v = intent0.getLongExtra("SOURCE_SERIAL_ID", -1L);
        if(v == -1L) {
            return;
        }
        boolean z = intent0.getBooleanExtra("OPT_VALUE", false);
        fakg fakg0 = fakg.e();
        synchronized(fakg.c) {
            fakg.r(fakg.c(fakg0.f), v, z);
            fakg.r(fakg.c(fakg0.g), v, z);
        }
        fakg0.s(this);
    }
}

