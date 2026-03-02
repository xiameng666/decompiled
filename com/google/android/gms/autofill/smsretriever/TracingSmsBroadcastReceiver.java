package com.google.android.gms.autofill.smsretriever;

import android.content.Context;
import android.content.Intent;
import apgz;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import gmcu;

public class TracingSmsBroadcastReceiver extends TracingBroadcastReceiver {
    private final gmcu a;

    public TracingSmsBroadcastReceiver(gmcu gmcu0) {
        super("autofill");
        this.a = gmcu0;
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if("com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED".equals(intent0.getAction())) {
            Status status0 = (Status)intent0.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            if(status0 != null) {
                apgz apgz0 = new apgz(intent0.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE"), status0.i);
                this.a.q(apgz0);
            }
        }
    }
}

