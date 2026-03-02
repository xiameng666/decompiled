package com.google.android.gms.auth.account;

import acrv;
import ajdg;
import ajdj;
import android.content.Intent;
import android.util.Log;
import azzc;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import java.util.Locale;

public class PhenotypeConfigSyncIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        if(!"com.google.android.gms.auth.account.config.PHENOTYPE_CONFIG_SYNC".equals(s)) {
            Log.i("Auth", String.format(Locale.US, "[PhenotypeConfigSyncIntentOperation] Not handling unknown action:" + s));
            return;
        }
        ajdj ajdj0 = new ajdj(this);
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{acrv.e};
        azzc0.b = false;
        azzc0.a = new ajdg(ajdj0);
        azzc0.d = 0x5F1;
        ajdj0.jn(azzc0.a());
        Log.i("Auth", String.format(Locale.US, "[PhenotypeConfigSyncIntentOperation] Requested phenotype config sync."));
    }
}

