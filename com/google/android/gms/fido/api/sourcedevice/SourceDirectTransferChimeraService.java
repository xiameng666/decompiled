package com.google.android.gms.fido.api.sourcedevice;

import bnbn;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class SourceDirectTransferChimeraService extends cjtg {
    public SourceDirectTransferChimeraService() {
        super(0x106, "com.google.android.gms.fido.sourcedevice.service.START", ggnj.a, 3, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new bnbn(this.l(), getServiceRequest0.f));
    }
}

