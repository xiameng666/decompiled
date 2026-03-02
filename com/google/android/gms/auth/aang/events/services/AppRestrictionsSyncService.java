package com.google.android.gms.auth.aang.events.services;

import adaz;
import adbl;
import adro;
import bbcu;
import bblp;
import bboh;
import cllr;
import cmbm;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import fktu;
import java.util.concurrent.Executor;

public class AppRestrictionsSyncService extends GmsTaskBoundService {
    private final Executor a;

    static {
        bboh.c("Auth", bbcu.fF, "AppRestrictionsSyncService");
    }

    public AppRestrictionsSyncService() {
        this.a = new bblp(1, 9);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        fktu fktu0 = adaz.a().a(cllr0.a);
        if(((adro)fktu0.a).ordinal() != 1) {
            return 0;
        }
        cmbm cmbm0 = adaz.c();
        return cmbm0.n(cmbm0.a(fktu0, new adbl(), this.a));
    }
}

