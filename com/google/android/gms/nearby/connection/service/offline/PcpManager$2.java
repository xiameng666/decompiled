package com.google.android.gms.nearby.connection.service.offline;

import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import cvbt;
import cvkr;
import cvnp;
import j..util.Objects;

public class PcpManager.2 extends NetworkCallbackWrapper {
    final String a;
    final cvbt b;
    public final cvnp c;

    public PcpManager.2(cvnp cvnp0, String s, cvbt cvbt0) {
        this.a = s;
        this.b = cvbt0;
        Objects.requireNonNull(cvnp0);
        this.c = cvnp0;
        super("nearby", "PcpManager");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network0) {
        cvkr cvkr0 = new cvkr(this, this.a, this.b);
        this.c.W(cvkr0);
    }
}

