package com.google.android.gms.pay.homescreen;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import dnta;
import j..util.Objects;

public class HomescreenFragment.2 extends TracingBroadcastReceiver {
    final dnta a;

    public HomescreenFragment.2(dnta dnta0) {
        Objects.requireNonNull(dnta0);
        this.a = dnta0;
        super("pay");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        this.a.ah.f.b.u(0, this.a.ah.f.b.b());
    }
}

