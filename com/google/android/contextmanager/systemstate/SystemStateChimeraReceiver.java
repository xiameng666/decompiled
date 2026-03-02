package com.google.android.contextmanager.systemstate;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import xrn;
import xxe;
import yez;
import yfc;

public class SystemStateChimeraReceiver extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        if(!"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(s) && !"com.google.android.gms.location.reporting.DELETE_OPERATION".equals(s) && !"com.google.gservices.intent.action.GSERVICES_CHANGED".equals(s) && !"com.google.android.gms.phenotype.COMMITTED".equals(s) && !yfc.a.equals(s)) {
            return;
        }
        xxe.u().b(new yez(this, intent0), new xrn("HandleSystemStateOnReceive", "com.google.android.gms", null));
    }
}

