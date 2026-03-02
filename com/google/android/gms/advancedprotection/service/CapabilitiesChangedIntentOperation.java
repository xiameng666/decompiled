package com.google.android.gms.advancedprotection.service;

import abjg;
import abkp;
import abld;
import android.content.Intent;
import bbdg;
import ccmq;
import com.google.android.chimera.IntentOperation;
import ibpo;
import ibuq;
import icbb;
import java.util.List;

public final class CapabilitiesChangedIntentOperation extends IntentOperation {
    public abld a;
    private static final List b;

    static {
        abjg.a("CapabilitiesChangedIntentOperation");
        CapabilitiesChangedIntentOperation.b = ibpo.g(new String[]{"com.google.android.gms.auth.ACCOUNT_CAPABILITIES_CHANGED", "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"});
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = new abld(this);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        ccmq.a().a(bbdg.wR);
        intent0.getAction();
        String s = intent0.getAction();
        if(!ibpo.aB(CapabilitiesChangedIntentOperation.b, s)) {
            return;
        }
        icbb.c(new abkp(this, null));
    }
}

