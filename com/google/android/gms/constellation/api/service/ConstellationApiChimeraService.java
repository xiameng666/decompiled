package com.google.android.gms.constellation.api.service;

import bbwv;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggfp;
import ggnj;
import hrfv;

public class ConstellationApiChimeraService extends cjtg {
    public ConstellationApiChimeraService() {
        ggfp ggfp0 = ggfp.G(hrfv.a.b().c().b);
        super(0x9B, "com.google.android.gms.constellation.service.START", ggnj.a, 0, 10, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        String s = getServiceRequest0.f;
        String s1 = getServiceRequest0.p;
        cjtn0.c(new bbwv(this, this.l(), s, s1));
    }
}

