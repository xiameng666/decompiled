package com.google.android.gms.fido.api.firstparty;

import blnv;
import bmnc;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class FidoFirstPartyApiChimeraService extends cjtg {
    public FidoFirstPartyApiChimeraService() {
        super(347, "com.google.android.gms.fido.fido2.firstparty.START", ggnj.a, 0, 9, blnv.W);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new bmnc(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

