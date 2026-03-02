package com.google.android.gms.auth.cryptauth.service;

import ajgw;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

public final class CryptauthChimeraService extends cjtg {
    public CryptauthChimeraService() {
        super(0x81, "com.google.android.gms.auth.cryptauth.cryptauthservice.START", Collections.EMPTY_SET, 0, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new ajgw(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

