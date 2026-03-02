package com.google.android.location.geofencer.service;

import bbdg;
import ccmq;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import fwke;
import fwkf;
import husq;

public class RandomDailyTaskSchedulerService extends GmsTaskBoundService {
    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.iX);
        if(husq.c()) {
            String s = cllr0.a;
            fwkf fwkf0 = fwke.a;
            if("fbeeb89c-f342-11ec-8d0b-935bdf218f60".equals(s)) {
                fwkf0.a();
                return 0;
            }
            if("4905f2f8-f343-11ec-b9ed-0f4a1a138b74".equals(s)) {
                fwkf0.b();
            }
        }
        return 0;
    }
}

