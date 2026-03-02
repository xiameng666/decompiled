package com.google.android.gms.notifications.registration.service.operations;

import android.content.Context;
import android.content.Intent;
import djwn;
import djwx;
import hekb;
import hfuh;
import hvsr;
import hvsy;
import ibuq;

public final class RegistrationIdChangedIntentOperation extends djwx {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!new hfuh(hvsy.c().c, hvsr.a).contains(hekb.j)) {
            return;
        }
        Context context0 = this.getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        ibuq.f(context0, "context");
        djwn.a(context0, "RE_REGISTER_REGISTRATION_ID_CHANGE");
    }
}

