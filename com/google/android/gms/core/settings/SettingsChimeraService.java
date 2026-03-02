package com.google.android.gms.core.settings;

import bcxw;
import bcyb;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class SettingsChimeraService extends cjtg {
    public SettingsChimeraService() {
        super(329, "com.google.android.gms.core.settings.service.START", ggnj.a, 0, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new bcyb(this.l(), new bcxw(this), getServiceRequest0.f, getServiceRequest0.p));
    }
}

