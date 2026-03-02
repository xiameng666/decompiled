package com.google.android.gms.nearby.sharing.sliceprovider;

import android.content.Context;
import android.content.Intent;
import bata;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import diwn;
import j..util.Objects;

public class ConsentSliceProvider.ConsentChangeIntentReceiver extends TracingBroadcastReceiver {
    final diwn a;

    public ConsentSliceProvider.ConsentChangeIntentReceiver(diwn diwn0) {
        Objects.requireNonNull(diwn0);
        this.a = diwn0;
        super("nearby");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        if(!bata.b(s, "com.google.android.gms.nearby.sharing.STATE_CHANGED") && !bata.b(s, "com.google.android.gms.nearby.sharing.DEVICE_CONTACTS_CONSENT_ENABLED") && !bata.b(s, "com.google.android.gms.nearby.sharing.ACTION_C11N_CONSENT_RESULT")) {
            return;
        }
        this.a.a = null;
        this.a.b();
    }
}

