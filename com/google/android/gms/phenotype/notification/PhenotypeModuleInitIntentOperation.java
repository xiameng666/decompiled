package com.google.android.gms.phenotype.notification;

import android.content.Intent;
import avzf;
import bbmq;
import eiow;
import eirf;
import eitp;

public class PhenotypeModuleInitIntentOperation extends avzf {
    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        bbmq.G(this, "com.google.android.gms.phenotype.service.FlagOverrideReceiver", true);
        if((v & 12) != 0) {
            eitp.c(this);
        }
    }

    @Override  // avzf
    protected final void c(Intent intent0) {
        eiow.b();
        eirf.a.e();
    }
}

