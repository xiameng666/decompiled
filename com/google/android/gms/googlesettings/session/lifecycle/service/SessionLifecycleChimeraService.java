package com.google.android.gms.googlesettings.session.lifecycle.service;

import bvah;
import bvai;
import bval;
import bvba;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ibnn;
import ibnz;
import ibpu;
import ibuq;

public final class SessionLifecycleChimeraService extends bvah {
    public final ibnn a;
    public bvba b;

    public SessionLifecycleChimeraService() {
        super(349, "com.google.android.gms.googlesettings.session.lifecycle.service.START", ibpu.a, 0, 9);
        this.a = new ibnz(new bvai(this));
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ibuq.f(getServiceRequest0, "request");
        cjtn0.c(new bval(this));
    }
}

