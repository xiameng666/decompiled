package com.google.android.gms.fido.api.headless;

import bmnz;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggfp;

public class FidoHeadlessApiChimeraService extends cjtg {
    private static final ggfp a;

    static {
        FidoHeadlessApiChimeraService.a = ggfp.K("android.permission-group.LOCATION", "android.permission-group.STORAGE");
    }

    public FidoHeadlessApiChimeraService() {
        super(180, "com.google.android.gms.fido.fido2.zeroparty.START", FidoHeadlessApiChimeraService.a, 0, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new bmnz(this, this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

