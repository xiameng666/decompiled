package com.google.android.location.fused.providers;

import android.os.SystemClock;
import android.os.WorkSource;
import cjnn;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;
import fwct;
import fwcv;
import j..util.Objects;
import jyy;

public class GpsPulseProviderController.StatePulseWait extends fwct implements GmsAlarmManagerCompat.OnAlarmListener {
    final fwcv a;
    private cjnn b;

    public GpsPulseProviderController.StatePulseWait(fwcv fwcv0) {
        Objects.requireNonNull(fwcv0);
        this.a = fwcv0;
        super(fwcv0);
    }

    @Override  // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(cjnn cjnn0) {
        if(this.g()) {
            this.a.d(this.a.o);
        }
    }

    @Override  // fwct
    public final void c() {
        long v = SystemClock.elapsedRealtime();
        fwcv fwcv0 = this.a;
        long v1 = v + fwcv0.f();
        WorkSource workSource0 = fwcv0.workSource_.b();
        jyy jyy0 = new jyy(fwcv0.h);
        if(v1 < 0L) {
            v1 = 0x7FFFFFFFFFFFFFFFL;
        }
        this.b = fwcv0.q.a("GpsPulseProviderController:PulseWait", 2, v1, workSource0, jyy0, this);
    }

    @Override  // fwct
    public final void d() {
        cjnn cjnn0 = this.b;
        if(cjnn0 != null) {
            cjnn0.a();
            this.b = null;
        }
    }

    @Override  // fwct
    public final String toString() {
        return "waiting_to_pulse";
    }
}

