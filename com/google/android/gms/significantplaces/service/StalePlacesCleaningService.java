package com.google.android.gms.significantplaces.service;

import a;
import cclw;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import epif;
import epig;
import iccl;
import icpu;
import java.util.concurrent.ExecutionException;

public final class StalePlacesCleaningService extends GmsTaskBoundService {
    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        try {
            icpu.e(iccl.b(cclw.b), new epif(this, null)).get();
            return 0;
        }
        catch(InterruptedException interruptedException0) {
            a.ae(epig.a.j(), "Failed to clean up stale places", interruptedException0);
            return 2;
        }
        catch(ExecutionException executionException0) {
            a.ae(epig.a.j(), "Failed to clean up stale places", executionException0);
            return 2;
        }
    }
}

