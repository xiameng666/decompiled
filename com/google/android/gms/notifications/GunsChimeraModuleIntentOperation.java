package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import avzf;
import bbdg;
import ccmq;
import com.google.android.chimera.IntentOperation;

public class GunsChimeraModuleIntentOperation extends avzf {
    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        if((v & 4) <= 0 && (v & 8) <= 0 && (v & 2) <= 0) {
            return;
        }
        Context context0 = this.getApplicationContext();
        Intent intent1 = IntentOperation.getStartIntent(context0, GunsIntentOperation.class, "com.google.android.gms.notifications.intents.LOAD_NOTIFICATIONS_FROM_DB");
        if(intent0 != null) {
            intent1.putExtras(intent0);
        }
        context0.startService(intent1);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.eC);
    }
}

