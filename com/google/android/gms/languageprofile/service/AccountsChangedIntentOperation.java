package com.google.android.gms.languageprofile.service;

import a;
import android.content.Context;
import android.content.Intent;
import bbcu;
import bboh;
import cbwh;
import cbxj;
import cbxo;
import cbyn;
import cmbm;
import com.google.android.chimera.IntentOperation;
import gfsx;
import gful_cronetEngineProvider;
import gged_interceptors;
import ggna;
import ggtj;
import glyq;
import huli;
import huln;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class AccountsChangedIntentOperation extends IntentOperation {
    private static final bboh a;
    private final gful_cronetEngineProvider b;

    static {
        AccountsChangedIntentOperation.a = bboh.b("AccountsChangedIntentOp", bbcu.ct);
    }

    public AccountsChangedIntentOperation() {
        this.b = new cbxj();
    }

    AccountsChangedIntentOperation(gful_cronetEngineProvider gful0) {
        this.b = gful0;
    }

    public static gfsx a(Context context0) {
        return gfsx.l(IntentOperation.getStartIntent(context0, AccountsChangedIntentOperation.class, "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"));
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        gged_interceptors gged0 = cbyn.a().b();
        huli huli0 = huli.a;
        if(huli0.e().z()) {
            int v = ((ggna)gged0).c;
            for(int v1 = 0; v1 < v; ++v1) {
                String s = (String)gged0.get(v1);
                try {
                    cbxo.a().b(s).get(huli0.e().i(), TimeUnit.MILLISECONDS);
                    cbyn.a().h(s);
                }
                catch(InterruptedException interruptedException0) {
                    Thread.currentThread().interrupt();
                    a.ae(AccountsChangedIntentOperation.a.i(), "Interruption occurred during scheduling a one time sync", interruptedException0);
                }
                catch(Exception exception0) {
                    a.ae(AccountsChangedIntentOperation.a.i(), "Exception while subscribing", exception0);
                }
            }
        }
        for(Object object0: cbyn.a().g()) {
            String s1 = (String)object0;
            try {
                ((ggtj)AccountsChangedIntentOperation.a.h()).x("Unsubscribe deleted account.");
                cbyn.a().k(s1);
            }
            catch(RuntimeException runtimeException0) {
                ((ggtj)((ggtj)AccountsChangedIntentOperation.a.i()).s(runtimeException0)).B("Exception while unsubscribing: %s", runtimeException0);
            }
        }
        if(huln.e()) {
            try {
                ((glyq)((cmbm)this.b.mr()).e(cbwh.d)).u();
            }
            catch(InterruptedException interruptedException1) {
                Thread.currentThread().interrupt();
                a.ae(AccountsChangedIntentOperation.a.i(), "Interruption occurred during scheduling a one time sync", interruptedException1);
            }
            catch(ExecutionException executionException0) {
                a.ae(AccountsChangedIntentOperation.a.i(), "Error while scheduling a one time sync", executionException0);
            }
        }
    }
}

