package com.google.android.gms.carrierauth.service;

import atqq;
import atqy;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import gfud;
import ggfp;
import ggnj;
import hrde;

public class CarrierAuthApiChimeraService extends cjtg {
    public CarrierAuthApiChimeraService() {
        ggfp ggfp0 = ggfp.G(gfud.e(',').n(hrde.c()));
        super(0xBF, "com.google.android.gms.carrierauth.service.START", ggnj.a, 0, 10, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        String s = getServiceRequest0.f;
        String s1 = getServiceRequest0.p;
        cjtn0.c(new atqy(this, this.l(), new atqq(), s, s1));
    }
}

