package com.google.android.libraries.onboarding.stableenvironment.autoremoval;

import babh;
import cclw;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import fnex;
import gmcd;
import icck;
import iccl;
import icpu;

public class GmsStableEnvironmentAutoRemovalService extends GmsTaskBoundService {
    private final icck a;

    public GmsStableEnvironmentAutoRemovalService() {
        this.a = iccl.b(cclw.c);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        fnex fnex0 = new fnex(cllr0, this, babh.a(), null);
        return icpu.e(this.a, fnex0);
    }
}

