package com.google.android.gms.auth.api.credentials.manager.providers.chromesync;

import a;
import aeny;
import aerr;
import aggi;
import agqz;
import agrg;
import agrh;
import android.content.Intent;
import bboh;
import bxie;
import bxma;
import bxnj;
import bxol;
import bxrz;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import gged_interceptors;
import ggna;
import hpmp;
import java.util.concurrent.ExecutionException;

public class ChromeSyncIntentOperation extends IntentOperation {
    private static final bboh a;

    static {
        ChromeSyncIntentOperation.a = aggi.a("ChromeSyncIntentOperation");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        gged_interceptors gged0;
        if(!"com.google.android.gms.phenotype.COMMITTED".equals(intent0.getAction()) || "com.google.android.gms.auth.api.credentials".equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            Boolean boolean0 = (Boolean)aerr.a.b();
            AppContextProvider.a();
            hpmp hpmp0 = hpmp.a;
            if(hpmp0.d().n()) {
                bxrz bxrz0 = (bxrz)agrh.a.mr();
                bxrz0.am(aggi.a(agrh.b(agrg.b)));
                String s = bxol.a();
                bxrz0.ap(bxnj.bd, s);
                bxrz0.W(agrg.b).c();
            }
            if(hpmp0.d().o()) {
                bxrz bxrz1 = (bxrz)agrh.a.mr();
                bxrz1.am(aggi.a(agrh.b(agrg.a)));
                String s1 = bxol.a();
                bxrz1.ap(bxnj.bg, s1);
                bxrz1.W(agrg.a).c();
            }
            agqz agqz0 = new agqz(this);
            try {
                gged0 = aeny.b();
            }
            catch(bxma bxma0) {
                a.ae(ChromeSyncIntentOperation.a.i(), "Failed to get the accounts.", bxma0);
                return;
            }
            int v = ((ggna)gged0).c;
            for(int v1 = 0; v1 < v; ++v1) {
                bxie bxie0 = (bxie)gged0.get(v1);
                try {
                    agqz0.e(bxie0).get();
                }
                catch(InterruptedException | ExecutionException exception0) {
                    a.ae(ChromeSyncIntentOperation.a.i(), "Failed to initialize sync.", exception0);
                }
            }
        }
    }
}

