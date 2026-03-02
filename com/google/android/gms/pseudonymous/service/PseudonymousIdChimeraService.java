package com.google.android.gms.pseudonymous.service;

import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ejkj;
import java.util.Collections;

public final class PseudonymousIdChimeraService extends cjtg {
    public PseudonymousIdChimeraService() {
        super(38, "com.google.android.gms.pseudonymous.service.START", Collections.EMPTY_SET, 2, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new ejkj(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

