package com.google.android.gms.auth.easyunlock.config;

import a;
import adgg;
import ajlq;
import ajlr;
import ajls;
import alez;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import azqi;
import azqj;
import bboh;
import com.google.android.chimera.IntentOperation;
import evql;
import evrg;
import ggtj;
import gqus;
import hpue;
import hpul;
import hpzt;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class EasyUnlockSupportReporterIntentOperation extends IntentOperation {
    private static final bboh a;

    static {
        EasyUnlockSupportReporterIntentOperation.a = ajlr.a("EasyUnlockSupportReporterIntentOperation");
    }

    public EasyUnlockSupportReporterIntentOperation() {
    }

    EasyUnlockSupportReporterIntentOperation(Context context0) {
        this.attachBaseContext(context0);
    }

    public static Intent a(Context context0) {
        return IntentOperation.getStartIntent(context0, EasyUnlockSupportReporterIntentOperation.class, "com.google.android.gms.auth.easyunlock.UPDATE_FEATURE_SUPPORT");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        Account[] arr_account;
        if(hpue.a.c().d() && !hpzt.g()) {
            ajls ajls0 = new ajls();
            boolean z = true;
            try {
                arr_account = new adgg(this).e(this);
            }
            catch(RemoteException | azqj | azqi exception0) {
                a.ae(EasyUnlockSupportReporterIntentOperation.a.j(), "Failed to fetch account list.", exception0);
                ajls0.a(1);
                return;
            }
            if(arr_account != null && arr_account.length != 0) {
                alez alez0 = new alez(this);
                if(!hpue.d() || !ajlq.b(this)) {
                    z = false;
                }
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < arr_account.length; ++v) {
                    arrayList0.add(alez0.e(gqus.d, z, arr_account[v]));
                }
                evql evql0 = evrg.e(arrayList0);
                try {
                    evrg.o(evql0, hpul.a.b().a(), TimeUnit.SECONDS);
                }
                catch(InterruptedException | ExecutionException | TimeoutException exception1) {
                    a.ae(EasyUnlockSupportReporterIntentOperation.a.j(), "Failed to report feature support.", exception1);
                    ajls0.a(3);
                    return;
                }
                ajls0.a(0);
                return;
            }
            ((ggtj)EasyUnlockSupportReporterIntentOperation.a.j()).x("Invalid account list.");
            ajls0.a(2);
        }
    }
}

