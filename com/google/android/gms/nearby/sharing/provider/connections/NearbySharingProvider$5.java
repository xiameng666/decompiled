package com.google.android.gms.nearby.sharing.provider.connections;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.ShareTarget;
import dfyq;
import dfyz;
import dfzz;
import j..util.Objects;

public class NearbySharingProvider.5 extends TracingBroadcastReceiver {
    final ShareTarget a;
    final Runnable b;
    public final dfzz c;
    final dfyq d;

    public NearbySharingProvider.5(dfzz dfzz0, ShareTarget shareTarget0, Runnable runnable0, dfyq dfyq0) {
        this.a = shareTarget0;
        this.b = runnable0;
        this.d = dfyq0;
        Objects.requireNonNull(dfzz0);
        this.c = dfzz0;
        super("nearby", "CertificatesDownloadReceiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        dfyz dfyz0 = new dfyz(this, this.a, this.b, this.d);
        this.c.aU(dfyz0);
    }
}

