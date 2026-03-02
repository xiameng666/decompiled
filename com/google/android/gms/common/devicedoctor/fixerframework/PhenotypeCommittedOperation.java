package com.google.android.gms.common.devicedoctor.fixerframework;

import android.content.Intent;
import android.util.Log;
import bamh;
import bami;
import bamn;
import com.google.android.chimera.IntentOperation;
import gfud;
import gged_interceptors;
import glhg;
import hrmy;

public class PhenotypeCommittedOperation extends IntentOperation {
    private final bamn a;

    public PhenotypeCommittedOperation() {
        this.a = new bamn();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null) {
            hrmy hrmy0 = hrmy.a;
            if(hrmy0.e().F()) {
                String s = intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                Log.i("PTCommittedOperation", "Receive new configuration for " + s);
                if(gged_interceptors.i(gfud.e(',').i().d().n(hrmy0.e().v())).contains(s)) {
                    Log.i("PTCommittedOperation", "Running Fixer Framework for " + s);
                    bamh bamh0 = new bamh();
                    bamh0.b = this;
                    bamh0.a = glhg.d;
                    bami bami0 = bamh0.a();
                    this.a.a(bami0);
                }
            }
        }
    }
}

