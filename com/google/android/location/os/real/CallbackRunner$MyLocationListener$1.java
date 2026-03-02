package com.google.android.location.os.real;

import android.location.Location;
import android.os.SystemClock;
import cjds;
import com.google.android.gms.libs.punchclock.tracing.TracingLocationListener;
import fvsb;
import fwts;
import fwtu;
import huvd;
import j..util.Objects;

public class CallbackRunner.MyLocationListener.1 extends TracingLocationListener {
    final fwts a;

    public CallbackRunner.MyLocationListener.1(fwts fwts0) {
        Objects.requireNonNull(fwts0);
        this.a = fwts0;
        super("CallbackRunner");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingLocationListener
    protected final void b(Location location0) {
        long v;
        if("gps".equals(location0.getProvider())) {
            try {
                v = 0L;
                v = location0.getElapsedRealtimeNanos() / 1000000L;
            }
            catch(NoSuchMethodError unused_ex) {
            }
            if(v == 0L) {
                v = SystemClock.elapsedRealtime();
            }
            if(!fvsb.a(location0)) {
                fwts fwts0 = this.a;
                fwtu fwtu0 = (fwtu)fwts0.a.get();
                if(fwtu0 != null && (!location0.isFromMockProvider() || huvd.s())) {
                    cjds cjds0 = new cjds(location0, v, fwtu0.h.e(), (fwtu0.i == null ? null : fwtu0.i.a()));
                    fwtu0.t(fwts0.b, 0, cjds0, false);
                }
            }
        }
    }
}

