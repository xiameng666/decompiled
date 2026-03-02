package com.google.android.gms.update.api;

import bbdg;
import ccmq;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ezvu;
import ggnj;

public class SystemUpdateApiChimeraService extends cjtg {
    public SystemUpdateApiChimeraService() {
        super(0x9D, "com.google.android.gms.update.START_API_SERVICE", ggnj.a, 0, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ccmq.a().a(bbdg.nS);
        cjtn0.c(new ezvu(this, this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

