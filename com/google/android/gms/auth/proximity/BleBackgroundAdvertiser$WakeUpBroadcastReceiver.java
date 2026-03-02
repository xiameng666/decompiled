package com.google.android.gms.auth.proximity;

import akur;
import akus;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import esaa;
import j..util.Objects;

public class BleBackgroundAdvertiser.WakeUpBroadcastReceiver extends TracingBroadcastReceiver {
    public final akus a;

    public BleBackgroundAdvertiser.WakeUpBroadcastReceiver(akus akus0) {
        Objects.requireNonNull(akus0);
        this.a = akus0;
        super("auth_proximity");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        akus.a.h("Waking up to rotate advertisement data.", new Object[0]);
        esaa esaa0 = new esaa(context0, 1, "BleBackgroundAdvertiser");
        esaa0.c(akus.b);
        this.a.d();
        akur akur0 = new akur(this, esaa0);
        this.a.c(akur0);
    }
}

