package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import bsoj;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import fdob;
import fdsh;
import fdyw;
import fdyy;
import j..util.Objects;

public class GcmMessageReceiver extends TracingBroadcastReceiver {
    private final fdyy a;
    private final fdsh b;

    public GcmMessageReceiver(fdyy fdyy0, fdsh fdsh0) {
        super("wearable");
        this.a = fdyy0;
        this.b = fdsh0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        try {
            bsoj.a(context0);
            if(Objects.equals(bsoj.e(intent0), "gcm")) {
                String s = intent0.getStringExtra("type");
                if(Objects.equals(s, "rpc")) {
                    Bundle bundle0 = intent0.getExtras();
                    fdob.i(7, bundle0.getString("pkgName"));
                    fdyw fdyw0 = new fdyw(this.a, bundle0);
                    this.a.k.post(fdyw0);
                }
                else if(Objects.equals(s, "tickle")) {
                    fdsh fdsh0 = this.b;
                    Bundle bundle1 = intent0.getExtras();
                    if(Log.isLoggable("CloudNode", 2)) {
                        Log.v("CloudNode", "Received message from the cloud, yay, scheduling fetch" + bundle1);
                    }
                    fdob.i(2, null);
                    fdsh0.u = true;
                    fdsh0.i.f(1);
                }
            }
        }
        finally {
            if(this.isOrderedBroadcast()) {
                this.setResultCode(-1);
            }
        }
    }
}

