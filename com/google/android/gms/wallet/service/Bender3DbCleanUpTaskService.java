package com.google.android.gms.wallet.service;

import android.content.Context;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import gbkv;
import gblq;
import gbls;
import gmbu;
import gmcd;
import ibuq;
import oqj;

public class Bender3DbCleanUpTaskService extends GmsTaskBoundService {
    public static final int a;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        Context context0 = this.getApplicationContext();
        ibuq.f(context0, "context");
        oqj.b(((gbls)gbkv.a.a(context0).x()).a, false, true, new gblq(System.currentTimeMillis()));
        return gmbu.i(Integer.valueOf(0));
    }
}

