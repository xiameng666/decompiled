package com.google.android.gms.droidguard.loader;

import bbcu;
import bboh;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;

public class VmPrefetcherTaskService extends GmsTaskBoundService {
    public static final bboh a;

    static {
        VmPrefetcherTaskService.a = bboh.b("DGVMP", bbcu.z);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        throw null;
    }
}

