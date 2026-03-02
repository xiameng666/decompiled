package com.google.android.gms.googleone.escalation.account.service;

import adqe;
import android.content.Intent;
import bbdg;
import bboh;
import bucw;
import bucx;
import bucy;
import buda;
import bufn;
import ccmq;
import ggtj;
import httz;
import ibnn;
import ibnz;
import ibuq;
import ibzk;
import icbb;
import icck;
import java.util.List;
import java.util.Map;

public final class EscalationAccountsChangedIntentOperation extends buda {
    public bufn a;
    public static final int b;
    private static final bboh c;
    private final ibnn d;

    static {
        EscalationAccountsChangedIntentOperation.c = bboh.a("EscalationAccountsChangedIntentOperation");
    }

    public EscalationAccountsChangedIntentOperation() {
        this.d = new ibnz(new bucw());
    }

    public final bufn a() {
        bufn bufn0 = this.a;
        if(bufn0 != null) {
            return bufn0;
        }
        ibuq.j("storageCardEligibilityManager");
        return null;
    }

    private final icck c() {
        return (icck)this.d.a();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        ccmq.a().a(bbdg.xB);
        if(httz.c() && ibzk.K(intent0.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
            List list0 = adqe.d(intent0);
            if(list0.isEmpty()) {
                ((ggtj)EscalationAccountsChangedIntentOperation.c.h()).x("No new removed accounts");
            }
            else {
                icbb.b(this.c(), null, null, new bucy(list0, this, null), 3);
            }
            Map map0 = adqe.e(intent0);
            if(map0.isEmpty()) {
                ((ggtj)EscalationAccountsChangedIntentOperation.c.h()).x("No new renamed accounts");
                return;
            }
            icbb.b(this.c(), null, null, new bucx(map0, this, null), 3);
        }
    }
}

