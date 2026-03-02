package com.google.android.gms.auth.blockstore.service;

import aiqk;
import aiqz;
import airt;
import aity;
import aitz;
import aizf;
import aizo;
import android.content.Intent;
import android.os.Bundle;
import avzf;
import bbod;
import bboh;
import com.google.android.gms.auth.blockstore.service.cloudsync.CloudSyncBackupTaskService;
import com.google.android.gms.auth.blockstore.service.metrics.LocalStorageUsageLoggingTaskService;
import ggtj;
import glzd;
import gmap;
import gmbg;
import gmbt;
import gmbu;
import hprv;
import hpsd;
import hpsg;

public class BlockstoreModuleInitIntentOperation extends avzf {
    public static final bboh a;
    private final gmbg b;
    private final gmbg c;

    static {
        BlockstoreModuleInitIntentOperation.a = aiqz.b("BlockstoreModuleInitIntentOperation");
    }

    public BlockstoreModuleInitIntentOperation() {
        this.b = new aity(this);
        this.c = new aitz(this);
    }

    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
    }

    @Override  // avzf
    protected final void d(Intent intent0, boolean z) {
        bboh bboh0 = BlockstoreModuleInitIntentOperation.a;
        ((ggtj)bboh0.h()).B("Container update. Module updated: %b", Boolean.valueOf(z));
        if(!bbod.c(hprv.d())) {
            ((ggtj)bboh0.h()).x("Feature flags are not turned on, skipping operations.");
            return;
        }
        Bundle bundle0 = new Bundle();
        gmbt gmbt0 = gmbt.h(new aiqk().c());
        airt airt0 = new airt(this, bundle0);
        gmap gmap0 = gmap.a;
        gmbu.t(gmbt.h(glzd.g(gmbt0, airt0, gmap0)), this.b, gmap0);
        if(hpsd.e()) {
            CloudSyncBackupTaskService.d(this);
        }
        if(hpsd.g()) {
            gmbu.t(gmbt.h(aizo.n().c.b(new aizf(), gmap0)), this.c, gmap0);
        }
        if(hpsg.i()) {
            LocalStorageUsageLoggingTaskService.d(this);
        }
    }
}

