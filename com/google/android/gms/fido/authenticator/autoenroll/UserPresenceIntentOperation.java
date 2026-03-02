package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Intent;
import blos;
import bnaa;
import com.google.android.chimera.IntentOperation;
import hstp;

public class UserPresenceIntentOperation extends IntentOperation {
    static {
        bnaa.a("UserPresenceIntentOperation");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        intent0.getAction();
        if(hstp.a.b().b() && intent0.getAction().equals("android.intent.action.USER_PRESENT")) {
            ((blos)blos.a.b()).b();
        }
    }
}

