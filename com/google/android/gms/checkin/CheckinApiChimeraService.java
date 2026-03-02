package com.google.android.gms.checkin;

import avqp;
import avtt;
import baun;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggfp;
import ggnj;
import ggoh;
import hqvj;

public class CheckinApiChimeraService extends cjtg {
    private static final baun a;
    private static final ggfp b;

    static {
        CheckinApiChimeraService.a = avtt.a("CheckinApiChimeraService");
        CheckinApiChimeraService.b = new ggoh("org.chromium.arc.gms");
    }

    public CheckinApiChimeraService() {
        int v = hqvj.c() ? 0 : 9;
        super(130, "com.google.android.gms.checkin.START", ggnj.a, 1, v, CheckinApiChimeraService.b);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        CheckinApiChimeraService.a.h("onGetService", new Object[0]);
        cjtn0.c(new avqp(this, this.l()));
    }
}

