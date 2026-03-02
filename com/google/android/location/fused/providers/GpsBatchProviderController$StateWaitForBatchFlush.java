package com.google.android.location.fused.providers;

import android.os.SystemClock;
import android.os.WorkSource;
import cjnn;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;
import fwcp;
import fwct;
import j..util.Objects;
import jyy;

public class GpsBatchProviderController.StateWaitForBatchFlush extends fwct implements GmsAlarmManagerCompat.OnAlarmListener {
    final fwcp a;

    public GpsBatchProviderController.StateWaitForBatchFlush(fwcp fwcp0) {
        Objects.requireNonNull(fwcp0);
        this.a = fwcp0;
        super(fwcp0);
    }

    @Override  // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(cjnn cjnn0) {
        if(this.g()) {
            this.a.d(this.a.d);
        }
    }

    @Override  // fwct
    public final void c() {
        long v = SystemClock.elapsedRealtime() + 5000L;
        if(v > 0L) {
            WorkSource workSource0 = this.a.workSource_.b();
            jyy jyy0 = new jyy(this.a.h);
            this.a.q.a("com.google.android.location.GPS_BATCH_FLUSH_ALARM", 2, v, workSource0, jyy0, this);
        }
    }

    @Override  // fwct
    public final void d() {
        this.a.f.g();
        this.a.q.d(this);
    }

    @Override  // fwct
    public final String toString() {
        return "wait_for_batch_flush";
    }
}

