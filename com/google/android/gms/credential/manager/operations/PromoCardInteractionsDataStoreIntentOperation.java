package com.google.android.gms.credential.manager.operations;

import adqe;
import android.accounts.Account;
import android.content.Intent;
import bbdg;
import bevb;
import bfmi;
import ccmq;
import ibuq;
import java.util.List;

public final class PromoCardInteractionsDataStoreIntentOperation extends bevb {
    public bfmi a;

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        ccmq.a().a(bbdg.ah);
        if(intent0.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            List list0 = adqe.c(intent0);
            ibuq.e(list0, "getRemovedWithRenamedAccounts(...)");
            for(Object object0: list0) {
                bfmi bfmi0 = this.a;
                if(bfmi0 == null) {
                    ibuq.j("promoCardInteractionsDataStoreFileCreator");
                    bfmi0 = null;
                }
                String s = ((Account)object0).name;
                ibuq.e(s, "name");
                bfmi0.a(s).delete();
            }
        }
    }
}

