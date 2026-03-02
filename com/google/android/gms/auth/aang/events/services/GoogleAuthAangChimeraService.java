package com.google.android.gms.auth.aang.events.services;

import adfl;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public final class GoogleAuthAangChimeraService extends cjtg {
    public GoogleAuthAangChimeraService() {
        super(343, "com.google.android.gms.auth.aang.events.services.START", ggnj.a, 1, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new adfl(this.l(), getServiceRequest0.f, this.getApplicationContext(), cjtn0.e()));
    }
}

