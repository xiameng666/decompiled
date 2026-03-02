package com.google.android.gms.auth.config;

import ajcz;
import ajdb;
import ajde;
import amff;
import cjtg;
import cjtn;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.GetServiceRequest;
import einq;
import ggnj;
import ggoh;

public class ConfigSyncApiChimeraService extends cjtg {
    public ConfigSyncApiChimeraService() {
        ggoh ggoh0 = new ggoh("com.google.android.setupwizard");
        super(0xDD, "com.google.android.gms.auth.config.service.START", ggnj.a, 0, 9, ggoh0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new ajcz(this.l(), new ajde(new einq(this), new amff(), new ajdb(ModuleManager.get(this))), getServiceRequest0.f));
    }
}

