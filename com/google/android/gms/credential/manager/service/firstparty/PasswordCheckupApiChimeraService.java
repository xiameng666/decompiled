package com.google.android.gms.credential.manager.service.firstparty;

import bbdg;
import becm;
import ccmq;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggdx;
import ggfp;
import ggnj;
import hfuo;
import hsab;
import ibuq;

public class PasswordCheckupApiChimeraService extends cjtg {
    public PasswordCheckupApiChimeraService() {
        hfuo hfuo0 = hsab.a.d().e().b;
        ibuq.e(hfuo0, "getElementList(...)");
        ggfp ggfp0 = ggdx.d(hfuo0);
        super(0xC4, "com.google.android.gms.credential.manager.service.firstparty.checkup.START", ggnj.a, 0, 10, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new becm(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        ccmq.a().a(bbdg.ah);
    }
}

