package com.google.android.gms.semanticlocation.service;

import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import emtu;
import ggnj;

public class SemanticLocationZeroPartyClientChimeraService extends cjtg {
    public SemanticLocationZeroPartyClientChimeraService() {
        super(0xAD, "com.google.android.gms.semanticlocation.zeroparty.service.START", ggnj.a, 0, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new emtu(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

