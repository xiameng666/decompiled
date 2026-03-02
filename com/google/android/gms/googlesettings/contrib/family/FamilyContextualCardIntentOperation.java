package com.google.android.gms.googlesettings.contrib.family;

import android.accounts.Account;
import bbcu;
import bbdi;
import bboh;
import buvm;
import ccrn;
import ccrp;
import ccrr;
import ggtj;
import ibuq;

public final class FamilyContextualCardIntentOperation extends ccrr {
    private static final bboh a;

    static {
        FamilyContextualCardIntentOperation.a = bboh.b("FAMILY_CONTEXTUAL_CARD", bbcu.gP);
    }

    public FamilyContextualCardIntentOperation() {
        super(bbdi.dn);
    }

    @Override  // ccrr
    public final ccrn a(ccrp ccrp0) {
        Account account0 = ccrp0.a;
        if(account0 == null) {
            ((ggtj)FamilyContextualCardIntentOperation.a.j()).x("Cannot create FAMILY contextual card: no active account.");
            return ccrn.e;
        }
        String s = account0.name;
        ibuq.e(s, "name");
        return new buvm(this, s);
    }
}

