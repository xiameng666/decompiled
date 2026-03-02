package com.google.android.gms.location.fused.engine.gnss;

import cjnn;
import cmwe;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;
import ibuq;

public final class GnssPulseTransport..ExternalSyntheticLambda1 implements GmsAlarmManagerCompat.OnAlarmListener {
    public final cmwe a;

    public GnssPulseTransport..ExternalSyntheticLambda1(cmwe cmwe0) {
        this.a = cmwe0;
    }

    @Override  // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(cjnn cjnn0) {
        cmwe cmwe0 = this.a;
        synchronized(cmwe0) {
            if(ibuq.m(cjnn0, cmwe0.e)) {
                cmwe0.e = null;
                cmwe0.d();
            }
        }
    }
}

