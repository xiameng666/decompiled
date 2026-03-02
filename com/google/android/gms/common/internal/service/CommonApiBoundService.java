package com.google.android.gms.common.internal.service;

import baui;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class CommonApiBoundService extends cjtg {
    public CommonApiBoundService() {
        super(39, "com.google.android.gms.common.service.START", ggnj.a, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new baui(getServiceRequest0.f, this.l()));
    }
}

