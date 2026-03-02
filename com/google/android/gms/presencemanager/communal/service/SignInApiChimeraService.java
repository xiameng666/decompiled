package com.google.android.gms.presencemanager.communal.service;

import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ejga;
import ggnj;

public class SignInApiChimeraService extends cjtg {
    public SignInApiChimeraService() {
        super(292, "com.google.android.gms.presencemanager.communal.service.signin.START", ggnj.a, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new ejga(this, this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

