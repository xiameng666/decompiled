package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import bsmn;
import bsqa;
import bsru;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class DataMessageManager.2 extends TracingBroadcastReceiver {
    final bsmn a;

    public DataMessageManager.2(bsmn bsmn0) {
        Objects.requireNonNull(bsmn0);
        this.a = bsmn0;
        super("gcm");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        bsmn bsmn0 = this.a;
        bsru bsru0 = (bsru)bsmn0.t.get();
        if((s.equals("android.intent.action.USER_ADDED") || s.equals("android.intent.action.USER_REMOVED") || s.equals("android.intent.action.USER_STARTING") || s.equals("android.intent.action.USER_STOPPED") || s.equals("android.intent.action.USER_STOPPING") || s.equals("android.intent.action.USER_SWITCHED")) && bsru0 != null) {
            bsqa bsqa0 = bsmn0.d;
            if(bsqa0 != null) {
                bsqa0.a(intent0, bsru0);
            }
        }
    }
}

