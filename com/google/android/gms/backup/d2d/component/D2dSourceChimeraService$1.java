package com.google.android.gms.backup.d2d.component;

import android.content.Context;
import android.content.Intent;
import ardc;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class D2dSourceChimeraService.1 extends TracingBroadcastReceiver {
    public final D2dSourceChimeraService a;

    public D2dSourceChimeraService.1(D2dSourceChimeraService d2dSourceChimeraService0) {
        Objects.requireNonNull(d2dSourceChimeraService0);
        this.a = d2dSourceChimeraService0;
        super("backup");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        int v = intent0.getIntExtra("e2e_tcp_source_port", -1);
        boolean z = intent0.getBooleanExtra("e2e_is_duplex_transfer", false);
        this.a.b.execute(new ardc(this, z, v));
    }
}

