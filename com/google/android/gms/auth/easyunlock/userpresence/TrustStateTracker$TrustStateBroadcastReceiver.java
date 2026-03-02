package com.google.android.gms.auth.easyunlock.userpresence;

import ajma;
import ajmb;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class TrustStateTracker.TrustStateBroadcastReceiver extends TracingBroadcastReceiver {
    private final ajmb a;

    public TrustStateTracker.TrustStateBroadcastReceiver(ajmb ajmb0) {
        super("auth_easyunlock");
        this.a = ajmb0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.trustagent.TRUST_STATE_CHANGED")) {
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 != null && bundle0.keySet().contains("is_trusted")) {
                intent0.getBooleanExtra("is_trusted", false);
                Object object0 = this.a.b;
                synchronized(object0) {
                    for(Object object1: this.a.e) {
                        ((ajma)object1).e();
                    }
                }
            }
        }
    }
}

