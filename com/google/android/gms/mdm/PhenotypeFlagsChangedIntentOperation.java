package com.google.android.gms.mdm;

import android.content.Intent;
import azpm;
import bbcu;
import bboh;
import bosa;
import com.google.android.chimera.IntentOperation;
import cqhx;
import cqhz;
import fphq;
import fpib;
import gfqx;
import gfsx;
import ggch;
import ggfp;
import ggtj;

public final class PhenotypeFlagsChangedIntentOperation extends IntentOperation {
    public static final int a;
    private static final bboh b;
    private static final ggfp c;

    static {
        PhenotypeFlagsChangedIntentOperation.b = bboh.b("PhenotypeChangedIntOp", bbcu.dX);
        PhenotypeFlagsChangedIntentOperation.c = ggfp.K("com.google.android.gms.security", "com.google.android.gms.findmydevice");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        gfsx gfsx0 = intent0 == null ? gfqx.a : ggch.j(PhenotypeFlagsChangedIntentOperation.c).c(new cqhz(intent0));
        if(!gfsx0.i()) {
            ((ggtj)PhenotypeFlagsChangedIntentOperation.b.j()).B("Unsupported intent: [%s]", (intent0 == null ? null : intent0.getAction()));
            return;
        }
        ((ggtj)PhenotypeFlagsChangedIntentOperation.b.h()).x("New flags committed.");
        fphq.d(fpib.a(((String)gfsx0.d())));
        bosa bosa0 = new bosa(this);
        cqhx.b(azpm.a, bosa0, this);
    }
}

