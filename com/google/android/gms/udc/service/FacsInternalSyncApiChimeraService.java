package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import baqr;
import bkcu;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ezqu;
import ezry;
import ezsq;
import ggnj;
import ggtl;

public class FacsInternalSyncApiChimeraService extends cjtg {
    public static final ggtl a;

    static {
        FacsInternalSyncApiChimeraService.a = ezqu.c();
    }

    public FacsInternalSyncApiChimeraService() {
        super(220, "com.google.android.gms.facs.internal.service.START", ggnj.a, 0, 10);
        this.setWantIntentExtras(true);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        bkcu bkcu0;
        String s = getServiceRequest0.f;
        Account account0 = getServiceRequest0.j;
        int v = Binder.getCallingUid();
        baqr baqr0 = new baqr();
        baqr0.d = s;
        baqr0.e = "com.google.android.gms";
        baqr0.a = v;
        baqr0.c = account0;
        baqr0.b = account0;
        FacsInternalSyncApiChimeraService.a.h().ar(0x447E).x("Receiving API connection to internal FACS API...");
        long v1 = Binder.clearCallingIdentity();
        try {
            bkcu0 = new bkcu(this.l(), baqr0, ezsq.b(this), ezry.g(this), ezry.f(this));
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
        cjtn0.c(bkcu0);
        FacsInternalSyncApiChimeraService.a.h().ar(0x447F).x("API connection successful!");
    }
}

