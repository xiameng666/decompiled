package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import dcle;
import j..util.Objects;
import jwh;

class SendSurfaceChimeraService.1 extends TracingBroadcastReceiver {
    final SendSurfaceChimeraService a;

    public SendSurfaceChimeraService.1(SendSurfaceChimeraService sendSurfaceChimeraService0) {
        Objects.requireNonNull(sendSurfaceChimeraService0);
        this.a = sendSurfaceChimeraService0;
        super("nearby", "ForegroundTransitionReceiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.nearby.sharing.TRANSITION_TO_BACKGROUND")) {
            SendSurfaceChimeraService sendSurfaceChimeraService0 = this.a;
            if(sendSurfaceChimeraService0.b != null) {
                Intent intent1 = (Intent)jwh.a(intent0, "nearby_share_fg_intent", Intent.class);
                if(intent1 != null) {
                    dcle dcle0 = sendSurfaceChimeraService0.b;
                    dcle0.c = dcle0.d;
                    dcle0.d = intent1;
                    for(Object object0: dcle0.b.keySet()) {
                        dcle0.a.h(((Long)object0).intValue());
                    }
                }
            }
        }
    }
}

