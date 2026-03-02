package com.google.android.gms.nearby.fastpair.audioshare;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import cybp;
import cycj;
import cyjh;
import ibuq;
import icbb;

public final class LeAudioSharingManager.broadcastReceiver.2.1 extends TracingBroadcastReceiver {
    final cycj a;

    public LeAudioSharingManager.broadcastReceiver.2.1(cycj cycj0) {
        this.a = cycj0;
        super("nearby", "BroadcastReceiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ibuq.f(context0, "context");
        if(ibuq.m((intent0 == null ? null : intent0.getAction()), "com.google.android.gms.nearby.fastpair.audioshare.ACTION_PREPARE_SWAP_GUEST_DEVICE")) {
            cyjh.a.d().B("%s: Receiving swap guest broadcast", "LeAudioSharingManager");
            cybp cybp0 = new cybp(this.a, null);
            icbb.b(this.a.i, null, null, cybp0, 3);
        }
    }
}

