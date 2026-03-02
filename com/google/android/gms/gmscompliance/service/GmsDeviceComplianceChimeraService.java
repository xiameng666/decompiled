package com.google.android.gms.gmscompliance.service;

import btey;
import btgk;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import fgvt;
import fgvy;
import ggnj;

public class GmsDeviceComplianceChimeraService extends cjtg {
    private final btgk a;
    private final fgvt b;

    public GmsDeviceComplianceChimeraService() {
        super(0x101, "com.google.android.gms.gmscompliance.service.START", ggnj.a, 1, 10, ggnj.a);
        this.b = new fgvy();
        this.a = new btgk();
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new btey(this, this.l(), this.a, this.b, getServiceRequest0.f, getServiceRequest0.p));
    }
}

