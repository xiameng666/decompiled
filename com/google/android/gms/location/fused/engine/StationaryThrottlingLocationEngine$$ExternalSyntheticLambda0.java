package com.google.android.gms.location.fused.engine;

import android.location.Location;
import cjnn;
import cmtm;
import cmva;
import cmyn;
import cnwg;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;
import fgvx;
import gftb;
import j..time.Instant;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public final class StationaryThrottlingLocationEngine..ExternalSyntheticLambda0 implements GmsAlarmManagerCompat.OnAlarmListener {
    public final cmva a;

    public StationaryThrottlingLocationEngine..ExternalSyntheticLambda0(cmva cmva0) {
        this.a = cmva0;
    }

    @Override  // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(cjnn cjnn0) {
        cmva cmva0 = this.a;
        synchronized(cmva0.f) {
            if(cmva0.d != cjnn0) {
                return;
            }
            cmva0.d = null;
            gftb.q(cmva0.c);
            long v1 = fgvx.a();
            long v2 = Instant.now().toEpochMilli();
            Location location0 = new Location(((Location)Objects.requireNonNull(cmva0.e)));
            location0.setTime(v2);
            location0.setElapsedRealtimeNanos(v1);
            cnwg.a(location0, TimeUnit.NANOSECONDS.toMillis(v1 - ((Location)Objects.requireNonNull(cmva0.e)).getElapsedRealtimeNanos()), 1.4f, 0.35f, 100.0f, 100.0f);
            cmva0.i(cmtm.f(location0));
            cmyn cmyn0 = cmva0.b;
            if(cmyn0 != null) {
                cmyn0.a();
            }
            if(cmva0.c) {
                cmva0.s();
            }
        }
    }
}

