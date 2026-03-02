package com.google.android.gms.learning.training;

import bbdg;
import ccdf;
import ccmq;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import gftb;
import java.util.Collections;

public class GmsTrainerApiService extends cjtg {
    public GmsTrainerApiService() {
        super(0x8B, "com.google.android.gms.learning.trainer.v2.START", Collections.EMPTY_SET, 2, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        gftb.check(getServiceRequest0);
        cjtn0.c(new ccdf(this.l(), getServiceRequest0));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        ccmq.a().a(bbdg.gy);
    }
}

