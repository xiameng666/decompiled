package com.google.android.gms.update.control;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ezwz;
import jwe;

public abstract class ActiveStateTrackingBroadcastReceiver extends TracingBroadcastReceiver {
    public final Object a;
    public boolean b;

    public ActiveStateTrackingBroadcastReceiver() {
        super("ota");
        this.a = new Object();
        this.b = false;
    }

    public abstract void b(Context arg1, Intent arg2);

    public final void c(Context context0, IntentFilter intentFilter0) {
        synchronized(this.a) {
            if(!this.b) {
                this.b = true;
                jwe.b(context0, this, intentFilter0, 2);
            }
        }
    }

    public final void d(Context context0) {
        synchronized(this.a) {
            if(this.b) {
                context0.unregisterReceiver(this);
                this.b = false;
            }
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        new ezwz(this, context0, intent0).start();
    }
}

