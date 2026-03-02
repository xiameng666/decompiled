package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

public class TelecomIntentOperation extends IntentOperation {
    private TelecomTaskService a;
    private Context b;

    static {
    }

    public TelecomIntentOperation() {
    }

    TelecomIntentOperation(Context context0, TelecomTaskService telecomTaskService0) {
        this.b = context0;
        this.a = telecomTaskService0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = this;
        this.a = new TelecomTaskService(this.b);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        if(!"android.intent.action.BOOT_COMPLETED".equals(s) && !"com.google.android.chimera.IntentOperation.NEW_MODULE".equals(s) && !"com.google.android.gms.chimera.container.CONTAINER_UPDATED".equals(s) && !"com.google.android.gms.phenotype.com.google.android.gms.security.COMMITTED".equals(s)) {
            return;
        }
        TelecomTaskService.e(this.a.a);
    }
}

