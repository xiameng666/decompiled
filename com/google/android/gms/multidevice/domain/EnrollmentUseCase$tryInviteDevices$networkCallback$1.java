package com.google.android.gms.multidevice.domain;

import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import cssq;
import cszv;
import cszw;
import ibuq;
import icbb;
import java.util.List;

public final class EnrollmentUseCase.tryInviteDevices.networkCallback.1 extends NetworkCallbackWrapper {
    final cszw a;
    final cssq b;
    final List c;

    public EnrollmentUseCase.tryInviteDevices.networkCallback.1(cszw cszw0, cssq cssq0, List list0) {
        this.a = cszw0;
        this.b = cssq0;
        this.c = list0;
        super("multidevice", "SystemServiceModuleNetworkCallback");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network0) {
        ibuq.f(network0, "network");
        cszv cszv0 = new cszv(this.a, this.b, this.c, null);
        icbb.b(this.a.c, null, null, cszv0, 3);
        this.a.d.unregisterNetworkCallback(this);
    }
}

