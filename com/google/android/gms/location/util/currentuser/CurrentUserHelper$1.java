package com.google.android.gms.location.util.currentuser;

import android.content.Context;
import android.content.Intent;
import cnws;
import cnwt;
import cnwu;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class CurrentUserHelper.1 extends TracingBroadcastReceiver {
    final cnwu a;

    public CurrentUserHelper.1(cnwu cnwu0, String s) {
        Objects.requireNonNull(cnwu0);
        this.a = cnwu0;
        super("location", s);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        cnwu cnwu0 = this.a;
        boolean z = cnwu0.d();
        synchronized(cnwu0) {
            cnwu0.c = z;
            cnwt cnwt0 = cnwu0.b;
            if(cnwt0 == null) {
                return;
            }
            cnws cnws0 = new cnws(cnwu0, cnwt0);
            cnwu0.a.execute(cnws0);
        }
    }
}

