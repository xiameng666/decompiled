package com.google.android.gms.credential.manager.operations;

import android.content.Intent;
import bbcu;
import bbdg;
import bboh;
import beuq;
import beuz;
import bevv;
import ccmq;
import ggtj;
import ibuq;
import icbb;

public final class PasswordChangesIntentOperation extends beuz {
    public bevv a;
    private static final bboh b;

    static {
        PasswordChangesIntentOperation.b = bboh.b("PasswordChangesIntentOperation", bbcu.cX);
    }

    public final bevv a() {
        bevv bevv0 = this.a;
        if(bevv0 != null) {
            return bevv0;
        }
        ibuq.j("passwordChangesProcessor");
        return null;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        ccmq.a().a(bbdg.ah);
        if(!ibuq.m(intent0.getAction(), "com.google.android.gms.credential.manager.operations.PASSWORDS_UPDATED")) {
            ((ggtj)PasswordChangesIntentOperation.b.j()).x("Unsupported action in the intent.");
            return;
        }
        String s = intent0.getStringExtra("account_name");
        if(s == null) {
            ((ggtj)PasswordChangesIntentOperation.b.j()).x("Account is missing from the intent.");
            return;
        }
        icbb.c(new beuq(s, this, null));
    }
}

