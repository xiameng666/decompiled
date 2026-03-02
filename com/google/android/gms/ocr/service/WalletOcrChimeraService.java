package com.google.android.gms.ocr.service;

import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import dklm;
import ggfp;
import ggnj;
import hvvd;

public class WalletOcrChimeraService extends cjtg {
    public WalletOcrChimeraService() {
        ggfp ggfp0 = ggfp.G(hvvd.a.b().a().b);
        super(279, "com.google.android.gms.ocr.service.START", ggnj.a, 0, 9, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new dklm(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
    }
}

