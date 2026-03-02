package com.google.android.gms.credential.manager.service.zeroparty;

import bgok;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class PasswordCheckupApiChimeraService extends cjtg {
    public PasswordCheckupApiChimeraService() {
        super(0xC4, "com.google.android.gms.credential.manager.service.zeroparty.checkup.START", ggnj.a, 0, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new bgok(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

