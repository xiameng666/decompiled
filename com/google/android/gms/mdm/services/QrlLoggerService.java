package com.google.android.gms.mdm.services;

import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import cqqm;
import cqqn;
import cqrb;
import glzd;
import gmap;
import hgzp;
import j..util.Objects;

public class QrlLoggerService extends GmsTaskBoundService {
    public static final int a;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        if(!Objects.equals(cllr0.a, "qrl_logging")) {
            return 2;
        }
        cqqn.b(glzd.f(cqrb.a(this.getApplicationContext(), hgzp.dB), new cqqm(), gmap.a), "Failed to logQuickRemoteLockEventSampled");
        return 0;
    }
}

