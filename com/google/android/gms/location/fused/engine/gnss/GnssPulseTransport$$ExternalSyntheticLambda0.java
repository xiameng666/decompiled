package com.google.android.gms.location.fused.engine.gnss;

import cjnn;
import cmwe;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;

public final class GnssPulseTransport..ExternalSyntheticLambda0 implements GmsAlarmManagerCompat.OnAlarmListener {
    public final cmwe a;

    public GnssPulseTransport..ExternalSyntheticLambda0(cmwe cmwe0) {
        this.a = cmwe0;
    }

    @Override  // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(cjnn cjnn0) {
        cmwe cmwe0 = this.a;
        synchronized(cmwe0) {
            if(cjnn0 != cmwe0.f) {
                return;
            }
            cmwe0.f = null;
            cmwe0.c();
        }
    }
}

