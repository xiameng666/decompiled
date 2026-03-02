package com.google.android.gms.phonesky.recovery.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import eiup;
import gftb;
import j..util.Objects;

class EmergencyPlayStoreInstallIntentOperation.2 extends TracingBroadcastReceiver {
    final String a;
    final EmergencyPlayStoreInstallIntentOperation b;
    final int c;

    public EmergencyPlayStoreInstallIntentOperation.2(EmergencyPlayStoreInstallIntentOperation emergencyPlayStoreInstallIntentOperation0, Context context0, int v, String s) {
        this.c = v;
        this.a = s;
        Objects.requireNonNull(emergencyPlayStoreInstallIntentOperation0);
        this.b = emergencyPlayStoreInstallIntentOperation0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        context0.unregisterReceiver(this);
        int v = this.c == 3 ? 8 : 4;
        String s = this.a;
        EmergencyPlayStoreInstallIntentOperation emergencyPlayStoreInstallIntentOperation0 = this.b;
        int v1 = intent0.getIntExtra("android.content.pm.extra.STATUS", 0x80000000);
        switch(v1) {
            case 0: {
                eiup.a("Commit callback called with status success", new Object[0]);
                emergencyPlayStoreInstallIntentOperation0.c.c(v, s);
                emergencyPlayStoreInstallIntentOperation0.b();
                return;
            }
            case 1: {
                emergencyPlayStoreInstallIntentOperation0.a();
                eiup.b("Commit callback with status failure, status: %d", new Object[]{((int)1)});
                emergencyPlayStoreInstallIntentOperation0.c.d(v, s, 3, 1);
                return;
            }
            default: {
                emergencyPlayStoreInstallIntentOperation0.a();
                String s1 = intent0.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                gftb.check(s1);
                eiup.b("Commit callback called with status %d with extra status message %s", new Object[]{v1, s1});
                emergencyPlayStoreInstallIntentOperation0.c.d(v, s, 3, v1);
            }
        }
    }
}

