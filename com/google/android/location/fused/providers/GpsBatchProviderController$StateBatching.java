package com.google.android.location.fused.providers;

import android.os.SystemClock;
import cjnn;
import clic;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;
import fwcp;
import fwct;
import j..util.Objects;
import jyy;

public class GpsBatchProviderController.StateBatching extends fwct implements GmsAlarmManagerCompat.OnAlarmListener {
    public boolean a;
    public final fwcp b;
    private final clic e;

    public GpsBatchProviderController.StateBatching(fwcp fwcp0) {
        Objects.requireNonNull(fwcp0);
        this.b = fwcp0;
        super(fwcp0);
        this.a = false;
        this.e = new clic(this);
    }

    @Override  // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(cjnn cjnn0) {
        if(this.g()) {
            this.b.f.c();
            this.e();
            this.a = true;
        }
    }

    public final void b() {
        this.b.q.d(this);
    }

    @Override  // fwct
    public final void c() {
        fwcp fwcp0 = this.b;
        if(fwcp0.f.h(fwcp0.r_interval_ms, this.e, fwcp0.h)) {
            this.a = false;
            this.e();
            return;
        }
        fwcp0.c = true;
        fwcp0.d(fwcp0.j);
    }

    @Override  // fwct
    public final void d() {
        fwcp fwcp0 = this.b;
        if(!fwcp0.c) {
            this.b();
            if(fwcp0.d == fwcp0.i) {
                fwcp0.f.g();
            }
            else {
                fwcp0.f.c();
            }
        }
        fwcp0.c = false;
    }

    public final void e() {
        long v = SystemClock.elapsedRealtime();
        fwcp fwcp0 = this.b;
        long v1 = v + fwcp0.s;
        if(v1 > 0L) {
            fwcp0.q.a("com.google.android.location.GPS_BATCH_ALARM", 2, v1, fwcp0.workSource_.b(), new jyy(fwcp0.h), this);
        }
    }

    @Override  // fwct
    public final String toString() {
        return "batching";
    }
}

