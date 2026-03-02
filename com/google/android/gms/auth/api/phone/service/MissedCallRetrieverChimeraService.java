package com.google.android.gms.auth.api.phone.service;

import aibe;
import baun;
import cclw;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;
import ibuq;

public final class MissedCallRetrieverChimeraService extends cjtg {
    private static final baun a;

    static {
        MissedCallRetrieverChimeraService.a = new baun("MissedCallService", new String[0]);
    }

    public MissedCallRetrieverChimeraService() {
        super(411, "com.google.android.gms.auth.api.phone.service.MissedCallRetrieverService.START", ggnj.a, 3, 10);
    }

    @Override  // cjtg
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ibuq.f(getServiceRequest0, "request");
        String s = getServiceRequest0.f;
        MissedCallRetrieverChimeraService.a.h("MissedCallRetrieverChimeraService#onGetService invoked by " + s, new Object[0]);
        ibuq.c(s);
        cjtn0.c(new aibe(this, s, cclw.d));
    }
}

