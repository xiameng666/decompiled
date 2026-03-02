package com.google.android.gms.dck.service;

import bhgz;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class DigitalKeyFrameworkApiChimeraService extends cjtg {
    public DigitalKeyFrameworkApiChimeraService() {
        super(289, "com.google.android.gms.dck.service.START", ggnj.a, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new bhgz(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

