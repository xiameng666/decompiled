package com.google.android.gms.wearable.backup.wear;

import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import fcvj;
import j..util.Objects;
import jqt;

public class WifiConnectionHelper.1 extends NetworkCallbackWrapper {
    final jqt a;

    public WifiConnectionHelper.1(fcvj fcvj0, jqt jqt0) {
        this.a = jqt0;
        Objects.requireNonNull(fcvj0);
        super("wearable", "WifiConnectionHelperNetworkCallback");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network0) {
        fcvj.a.j("Wi-Fi network connected", new Object[0]);
        this.a.b(Boolean.valueOf(true));
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network0) {
        fcvj.a.m("Wi-Fi network lost, continuing restore with Wi-Fi over BT proxy", new Object[0]);
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void d() {
        fcvj.a.m("Cannot connect to Wi-Fi, restoring with Wi-Fi over BT proxy", new Object[0]);
        this.a.b(Boolean.valueOf(false));
    }
}

