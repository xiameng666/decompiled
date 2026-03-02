package com.google.android.gms.common.analytics;

import android.content.Intent;
import azsq;
import bbcu;
import bboh;
import com.google.android.chimera.IntentOperation;
import hrlf;
import hrlu;

public class CoreAnalyticsLogEventOperation extends IntentOperation {
    static {
        bboh.b("CoreAnalyticsLogEvent", bbcu.dH);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        if("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(s) && hrlf.c()) {
            azsq.c();
            azsq.b(this, 12, hrlu.c());
            return;
        }
        if("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED".equals(s)) {
            azsq.c();
            azsq.b(this, 13, hrlu.c());
        }
    }
}

