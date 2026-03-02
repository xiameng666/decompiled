package com.google.android.gms.asterism.api.service;

import acoj;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import gfud;
import ggfp;
import ggnj;
import hrcv;

public class AsterismApiChimeraService extends cjtg {
    public AsterismApiChimeraService() {
        ggfp ggfp0 = ggfp.G(gfud.e(',').n(hrcv.c()));
        super(0xC7, "com.google.android.gms.asterism.service.START", ggnj.a, 0, 10, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        String s = getServiceRequest0.f;
        String s1 = getServiceRequest0.p;
        cjtn0.c(new acoj(this, this.l(), s, s1));
    }
}

