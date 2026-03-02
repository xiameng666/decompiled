package com.google.android.gms.nearby.connection.service.offline.dct.wifi;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import cvau;
import cvwq;
import j..util.Objects;
import java.util.concurrent.CountDownLatch;

public class WifiConnectionManager.NetworkCallback extends NetworkCallbackWrapper {
    final cvwq a;
    private final int b;
    private final CountDownLatch c;

    public WifiConnectionManager.NetworkCallback(cvwq cvwq0, Context context0, int v, CountDownLatch countDownLatch0) {
        Objects.requireNonNull(cvwq0);
        this.a = cvwq0;
        super(context0, "connections");
        this.b = v;
        this.c = countDownLatch0;
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network0) {
        int v = this.a.a();
        cvau.a.a().j("%s Network available: %d, expectedWifiManagerNetworkId: %d", "[WifiConnectionManager]", Integer.valueOf(v), Integer.valueOf(this.b));
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void b(Network network0, NetworkCapabilities networkCapabilities0) {
        int v = this.a.a();
        cvau.a.a().j("%s Capability change for network: %d: %s", "[WifiConnectionManager]", Integer.valueOf(v), networkCapabilities0.toString());
        if(v == this.b && (cvwq.e(networkCapabilities0) || networkCapabilities0.hasCapability(17))) {
            this.c.countDown();
        }
    }
}

