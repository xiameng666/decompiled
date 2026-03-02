package com.google.android.gms.thunderbird.service;

import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ewny;
import ggfp;
import ggnj;
import hzay;

public class ThunderbirdApiChimeraService extends cjtg {
    public ThunderbirdApiChimeraService() {
        ggfp ggfp0 = ggfp.G(hzay.a.o().D().b);
        super(0xE2, "com.google.android.gms.thunderbird.service.START", ggnj.a, 0, 10, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new ewny(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

