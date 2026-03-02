package com.google.android.gms.westworld.perfetto;

import bbdg;
import bblp;
import ccmq;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import ehkj;
import ehks;
import ehkt;
import ffqh;
import gmcd;
import gmcg;

public final class PerfettoScheduledUploadService extends GmsTaskBoundService {
    public static final int a;
    private final gmcg b;

    public PerfettoScheduledUploadService() {
        this.b = new bblp(1, 10);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        ccmq.a().a(bbdg.uR);
        ffqh ffqh0 = new ffqh(this, new ehks(), new ehkj(ehkt.c(this)));
        return this.b.e(ffqh0);
    }
}

