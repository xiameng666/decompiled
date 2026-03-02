package com.google.android.gms.icing.proxy;

import android.content.Intent;
import bbdg;
import bwyp;
import bwzd;
import ccmq;
import com.google.android.chimera.IntentOperation;

public class ToggleContactsIndexerIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.nm);
        bwzd.j("Handling global search source toggled intent");
        if("com.google.android.gms.icing.GlobalSearchSourceToggled".equals(intent0.getAction()) && "contacts_contact_id".equals(intent0.getStringExtra("SourceName"))) {
            boolean z = intent0.getBooleanExtra("Enabled", false);
            synchronized(bwyp.a) {
                bwyp.b = Boolean.valueOf(z);
            }
        }
    }
}

