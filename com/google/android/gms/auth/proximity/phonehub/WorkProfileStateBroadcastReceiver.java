package com.google.android.gms.auth.proximity.phonehub;

import albt;
import alis;
import alrt;
import android.content.Context;
import android.content.Intent;
import bboh;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ggfp;
import ggtj;
import hpzm;
import java.util.Timer;

public class WorkProfileStateBroadcastReceiver extends TracingBroadcastReceiver {
    public static final ggfp a;
    public Timer b;
    private static final bboh c;

    static {
        WorkProfileStateBroadcastReceiver.c = alis.a("WorkProfileStateBroadcastReceiver");
        WorkProfileStateBroadcastReceiver.a = ggfp.M("android.intent.action.MANAGED_PROFILE_AVAILABLE", "android.intent.action.MANAGED_PROFILE_UNAVAILABLE", "android.intent.action.MANAGED_PROFILE_ADDED", "android.intent.action.MANAGED_PROFILE_REMOVED");
    }

    public WorkProfileStateBroadcastReceiver() {
        super("auth_proximity");
        this.b = null;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(!albt.c()) {
            ((ggtj)WorkProfileStateBroadcastReceiver.c.j()).x("Exo is not supported!");
            return;
        }
        String s = intent0.getAction();
        if(!WorkProfileStateBroadcastReceiver.a.contains(s)) {
            ((ggtj)WorkProfileStateBroadcastReceiver.c.j()).x("Unexpected intent action.");
            return;
        }
        ((ggtj)WorkProfileStateBroadcastReceiver.c.h()).x("Sending work profile state changed info.");
        Timer timer0 = this.b;
        if(timer0 != null) {
            timer0.cancel();
        }
        Timer timer1 = new Timer();
        this.b = timer1;
        timer1.schedule(new alrt(this), hpzm.a.f().m());
    }
}

