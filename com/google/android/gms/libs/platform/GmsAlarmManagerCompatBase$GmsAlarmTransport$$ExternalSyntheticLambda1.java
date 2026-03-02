package com.google.android.gms.libs.platform;

import cjnn;
import cjnp;

public final class GmsAlarmManagerCompatBase.GmsAlarmTransport..ExternalSyntheticLambda1 implements GmsAlarmManagerCompat.OnAlarmListener {
    public final cjnp a;

    public GmsAlarmManagerCompatBase.GmsAlarmTransport..ExternalSyntheticLambda1(cjnp cjnp0) {
        this.a = cjnp0;
    }

    @Override  // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(cjnn cjnn0) {
        synchronized(this.a.e.c) {
            this.a.d = null;
        }
        this.a.d();
    }
}

