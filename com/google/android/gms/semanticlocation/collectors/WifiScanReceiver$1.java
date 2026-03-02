package com.google.android.gms.semanticlocation.collectors;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import elxd;
import elxe;
import elxf;
import gmap;
import gmcg;
import j..util.Objects;

public class WifiScanReceiver.1 extends TracingBroadcastReceiver {
    final gmcg a;
    public final elxf b;

    public WifiScanReceiver.1(elxf elxf0, Context context0, gmcg gmcg0) {
        this.a = gmcg0;
        Objects.requireNonNull(elxf0);
        this.b = elxf0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        elxd elxd0 = new elxd(this, intent0);
        this.a.d(elxd0).hB(new elxe(), gmap.a);
    }
}

