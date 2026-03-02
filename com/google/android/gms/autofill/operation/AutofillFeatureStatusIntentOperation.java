package com.google.android.gms.autofill.operation;

import android.accounts.Account;
import ansx;
import apdp;
import bbdi;
import ccrt;
import ccrv;
import ccsa;
import gfsx;
import hqcr;

public class AutofillFeatureStatusIntentOperation extends ccsa {
    public AutofillFeatureStatusIntentOperation() {
        super(bbdi.cf);
    }

    @Override  // ccsa
    public final ccrt a(ccrv ccrv0) {
        Account account0 = ccrv0.a;
        return account0 == null && !hqcr.a.b().a() ? ccrt.d : new apdp(ansx.a(this, gfsx.l(account0)).a());
    }

    @Override  // ccql
    protected final boolean b() {
        return hqcr.a.b().f();
    }
}

