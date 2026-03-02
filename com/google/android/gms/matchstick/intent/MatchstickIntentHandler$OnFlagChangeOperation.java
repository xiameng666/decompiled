package com.google.android.gms.matchstick.intent;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import cpty;
import fihk;
import hvdq;

public class MatchstickIntentHandler.OnFlagChangeOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 == null) {
            fihk.a("IntentHandler", "Intent is null", new Object[0]);
            return;
        }
        String s = intent0.getAction();
        if(("com.google.android.gms.phenotype.COMMITTED".equals(s) || cpty.a.equals(s)) && "com.google.android.gms.matchstick".equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            cpty.a(this.getBaseContext());
            if(hvdq.g()) {
                cpty.f(this.getBaseContext(), "com.google.android.gms.matchstick.ui.LighterEntryPointActivity");
            }
        }
    }
}

