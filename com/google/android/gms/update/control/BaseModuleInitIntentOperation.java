package com.google.android.gms.update.control;

import android.content.Intent;
import avzf;
import com.google.android.chimera.IntentOperation;

public class BaseModuleInitIntentOperation extends avzf {
    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        this.startService(IntentOperation.getStartIntent(this, ReceiverIntentOperation.class, "com.google.android.gms.update.BASE_MODULE_INIT"));
    }
}

