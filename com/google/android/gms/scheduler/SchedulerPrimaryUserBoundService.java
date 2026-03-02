package com.google.android.gms.scheduler;

import bbdg;
import ccmq;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import ekrt;
import fhcd;
import gftb;
import ggnj;
import hrvr;

public class SchedulerPrimaryUserBoundService extends cjtg {
    public SchedulerPrimaryUserBoundService() {
        super(0xDA, "com.google.android.gms.scheduler.ACTION_PROXY_SCHEDULE_SINGLE_USER", ggnj.a, 0, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        if(!hrvr.c() && fhcd.g(this)) {
            cjtn0.a(16, null);
            return;
        }
        gftb.z(this.l, "LifecycleSynchronizer not set");
        cjtn0.c(new ekrt(new cjts(this.getApplicationContext(), this.l, this.e), getServiceRequest0.f, getServiceRequest0.p));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        ccmq.a().a(bbdg.so);
    }
}

