package com.google.android.gms.measurement.internal;

import android.content.Intent;
import bbpz;
import com.google.android.chimera.IntentOperation;
import crkt;

public class PhenotypeChangeListenerIntentOperation extends IntentOperation {
    private static final String a;

    static {
        PhenotypeChangeListenerIntentOperation.a = bbpz.f("com.google.android.gms.measurement");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if("com.google.android.gms.phenotype.COMMITTED".equals(intent0.getAction())) {
        label_3:
            if("com.google.android.gms.measurement".equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                crkt.i(this).aJ().k.a("Measurement Phenotype flag(s) updated");
            }
        }
        else {
            String s = intent0.getAction();
            if(PhenotypeChangeListenerIntentOperation.a.equals(s)) {
                goto label_3;
            }
        }
    }
}

