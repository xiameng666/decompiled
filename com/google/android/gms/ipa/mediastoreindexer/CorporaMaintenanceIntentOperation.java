package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import bbcu;
import bboh;
import cakg;
import calu;
import camf;
import canh;
import cani;
import com.google.android.chimera.IntentOperation;
import ggtj;
import gmbu;
import gmcd;
import huhz;
import java.util.concurrent.TimeUnit;

public class CorporaMaintenanceIntentOperation extends IntentOperation {
    private static final bboh a;

    static {
        CorporaMaintenanceIntentOperation.a = bboh.b("GmscoreIpa", bbcu.ee);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ((ggtj)CorporaMaintenanceIntentOperation.a.h()).x("Starting mediastore corpora maintenance");
        cakg cakg0 = new cakg();
        canh canh0 = new canh(6);
        gmcd gmcd0 = new calu(new camf(this.getApplicationContext(), cakg0, canh0)).O.get();
        gmbu.t(gmcd0, new cani(gmcd0, canh0), camf.b);
        gmbu.q(gmcd0, huhz.a.h().u(), TimeUnit.SECONDS, camf.a);
        cakg0.c(gmcd0, camf.b);
    }
}

