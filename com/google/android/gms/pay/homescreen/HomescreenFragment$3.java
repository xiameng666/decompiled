package com.google.android.gms.pay.homescreen;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import dnta;
import dobl;
import doeb;
import edoq;
import j..util.Objects;

public class HomescreenFragment.3 extends TracingBroadcastReceiver {
    final dnta a;

    public HomescreenFragment.3(dnta dnta0) {
        Objects.requireNonNull(dnta0);
        this.a = dnta0;
        super("pay");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        dobl dobl0 = this.a.ah;
        doeb doeb0 = dobl0.e;
        edoq edoq0 = doeb0.b;
        if(doeb0.g != edoq0.a()) {
            if(dobl0.j) {
                dobl0.r(0);
            }
            doeb0.g = edoq0.a();
        }
    }
}

