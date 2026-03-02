package com.google.android.gms.advancedprotection.service.reboot;

import abjg;
import ablg;
import android.content.Intent;
import bbdg;
import ccil;
import ccmq;
import com.google.android.chimera.IntentOperation;
import hotw;
import ibuq;

public final class RebootServiceIntentOperation extends IntentOperation {
    static {
        abjg.a("RebootServiceIntentOperation");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        ccmq.a().a(bbdg.wS);
        if(hotw.d() && hotw.g()) {
            if(ccil.a(this).d()) {
                this.startService(ablg.a());
                return;
            }
            this.stopService(ablg.a());
        }
    }
}

