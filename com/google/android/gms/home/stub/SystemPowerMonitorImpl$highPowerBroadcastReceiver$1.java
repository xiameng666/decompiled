package com.google.android.gms.home.stub;

import android.content.Context;
import android.content.Intent;
import bboh;
import bwiy;
import bwiz;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ggtj;
import ibuq;
import j..util.Objects;

public final class SystemPowerMonitorImpl.highPowerBroadcastReceiver.1 extends TracingBroadcastReceiver {
    final bwiz a;

    public SystemPowerMonitorImpl.highPowerBroadcastReceiver.1(bwiz bwiz0, Context context0) {
        this.a = bwiz0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        String s = intent0.getAction();
        if(!Objects.equals(s, "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED") && !Objects.equals(s, "android.os.action.LOW_POWER_STANDBY_POLICY_CHANGED")) {
            return;
        }
        bboh bboh0 = bwiz.a;
        ((ggtj)bboh0.h()).B("Power mode update: %s", s);
        bwiz bwiz0 = this.a;
        String s1 = bwiy.a(bwiz0.b);
        ((ggtj)bboh0.h()).B("Energy mode is now %s", s1);
        synchronized(bwiz0) {
            synchronized(bwiz0) {
                ((ggtj)bboh0.j()).x("Already unregistered energy mode listener");
            }
        }
    }
}

