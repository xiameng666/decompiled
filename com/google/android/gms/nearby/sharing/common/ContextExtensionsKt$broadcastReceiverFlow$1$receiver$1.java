package com.google.android.gms.nearby.sharing.common;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import dcvz;
import icgz;
import ichm;

public final class ContextExtensionsKt.broadcastReceiverFlow.1.receiver.1 extends TracingBroadcastReceiver {
    final String a;
    final ichm b;

    public ContextExtensionsKt.broadcastReceiverFlow.1.receiver.1(String s, ichm ichm0) {
        this.a = s;
        this.b = ichm0;
        super("nearby", s);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0 != null) {
            String s = this.a;
            if((this.b.b(intent0) instanceof icgz)) {
                dcvz.a.c().i("failure sending intent %s in component %s", intent0, s);
            }
        }
    }
}

