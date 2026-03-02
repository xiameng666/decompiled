package com.google.android.gms.networktransparency.init;

import bbcu;
import bbdg;
import bboh;
import ccmq;
import cllr;
import djjd;
import djjv;
import gmcd;
import ibrt;
import ibuq;
import iccl;
import icpu;

public final class NetworkDataUpdateTaskBoundService extends Pommel_NetworkDataUpdateTaskBoundService {
    public static final bboh a;
    public djjv b;
    public ibrt c;

    static {
        NetworkDataUpdateTaskBoundService.a = bboh.b("NetworkTransparency", bbcu.gc);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        ccmq.a().a(bbdg.tZ);
        ibrt ibrt0 = this.c;
        if(ibrt0 == null) {
            ibuq.j("coroutineContext");
            ibrt0 = null;
        }
        return icpu.e(iccl.b(ibrt0), new djjd(this, null));
    }
}

