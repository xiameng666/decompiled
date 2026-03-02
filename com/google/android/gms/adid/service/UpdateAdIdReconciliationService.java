package com.google.android.gms.adid.service;

import android.content.Context;
import bbcu;
import bboh;
import cllr;
import com.google.android.gms.ads.identifier.log.a;
import com.google.android.gms.ads.identifier.settings.b;
import com.google.android.gms.ads.identifier.util.d;
import com.google.android.gms.chimera.modules.adid.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import honl;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class UpdateAdIdReconciliationService extends GmsTaskBoundService {
    public static final Executor a;
    private final Context b;
    private final d c;
    private final a d;
    private final b e;

    static {
        bboh.b("UpdateAdIdReconTask", bbcu.fz);
        UpdateAdIdReconciliationService.a = Executors.newCachedThreadPool();
    }

    public UpdateAdIdReconciliationService() {
        this(AppContextProvider.a());
    }

    private UpdateAdIdReconciliationService(Context context0) {
        this(context0, new d(), new a(), b.c(context0));
    }

    public UpdateAdIdReconciliationService(Context context0, d d0, a a0, b b0) {
        this.c = d0;
        this.b = context0;
        this.d = a0;
        this.e = b0;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        if(!honl.c()) {
            return 2;
        }
        String s = this.e.f(-100);
        boolean z = this.e.n(-100);
        com.google.android.gms.ads.identifier.util.a a0 = new com.google.android.gms.ads.identifier.util.a(this.c, this.b, s, z, UpdateAdIdReconciliationService.a, this.d);
        UpdateAdIdReconciliationService.a.execute(a0);
        return 0;
    }
}

