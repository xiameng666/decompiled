package com.google.android.gms.measurement.service;

import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import crih;
import crqq;
import crtn;
import ggnj;

public final class ChimeraMeasurementApiService extends cjtg {
    public ChimeraMeasurementApiService() {
        super(93, "com.google.android.gms.measurement.START", ggnj.a, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        crqq crqq0 = crqq.y(this);
        if(!crqq0.j.get()) {
            crqq0.aJ().k.a("UploadController is not yet fully initialized");
            cjtn0.a(7777, null);
            return;
        }
        cjtn0.c(new crtn(new crih(crqq0, getServiceRequest0.f)));
    }
}

