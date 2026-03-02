package com.google.android.gms.auth.aang.impl.deviceaccount;

import adoc;
import aktc;
import batl;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggfp;
import ggnj;
import hoyw;

public final class DeviceAccountChimeraService extends cjtg {
    private aktc a;

    public DeviceAccountChimeraService() {
        ggfp ggfp0 = ggfp.G(hoyw.a.b().c().b);
        super(316, "com.google.android.gms.auth.account.device.deviceaccount.START", ggnj.a, 0, 10, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        this.a = new aktc(AppContextProvider.a());
        cjts cjts0 = this.l();
        aktc aktc0 = this.a;
        batl.s(aktc0);
        cjtn0.c(new adoc(cjts0, aktc0));
    }

    @Override  // cjtg
    public final void onDestroy() {
        aktc aktc0 = this.a;
        if(aktc0 != null) {
            aktc0.b();
        }
        super.onDestroy();
    }
}

