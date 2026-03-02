package com.google.android.gms.multidevice.service;

import adqe;
import android.content.Intent;
import bbmq;
import bboh;
import ctbn;
import cter;
import ctes;
import ctez;
import cume;
import ggtj;
import hvmz;
import ibnf;
import ibuk;
import ibuq;
import icbb;
import icck;
import java.util.List;

public final class AccountChangeIntentOperation extends ctez {
    public static final bboh a;
    public icck b;
    public ibnf c;
    public ibnf d;
    public ctbn e;

    static {
        AccountChangeIntentOperation.a = cume.a(new ibuk(AccountChangeIntentOperation.class));
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        if(hvmz.f()) {
            if(((Boolean)icbb.c(new cter(this, null))).booleanValue()) {
                ((ggtj)AccountChangeIntentOperation.a.h()).B("Platform not supported, skipping intent: %s", intent0);
                return;
            }
            if(bbmq.Q(this.getApplicationContext())) {
                return;
            }
            if(ibuq.m("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE", intent0.getAction()) && intent0.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
                List list0 = hvmz.h() ? adqe.d(intent0) : adqe.c(intent0);
                icck icck0 = this.b;
                if(icck0 == null) {
                    ibuq.j("scope");
                    icck0 = null;
                }
                icbb.b(icck0, null, null, new ctes(list0, this, null), 3);
                return;
            }
            ((ggtj)AccountChangeIntentOperation.a.h()).B("Intent received not actionable: %s", intent0);
            return;
        }
        ((ggtj)AccountChangeIntentOperation.a.h()).B("Module not enabled, skipping intent: %s", intent0);
    }
}

