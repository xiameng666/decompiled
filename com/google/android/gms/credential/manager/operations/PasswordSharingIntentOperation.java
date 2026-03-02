package com.google.android.gms.credential.manager.operations;

import android.content.Intent;
import bbcu;
import bbdg;
import bboh;
import beuw;
import beva;
import bfdz;
import ccmq;
import ggtj;
import ibuq;
import icbb;

public final class PasswordSharingIntentOperation extends beva {
    public bfdz a;
    private static final bboh b;

    static {
        PasswordSharingIntentOperation.b = bboh.b("PasswordSharingIntentOperation", bbcu.cX);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        ccmq.a().a(bbdg.ah);
        if(!ibuq.m(intent0.getAction(), "com.google.android.gms.credential.manager.operations.PROCESS_INCOMING_PASSWORD_SHARING_INVITATIONS")) {
            ((ggtj)PasswordSharingIntentOperation.b.j()).x("Unsupported action in the intent.");
            return;
        }
        String s = intent0.getStringExtra("account_name");
        if(s == null) {
            ((ggtj)PasswordSharingIntentOperation.b.j()).x("Account is missing from the intent.");
            return;
        }
        icbb.c(new beuw(this, s, null));
    }
}

