package com.google.android.location.reporting.service;

import bbdg;
import ccmq;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import fxtk;

public class UploadChimeraGcmTaskService extends GmsTaskChimeraService {
    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.jm);
        fxtk.f(this.getBaseContext());
        return 0;
    }
}

